package vladproduction.com.func_interface;

public class Main01 {
    public static void main(String[] args) {
        Main01 main01 = new Main01();
        main01.run();
    }

    private void run() {
        Action action = new ActionClass(); //instance
        print(action);

        System.out.println("------------------");
        Action action1 = new Action() { //no instance(just action)
            @Override
            public void doAction() {
                System.out.println("doAction() from interface Action");
            }
        };
        print(action1);
        System.out.println("------------------");

        Action action2 = () -> {
            System.out.println("doAction() from interface Action->lambda expression");
        };
        print(action2);
        System.out.println("------------------");

        Action action3 = ()-> System.out.println("doAction() from interface Action->lambda expression_#2");
        print(action3);
        System.out.println("------------------");


        System.out.println("---(Action)--or--(Action2)-----------");

        print((Action) ()-> System.out.println("doAction() from interface Action"));

        print((Action2)()-> System.out.println("doAction() from interface Action2"));


    }

    private static void print(Action action){
        action.doAction();
    }
    private static void print(Action2 action){
        action.doAction();
    }
}
