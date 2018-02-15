package project.pkg1;

import java.util.StringTokenizer;

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
public class CustomPlayer extends Player {

    private int hitPoints;

    public CustomPlayer(String name, int room, String inventory, int hitPoints) {
        super(name, room, inventory);
        this.hitPoints = hitPoints;

    }

    /**
     * @return the hitPoints
     */
    public int getHitPoints() {
        return hitPoints;
    }

    /**
     * @param hitPoints the hitPoints to set
     */
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    /**
     * Prints the users inventory and hit points to the console
     */
    @Override
    public void printInventory() {
        StringTokenizer strT = new StringTokenizer(super.getInventory(), ";");
        System.out.println(super.getName() + "'s items: ");
        int numItems = 0;
        while (strT.hasMoreTokens()) {
            System.out.println("  " + strT.nextToken());
            numItems++;
        }
        System.out.println("You have " + hitPoints + " Hit Point(s)");
        System.out.println("  A total of " + numItems + " item(s)");
    }
}
