
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

    public static void main(String[] args) throws FileNotFoundException {

        boolean runProgram = true;
        Scanner keyboard = new Scanner(System.in);
        String file;
        File accountFile = null;
        Scanner inputFile;

        System.out.println("Enter a filename (with extension)");
        file = keyboard.nextLine();
        accountFile = new File(file);
        inputFile = new Scanner(accountFile);

        while (runProgram) {

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
            if (inputFile.hasNext()) {
            } else {
                System.out.println("Parsing Complete");
                runProgram = false;
            }
        }

    }

    private static boolean isValid(String fileLine) throws BankAccountException {

        boolean digitValidity = false, nameValidity = false;
        StringTokenizer toke = new StringTokenizer(fileLine, ";", false);
        char[] accountParts;
        final int REQUIRED_LENGTH = 3;

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

        return digitValidity && nameValidity;
    }
}
