/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brandonedwards
 */
public class BackTrackTest {
    
    public BackTrackTest() {
    }

    /**
     * Test of tryToReachGoal method, of class BackTrack.
     */
    @Test
    public void testTryToReachGoal() {
        System.out.println("tryToReachGoal");
        Position pos = null;
        BackTrack instance = null;
        boolean expResult = false;
        boolean result = instance.tryToReachGoal(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
