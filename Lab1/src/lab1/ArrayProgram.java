package lab1;

import java.util.Random;

/*
 * Author Brandon Edwards 
 * Date 1/5/18 
 * File ArrayProcessor.java 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
//a main method class that constructs an array and uses the ArrayProcessor class
//to sort and print the array positions to the console
public class ArrayProgram {

    public static void main(String[] args) {

        //creation of an array with three positions
        int[] anArray = new int[3];

        //Initializing the processor and a random number generator
        //to fill the array
        ArrayProcessor processor = new ArrayProcessor();
        Random randomNumber = new Random();

        //a for loop to place a random number between 0 and 10
        //in each position on the array
        for (int x = 0; x < 3; x++) {
            anArray[x] = randomNumber.nextInt(11);
        }

        // statements to print and operate on the array created in line 22
        System.out.println("Original array");
        processor.print3IntArray(anArray);
        processor.sort3IntArrays(anArray);
        processor.reverse3IntArray(anArray);

    }

}
