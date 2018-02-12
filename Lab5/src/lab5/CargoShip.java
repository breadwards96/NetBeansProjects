
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
public class CargoShip extends Ship{
    
    private int tonnage;
    private boolean isDoubleHull;

    public CargoShip(String name, int year,int tonnage, boolean doubleHull) {
        super(name,year);
        this.tonnage = tonnage;
        isDoubleHull = doubleHull;
    }

    /**
     * @return the tonnage
     */
    public int getTonnage() {
        return tonnage;
    }

    /**
     * @param tonnage the tonnage to set
     */
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    /**
     * @return the isDoubleHull
     */
    public boolean getIsDoubleHull() {
        return isDoubleHull;
    }

    /**
     * @param isDoubleHull the isDoubleHull to set
     */
    public void setIsDoubleHull(boolean isDoubleHull) {
        this.isDoubleHull = isDoubleHull;
    }
    
    @Override
    public String toString() {
        
        String response = "Name: " + super.getName()
                + "\nYear Built: " + super.getYearBuilt()
                + "\nNumber of Propellars: " + super.getNumPropellars()
                + "\nTonnage: " + getTonnage()
                + "\nDouble Hull: " + getIsDoubleHull();
        
        
        return response;
    }
    
}
