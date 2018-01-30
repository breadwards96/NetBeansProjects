package lab3;

/* @Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */

// the required import statements
import java.util.Scanner;
import java.util.StringTokenizer;

public class LessNaiveEncryption {

	public static void main(String[] args) {

		// Setup a scanner object, and receive user's input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Provide an input sentence: ");
		String userInput = keyboard.nextLine();
                
                //initialize a stringTokenizer object to hold and parse the userInput
		StringTokenizer stringTokenizerObject = new StringTokenizer(userInput, " ", true);

                //print the result sentence before the calculation for proper formatting
		System.out.print("The output sentence is   : ");

                //a while loop that takes the phrase and reverses each word until the whole phrase is done
                //will only reverse the letters in the word not the entire sentence
		while (stringTokenizerObject.hasMoreTokens()) {
			StringBuilder token = new StringBuilder(stringTokenizerObject.nextToken());
			System.out.print(token.reverse());

		}
		
                //a final new line to prevent new output from clashing
		System.out.print("\n");
	}
}
