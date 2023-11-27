package vladproduction.com.consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //consumer-->accept();
        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        stringConsumer.accept("alfa");

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        };
        integerConsumer.accept(5000);
    }
}
