package lab2;

import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class RobotTorso {
    
    private int numArms;
    
    //constructor for torso, sets arm number between 0 and 9
    public RobotTorso(){
        
        Random numGen = new Random();
        
        numArms = numGen.nextInt(10);
        
    }
    
    //toString for arm number
    @Override
    public String toString(){
      
        String output = "this robot torso has " 
                + numArms 
                + " arms";
        
        return output;
    }
    
}
