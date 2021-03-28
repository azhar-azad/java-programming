package com.azad.practice.java.GenericCollections.CollectionsMethods.helperClasses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private List<Card> list; // declare List that will store Cards

    // set up deck of Cards and shuffle
    public DeckOfCards() {

        Card[] deck = new Card[52];
        int count = 0; // number of cards

        // populate deck with Card objects
        for (Card.Suit suit: Card.Suit.values()) {
            for (Card.Face face: Card.Face.values()) {
                deck[count] = new Card(face, suit);
                ++count;
            }
        }

        list = Arrays.asList(deck); // get List
        Collections.shuffle(list); // shuffle deck
    }

    // output deck
    public void printCards() {

        // diplay 52 cards in two columns
        for (int i = 0; i < list.size(); i++)
            System.out.printf("%-19s%s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
    }
}
