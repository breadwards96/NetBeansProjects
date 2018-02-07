package project.pkg1;

/* Since you did not write or even modify the player class, 
 * do not add your name, date, and honor code to it. */
 
 /* Do NOT modify the Player class in any way. 
  * Do NOT add code. 
  * Do NOT remove code. 
  * Leave it as-is.*/
 
/* The Player class is a superclass that holds information about the game's player. 
 * A player has an inventory (that is a String, with items separated by semicolons), 
 * a name, and the field roomNum, 
 * which is the ID of the room where the player currently 
 * is located within the game grid. 
 * The methods in the Player class are used to add or remove items 
 * from the player's inventory, and to retrieve the values of the private 
 * instance fields. 
 * The constructor for the Player class takes as an argument the player's name, 
 * a room number (that designates the room where the player begins the game), 
 * and a String that represents the player's inventory. 
 * Objects in the inventory are separated by semi-colons. 
 * For example, to create a new player with the name Santa, 
 * which begins the game in room 1, and which has an inventory of 
 * toys, hot chocolate, and mittens, you would write: 
 *
 * Player player = new Player(�Santa�, 1, �toys;hot chocolate;mittens�); 
 */

// import statements

import java.util.StringTokenizer;

// class for a generic player
public class Player {

    // current room number of the player
    private int roomNum;
    // name of the player
    private String name;
    // the ; separated list of items the play has
    private String playerInventory;
    // flag to control flow of game
    private boolean continuePlay;
 
 /* Do NOT modify the Player class in any way. 
  * Do NOT add code. 
  * Do NOT remove code. 
  * Leave it as-is.*/
 

    // non-default constructor Player(�Santa�, 1, �toys;hot chocolate;mittens�); 
    public Player(String name, int room, String inventory) {
        this.name = name;
        roomNum = room;
        continuePlay = true;
        playerInventory = inventory;
    }

    // getter method to return player's inventory
    public String getInventory() {
        return playerInventory;
    }

    // getter function to get listing of inventor
    public void printInventory() {
        StringTokenizer strT = new StringTokenizer(playerInventory, ";");
        System.out.println(name + "'s items: ");
        int numItems = 0;
        while (strT.hasMoreTokens()) {
            System.out.println("  " + strT.nextToken());
            numItems++;
        }
        System.out.println("  A total of " + numItems + " item(s)");
    }

    // setter function
    public void setContinuePlay(boolean continuePlay) {
        this.continuePlay = continuePlay;
    }

    // getter function
    public boolean getContinuePlay() {
        return continuePlay;
    }

    // getter function
    public String getName() {
        return name;
    }

    // add an item to user's inventory
    public void addToInventory(String item) {
        playerInventory = Utilities.addToString(item, playerInventory);
    }

    // remove item from user's inventory
    public void removeFromInventory(String item) {
        playerInventory = Utilities.removeFromList(item, playerInventory);
    }
}