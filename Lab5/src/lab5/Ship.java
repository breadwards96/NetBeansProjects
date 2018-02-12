
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
public abstract class Ship {
    
    private String name;
    private int yearBuilt;
    private int numPropellars = 0;
    
    public Ship(String name, int year){
        
        this.name = name;
        yearBuilt = year;
    }

    public String getName() {
        return name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getNumPropellars() {
        return numPropellars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void setNumPropellars(int numPropellars) {
        this.numPropellars = numPropellars;
    }
    
    @Override
    public abstract String toString();
}
