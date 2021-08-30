package com.azad.java.practice.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerSorter {

    public static void main(String[] args) {

        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        PlayerRankingComparator rankingComparator= new PlayerRankingComparator();
        PlayerAgeComparator ageComparator = new PlayerAgeComparator();

        System.out.println("Before sorting: " + footballTeam);
        Collections.sort(footballTeam, rankingComparator);
        System.out.println("After sorting by ranking: " + footballTeam);
        Collections.sort(footballTeam, ageComparator);
        System.out.println("After sorting by age: " + footballTeam);
    }
}
