package com.vladproduction.examples.pipeline_student_rating;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main01 {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", 10);
        Student s2 = new Student(2, "Bob", 12);
        Student s3 = new Student(3, "Janny", 11);
        Student s4 = new Student(4, "Nick", 11.5);
        Student s5 = new Student(5, "Lisa", 10.5);


        //1
        System.out.println("---//1---");
        long countOver11 = Stream.of(s1, s2, s3, s4, s5).filter(s -> s.getRating() >= 11).count();
        System.out.println(countOver11);

        //2
        System.out.println("---//2---");
        List<Student> studentsRatingOver11All = Stream.of(s1, s2, s3, s4, s5)
                .filter(s -> s.getRating() >= 11).collect(Collectors.toList());
        System.out.println(studentsRatingOver11All);

        //3
        System.out.println("---//3---");
        long countFromThird = Stream.of(s1, s2, s3, s4, s5)
                .filter(s -> s.getRating() >= 11)
                .filter(s -> s.getId() >= 3).count();
        System.out.println(countFromThird);

        //4
        System.out.println("---//4---");
        List<Student> ratingOver11ById = Stream.of(s1, s2, s3, s4, s5)
                .filter(s -> s.getRating() >= 11)
                .filter(s -> s.getId() >= 1).collect(Collectors.toList());
        System.out.println(ratingOver11ById);

        //5
        System.out.println("---//5---");
        Stream.of(s1, s2, s3, s4, s5)
                .filter(s->s.getName().length()<=3)
                .forEach(System.out::println);

        //6
        System.out.println("---//6---");
        Stream.of(s1, s2, s3, s4, s5)
                .filter(s->s.getRating() >= 11.5)
                .forEach(System.out::println);

        //7
        System.out.println("---//7---");
        Student studentFindFirst = Stream.of(s1, s2, s3, s4, s5)
                .filter(s -> s.getId() > 5)
                .findFirst()
                .orElse(new Student(6, "Charly", 10.9));
        System.out.println("studentFindFirst = " + studentFindFirst);

        //8
        System.out.println("---//8---");
        Student studentFindAny = Stream.of(s1, s2, s3, s4, s5)
                .peek(s-> System.out.println("peek1 = "+s))
                .filter(s -> s.getRating() > 11)
                .peek(s-> System.out.println("peek2 = "+s))
                .findAny()
                .orElse(new Student(6, "Charly", 13));
        System.out.println("studentFindAny = " + studentFindAny);

        //9
        System.out.println("---//9---");
        long countStudent = Stream.of(s1, s2, s3, s4, s5)
                .peek(s-> System.out.println("peek1 = "+s))
                .filter(s -> s.getRating() > 11)
                .peek(s-> System.out.println("peek2 = "+s))
                .count();
        System.out.println("countStudent = " + countStudent);
    }
}
