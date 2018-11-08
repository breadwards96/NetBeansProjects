package project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Project: Project1 
 * Author: Brandon Edwards 
 * Creation date: 11/5/2018 
 * Completion time: 4 hours
 *
 * Honor Code: I pledge that this program represents my own program code. I
 * received help from no one in designing and debugging my program.
 */
public class Driver {

    /**
     * invokes the run method to test for palindromes
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new Driver().run();

    }

    /**
     * a simple method to invoke the methods needed to process the palindromes 
     */
    public void run() {

        System.out.println(
                palindrome(
                        parser(
                                prompt()
                        )
                )
        );

    }

    /**
     * uses two iterators to check if a linked list containing myVector objects
     * is a palindrome or not
     * 
     * @param list
     * @return 
     */
    public String palindrome(LinkedList list) {

        ListIterator<MyVector> frontItr = list.listIterator(0);
        ListIterator<MyVector> backItr = list.listIterator(list.size());
        int size = list.size();

        for (int i = 0; i < size / 2; i++) {
            MyVector frontPos = frontItr.next();
            MyVector backPos = backItr.previous();
            
            for (int j = 0; j < frontPos.size(); j++) {
                if (!(frontPos.equals(backPos))) {
                    return "Not Palindrome";
                }
            }
        }
        return "Palindrome";
    }

    /**
     * IO method to handle input from a file.
     *
     * @return String
     */
    private String prompt() {
        Scanner file;
        try {
            System.out.println("Reading file");
            file = new Scanner(new File("Palindrome.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("File Palindrome.txt not found in project folder");
            return null;
        }
        String response = file.next();
        return response;
    }

    /**
     * used to digest strings into a double array for the myVector constructor.
     *
     * @param response
     * @return double[]
     */
    public LinkedList parser(String response) {

        String[] tokens = response.split(",");
        double[] doubleTokens;
        MyVector vector;
        LinkedList<MyVector> list = new LinkedList<>();

        System.out.println("Filling linked list with myVector objects");
        
        for (int i = 0; i < tokens.length; i++) {

            try {

                double doubleToken = Double.parseDouble(tokens[i]);
                doubleTokens = new double[1];
                doubleTokens[0] = doubleToken;
                vector = new MyVector(doubleTokens);
                list.add(vector);

            } catch (NumberFormatException e) {
                System.out.println("non-number character found at position "
                        + i);
                System.out.println("replacing with 0.0");
            }
        }

        return list;
    }
}
