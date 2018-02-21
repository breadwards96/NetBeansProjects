
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
public class RecursiveMutiplication {

    public static double multiply(int x, int y) {

        //field for the end result of the multiplication        
        double product = 0;

        //test for the end of the recursion
        if (x > 0) {

            product += y;

            //reducing the sentinel value by 1, invoking the method again,
            //and assigning the result to the output variable
            product += multiply(x - 1, y);

        }

        return product;
    }

}
