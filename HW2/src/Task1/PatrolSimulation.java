package Task1;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
//a program that runs a cars parked time agaisnt how much they paid for on the
//meter and issues a parking ticket if they're in violation
public class PatrolSimulation {

    public static void main(String[] args) {

        //arrays and an officer for use in the program
        //two of each arrayed object
        ParkedCar[] cars = new ParkedCar[2];
        ParkingMeter[] meters = new ParkingMeter[2];
        PoliceOfficer officer = new PoliceOfficer("Johnny Law", "14549");
        ParkingTicket[] tickets = new ParkingTicket[2];
        
        //constructor invokations
        cars[0] = new ParkedCar("Mitsubishi", "Mirage", "Black", "aba658", 60);
        cars[1] = new ParkedCar("Nissan", "Rogue", "Grey", "nex926", 320);
        meters[0] = new ParkingMeter(120);
        meters[1] = new ParkingMeter(30);
        tickets[0] = new ParkingTicket(cars[0], officer, meters[0].getMinutesPurchased());
        tickets[1] = new ParkingTicket(cars[1], officer, meters[1].getMinutesPurchased());
        
        //a for loop that checks for violations and issues fines if they exist
        for(int x = 0;x<cars.length;x++){
            if(cars[x].getMinutesParked() > meters[x].getMinutesPurchased()){
                tickets[x].calculateFine();
                System.out.println(tickets[x]);
            } else {
                System.out.println("Ticket Data: \n"
                + " No Violation");
            }
            //new line for formats sake
            System.out.print("\n");
        }
        
        

    }

}
