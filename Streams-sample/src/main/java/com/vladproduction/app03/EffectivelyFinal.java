package com.vladproduction.app03;

import java.util.function.Function;

public class EffectivelyFinal {
    public static void main(String[] args) {

        int t = 10;

        Function<Integer, Integer> fun = x -> x * t;
        Integer integerRes = fun.apply(5);
        System.out.println(integerRes);


    }
}
