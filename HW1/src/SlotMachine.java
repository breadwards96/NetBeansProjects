
import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/13/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class SlotMachine {

    private int[] row1 = new int[3];
    private int[] row2 = new int[3]; 
    private int[] row3 = new int[3];

    public SlotMachine() {
        playMachine();
    }

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

    public boolean isWinner() {
        boolean result = false;

        if(row1[0] == row1[1] && row1[1] == row1[2]){
            result = true;
            return result;
        }
        if(row2[0] == row2[1] && row2[1] == row2[2]){
            result = true;
            return result;
        }
        if(row3[0] == row3[1] && row3[1] == row3[2]){
            result = true;
            return result;
        }
        
                
                
        return result;
    }

}
