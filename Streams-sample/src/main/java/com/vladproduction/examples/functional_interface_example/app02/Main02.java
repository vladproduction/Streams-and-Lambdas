package com.vladproduction.examples.functional_interface_example.app02;

public class Main02 {

    public static void main(String[] args) {
        Handler01 handler01 = () -> {
            System.out.println("Hello!01");
        };

        handler01.myMethod();

    }
}
