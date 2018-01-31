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
public class ParkingTicket {

    private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;
    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int meterMins) {
        car = new ParkedCar(aCar);
        officer = new PoliceOfficer(anOfficer);
        minutes = meterMins;
    }

    public void calculateFine() {

        fine = (BASE_FINE)
                + (HOURLY_FINE
                * (Math.round(
                        (double) (minutes + 50)
                        / 60)));

    }

    public ParkedCar getCar() {
        return car;
    }

    public PoliceOfficer getOfficer() {
        return officer;
    }

    public double getFine() {
        return fine;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public void setOfficer(PoliceOfficer officer) {
        this.officer = officer;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "Ticket Data:"
                + "\n" + car.toString()
                + "\n" + officer.toString()
                + "\n Fine = " + fine
                + "\n Minutes Purchased = " + minutes;
    }

}
