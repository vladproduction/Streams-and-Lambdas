package vladproduction.com.examples.students_income;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main01Streams {
    public static void main(String[] args) {
        Main01Streams main01Streams = new Main01Streams();
        main01Streams.run();
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

        //variant#1(income=***)
        System.out.println("---income=***---");
        List<Double> incomeList = students.stream().filter((Student student)->{
                    return student.getRating()>10;
                }).map((Student student)->{
                    double income = student.getRating()*100;
                    IncomeSheet report = new IncomeSheet(income, student.getName());
                    return report;
                }).map(s -> s.getIncome())
                .collect(Collectors.toList());
        for (Double income:incomeList) {
            System.out.println(income);
        }
        System.out.println();

        //variant#2(name=***; income=***)
        System.out.println("---name=***; income=***---");
        List<IncomeSheet> sheetList = students.stream().filter((Student student)->{
           return student.getRating() > 10;
        }).map((Student student) -> {
            double income = student.getRating()*100;
            IncomeSheet report = new IncomeSheet(income, student.getName());
            return report;
        }).collect(Collectors.toList());
        for (IncomeSheet student : sheetList) {
            System.out.print(student + "\n");
        }
        System.out.println();


        //variant#3(totalStudents=***)
        System.out.println("---totalStudents=***---");
        long studentStream = students.stream().filter((Student student)->{
            return student.getRating()>10;
        }).map((Student student)->{
            double income = student.getRating()*100;
            IncomeSheet report = new IncomeSheet(income, student.getName());
            return report;
        }).count();
        System.out.println("totalStudents = " + studentStream);

        System.out.println();

        //variant#4(totalIncome=***)
        System.out.println("---totalIncome=***---");
        double totalIncome = students.stream()
                .filter((Student student)->{
            return student.getRating()>10;})
                .map((Student student)->{
            double income = student.getRating()*100;
            IncomeSheet report = new IncomeSheet(income, student.getName());
            return report;})
                .map(s->s.getIncome())
                .mapToDouble(d-> d).sum();
        System.out.println("totalIncome = " + totalIncome);


        System.out.println("--avg example:---------");
        OptionalDouble res = IntStream.of(1,2,3,4,5).average();
        double resultAVG = res.getAsDouble();
        System.out.println(resultAVG);



    }

}
