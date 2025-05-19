package com.vladproduction.consumer;

import java.util.function.Consumer;

public class Main02 {
    public static void main(String[] args) {

        Consumer<String> c3 = (s)-> System.out.println("C3; "+s);
        c3.accept("Web web web");

       System.out.println("--------------------");
        Consumer<String> c4 = (s)-> {
            Runnable runnable = System.out::println;

        };
        c4.accept("Web web web");
    }
}
