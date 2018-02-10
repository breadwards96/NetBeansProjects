
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brandonedwards
 */
public class gui extends JFrame {
    
     public static void main(String[] args) {
       
         
         //JFrame window = new JFrame();
         
         
         //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         int loc;String str = "The cow jumped over the moon.";
         loc = str.lastIndexOf("e ");
         loc*= str.lastIndexOf("moon!");
         
         System.out.println(loc);
         
         Object noodle = new Object();
         
         String pi = "pi is 3.14159, and then some";
         StringTokenizer toke = new StringTokenizer(pi, "3.14", true);
         while(toke.hasMoreTokens()){
             System.out.println(toke.nextToken());
         }
         
         
    }
    
    
    
    
    
}
