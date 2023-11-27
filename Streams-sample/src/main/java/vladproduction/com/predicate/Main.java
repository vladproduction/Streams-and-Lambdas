package vladproduction.com.predicate;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //predicate-->test();
        Predicate<Person> malePredicate = new Predicate<Person>() {
            @Override
            public boolean test(Person p) {
                return p.isGender();
            }
        };

        Person mike = new Person("Mike", 32, true);
        Person julie = new Person("Julie", 20, false);
        boolean res1 = malePredicate.test(mike);
        boolean res2 = malePredicate.test(julie);
        System.out.println("mike = "+res1);
        System.out.println("julie = "+res2);

        System.out.println("---------------------------------");
//        Predicate<Person> femalePredicate = (Person p)->{
//            return p.isGender();
//        };
        Predicate<Person> femalePredicate = (Person p) -> p.isGender();
        boolean res3 = femalePredicate.test(julie);
        boolean res4 = femalePredicate.test(mike);
        System.out.println("julie = "+res3);
        System.out.println("mike = "+res4);

    }
}
