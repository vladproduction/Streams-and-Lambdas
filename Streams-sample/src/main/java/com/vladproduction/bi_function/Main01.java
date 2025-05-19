package com.vladproduction.bi_function;

import java.util.function.BiFunction;

public class Main01 {
    public static void main(String[] args) {
        Main01 main01 = new Main01();
        main01.run();
    }

    private void run() {

        BiFunction<String, String, Integer> biFunction = new BiFunction<String, String, Integer>() {
            @Override
            public Integer apply(String s1, String s2) {
                return s1.length()+s2.length();
            }
        };
        int res1 = biFunction.apply("alfa", "beta"); //8
        System.out.println("res1 = "+res1);

        System.out.println("----less typing-----------------");
        BiFunction<String, String, Integer> biFunction2 = (s, s2) -> s.length()+s2.length();
        System.out.println(biFunction2.apply("alfa", "beta"));

    }
}
