/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warproject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Smit Dobariya
 */
public class GameController extends GroupOfCard {
    
    private ArrayList<Card> p1CollectDeck = new ArrayList<Card>();
    private ArrayList<Card> p2CollectDeck = new ArrayList<Card>();
    private ArrayList<Card> p1DrawDeck = new ArrayList<Card>();
    private ArrayList<Card> p2DrawDeck = new ArrayList<Card>();
    
    private int P1Win=0;
    private int P2Win = 0;
    

    public GameController() {
        super();
    }

    public ArrayList<Card> getp1CollectDeck() {
        return p1CollectDeck;
    }

    public void setp1CollectDeck(ArrayList<Card> p1CollectDeck) {
        this.p1CollectDeck = p1CollectDeck;
    }

    public ArrayList<Card> getp2CollectDeck() {
        return p2CollectDeck;
    }

    public void setp2CollectDeck(ArrayList<Card> p2CollectDeck) {
        this.p2CollectDeck = p2CollectDeck;
    }

    public ArrayList<Card> getDrawCollectP1Deck() {
        return p1DrawDeck;
    }

    public void setDrawCollectP1Deck(ArrayList<Card> p1DrawDeck) {
        this.p1DrawDeck = p1DrawDeck;
    }

    public ArrayList<Card> getDrawCollectP2Deck() {
        return p2DrawDeck;
    }

    public void setDrawCollectP2Deck(ArrayList<Card> p2DrawDeck) {
        this.p2DrawDeck = p2DrawDeck;
    }

    public int getP1Win() {
        return P1Win;
    }

    public void setP1Win(int P1Win) {
        this.P1Win = P1Win;
    }

    public int getP2Win() {
        return P2Win;
    }

    public void setP2Win(int P2Win) {
        this.P2Win = P2Win;
    }

   
    public void Game() {

        Scanner sc = new Scanner(System.in);

       // System.out.println("Player 1 have: ");
        //System.out.println("player card is invisible");
        //System.out.println(super.getP1Deck());
        System.out.println();
       // System.out.println("Player 2 have: ");
        //System.out.println(super.getP2Deck());
        System.out.println("Player 1 want to play? press 1 if you want to play Or press 0 if you want to exit: ");
        int check=sc.nextInt();
        System.out.println("Player 2 want to play? press 1 if you want to play Or press 0 if you want to exit: ");
        int check1=sc.nextInt();
        
        
        Card p1card = super.getP1Deck().get(0);
        Card p2card = super.getP2Deck().get(0);

        

        while(!(super.getP2Deck().size() == 0) || !(super.getP1Deck().size() == 0)) 
        {
            if(check==1 && check1==1)
    
        {
            
            
            p1card = super.getP1Deck().get(0);
            p2card = super.getP2Deck().get(0);

            if (p1card.getValue() > p2card.getValue()) {
                
                System.out.println();
                System.out.println("Player 1 Won!");
                p1CollectDeck.add(p2card);
                p1CollectDeck.add(p1card);
                super.getP2Deck().remove(p2card);
                super.getP1Deck().remove(p1card);
                P1Win++;
            } 
            
            else 
            if(p1card.getValue() < p2card.getValue()){
                
                System.out.println();
                System.out.println("Player 2 won");
                p2CollectDeck.add(p2card);
                
                        p2CollectDeck.add(p1card);
                super.getP2Deck().remove(p2card);
                super.getP1Deck().remove(p1card);
                P2Win++;

            }
            
            
            else 
                if (p1card.getValue() == p2card.getValue()) {
                System.out.println();

                System.out.println("Both Player have Same value it's a WAR Time!!!");
                System.out.println("Drawing the first three cards from both players decks.");

                 System.out.println("player 1' card: "+p1card);
                 System.out.println("player 2' card: "+p2card);
                  
                
                 replay(); 
                for (int i = 0; i < 3; i++) {
                    p1DrawDeck.add(0,super.getP1Deck().get(i+1));
                    p2DrawDeck.add(0,super.getP2Deck().get(i+1));
                }
                
                
                System.out.println(p2DrawDeck + "\n" + p1DrawDeck);
              
                
                
                replay();
                p1card = super.getP1Deck().get(4);
                p2card = super.getP2Deck().get(4);
                System.out.println("player 1' card after draw: "+p1card);
                System.out.println("player 2' card after draw: "+p2card);
                
                if (p1card.getValue() > p2card.getValue() ) 
                {
                    System.out.println();
                    System.out.println("player 1 Won!!");
                    for (int i = 0; i < 3; i++) {
                        
                        p1CollectDeck.add(0,p1DrawDeck.get(0));
                       
                        p1CollectDeck.add(0,p2DrawDeck.get(0));
                       
                    }
                    p1CollectDeck.add(0,super.getP1Deck().get(4));
                    p1CollectDeck.add(0,super.getP2Deck().get(4));
                    p1CollectDeck.add(0,super.getP1Deck().get(0));
                    p1CollectDeck.add(0,super.getP2Deck().get(0));
                    
                    super.getP2Deck().remove(3);
                    super.getP1Deck().remove(3);
                    for(int i = 0; i < 3; i++)
                    {
                    super.getP2Deck().remove(0);
                    super.getP1Deck().remove(0);
                    p1DrawDeck.remove(0);
                    p2DrawDeck.remove(0);
                    }
                    P1Win++;
                    super.getP2Deck().remove(p2card);
                    super.getP1Deck().remove(p1card);
                    
                }
                    
                    
                    
                 
                else 
                if(p1card.getValue() < p2card.getValue()){
                    System.out.println();
                    System.out.println("player 2 won");
                    for (int i = 0; i < 3; i++) {
                       
                         p2CollectDeck.add(0,p1DrawDeck.get(0));
                       
                         p2CollectDeck.add(0,p2DrawDeck.get(0));
                        
                    }
                    p2CollectDeck.add(0,super.getP1Deck().get(4));
                    p2CollectDeck.add(0,super.getP2Deck().get(4));
                    p2CollectDeck.add(0,super.getP1Deck().get(0));
                    p2CollectDeck.add(0,super.getP2Deck().get(0));
                    super.getP2Deck().remove(3);
                    super.getP1Deck().remove(3);
                    for(int i = 0; i < 3; i++)
                    {
                    super.getP2Deck().remove(0);
                    super.getP1Deck().remove(0);
                    p1DrawDeck.remove(0);
                    p2DrawDeck.remove(0);
                    }
                    P2Win++;
                    super.getP2Deck().remove(p2card);
                   super.getP1Deck().remove(p1card);
                    
                    
                }
                }
                
                
                

             

            System.out.println("Player 1's Card: " + p1card);
            System.out.println("Player 2's Card: " + p2card + "\n");
            System.out.println("Player 1 have "+super.getP1Deck().size()+" card left");
            System.out.println("Player 2 have "+super.getP2Deck().size()+" card left");
            
            System.out.println();
            System.out.println();
            System.out.println("Player 1's score: " + P1Win + " \n" + "Player 2 Score: " + P2Win);
            System.out.println("player 1 card in his winning collector Deck: ");
            System.out.println(p1CollectDeck.size());

            System.out.println("player 2's card in his winning collector Deck: ");
            System.out.println(p2CollectDeck.size());
            System.out.println();
            System.out.println();

        
            System.out.println("player 1 want to play again? Press 1 to play again or press 0 to exit: ");
            check=sc.nextInt();
            System.out.println("player 2 want to play again? Press 1 to play again or press 0 to exit: ");
            check1=sc.nextInt();
        
            
        }
        
            else
            {
                
                
                if(!(check==1))
                {
                    
                    System.out.println("Player 2 Win!!");
                    System.out.println("Player 1 Want to exit the Game So Player 2 Win The Game");
                }
                else
                    if(!(check1==1))
                {
                    System.out.println("Player 1 Win!!");
                    System.out.println("Player 2 Want to exit the Game So Player 2 Win The Game");
                    
                }
                break;
                    
            }
            
            replay();
            
            
}
        
        
        
        

        sc.close();

    }
    
    public void replay()
    {
        if(super.getP2Deck().size()==3 || super.getP1Deck().size()==3)
            {
                for(int i = 0; i < p2CollectDeck.size(); i++)
                {
                super.getP2Deck().add(p2CollectDeck.get(0));
                p2CollectDeck.remove(0);
                }
                for(int i = 0; i < p1CollectDeck.size(); i++)
                {
                super.getP1Deck().add(p1CollectDeck.get(0));
                p1CollectDeck.remove(0);
                }
            
            }
        
    }
    
}

