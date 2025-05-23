/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Andrea Fausto 991745454
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        
        // Scanner input = new Scanner(System.in);
        
        // System.out.println("Pick a number: ");
        // int number = input.nextInt();
        // input.nextLine();
        
        // System.out.println("Pick a suit: ");
        // String suit = input.nextLine();
        
        // Card test1 = new Card();
        // test1.setValue(number);
        // test1.setSuit(suit);
        
        
        // boolean matchTest = false;
        
        
        // for (Card c2 : magicHand){
        //     if(c2.getValue()== number && c2.getSuit().equals(suit)){
        //         matchTest = true;
        //     }
        // }
        
        // if (matchTest){
        //     System.out.println("They match!!");
        // }
        // else{
        //     System.out.println("Oops they don't match");
        // }


        int number = input.nextInt();
        String suit = input.nextLine();

        
        Card luckyCard = new Card();

        luckyCard.setValue(4);
        luckyCard.setSuit("Hearts");

        boolean matchTest = false;
        
        
        for (Card c2 : magicHand){
            if(c2.getValue()== number && c2.getSuit().equals(suit)){
                matchTest = true;
            }
        }
        
        if (matchTest){
            System.out.println("They match!!");
        }
        else{
            System.out.println("Oops they don't match");
        }
        
 
    }
    
}
