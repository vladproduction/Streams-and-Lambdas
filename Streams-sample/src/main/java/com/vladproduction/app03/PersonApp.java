package com.vladproduction.app03;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonApp {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Bob", 25, 10000));
        persons.add(new Person("John", 30, 15000));
        persons.add(new Person("Mike", 22, 12000));
        persons.add(new Person("Dylan", 26, 16000));
        persons.add(new Person("Anna", 20, 14000));

        List<Double> collect = persons.stream()
                .filter(p -> p.getAge() >= 25)
                .map(p -> p.getSalary() * 1.1)
                .collect(Collectors.toList());

        System.out.println(persons);
        System.out.println(collect);

        System.out.println("--------------");
        List<Double> collect1 = persons.stream()
                .peek(p -> System.out.println("Person: " + p))
                .filter(p -> p.getAge() >= 25)
                .peek(p -> System.out.println("Filtered: " + p))
                .map(p -> p.getSalary() * 1.1)
                .collect(Collectors.toList());

        System.out.println(collect1);

        System.out.println("--------------");
        Optional<Person> any = persons.stream()
                .filter(person -> person.getSalary() > 10_000)
                .findAny();

        System.out.println(any);

        //alternative through if condition
        /*if(any.isPresent()){
            Person person = any.get();
            System.out.println(person);
        }else {
            Person person = new Person("No person", 0, 0);
            System.out.println(person);
        }*/

        //best practices
        Person personA = any.orElse(new Person("No person", 0, 0));
        System.out.println(personA);

        Person personB = any.orElseThrow();
        System.out.println(personB);




    }
}
















