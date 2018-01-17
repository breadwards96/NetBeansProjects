package lab2;


/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class RobotGarage {

    public static void main(String[] args) {

        Robot[] robotGarage = new Robot[3];

        robotGarage[0] = new Robot();
        robotGarage[1] = new Robot();
        robotGarage[2] = robotGarage[0].copy();

        for (Robot robotGarage1 : robotGarage) {
            System.out.println(robotGarage1.toString());
            System.out.println();
        }
        System.out.println("There are "
                + robotGarage[1].getRobotCount()
                + " robots"
                + "\n");

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
