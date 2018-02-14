
package lab5;

/**
 * @author Brandon Edwards
 * @since 2/12/18
 **/
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class ShipDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int NUM_SHIPS = 3;
        
        Ship[] ships = new Ship[NUM_SHIPS];
        
        ships[0] = new CargoShip("USS Hauler", 1945, 89, true);
        ships[1] = new CruiseShip("Grand Victoria", 1981, 350, 6);
        ships[2] = new CruiseShip("Olympic", 1901, 150, 0);
        
        for(Ship x:ships){
            System.out.println(x);
            System.out.println("--------------------------");
        }

    }
    
}
