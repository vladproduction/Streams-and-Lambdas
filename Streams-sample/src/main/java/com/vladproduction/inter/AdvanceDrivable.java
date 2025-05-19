package com.vladproduction.inter;

//@FunctionalInterface
public interface AdvanceDrivable extends Drivable{

    void drive(int speed);

    public static void start(){
        System.out.println("AdvanceDrivable - Start...");
    }

}
