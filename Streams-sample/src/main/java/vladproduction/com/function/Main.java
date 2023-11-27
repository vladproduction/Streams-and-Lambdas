package vladproduction.com.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //function-->apply();
        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                char [] array = string.toCharArray();
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    if(array[i] == 'a' ) count++;
                }
//                for (int i = array.length-1; i >= 0 ; i--) { //counting from the end
//                    if(array[i] == 'a') count++;
//                }
                return count;
            }
        };
        int count1 = f.apply("aaa bbb ccc");
        System.out.println("count1 = "+count1);

        System.out.println("------------------------------------");

        //enter String; return Integer
        Function<String, Integer> f2 = (String string) -> {
            char [] array = string.toCharArray();
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 'a' ) count++;
            }
            return count;
        };
        int count2 = f2.apply("aaa bbb ccc");
        System.out.println("count2 = "+count2);
    }
}
