
package project.pkg1;

import java.util.Scanner;

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
public class Bedroom extends Room {


    public Bedroom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
    }

    @Override
    public int playRoom(CustomPlayer player) {

        // inform the player of his/her current room
        System.out.println("You are in the " + super.getRoomName());
        System.out.println("What would you like to do?");

        // variables for player interaction
        String command;
        int newRoomNum = super.getRoomNum();
        Scanner keyboard = new Scanner(System.in);
        command = keyboard.nextLine();

        // switch on the user's command
        switch (command) {
            case "exits":
                printListOfExits();
                break;
            case "look":
                printObjectsInRoom();
                break;
            case "inventory":
                player.printInventory();
                break;
            case "go west":
            case "go east":
            case "go south":
            case "go north":
                newRoomNum = leaveRoom(command);
                break;
            case "quit":
                player.setContinuePlay(false);
                break;
            case "pick up":
                userPicksUp(player);
                break;
            case "drop":
                userDrops(player);
                break;
            case "help":
                Utilities.printHelp();
                break;
            case "sleep":
                SleeponBed(player);
                System.out.println("your Hit Points have been restored");
                break;
            default:
                System.out.println("Invalid command. Type help for details.");
        }

        return newRoomNum;
    }

    public void SleeponBed(CustomPlayer player) {

        player.setHitPoints(10 - player.getHitPoints());

    }
}
