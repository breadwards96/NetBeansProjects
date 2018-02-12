
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
public class gui {
    
     public static void main(String[] args) {
       
         
         //JFrame window = new JFrame();
         
         
         //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
             int number;
 
   try {
      String st =  "xyz";
      System.out.println(st.startsWith("X"));
      number= Integer.parseInt(st);
      System.out.println( "A"); 
   }
   catch(NumberFormatException e)  {
      System.out.println( "B");
   }
   catch(IllegalArgumentException e) {
      System.out.println( "C");
   }

   System.out.println( "D");  }   }    
    
    
  
