package com.vladproduction.lambda;

public class Main03Handler04Return {
    public static void main(String[] args) {

        Handler04Return handler1 = ()->{
            return "result:(1) " +
                    "Hello!";
        };
        System.out.println(handler1.makeResult());

        Handler04Return handler2 = ()-> "result:(2) " +
                "Hello Again!!!";
        System.out.println(handler2.makeResult());
    }
}
