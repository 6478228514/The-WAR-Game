/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package warproject;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static warproject.Card.Rank.ACE;
import static warproject.Card.Suit.SPADES;

/**
 *
 * @author sukhm
 */
public class DeckTest {
    
    /*public DeckTest() {
    }
    
    /*@BeforeClass
   // public static void setUpClass() {
   // }
    
   @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("shuffle");
        ArrayList<Card> x = new ArrayList(26);
        Deck instance = new Deck();
        instance.shuffle(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testShuffleBad() {
        System.out.println("shuffle");
        ArrayList<Card> x = new ArrayList(0);
        Deck instance = new Deck();
        instance.shuffle(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        @Test
    public void testShuffleBoundary() {
        System.out.println("shuffle");
        ArrayList<Card> x = new ArrayList(1);
        Deck instance = new Deck();
        instance.shuffle(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of size method, of class Deck.
     */
    @Test
    public void testSizeGood() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testSizeBad() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
          @Test
         public void testSizeBoundary() {
        System.out.println("size");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
