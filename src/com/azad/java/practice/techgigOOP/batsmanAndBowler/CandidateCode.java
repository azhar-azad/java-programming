package com.azad.practice.javaprogramming2.practice.techgigOOP.batsmanAndBowler;

public class CandidateCode {

    public static class Batsman {
        public static void quality() {
            System.out.println("I am BATSMAN");
        }
    }

    public static class Bowler {
        public static void quality() {
            System.out.println("I am BOWLER too");
        }
    }

    public static void main(String[] args) throws Exception {

        //Write code here
        Batsman batsman = new Batsman();
        Bowler bowler = new Bowler();

        batsman.quality();
        bowler.quality();
    }
}
