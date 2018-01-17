package lab2;

import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class Robot {

    static int numRobots = 0;

    RobotHead robotHead;
    RobotTorso robotTorso;

    String serialID;

    public Robot() {
        Random numGen = new Random();
        
        numRobots++;
        serialID = "Johnny" + numGen.nextInt(100000);
        robotHead = new RobotHead();
        robotTorso = new RobotTorso();

    }

    public int getRobotCount() {

        return numRobots;
    }

    public Robot copy() {

        Robot robotCopy = new Robot();
        
        robotCopy.setSerialID(serialID);
        
        return robotCopy;
    }
    
    public void setSerialID(String ID){
        
        serialID = ID;
    }

    public boolean equals(Robot robot) {

        return serialID.equals(robot.getSerialID());
    }
    
    public String getSerialID(){
        
        return serialID;
    }
    
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

