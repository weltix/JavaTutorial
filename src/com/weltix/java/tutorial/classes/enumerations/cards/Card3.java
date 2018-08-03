package com.weltix.java.tutorial.classes.enumerations.cards;

/**
 * Created by ASUS on 23.05.14.
 */
public class Card3 {
    private final Rank rank;
    private final Suit suit;

    public Card3(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}