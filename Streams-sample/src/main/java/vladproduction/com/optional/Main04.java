package vladproduction.com.optional;

import java.util.Optional;

public class Main04 {
    public static void main(String[] args) {

        Optional<String> optional = getSomeData2();
//        String dataValue = optional.orElseThrow(new Supplier<IllegalArgumentException>() {
//            @Override
//            public IllegalArgumentException get() {
//                return new IllegalArgumentException("MyException: Give me something to get");
//            }
//        });

        //variant#1
//        String dataValue = optional.orElseThrow(() ->
//                new IllegalArgumentException("MyException: Give me something to get"));


        //variant#2
        String dataValue = optional.orElseThrow((IllegalArgumentException::new));

        System.out.println(dataValue);
    }

    private static Optional<String> getSomeData2(){
//        Optional<String> optional = Optional.of("Hello");
//        return optional;
        return Optional.empty();
    }
}
