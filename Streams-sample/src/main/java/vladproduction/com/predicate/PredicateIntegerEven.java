package vladproduction.com.predicate;

import java.util.function.Predicate;

public class PredicateIntegerEven {
    public static void main(String[] args) {
        //testing if argument is even:
        Predicate<Integer> myIntegerPredicate = (Integer p) -> {
            if(p%2 == 0){
                return true;
            }
            else {
                return false;
            }
        };

        boolean res = myIntegerPredicate.test(13);
        System.out.println("res= "+ res); //false

    }
}
