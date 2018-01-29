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

		// Step 1: create a StringTokenizer object using the
		// constructor that takes as the first argument the
		// string, the second argument the delimiter, and the
		// third argument the boolean value true. The last
		// argument to that constructor indicates if the
		// Delimiter should or should not itself be a token.
		// The first argument that you pass to the StringTokenizer
		// should be the variable userInput.
		//
		// Step 1 can be completed in a single line of code.
                
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
		// Step 2a: Refer to the lecture slides, or page 597 of
		// the book, to see how you can tokenize the sentence
		// that you've placed into userInput. You can use a
		// while loop, or a for loop (I recommend a while).
		//
		// Step 2b: For each token (word) that you extract from
		// the input sentences, build a StringBuilder object. We
		// learned in lecture that the StringBuilder Class has
		// many useful methods used to manipulate a String.
		// Perform a web search for "Java 8 API", and access the
		// oracle webpage. Click on the StringBuilder class
		// name in the navigation box on the left of the
		// screen, and look for a method that will reverse the
		// String field in the StringBuilder object that you've
		// created.
		//
		// Step 2c: Use the method that you've found via the API,
		// to reverse the String field in your StringBuilder object,
		// and print that reverse String to the console.
		//
		// Steps 2a through 2c can be completed with 5 lines of code.
		// If you used System.out.print when tokenizing your
		// String, the following command will output a final
		// blank line after the last output
		System.out.print("\n");
	}
}
