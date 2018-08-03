package com.weltix.java.tutorial.interfaces_and_inheritance.interfaces.default_methods.cards;

import java.util.*;

/**
 * Created by ASUS on 01.06.14.
 */

public class SortByRankThenSuit implements Comparator<Card> {
    public int compare(Card firstCard, Card secondCard) {
        int compVal =
                firstCard.getRank().value() - secondCard.getRank().value();
        if (compVal != 0)
            return compVal;
        else
            return firstCard.getSuit().value() - secondCard.getSuit().value();
    }
}