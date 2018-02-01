package Task1;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class ParkingMeter {

    //parking meter meter
    private int minutesPurchased;

    //constructor for adding time
    public ParkingMeter(int numMinsPurchased) {
        minutesPurchased = numMinsPurchased;
    }

    //getter
    public int getMinutesPurchased() {
        return minutesPurchased;
    }

    //setter
    public void setMinutesPurchased(int minutesPurchased) {
        this.minutesPurchased = minutesPurchased;
    }

    //toString with data
    @Override
    public String toString() {
        return "Parking Meter Data:"
                + "\n Minutes Purchased = "
                + minutesPurchased;
    }

}
