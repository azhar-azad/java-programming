package com.azad.practice.java.CmdLineApps.CardShufflingDealing;

// Card shuffling and dealing
public class DeckOfCardsTest {

    // execute application
    public static void main(String[] args) {

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for (int i = 1; i <= 52; i++) {
            // deal and display a Card
            System.out.printf("%-19s", deck.dealCard());

            if (i % 4 == 0) // output a newline after every fourth card
                System.out.println();
        }
    }
}
