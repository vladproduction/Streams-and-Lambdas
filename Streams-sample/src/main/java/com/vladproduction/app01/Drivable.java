package com.vladproduction.app01;

//@FunctionalInterface
public interface Drivable {

    void drive();


    static void start(){
        System.out.println("Start...");
    }

    public static void stop(){
        System.out.println("Stop...");
    }

}
