/**@author Brandon Edwards 
 * @since 2/5/18 
 * 
 * honorCode I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 **/

public class BankAccountException extends Exception{

    public BankAccountException(String accountLine) {
        super("Error! Account: " 
                    + accountLine + " is not valid");
    }
    
    
}
