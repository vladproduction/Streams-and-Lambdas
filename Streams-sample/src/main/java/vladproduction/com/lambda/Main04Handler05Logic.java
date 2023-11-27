package vladproduction.com.lambda;

import java.util.Scanner;

public class Main04Handler05Logic {
    public static void main(String[] args) {
        Main04Handler05Logic main04Handler05Logic = new Main04Handler05Logic();
        main04Handler05Logic.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        int type = scanner.nextInt();
        switch (type) {
            case 1:
                Handler05Logic male = (n, a) -> {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Your gender: Male");
                    sb.append("Name: ").append(n);
                    sb.append(" Age: ").append(a);
                    return sb.toString();
                };
                System.out.println(male.makeResult(name = scanner.next(),
                        age = scanner.nextInt()));
                break;
            case 2:
                Handler05Logic female = (n, a) -> {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Your gender: Female");
                    sb.append("Name: ").append(n);
                    sb.append(" Age: ").append(a);
                    return sb.toString();
                };
                System.out.println(female.makeResult(name = scanner.next(),
                        age = scanner.nextInt()));
                break;
            default:
                throw new IllegalArgumentException("Unsupported type");
        }
        scanner.close();
    }
}
