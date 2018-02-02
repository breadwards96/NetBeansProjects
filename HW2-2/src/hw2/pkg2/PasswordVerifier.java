package hw2.pkg2;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class PasswordVerifier {

    //minimum password length
    private static final int MIN_PASSWORD_LENGTH = 6;

    //the only public method for checking the validity of a password
    public static boolean isValid(String str) {
        //checking length
        if (str.length() >= MIN_PASSWORD_LENGTH) {
            //checking other requirements
            return hasUpperCase(str) && hasLowerCase(str) && hasDigit(str);
        }
        return false;
    }

    //check for uppercases
    private static boolean hasUpperCase(String str) {
        boolean flag = false;
        char[] set = str.toCharArray();
        for (char c : set) {
            if (Character.isUpperCase(c)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //check for lowercases
    private static boolean hasLowerCase(String str) {
        boolean flag = false;
        char[] set = str.toCharArray();
        for (char c : set) {
            if (Character.isLowerCase(c)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    
    //check for digits
    private static boolean hasDigit(String str) {
        boolean flag = false;
        char[] set = str.toCharArray();
        for (char c : set) {
            if (Character.isDigit(c)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    
}
