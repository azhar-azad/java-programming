package com.azad.java.learning.GenericCollections.CollectionsMethods.helperClasses;

// class to represent a Card in a deck of cards
public class Card {

    public static enum Face { Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King }
    public static enum Suit { Clubs, Diamonds, Hearts, Spades }

    private final Face face;
    private final Suit suit;

    // constructor
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // return face of the card
    public Face getFace() {
        return face;
    }

    // return suit of the card
    public Suit getSuit() {
        return suit;
    }

    // return String representation of card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}
