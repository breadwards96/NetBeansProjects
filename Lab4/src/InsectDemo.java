/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**@author Brandon Edwards 
 * @since 2/5/18 
 * 
 * honorCode I pledge that this submission is solely my work,
 * and that I have neither given to nor received help from anyone
 * other than the instructor or TAs.
 **/
public class InsectDemo {

    public static void main(String[] args) {

        //constructors
        Beetle dung = new Beetle(true);
        Grasshopper crikee = new Grasshopper();

        //setting lifespan and jump distance of the grasshopper
        crikee.setLifeSpanDays(10);
        crikee.setJumpDist(12.370);

        //setting the lifespan and stink of the dung beetle
        dung.setLifeSpanDays(12);
        dung.setStink(3);

        //print statement with formatting
        System.out.println(
            "The grasshopper 'crikee' can jump " + crikee.getJumpDist() + "cm."
            + "\n He has a life span of " + crikee.getLifeSpan() + " days."
            + "\n He has " + crikee.getNumLegs() + " legs."
            + "\n The beetle 'dung' has a life span of " + dung.getLifeSpan() + " days."
            + "\n She has " + dung.getNumLegs() + " legs."
            + "\n Is she a big stinker? " + dung.getIsABigStink());

    }
}
