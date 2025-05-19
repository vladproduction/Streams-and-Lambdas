package com.vladproduction.inter;

//@FunctionalInterface
public interface Drivable {

    void drive();


    public static void start(){
        System.out.println("Start...");
    }

    public static void stop(){
        System.out.println("Stop...");
    }

}
