package vladproduction.com.examples.player_example.app01;

import player_example.Player;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player(5, "Zidane", 10));
        playerList.add(new Player(10, "R10", 50));
        playerList.add(new Player(3, "Maldini", 7));
        playerList.add(new Player(11, "Pele", 999));
        playerList.add(new Player(2, "Cafu", 15));
        List<Player> topScores =  findGoodScore(playerList);
        for(Player p: topScores){
            System.out.println(p);
        }
    }


    private static List<Player> findGoodScore(List<Player> list){
        List<Player> resultList = new ArrayList<>();
        for(Player p:list){
           if(p.getScore()>10){
               resultList.add(p);
           }
        }
        return resultList;
    }


}
