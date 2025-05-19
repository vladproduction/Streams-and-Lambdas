package com.vladproduction.examples.functional_interface_example.app01;

public class Main {

    public static void main(String[] args) {
        MyAction myAction = new MySimpleAction();
        print(myAction);

        System.out.println("------------------");

        MyAction myAction2 = new MyAction() {
            @Override
            public void doMyAction() {
                System.out.println("MyAction2");

            }
        };
        print(myAction2);



        System.out.println("------------------");


        MyAction myAction3 = () ->{
            System.out.println("MyAction3");
        };
        print(myAction3);


        System.out.println("------------------");
        MyAction myAction4 = () -> System.out.println("MyAction4");
        print(myAction4);


        System.out.println("------------------");
        print(()->{
            System.out.println("HELLO!!!");
        });
    }


    private static void print(MyAction myAction){
        myAction.doMyAction();
    }

}
