/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warproject;
import java.util.ArrayList;

/**
 *
 * @author Smit Dobariya
 */
public class GroupOfCard extends Deck {

    private ArrayList<Card> p2Deck=  new ArrayList<>();
    private ArrayList<Card> p1Deck = new ArrayList<>();
    private ArrayList<Card> shuffleCard = new ArrayList<>();

    public ArrayList<Card> getP2Deck() {
        return p2Deck;
    }

    public void setp2Deck(ArrayList<Card> p2Deck) {
        this.p2Deck = p2Deck;
    }

    public ArrayList<Card> getP1Deck() {
        return p1Deck;
    }

    public void setP1Deck(ArrayList<Card> p1Deck) {
        this.p1Deck = p1Deck;
    }

    public ArrayList<Card> getshuffleCard() {
        return shuffleCard;
    }

    public void setshuffleCard(ArrayList<Card> shuffleCard) {
        this.shuffleCard = shuffleCard;
    }


    public GroupOfCard(){
        Shuffle();
        p2Deck();
        p1Deck();
    }

    public void Shuffle() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                Card card = new Card(suit, rank);
                
                shuffleCard.add(card);
            }
        }
        super.shuffle(shuffleCard);
    }
 
    public void p2Deck(){
        for(int i = 0; i<shuffleCard.size()/2;i++){
            p2Deck.add(shuffleCard.get(i));
        }
    }
    public void p1Deck(){
        for(int i = shuffleCard.size()/2; i<shuffleCard.size();i++){
            p1Deck.add(shuffleCard.get(i));
        }
    }




}
