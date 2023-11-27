package vladproduction.com.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //optional
        String myData = getSomeData();
        if(myData != null){
            int length = myData.length();
            System.out.println(myData +" = "+ length);
        }

        System.out.println("---optional:------");
        Optional<Object> optional = getSomeData2();
        if(optional.isPresent()){
            Object someData = optional.get();
            System.out.println("someData = " + someData);
        }
    }

    private static Optional<Object> getSomeData2() {
        return Optional.of("Hello");
        //return Optional.empty();
    }

    private static String getSomeData() {
        return null;
    }
}
