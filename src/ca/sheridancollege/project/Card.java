
import java.util.ArrayList;
import java.util.Collections;

public class Card {

    public enum Suit {
        HEARTS, DIAMONDS, CLUBS, SPADES
    }

    public enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

public ArrayList<String> makeDeck()
   {   
    
    Value[] values = Value.values();

    Suit[] suit = Suit.values();

    ArrayList<String> deck = new ArrayList<String>();

    for (Suit s : suit) {
        for (Value value : values) {
            deck.add(value + " of " + s);
        }
    }

    Collections.shuffle(deck);

    return deck;

    
}
}