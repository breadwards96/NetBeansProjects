package Task2;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class PasswordVerifier {

    private final static int MIN_PASSWORD_LENGTH = 6;

    public static boolean isValid(String str) {
        
        if(str.length() >= MIN_PASSWORD_LENGTH){
            
            return hasUpperCase(str) && hasLowerCase(str) && hasDigit(str);
        }
        
        return false;
    }

    public static boolean hasUpperCase(String str) {
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

    public static boolean hasLowerCase(String str) {
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

    public static boolean hasDigit(String str) {

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
