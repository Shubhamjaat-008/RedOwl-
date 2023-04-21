/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shubh
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
public void testCardsToPlayerOne() {
    Player player = new Player();
    ArrayList<String> player1 = player.cardsToPlayerOne();

    // Check that player1 has 6 cards
    assertEquals(6, player1.size());

    // Check that player1 has no duplicate cards
    HashSet<String> set = new HashSet<String>(player1);
    assertEquals(6, set.size());

    // Check that player1's cards are not in the deck anymore
    ArrayList<String> deck = player.cardobj.makeDeck();
    deck.removeAll(player1);
    assertEquals(46, deck.size());
}

@Test
public void testCardsToPlayerTwo() {
    Player player = new Player();
    ArrayList<String> player2 = player.cardsToPlayerTwo();

    // Check that player2 has 6 cards
    assertEquals(6, player2.size());

    // Check that player2 has no duplicate cards
    HashSet<String> set = new HashSet<String>(player2);
    assertEquals(6, set.size());

    // Check that player2's cards are not in the deck anymore
    ArrayList<String> deck = player.cardobj.makeDeck();
    deck.removeAll(player2);
    assertEquals(46, deck.size());
}

}
