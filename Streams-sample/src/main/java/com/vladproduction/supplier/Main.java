package com.vladproduction.supplier;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //supplier->get();
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Hello from <String Supplier>";
            }
        };
        String resString = stringSupplier.get();
        System.out.println("resString = " + resString);

        System.out.println("---------------------");

        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5000;
            }
        };
        int resInteger = integerSupplier.get();
        System.out.println("resInteger = " + resInteger);

    }
}
