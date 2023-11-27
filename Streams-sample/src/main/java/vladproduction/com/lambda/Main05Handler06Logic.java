package vladproduction.com.lambda;



public class Main05Handler06Logic {
    public static void main(String[] args) {

        Handler06Logic handler = (String name, int age, boolean male)->{
            StringBuilder sb = new StringBuilder();
            if(male){
                sb.append("Good day, Mr. "+name+"; "+age + " years");
            }else {
                sb.append("Good day, Mrs. "+name);
            }
            return sb.toString();
        };
        String first = handler.doResult("John", 39, true);
        String second = handler.doResult("Daniela", 31, false);
        System.out.println(first);
        System.out.println(second);

    }

}
