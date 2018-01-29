package lab2;


/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class RobotGarage {

    //a program that creates 3 robots and makes two of them the same before
    //testing each robots methods
    public static void main(String[] args) {

        // robot array size 3 for holding the robots
        Robot[] robotGarage = new Robot[3];

        //init of the robots, two originals and a copy
        robotGarage[0] = new Robot();
        robotGarage[1] = new Robot();
        robotGarage[2] = robotGarage[0].copy();

        //testing toStrings
        for (Robot robotGarage1 : robotGarage) {
            System.out.println(robotGarage1.toString());
            System.out.println();
        }
        
        //Counting robots
        System.out.println("There are "
                + Robot.getRobotCount()
                + " robots"
                + "\n");

        //testing equals
        if (robotGarage[0].equals(robotGarage[1])) {
            System.out.println("Robots 1 and 2 are the same");
        }
        if (robotGarage[1].equals(robotGarage[2])) {
            System.out.println("Robots 2 and 3 are the same");
        }
        if (robotGarage[0].equals(robotGarage[2])) {
            System.out.println("Robots 1 and 3 are the same");
        }
    }

}
