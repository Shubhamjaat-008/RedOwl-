/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */




import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shubh
 */
public class CardTest {
    
  
    @Test
    public void testMakeDeck() {
        Card card = new Card();
        ArrayList<String> deck = card.makeDeck();

        // Check that the deck has 52 cards
        assertEquals(52, deck.size());

        // Check that the deck has no duplicate cards
        assertEquals(52, deck.size());

    }

}





