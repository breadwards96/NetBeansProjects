/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools Templates
 * and open the template in the editor.
 */
package Task1;

/* @Author Brandon Edwards 
 * Date 1/29/18 
 * Honor Code I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 */
public class PoliceOfficer {

    //fields for relevant data
    private String name;
    private String badgeNumber;

    //constructor
    public PoliceOfficer(String officerName, String badgeNumber) {
        name = officerName;
        this.badgeNumber = badgeNumber;
    }

    //copy constructor for aggregation
    public PoliceOfficer(PoliceOfficer officer) {

        this.setName(officer.getName());
        this.setBadgeNumber(officer.getBadgeNumber());
    }

    //getters
    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    //toString for name and badge
    @Override
    public String toString() {
        return "Officer Data:"
                + "\n Name = " + name
                + "\n Badge Number = " + badgeNumber;
    }

}
