package com.vladproduction.examples.filter_students;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        Main01 main01 = new Main01();
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

        List<Student> topRating = findTopRating(students);
        for (Student student : topRating) {
            System.out.println(student);
        }
    }

    private static List<Student> findTopRating(List<Student> students) {
        List<Student> topRatingList = new ArrayList<>();
        for (Student student: students) {
            if (student.getRating() > 11) {
                topRatingList.add(student);
            }
        }
        return topRatingList;
    }
}
