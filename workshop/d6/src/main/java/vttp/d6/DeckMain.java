package vttp.d6;

import java.util.List;

public class DeckMain {
    public static void main( String[] args ) {
        DeckOfCards deck = new DeckOfCards();
        System.out.println("***Before***");
        System.out.println(deck);
        deck.shuffle();
        System.out.println("***After***");
        System.out.println(deck);

        List<Card> cards = deck.take(5);
        System.out.println("After removing 5 cards");
        System.out.println(deck);
    }
}
