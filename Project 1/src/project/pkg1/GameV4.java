
package project.pkg1;

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
public class GameV4 {

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 7;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2;n3;s6");
        gameBoard[1] = new Room("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2");
        gameBoard[2] = new Room("Green Room", "meowing kitten;", 2, "w1;e0");
        gameBoard[3] = new Room("Bathroom", "Rob Gronkowski", 3, "w4;s0;e5");
        gameBoard[4] = new Room("Pantry", "Oats;Dust Bunny", 4, "e3");
        gameBoard[5] = new MonsterRoom("Dusty Room", "", 5, "w3");
        gameBoard[6] = new Bedroom("Bedroom", "Sleeping Bag", 6, "n0");

        // keep track of which room player is in 
        int playerRoomNumber = 0;

        // create player object, using the superclass Player
        CustomPlayer player = new CustomPlayer("Tatiana", playerRoomNumber, "bubble gum;band-aid;toothpick", 10);

        // play the game, as long as player object has field continuePlay set to true
        while (player.getContinuePlay() == true) {
            playerRoomNumber
                    = gameBoard[playerRoomNumber].playRoom(player);
        }
    }
}
