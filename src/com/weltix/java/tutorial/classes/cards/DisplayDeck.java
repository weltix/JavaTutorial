package com.weltix.java.tutorial.classes.cards;

/**
 * Created by ASUS on 15.05.14.
 */
public class DisplayDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                Card card = deck.getCard(suit, rank);
                System.out.format("%s of %s%n",
                        card.rankToString(card.getRank()),
                        card.suitToString(card.getSuit()));
            }
        }
    }
}