package vladproduction.com.lambda;

public class Main01 {
    public static void main(String[] args) {

        Handler01 handler01  = () -> {
            System.out.println("Inside handler01");
        };
        handler01.myMethod();
        System.out.println("-------------------");

        Handler02String handler02String = (String s)->{
            System.out.println("handler02String: "+s);
        };
        handler02String.myMethod("with String param");

        Handler02Int handler02Int = (int x)->{
            System.out.println("handler02Int: "+x);
        };
        handler02Int.myMethod(4000);

        System.out.println("-----------------------------------");
        handler02Int = (int x) -> {
            if(x >= 4000) System.out.println("MORE or EQUAL 4000 = " + x);
            else System.out.println("LESS then 4000 = " + x);
        };
        handler02Int.myMethod(5000);

        System.out.println("---no necessary print type:------------");

        Handler02Int handler02Int2 = (x) -> {
            System.out.println("No print type but MORE or EQUAL 4000 = "+x);
        };
        handler02Int2.myMethod(5200);



    }
}
