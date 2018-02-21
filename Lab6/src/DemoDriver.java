
import java.util.Scanner;

/**
 * @author Brandon Edwards
 * @since 2/12/18
 *
 *
 */
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class DemoDriver {

    public static void main(String[] args) {

        //fields for user input
        Scanner keyboard = new Scanner(System.in);
        int input1;
        int input2;

        //prompting the user for integers to multiply
        System.out.println("Welcome to recursive math"
                + "\nPlease enter an integer");
        input1 = keyboard.nextInt();

        System.out.println("Please enter a second integer");
        input2 = keyboard.nextInt();

        System.out.println("Multiplying...");

        System.out.println(input1 + " times " + input2 + " equals "
                + RecursiveMutiplication.multiply(input1, input2));

    }
}
