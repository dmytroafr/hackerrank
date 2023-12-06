package org.example.first;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        int diff = o1.score-o2.score;
        if (diff<=0) {
            if (diff==0){
                return o1.name.compareTo(o2.name);
            }
            return 1;
        }

        return -1;
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}