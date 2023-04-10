/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warproject;

/**
 *
 * @author Smit Dobariya
 * @author Sukhman Wahniwal
 * @author Jaismin 
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class WarProject {

   //contains the main method
    public static void main(String[] args) {
      
        System.out.println("Welcome to the card game of WAR!");
        System.out.println("Here are some rules of the game that should be followed!!!!");
        System.out.println("The deck will be divided in two player automatically by computer.\n players will not be allowed to see their card");
        System.out.println("Player will type 1 number to put their card face up or they can press 0 to exit the game.");
        System.out.println("The player who have higher value card wins the round.");
        System.out.println("if both player has same card then they will draws three card from their deck and puts them face down.");
        System.out.println("again Each player then draws one card from their deck and the player who has highest value will win all the cards on table.");
        System.out.println("The game will be continued until one player has all the card or player want to exit.");
        System.out.println("If any player will exit in middle of the game he will loose the game");

        GameController gl = new GameController();
        gl.Game();

       }
    
}

