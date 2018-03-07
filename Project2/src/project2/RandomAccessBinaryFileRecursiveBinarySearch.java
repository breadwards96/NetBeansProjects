package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Brandon Edwards
 * @since 2/26/18
 *
 *
 */
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class RandomAccessBinaryFileRecursiveBinarySearch {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //fields
        boolean prompt = true;
        int cycle = 0;
        short index = 0;
        Scanner keyboard = new Scanner(System.in);
        File binFileShort = new File("BinFileShort");
        RandomAccessFile randoFile = new RandomAccessFile(binFileShort, "r");
        BinaryRecursiveSearch recurSearcher = new BinaryRecursiveSearch();

        //loop to prompt user 10 times
        while (prompt) {

            if (cycle > 10) {
                prompt = false;
            }

            System.out.println("The File is " + randoFile.length()
                    + " Bytes long");

            System.out.println("Please enter a number to look for: ");
            
            //Error Handling
            try{
            index = keyboard.nextShort();
            }catch(InputMismatchException e){
                System.out.println("Sorry that's not a valid number. Closing.");
                break;
            }
            
            //search function
            long result = recurSearcher.search(randoFile,
                    0, randoFile.length() - 1, index);

            //result processing and subsequent output
            if (result == -1) {
                System.out.println("The number " + index
                        + " could not be found in the file");
            } else {
                System.out.println("The number " + index
                        + " was found at file position "
                        + result);
            }
            cycle++;
        }

    }

}