package hw2.pkg2;

import java.util.Scanner;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class PasswordDemo {

    public static void main(String[] args) {
        //fields for user input
        Scanner keyboard = new Scanner(System.in);
        String input;

        //user interaction
        System.out.println("A valid password must contain:" 
                + "\n at least 6 characters" 
                + "\n at least 1 uppercase" 
                + "\n at least 1 lowercase" 
                + "\n and at least 1 number");
        System.out.println("Enter a password:");
        input = keyboard.nextLine();

        //checking for validity and printing the proper response
        if (PasswordVerifier.isValid(input)) {
            System.out.print("That password is valid");
        } else {
            System.out.println("That password is not valid!");
        }
    }

}
