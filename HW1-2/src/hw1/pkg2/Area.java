
package hw1.pkg2;

/* Author Brandon Edwards 
 * Date 1/13/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class Area {

    //circle
    public static double area(double radius) {

        double area = Math.PI * (Math.pow(radius, 2.0));

        return area;
    }

    //rectanlge
    public static double area(int width, int length) {

        double area = width * length;

        return area;
    }

    //Cylinder
    public static double area(double radius, double height) {

        double area = (2 * (Math.PI * (Math.pow(radius, 2))))
                + (2 * (Math.PI * (radius * height)));

        return area;
    }

}
