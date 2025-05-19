package com.vladproduction.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main03throwException {
    public static void main(String[] args) {

        Optional<String> optional = getSomeData2();
        String dataValue = optional.orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("MyException: Give me something to get");
            }
        });
        System.out.println(dataValue);

    }

    private static Optional<String> getSomeData2(){
        Optional<String> optional = Optional.of("Hello");
        return optional;
        //return Optional.empty();
    }
}
