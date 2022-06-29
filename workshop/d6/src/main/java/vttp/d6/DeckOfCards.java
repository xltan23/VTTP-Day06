package vttp.d6;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// And enum must be imported
import vttp.d6.Card.Suit;

public class DeckOfCards {

    private List<Card> cards = new LinkedList<>();
    
    // Default constructor calls another constructor
    public DeckOfCards() {
        this(1);
    }

    // Building the deck of cards
    public DeckOfCards(int numOfDecks) {
        for (int d = 0; d < numOfDecks; d++) {
            for (Suit s: Suit.values()) {
                for (int i = 0; i<Card.Ranks.length; i++) {
                    Card card = new Card(s, Card.Ranks[i], Card.Card_Values[i]);
                    cards.add(card);
                }
            }
        }
    }

    public void shuffle() {
        Random rand = new SecureRandom();
        for (int i = 0; i < cards.size(); i++) {
            Card srcCard = cards.get(i);
            int randomNum = rand.nextInt(0, cards.size());
            Card swapCard = cards.get(randomNum);
            cards.set(randomNum, srcCard);
            cards.set(i, swapCard);
        }
    }

    public Card take() {
        return cards.remove(0);
    }

    public List<Card> take(int num) {
        List<Card> cards = new LinkedList<>(); // Ensure usage of same deck of cards when operation is performed
        for (int i = 0; i < num; i++) {
            if (remaining() > 0) {
                cards.add(take());
            } else {
                break;
            }
        }
        return cards;
    }

    public int remaining() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
