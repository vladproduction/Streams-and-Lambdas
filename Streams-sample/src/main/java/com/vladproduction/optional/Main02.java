package com.vladproduction.optional;

import java.util.Optional;

public class Main02 {
    public static void main(String[] args) {

        Optional<String> optional = getSomeData2();
        String anotherValue = optional.orElse("another value if Optional.empty");
        System.out.println(anotherValue);

    }

    private static Optional<String> getSomeData2(){
        //Optional<String> optional = Optional.of("Hello");
        //return optional;
        return Optional.empty();
    }
}
