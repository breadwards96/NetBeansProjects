
package Task1;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class ParkedCar {

    //necessary car information
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    //constructor for a car
    public ParkedCar(String mk, String mdel, String col, String lic, int minParked) {
        make = mk;
        model = mdel;
        color = col;
        licenseNumber = lic;
        minutesParked = minParked;
    }

    //copy constructor
    public ParkedCar(ParkedCar car2) {

        this.setMake(car2.getMake());
        this.setModel(car2.getModel());
        this.setColor(car2.getColor());
        this.setLicenseNumber(car2.getLicenseNumber());
        this.setMinutesParked(car2.getMinutesParked());
    }

    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    //setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    //toString that prints all the fields with proper formatting
    @Override
    public String toString() {
        return "Car Data:"
                + "\n Make = " + make
                + "\n Model = " + model
                + "\n Color = " + color
                + "\n License Number = " + licenseNumber
                + "\n Minutes Parked = " + minutesParked;
    }

}
