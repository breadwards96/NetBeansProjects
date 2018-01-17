/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/* Author Brandon Edwards 
 * Date 1/16/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class RobotHead {

    private String eyeColor;

    public RobotHead() {

        Random numGen = new Random();

        switch (numGen.nextInt(5)) {
            case 0:
                eyeColor = "Blue";
                break;
            case 1:
                eyeColor = "Green";
                break;
            case 2:
                eyeColor = "Evil Red";
                break;
            case 3:
                eyeColor = "Creepy Yellow";
                break;
            case 4:
                eyeColor = "Black";
                break;

        }
    }

    @Override
    public String toString() {

        String response = "Eye color: "
                + eyeColor;

        return response;
    }
}
