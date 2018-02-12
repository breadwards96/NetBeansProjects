
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Brandon Edwards
 * @since 2/5/18 
 *
 */
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class BankAccountProcessor {

    //a program that reads a file of bank accounts and detects errors
    public static void main(String[] args) throws FileNotFoundException {

        //fields
        boolean runProgram = true;
        Scanner keyboard = new Scanner(System.in);
        String file;
        File accountFile = null;
        Scanner inputFile;

        //asking for user input
        System.out.println("Enter a filename (with extension)");
        file = keyboard.nextLine();
        
        //opening the file with a scanner
        accountFile = new File(file);
        inputFile = new Scanner(accountFile);

        //while loop to read through the lines in the file
        while (runProgram) {

            //try catch for validating the lines
            //throws custom exception if an error is found
            try {
                String fileLine = inputFile.nextLine();
                if (isValid(fileLine)) {
                    System.out.println("Account: "
                            + fileLine + " is valid");
                }
            } catch (BankAccountException bae) {
                System.out.println("Exception caught would you like to continue? y/n");
                switch (keyboard.nextLine()) {
                    case "y":
                        break;
                    case "n":
                        System.out.println("Okay, closing");
                        return;
                    default:
                        System.out.println("Invalid entry... closing");
                        return;
                }
            }
            //if to detect EOF and stop loop
            if (inputFile.hasNext()) {
            } else {
                System.out.println("Parsing Complete");
                runProgram = false;
            }
        }

    }

    //method for checking two parameters in the fileline
    private static boolean isValid(String fileLine) throws BankAccountException {

        //fields
        boolean digitValidity = false, nameValidity = false;
        StringTokenizer toke = new StringTokenizer(fileLine, ";", false);
        char[] accountParts;
        final int REQUIRED_LENGTH = 3;

        //checking for letters or anomolies in account number
        accountParts = toke.nextToken().toCharArray();
        for (int x = 0; x < accountParts.length; x++) {
            if (Character.isDigit(accountParts[x])) {
                digitValidity = true;
            } else {
                digitValidity = false;
                System.out.println("The character: '" + accountParts[x]
                        + "' is not a valid number");
                throw new BankAccountException(fileLine);
            }

        }
        //checking account names for short names,
        //and non-alphabetical or non-whitespace characters
        accountParts = toke.nextToken().toCharArray();
        for (int x = 0; x < accountParts.length; x++) {
            if (accountParts.length > REQUIRED_LENGTH) {
                if (Character.isAlphabetic(accountParts[x])
                        || Character.isWhitespace(accountParts[x])) {
                    nameValidity = true;
                } else {
                    nameValidity = false;
                    System.out.println("Error: This account name is not valid");
                    System.out.println(fileLine + " is not valid");
                    throw new BankAccountException(fileLine);
                }
            } else {
                break;
            }
        }

        //only retruns true if both checks are valid
        return digitValidity && nameValidity;
    }
}
