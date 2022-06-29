package vttp.d6;

public class Card {

    public enum Suit { Spades, Hearts, Diamonds, Clubs }

    public static final String[] Ranks = {
        "King", "Queen", "Jack", "Ten", "Nine", "Eight", 
        "Seven", "Six", "Five", "Four", "Three", "Two", "One"
    };

    public static final int[] Card_Values = {
        10,10,10,10,9,8,
        7,6,5,4,3,2,1
    };

    private final Suit suit;
    private final String name;
    private final int value;

    public Card(Suit s, String n, int v) {
        this.suit = s;
        this.name = n;
        this.value = v; 
    }

    public Suit getSuit() {
        return suit;
    }
    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "s=%s, n=%s, v=%d".formatted(suit, name, value);
    }

}
