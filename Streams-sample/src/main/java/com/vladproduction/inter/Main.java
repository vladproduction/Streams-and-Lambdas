package com.vladproduction.inter;

public class Main {

    public static void main(String[] args) {

        Drivable d = ()-> System.out.println( "Driving...");
        d.drive();

        AdvanceDrivable.start();
        Drivable.start();

    }

}
