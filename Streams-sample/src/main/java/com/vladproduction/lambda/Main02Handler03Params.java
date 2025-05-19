package com.vladproduction.lambda;

public class Main02Handler03Params {
    public static void main(String[] args) {

        Handler03Params handler03Params = (String name, double price, boolean isPresent)->{
            System.out.println("name "+name + " price "+price + " isPresent "+ isPresent);
        };
        handler03Params.myMethod("Laptop", 399.99, true);

        System.out.println("-------no type declaration-------------");

        Handler03Params handler04Params = (name, price, isPresent)->{
            System.out.println("name "+name + " price "+price + " isPresent "+ isPresent);
        };
        handler04Params.myMethod("Tablet", 299.99, true);
    }
}
