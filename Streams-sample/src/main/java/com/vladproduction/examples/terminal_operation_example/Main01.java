package com.vladproduction.examples.terminal_operation_example;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main01 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", 10);
        Student s2 = new Student(2, "Bob", 12);
        Student s3 = new Student(3, "Janny", 11);
        Student s4 = new Student(4, "Nick", 11.5);
        Student s5 = new Student(5, "Lisa", 10.5);

        Stream<Student> studentStream = Stream.of(s1, s2, s3, s4, s5);
        long total = studentStream.count();
        System.out.println("total = " + total);

//        no available to use same stream after terminal operation (count();), for example:
//       studentStream.forEach(s-> System.out.println(s)); //actually (forEach(); - also terminal)
//        IllegalStateException: stream has already been operated upon or closed

        System.out.println("-------------");
        //open new Stream(): now it`s work!
        Stream.of(s1, s2, s3, s4, s5).forEach(s-> System.out.println(s));

        System.out.println("----findFirst---------");
        Optional<Student> firstStudentOptional = Stream.of(s1, s2, s3, s4, s5).findFirst();
        Student firstStudent = firstStudentOptional.orElse(new Student(1,"Sara",10.8));
        System.out.println("firstStudent = " + firstStudent);

        //if Stream() is empty:
        System.out.println("----empty:---------");
        Object newStudent = Stream.empty().findFirst().orElse(new Student(1,"Sara",10.8));
        System.out.println("newStudent = "+newStudent);

        //findAny
        System.out.println("----findAny:---------");
        Student anyStudent = Stream.of(s1, s2, s3, s4, s5).findAny().orElse(new Student(1,"Sara",10.8));
        System.out.println("anyStudent = " + anyStudent);

        //collect
        System.out.println("----collect:---------");
        List<Student> listOfStudents = Stream.of(s1, s2, s3, s4, s5).collect(Collectors.toList());
        System.out.println("listOfStudents");
        System.out.println(listOfStudents);

    }
}
