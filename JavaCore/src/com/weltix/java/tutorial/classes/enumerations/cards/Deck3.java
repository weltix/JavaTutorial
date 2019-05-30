/*
 * Copyright (c) 30.05.2019, DMITRIY BLUDOV. All rights reserved.
 */

package com.weltix.java.tutorial.classes.enumerations.cards;

public class Deck3 {
    private static Card3[] cards = new Card3[52];
    public Deck3() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card3(rank, suit);
            }
        }
    }
}