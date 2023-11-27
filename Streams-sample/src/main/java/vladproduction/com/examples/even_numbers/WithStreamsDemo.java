package vladproduction.com.examples.even_numbers;

import java.util.Arrays;
import java.util.List;

public class WithStreamsDemo {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,13,5,15,12,20);
        
        list.stream() // Ccreating Stream from collection source
        .filter(i -> i%2 == 0) // Intermediate Operation
        .forEach(System.out::println); // Terminal Operation
        
        //Output - 10  12  20
    }
}