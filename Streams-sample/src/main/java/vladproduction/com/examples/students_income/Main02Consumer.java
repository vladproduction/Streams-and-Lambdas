package vladproduction.com.examples.students_income;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main02Consumer {
    public static void main(String[] args) {
        Main02Consumer main02Consumer = new Main02Consumer();
        main02Consumer.run();
    }

    private void run() {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Alice", 10));
        studentList.add(new Student(2,"Bob", 11));
        studentList.add(new Student(3,"Carol", 10));

        //variant#1
        studentList.stream().forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        // variant#2
        studentList.stream().forEach((student) -> System.out.println(student));

        //variant#3
        studentList.stream().forEach(student -> System.out.println(student));

        //variant#4
        studentList.stream().forEach(System.out::println);

    }
}
