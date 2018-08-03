package com.weltix.java.tutorial.interfacesandinherirance.interfaces.defaultmethods.cards;

import java.util.*;
import java.lang.*;

/**
 * Created by ASUS on 31.05.14.
 */
public interface Deck {
    List<Card> getCards();
    Deck deckFactory();
    int size();
    void addCard(Card card);
    void addCards(List<Card> cards);
    void addDeck(Deck deck);
    void shuffle();
    void sort();
    void sort(Comparator<Card> c);
    String deckToString();

    Map<Integer, Deck> deal(int players, int numberOfCards)
            throws IllegalArgumentException;

}