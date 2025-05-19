package com.vladproduction.examples.player_example.app04;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main04Stream {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(5, "Zidane", 10));
        playerList.add(new Player(10, "R10", 50));
        playerList.add(new Player(3, "Maldini", 7));
        playerList.add(new Player(11, "Pele", 999));
        playerList.add(new Player(2, "Cafu", 15));

        /*playerList.stream().collect(new Supplier<Player>() {
            @Override
            public Player get() {
                return new Player(5, "", 10);
            }
        }, new BiConsumer<Player, Player>() {
            @Override
            public void accept(Player player, Player player2) {

            }
        }, new BiConsumer<Player, Player>() {
            @Override
            public void accept(Player player, Player player2) {

            }
        });*/


        playerList.stream().forEach(new Consumer<Player>() {
            @Override
            public void accept(Player player) {
                System.out.println(player);
            }
        });

        System.out.println("---------------");

        playerList.stream().forEach((Player p) -> {
            System.out.println(p);
        });

        System.out.println("---------------");
        playerList.stream().forEach(p -> System.out.println(p));

        System.out.println("---------------");
        playerList.stream().forEach(System.out::println);




    }

}
