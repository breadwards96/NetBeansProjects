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

    private String name;
    private String badgeNumber;

    public PoliceOfficer(String officerName, String badgeNumber) {
        name = officerName;
        this.badgeNumber = badgeNumber;
    }

    public PoliceOfficer(PoliceOfficer officer) {

        PoliceOfficer policeOfficer = new PoliceOfficer(
                name,
                badgeNumber);
    }

    public String getName() {
        return name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    @Override
    public String toString() {
        return "Officer Data:"
                + "\n Name = " + name
                + "\n Badge Number = " + badgeNumber;
    }

}
