/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package war;

import java.util.Random;
import java.util.Set;

/**
 *
 * @author brandonedwards
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] deck1 = new int[52];
        int[] deck2 = new int[52];
        int[] deal
                = {1, 1, 1, 1,
                    2, 2, 2, 2,
                    3, 3, 3, 3,
                    4, 4, 4, 4,
                    5, 5, 5, 5,
                    6, 6, 6, 6,
                    7, 7, 7, 7,
                    8, 8, 8, 8,
                    9, 9, 9, 9,
                    10, 10, 10, 10,
                    11, 11, 11, 11,
                    12, 12, 12, 12,
                    13, 13, 13, 13,};
        
        shuffle(deal);
        
        for(int x: deal){
            System.out.println(x);
        }

    }

    public static int[] shuffle(int[] deck) {

        int placeholder, position1, position2;

        Random numGen = new Random();

        for (int x = 0; x < deck.length; x++) {
            position1 = numGen.nextInt(52);
            position2 = numGen.nextInt(52);
            placeholder = deck[position1];
            deck[position1] = deck[position2];
            deck[position2] = deck[position1];

        }

        return deck;
    }
    
    public deal(int[] deck1, int[] deck2, int[] dealingDeck){
        for(int x = 0; x < (dealingDeck.length/2); x++){
            
        }
        }
    }

