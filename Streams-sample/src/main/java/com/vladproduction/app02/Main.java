package com.vladproduction.app02;

public class Main {
    public static void main(String[] args) {

        A a = new AImpl();
        a.print(); //default method

        B b = ()-> System.out.println("B - print");

        C c = ()-> System.out.println("C - info");


    }
}
