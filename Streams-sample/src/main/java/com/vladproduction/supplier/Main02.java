package com.vladproduction.supplier;

import java.util.function.Supplier;

public class Main02 {
    public static void main(String[] args) {
        Supplier<String> supplier2 = () -> "Hello: supplier2";
        Supplier<String> supplier3 = () -> {
            return "Hello: supplier3";
        };
        String res2 = supplier2.get();
        String res3 = supplier3.get();
        System.out.println(res2);
        System.out.println(res3);
    }
}
