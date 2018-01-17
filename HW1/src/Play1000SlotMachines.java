
import java.util.ArrayList;
import java.util.List;

/* Author Brandon Edwards 
 * Date 1/13/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class Play1000SlotMachines {

    public static void main(String[] args) {

        int winner = 0;

        SlotMachine[] slotArray;
        slotArray = new SlotMachine[1000];

        for (int x = 0; x < slotArray.length; x++) {
            slotArray[x] = new SlotMachine();
            if (slotArray[x].isWinner()) {
                winner++;
            }
        }
        System.out.println("Out of 1000 slot machines, " + winner + " were winners.");

    }
}
