package com.vladproduction.examples.functional_interface_example.app04;

public class Main04 {

    public static void main(String[] args) {
        Handler03 handler03 = (String name, double price, boolean isPresent) -> {
            System.out.println("name="+name);
            System.out.println("price="+price);
            System.out.println("isPresent="+isPresent);
        };

        handler03.myMethod("MyName", 100, true);
        System.out.println("---------------------------------------");


        Handler03 h3 = (name, price, isPresent) -> {
            System.out.println("name="+name);
            System.out.println("price="+price);
            System.out.println("isPresent="+isPresent);
        };
        h3.myMethod("MyName", 100, true);

    }

}
