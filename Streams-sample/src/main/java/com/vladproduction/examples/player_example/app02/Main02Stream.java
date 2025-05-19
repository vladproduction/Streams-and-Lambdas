package com.vladproduction.examples.player_example.app02;



import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main02Stream {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(5, "Zidane", 10));
        playerList.add(new Player(10, "R10", 50));
        playerList.add(new Player(3, "Maldini", 7));
        playerList.add(new Player(11, "Pele", 999));
        playerList.add(new Player(2, "Cafu", 15));


        /*List<Businessman> result = playerList.stream().filter((Player p)->{
            return p.getScore()>10;
        }).map((Player p)->{
            int income = p.getScore()*5;
            Businessman businessman = new Businessman(income, p.getName());
            return businessman;
        }).collect(Collectors.toList());
        System.out.println(result);*/

        playerList.stream().filter((Player p)->{
            return p.getScore()>10;
        }).map((Player p)->{
            int income = p.getScore()*5;
            Businessman businessman = new Businessman(income, p.getName());
            return businessman;
        }).map(businessman -> businessman.getIncome());

        OptionalDouble res = IntStream.of(1,2,3,4,5).average();
        double result = res.getAsDouble();
    }

}
