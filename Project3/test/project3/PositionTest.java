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
public class PositionTest {
    
    public PositionTest() {
    }

    /**
     * Test of getRow method, of class Position.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Position.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Position instance = new Position();
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
