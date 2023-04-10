/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warproject;

/**
 *
 * @author Smit Dobariya
 * @author Sukhman Wahniwal
 * @author Jaismin
 */
public class Card {
    
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public enum Suit {
        SPADES,
        DIAMONDS,
        CLUBS,
        HEARTS
    }

    public enum Rank {
        ACE(14),
        KING(13),
        QUEEN(12),
        JACK(11),
        TEN(10),
        NINE(9),
        EIGHT(8),
        SEVEN(7),
        SIX(6),
        FIVE(5),
        FOUR(4),
        THREE(3),
        TWO(2);

        private final int value;

        Rank(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }

    

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String toString() {
        return rank + " of " + suit;
    }
  

}
