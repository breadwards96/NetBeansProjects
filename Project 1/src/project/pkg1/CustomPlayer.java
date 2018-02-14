package project.pkg1;

import java.util.StringTokenizer;

/* Add code to CustomPlayer class only in Step IV of this coding project. 
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
        System.out.println("You have + " + hitPoints + " Hit Point(s)");
        System.out.println("  A total of " + numItems + " item(s)");
    }
}