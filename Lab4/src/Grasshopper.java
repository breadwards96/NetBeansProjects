/**@author Brandon Edwards 
 * @since 2/5/18 
 **/
/**
 * honorCode I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 **/

public class Grasshopper extends Insect {

    //fields
    private double jumpDistance;

    //methods
    /**
     * The default constructor.
     *
     */
    public Grasshopper() {
    }

    /**
     * This setter method takes a double and sets the grasshopper's jump
     * distance.
     *
     * @param dist the distance that the grasshopper can jump.
     *
     */
    public void setJumpDist(double dist) {
        jumpDistance = dist;
    }

    /**
     * This getter returns the double representing the grasshopper's jump
     * distance.
     *
     * @return the grasshopper's jump distance.
     *
     */
    public double getJumpDist() {
        return jumpDistance;
    }
}


