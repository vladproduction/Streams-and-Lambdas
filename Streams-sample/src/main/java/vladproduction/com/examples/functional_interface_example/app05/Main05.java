package vladproduction.com.examples.functional_interface_example.app05;

public class Main05 {

    public static void main(String[] args) {
        Handler04 handler04 = ()->{
            return "10";
        };
        String result = handler04.makeResult();
        System.out.println("result="+result);
        System.out.println("----------------");

        Handler04 h4 = ()->"SomeText";
        String r = h4.makeResult();
        System.out.println("r="+r);

    }
}
