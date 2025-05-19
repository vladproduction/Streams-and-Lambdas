package com.vladproduction.examples.player_example.app05;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main05Stream {

    public static void main(String[] args) {
        Player p1 = new Player(5, "Zidane", 10);
        Player p2 = new Player(10, "R10", 50);
        Player p3 = new Player(3, "Maldini", 7);
        Player p4 = new Player(11, "Pele", 999);
        Player p5 = new Player(2, "Cafu", 15);


        Stream<Player> stream = Stream.of(p1,p2,p3,p4,p5);
        long count = stream.count();
        System.out.println("count="+count);

        System.out.println("-----findFirst-----------");
        //stream.forEach(p->System.out.println(p));
        Stream.of(p1,p2,p3,p4,p5).forEach(p->System.out.println(p));
        System.out.println("----------------");
        Optional<Player> firstPlayerOptional = Stream.of(p1,p2,p3,p4,p5).findFirst();
        Player firstPlayer= firstPlayerOptional.orElse(new Player(7, "David", 20));
        System.out.println(firstPlayer);
        Object defaultPlayer = Stream.empty().findFirst().orElse(new Player(7, "David", 20));
        System.out.println(defaultPlayer);

        System.out.println("-------findAny---------");
        Player p = Stream.of(p1,p2,p3,p4,p5).findAny().orElse(new Player(10, "Ivan Samarano", 30));
        System.out.println(p);

        System.out.println("-------Collect to List---------");
        List<Player> listPlayers = Stream.of(p1,p2,p3,p4,p5).collect(Collectors.toList());
        System.out.println(listPlayers);


    }


}
