package vladproduction.com.examples.filter_students;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main02Stream {
    public static void main(String[] args) {
        Main02Stream main01 = new Main02Stream();
        main01.run();
    }

    private void run() {

        Student student1 = new Student(1,"Jack",10.5);
        Student student2 = new Student(2,"Janny",11.3);
        Student student3 = new Student(3,"Phil",10.1);
        Student student4 = new Student(4,"Sara",9.9);
        Student student5 = new Student(5,"John",11.8);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        Predicate<Student> studentPredicate = (Student student)-> {
            System.out.println("in predicate: " + student);
            return student.getRating() > 10;
        };

        //variant#1
//        for (Student student : students) {
//            if(studentPredicate.test(student));
//            else students.remove(student);
//        }
//        Stream<Student> studentStream = students.stream();
//        studentStream = studentStream.filter(studentPredicate);
//        long count1 = studentStream.count();
//        System.out.println("count1: "+count1);

        //variant#2
//        long count2 = students.stream().filter(studentPredicate).count();
//        System.out.println("count2: "+count2);

        //variant#3
//        List<Student> resultList = students.stream().filter(studentPredicate).collect(Collectors.toList());
//        for (Student student : resultList) {
//            System.out.println(student);
//        }

        //variant#4
//        students.stream().filter(studentPredicate).forEach(student -> {
//            System.out.println(student);
//        });

        //variant#5
        students.stream().filter(studentPredicate).forEach(System.out::println);



    }

}
