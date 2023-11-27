package vladproduction.com.examples.functional_interface_example.app03;

public class Main03 {

    public static void main(String[] args) {
        Handler02 handler02 = (int type)->{
            type++;
            if(type>5){
                System.out.println("Greater then 5");
            }else{
                System.out.println("Less or equal 5");
            }
        };

        handler02.myMethod(10);
        System.out.println("------------------------------");

        Handler02 h = (type)->{
            type++;
        };

    }

}
