package project1;

import java.util.Scanner;

/**
 * Project: Project1 Author: Brandon Edwards 
 * Creation date: 10/5/18 
 * Completion time: 6 hours
 *
 * Honor Code: I pledge that this program represents my own program code. I
 * received help from in designing and debugging my program.
 */
public class Driver {

    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {

        new Driver().run();

    }

    /**
     * the way the program's going to operate.
     */
    public void run() {

        //prompting for first set of vector dimensions
        System.out.println("First vector:");
        MyVector vector1 = new MyVector(parser(prompt()));

        //prompting for second set of vector dimensions
        System.out.println("Second vector:");
        MyVector vector2 = new MyVector(parser(prompt()));

        //vector output for accuracy checking
        System.out.println("Vector 1:");
        System.out.println(vector1);
        System.out.println("");

        System.out.println("Vector 2:");
        System.out.println(vector2);
        System.out.println("");

        //Copy constructor
        System.out.println("Copy constructor demo");
        MyVector vector3 = new MyVector(vector1);

        System.out.println("Vector 1:");
        System.out.println(vector1);

        System.out.println("Vector 1 copy");
        System.out.println(vector3);

        //Addition operation
        System.out.println("Addition: ");
        vector3 = vector1.plus(vector2);
        System.out.println(vector3);
        System.out.println("");

        //Subtraction operation
        System.out.println("Subtraction: ");
        vector3 = vector1.minus(vector2);
        System.out.println(vector3);
        System.out.println("");

        //Scalar product operation
        System.out.println("Scale up by ten: ");
        vector3 = vector1.scale(10);
        System.out.println(vector3);
        vector3 = vector2.scale(10);
        System.out.println(vector3);
        System.out.println("");

        //Equals operation
        System.out.println("Equivalence: ");
        System.out.println(vector1.equals(vector2));
        System.out.println("");

        //Dot product operation
        System.out.println("Dot Product: ");
        vector3 = vector1.dotProd(vector2);
        System.out.println(vector3);
        System.out.println("");

        //absolute value operation
        System.out.println("Absolute value: ");
        System.out.println(vector1.abs());
        System.out.println(vector2.abs());

    }

    /**
     * IO method to handle input from the keyboard.
     *
     * @return String
     */
    private String prompt() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input a vector with commas between each dimension");
        String response = keyboard.next();

        return response;
    }

    /**
     * used to digest strings into a double array for the myVector constructor.
     *
     * @param response
     * @return double[]
     */
    public double[] parser(String response) {

        String[] tokens = response.split(",");
        double[] doubleTokens = new double[tokens.length];

        for (int i = 0; i < tokens.length; i++) {

            try {

                double doubleToken = Double.parseDouble(tokens[i]);
                doubleTokens[i] = doubleToken;

            } catch (NumberFormatException e) {
                System.out.println("non-number character found at position "
                        + i);
                System.out.println("replacing with 0.0");

            }

        }

        System.out.println("\nthere are " + doubleTokens.length
                + " tokens in the array");
        System.out.println("");

        return doubleTokens;
    }
}
