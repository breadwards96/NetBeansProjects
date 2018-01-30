/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class ParkingMeter {

    private int minutesPurchased;

    public ParkingMeter(int numMinsPurchased) {
        minutesPurchased = numMinsPurchased;
    }

    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    @Override
    public String toString() {
        return "minutesPurchased = "
                + minutesPurchased;
    }

}
