/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brandonedwards
 */
public class KnightTest {
    
    public KnightTest() {
    }

    /**
     * Test of isOK method, of class Knight.
     */
    @Test
    public void testIsOK() {
        System.out.println("isOK");
        Position pos = null;
        Knight instance = null;
        boolean expResult = false;
        boolean result = instance.isOK(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsPossible method, of class Knight.
     */
    @Test
    public void testMarkAsPossible() {
        System.out.println("markAsPossible");
        Position pos = null;
        Knight instance = null;
        instance.markAsPossible(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGoal method, of class Knight.
     */
    @Test
    public void testIsGoal() {
        System.out.println("isGoal");
        Position pos = null;
        Knight instance = null;
        boolean expResult = false;
        boolean result = instance.isGoal(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsDeadEnd method, of class Knight.
     */
    @Test
    public void testMarkAsDeadEnd() {
        System.out.println("markAsDeadEnd");
        Position pos = null;
        Knight instance = null;
        instance.markAsDeadEnd(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Knight.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Position pos = null;
        Knight instance = null;
        Iterator<Position> expResult = null;
        Iterator<Position> result = instance.iterator(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrid method, of class Knight.
     */
    @Test
    public void testGetGrid() {
        System.out.println("getGrid");
        Knight instance = null;
        int[][] expResult = null;
        int[][] result = instance.getGrid();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Knight.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Knight instance = null;
        Position expResult = null;
        Position result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Knight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Knight instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
