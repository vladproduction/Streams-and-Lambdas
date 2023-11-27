package vladproduction.com.examples.player_example.app01;

import player_example.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main01Stream {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(5, "Zidane", 10));
        playerList.add(new Player(10, "R10", 50));
        playerList.add(new Player(3, "Maldini", 7));
        playerList.add(new Player(11, "Pele", 999));
        playerList.add(new Player(2, "Cafu", 15));

        Predicate<Player> playerPredicate = (Player player)->{
            System.out.println("In predicate:" +player);
          return player.getScore()>10;
        };
        /*for(Player player: playerList){
            if(playerPredicate.test(player)){

            }else{
                playerList.remove(player);
            }
        }*/



        /*Stream<Player> stream = playerList.stream();
        stream = stream.filter(playerPredicate);
        long count = stream.count();
        System.out.println("count="+count);*/
        //long count2 = stream.count();

        long count = playerList.stream().filter(playerPredicate).count();
        System.out.println("count="+count);

        /*List<Player> result = playerList.stream().filter(playerPredicate).collect(Collectors.toList());
        for(Player p: result){
            System.out.println(p);
        }*/

        playerList.stream().filter(playerPredicate).forEach(player -> {
            System.out.println(player);
        });


    }


}
