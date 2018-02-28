package project2;

import java.io.IOException;
import java.io.RandomAccessFile;

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
public class BinaryRecursiveSearch {

    public BinaryRecursiveSearch() {
    }

    //search method
    public long search(RandomAccessFile file, long start, long end, Short index)
            throws IOException {

        //finding the middle
        long middle = (start + end) / 2;

//        System.out.println("length: " + file.length());
//        System.out.println("pos: " + middle);
        file.seek((middle * 2));

        //for position processing
        short number = file.readShort();

        //case for number not found
        if (middle >= file.length() || middle < start) {
//            System.out.println("File position: " + middle
//            + "\nFile length: " + file.length());
//            System.out.println("Number: " + number);
            return -1;
        }

        //base case for number found
        if (number == index) {
//            System.out.println("Number: " + number);
            return middle;
        }
        
        //recursion for too high or too low
        if (number < index) {
//            System.out.println("Number: " + number);
            return search(file, middle + 1, end, index);
        } else {
//            System.out.println("Number: " + number);
            return search(file, start, middle - 1, index);
        }
    }
}
