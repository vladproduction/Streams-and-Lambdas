package vladproduction.com.examples.functional_interface_example.app06;

public class Main06 {

    public static void main(String[] args) {
        Handler5 handler5 = (int age, String name, boolean male)->{
            StringBuilder sb = new StringBuilder();
            if(male){
                sb.append("Good day, Mr."+name+"; "+age);
            }else{
                sb.append("Good day, Mrs."+name);
            }
            return sb.toString();
        };
        String r1 = handler5.makeResult(10, "Jack", true);
        String r2 = handler5.makeResult(20, "Lola", false);
        System.out.println("r1="+r1);
        System.out.println("r2="+r2);
    }

}
