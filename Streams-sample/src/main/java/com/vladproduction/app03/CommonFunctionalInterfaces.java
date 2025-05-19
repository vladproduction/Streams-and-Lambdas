package com.vladproduction.app03;

import java.util.function.*;

public class CommonFunctionalInterfaces {

    public static void main(String[] args) {

        //predicate, consumer, function, supplier

        //1. Function
        Function<Integer, String> f = new Function<>() {

            @Override
            public String apply(Integer integer) {
                return integer + "";
            }
        };

        Function<Integer, String> f1 = integer -> integer + "";

        String applyF = f.apply(10);
        String applyF1 = f1.apply(100);
        System.out.println(applyF + " " + applyF1);

        // 2. Predicate - boolean
        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("a");
            }
        };
        boolean tested = p.test("a");
        System.out.println(tested);

        Predicate<String> p1 = s -> s.startsWith("1");
        boolean tested1 = p1.test("123");
        System.out.println(tested1);


        // 3. Consumer - void
        Consumer<String> c = new Consumer<>() {

            @Override
            public void accept(String s) {
                System.out.println(s + ": is accepted");
                System.out.println(s + ": is accepted 2");
            }
        };

        c.accept("123");

        Consumer<String> c1 = s -> System.out.println(s + ": is accepted");
        c1.accept("1234");



        // 4. Supplier - T
        Supplier<String> s = new Supplier<>() {

            @Override
            public String get() {

                return "Supplier get method";
            }
        };
        String string = s.get();
        System.out.println(string);

        Supplier<String> s1 = () -> "Supplier get method 2";
        String string1 = s1.get();
        System.out.println(string1);

        //5. BiFunction
        BiFunction<Integer, Integer, String> bif = new BiFunction<>() {
            @Override
            public String apply(Integer integer, Integer integer2) {

                return "Sum = " + (integer + integer2);
            }
        };
        String sumResult = bif.apply(10, 20);
        System.out.println(sumResult);

        BiFunction<Integer, Integer, String> bif1 = (i1, i2) -> {
            return "Sum = " + (i1 + i2);
        };
        String sumResult1 = bif1.apply(100, 200);
        System.out.println(sumResult1);


    }
}
