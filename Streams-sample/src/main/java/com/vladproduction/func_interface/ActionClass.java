package com.vladproduction.func_interface;

public class ActionClass implements Action{
    @Override
    public void doAction() {
        System.out.println("ActionClass: (implements Action)");
    }
}
