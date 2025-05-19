package com.vladproduction.app01;

@FunctionalInterface
public interface AdvanceDrivable extends Drivable{


    static void start(){
        System.out.println("AdvanceDrivable - Start...");
    }

    default void stop(){
        System.out.println("AdvanceDrivable - Stop...");
        start();
        drive();
        helper();
        Drivable.start();
    }

    private void helper(){
        System.out.println("AdvanceDrivable - Helper...");
    }

}
