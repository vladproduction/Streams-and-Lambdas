package com.vladproduction.examples.player_example.app06;



import java.util.stream.Stream;

public class Main06Stream {

    public static void main(String[] args) {
        Player p1 = new Player(5, "Zidane", 10);
        Player p2 = new Player(10, "R10", 50);
        Player p3 = new Player(3, "Maldini", 7);
        Player p4 = new Player(11, "Pele", 999);
        Player p5 = new Player(2, "Cafu", 15);

        System.out.println("----------count------");
        //Stream.of(p1,p2,p3,p4,p5).filter(p->p.getScore()>10).count();
        long count = Stream.of(p1,p2,p3,p4,p5).filter(p->p.getScore()>10).filter(p->p.getNumber()<10).count();
        System.out.println("count="+count);

        System.out.println("----------firstPlayer------");
        Player firstPlayer = Stream.of(p1, p2, p3, p4, p5)
                .filter(p -> p.getScore() > 10)
                .filter(p -> p.getNumber() <= 1).findFirst()
                .orElse(new Player(1, "Buffon", 0));
        System.out.println(firstPlayer);

        System.out.println("----------anyPlayer------");
        Player anyPlayer = Stream.of(p1, p2, p3, p4, p5).peek(p->System.out.println("peek1="+p))
                .filter(p -> p.getScore() > 10)
                .peek(p->System.out.println("peek2="+p))
                .filter(p -> p.getNumber() <= 10)
                .peek(p->System.out.println("peek3="+p))
                .findAny()
                .orElse(new Player(1, "Buffon", 0));
        System.out.println(anyPlayer);


        System.out.println("----------count2------");
        long count2 = Stream.of(p1, p2, p3, p4, p5).peek(p->System.out.println("peek1="+p))
                .filter(p -> p.getScore() > 10)
                .peek(p->System.out.println("peek2="+p))
                .filter(p -> p.getNumber() <= 10)
                .peek(p->System.out.println("peek3="+p))
                .count();
        System.out.println("count2="+count2);

        System.out.println("----------terminal operator------");
        Stream.of(p1, p2, p3, p4, p5).peek(p->System.out.println("peek1="+p))
                .filter(p -> p.getScore() > 10)
                .peek(p->System.out.println("peek2="+p))
                .filter(p -> p.getNumber() <= 10)
                .peek(p->System.out.println("peek3="+p));
    }


}
