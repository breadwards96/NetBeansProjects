package lab5;

/**
 * @author Brandon Edwards
 * @since 2/12/18
 *
 **/
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class CruiseShip extends Ship{
    
    private int passengers;
    private int numPets;

    public CruiseShip(String name, int year, int passengers, int numPets) {
        super(name, year);
        this.passengers = passengers;
        this.numPets = numPets;
    }

    /**
     * @return the passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * @param passengers the passengers to set
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    /**
     * @return the numPets
     */
    public int getNumPets() {
        return numPets;
    }

    /**
     * @param numPets the numPets to set
     */
    public void setNumPets(int numPets) {
        this.numPets = numPets;
    }

    @Override
    public String toString() {
        
        String response = "Name: " + super.getName()
                + "\nYear Built: " + super.getYearBuilt()
                + "\nNumber of Propellars: " + super.getNumPropellars()
                + "\nPassengers: " + getPassengers()
                + "\nNumber of Pets: " + getNumPets();

        return response;
    }
    
   
}
