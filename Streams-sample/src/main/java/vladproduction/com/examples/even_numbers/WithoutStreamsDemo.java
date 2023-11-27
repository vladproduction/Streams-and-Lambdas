package vladproduction.com.examples.even_numbers;

import java.util.Arrays;
import java.util.List;

public class WithoutStreamsDemo {
 
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,13,5,15,12,20);
        
        //Printing even numbers
        for(Integer i : list) {
            if(i%2 == 0)
               System.out.println(i);
        }
    }
}