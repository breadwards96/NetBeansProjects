package project3;

import java.util.Scanner;

/*
*
* Project: Project3                                             
* Author: Brandon Edwards                       
* Creation date: 10/30/2018                                   
* Completion time: 4 hours                                     
*                                                              
* Honor Code: I pledge that this program represents my         
* own program code. I received help from (fill in the name)  
* in designing and debugging my program.  
*/
public class KnightUser {

    Scanner keyboard;
    Knight knight;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new KnightUser().run();
        

    }
    
    public void run(){
        
        keyboard = new Scanner(System.in);
        
        System.out.println("Input board width");
        int width = keyboard.nextInt();
        
        System.out.println("Input board length");
        int length = keyboard.nextInt();
        
        System.out.println("Input a starting x position");
        int startX = keyboard.nextInt();
        
        System.out.println("Input a starting y position");
        int startY = keyboard.nextInt();
        
        Knight knight1 = new Knight(width, length, startX, startY);
        
        this.searchTour();
        
    }

    private void searchTour() {
        
        knight.back.tryToReachGoal(knight.getStart());
        System.out.println("");
            }
}
