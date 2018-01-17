
import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/13/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class SlotMachine {

    //three int arrays to represent the slot dials
    private int[] row1 = new int[3];
    private int[] row2 = new int[3]; 
    private int[] row3 = new int[3];

    //constructor to create and play a slot machine
    public SlotMachine() {
        playMachine();
    }

    //gens a random number and plays the three dials
    public void playMachine() {

        Random numberGenerator = new Random();

        for (int x = 0; x < row1.length; x++) {
            row1[x] = numberGenerator.nextInt(10);
        }
        
        for (int x = 0; x < row2.length; x++) {
            row2[x] = numberGenerator.nextInt(10);
        }
        
        for (int x = 0; x < row3.length; x++) {
            row3[x] = numberGenerator.nextInt(10);
        }
        
    }

    //checks the three dials for the same number and determines winners
    public boolean isWinner() {

        if(row1[0] == row1[1] && row1[1] == row1[2]){
            return true;
        }
        if(row2[0] == row2[1] && row2[1] == row2[2]){
            return true;
        }
        return row3[0] == row3[1] && row3[1] == row3[2];
    }

}
