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
public class PatrolSimulation {

    public static void main(String[] args) {

        ParkedCar[] cars = new ParkedCar[2];
        ParkingMeter[] meters = new ParkingMeter[2];
        PoliceOfficer officer = new PoliceOfficer("Johnny Law", "14549");
        ParkingTicket[] tickets = new ParkingTicket[2];
        
        cars[0] = new ParkedCar("Mitsubishi", "Mirage", "Black", "aba658", 60);
        cars[1] = new ParkedCar("Nissan", "Rogue", "Grey", "nex926", 320);
        meters[0] = new ParkingMeter(120);
        meters[1] = new ParkingMeter(30);
        tickets[0] = new ParkingTicket(cars[0], officer, meters[0].getMinutesPurchased());
        tickets[1] = new ParkingTicket(cars[1], officer, meters[1].getMinutesPurchased());
        
        for(int x = 0;x<cars.length;x++){
            if(cars[x].getMinutesParked() > meters[x].getMinutesPurchased()){
                tickets[x].calculateFine();
                System.out.println(tickets[x]);
            } else {
                System.out.println("Ticket Data: \n"
                + "No Violation");
            }
        }
        
        

    }

}
