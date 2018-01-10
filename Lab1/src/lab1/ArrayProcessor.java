package lab1;

/*
 * Author Brandon Edwards
 * Date 1/5/18 
 * File ArrayProcessor.java 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
//a simple class with 3 methods that operate on a given integer array.
//these method are designed for a 3 position array.
public class ArrayProcessor {

    //a method to sort an array from smallest to largest using two for loops.
    public int[] sort3IntArrays(int[] anArray) {
        for (int i = 0; i < 2; i++) {

            for (int x = 0; x < 2; x++) {
                //swaps two array postions using a placeholder
                if (anArray[x] > anArray[x + 1]) {
                    int holder = anArray[x];
                    anArray[x] = anArray[x + 1];
                    anArray[x + 1] = holder;
                }
            }
        }

        System.out.println("Sorted array");
        print3IntArray(anArray);

        return anArray;
    }

    //another sorting method to order an array from largest to smallest.
    public int[] reverse3IntArray(int[] anArray) {

        for (int i = 0; i < 2; i++) {
            //Another swap loop but custom for this method
            for (int x = 0; x < 2; x++) {
                if (anArray[x] < anArray[x + 1]) {
                    int holder = anArray[x];
                    anArray[x] = anArray[x + 1];
                    anArray[x + 1] = holder;
                }
            }
        }

        System.out.println("Sorted reversed array");
        print3IntArray(anArray);

        return anArray;
    }

    //This method uses a for loop to print out a given array to the console
    //with focus on readability between array entries and seperate arrays
    public void print3IntArray(int[] anArray) {

        for (int x = 0; x < anArray.length; x++) {
            System.out.println("Entry " + x + " is " + anArray[x]);

        }
        System.out.println();
    }

}
