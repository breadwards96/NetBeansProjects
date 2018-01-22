package lab2;

import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class Robot {

    // the number of total robots across all objects
    private static int numRobots = 0;

    //body parts yet to be initialized
    private RobotHead robotHead;
    private RobotTorso robotTorso;

    //robot name and id between 0 and 99,999
    private String serialID;

    //constructor for the robot object
    //generates serial ID and inits body parts
    public Robot() {
        Random numGen = new Random();
        
        numRobots++;
        serialID = "Johnny" + numGen.nextInt(100000);
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();

    }

    //to get the total number of robots
    public static int getRobotCount() {

        return numRobots;
    }

    //to make a semi-deep copy of a robot with the same serial ID
    public Robot copy() {

        Robot robotCopy = new Robot();
        
        robotCopy.setSerialID(serialID);
        
        return robotCopy;
    }
    
    //used with the copy method
    public void setSerialID(String ID){
        
        serialID = ID;
    }

    //to compare the serial ids of two robots
    public boolean equals(Robot robot) {

        return serialID.equals(robot.getSerialID());
    }
    
    //to retrieve a robots serial ID
    public String getSerialID(){
        
        return serialID;
    }
    
    //to string the prints serial id and toString for body parts
    @Override
    public String toString(){
        
        String response = "Serial ID: "
                + serialID 
                + "\n"
                + robotHead.toString()
                + "\n"
                + robotTorso.toString();
        
        return response;
    }
    
}

