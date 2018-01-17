
package hw1.pkg2;

import static hw1.pkg2.Area.area;
import java.util.Scanner;

/* Author Brandon Edwards 
 * Date 1/13/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class AreaDriver {

    //a program that asks for input 
    //and invokes methods to perform area calculations
    public static void main(String[] args) {

        //scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //variables for holding user input values
        double circleRadius, cylinderRadius, height, area;
        int width, length;

        //ask for and assign user input
        System.out.println("Enter the radius of the circle:");
        circleRadius = keyboard.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        width = keyboard.nextInt();

        System.out.println("Enter the length of the rectangle:");
        length = keyboard.nextInt();

        System.out.println("Enter the radius the cylinder:");
        cylinderRadius = keyboard.nextDouble();

        System.out.println("Enter the height of the cylinder:");
        height = keyboard.nextDouble();

        area = area(circleRadius);
        System.out.println("the area of a circle with a radius of "
                + circleRadius + " is " + area);

        //calculating the area and printing the result
        area = area(width, length);
        System.out.println("the area of a rectangle with a width of "
                + width + " and a length of " + length + " is " + area);

        area = area(cylinderRadius, height);
        System.out.println("the area of a cylinder with a radius of "
                + cylinderRadius + " and a height of " + height + " is " + area);

    }

}
