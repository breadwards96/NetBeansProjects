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
public class ApplicationTest {
    
    public ApplicationTest() {
    }

    /**
     * Test of isOK method, of class Application.
     */
    @Test
    public void testIsOK() {
        System.out.println("isOK");
        Position pos = null;
        Application instance = new ApplicationImpl();
        boolean expResult = false;
        boolean result = instance.isOK(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsPossible method, of class Application.
     */
    @Test
    public void testMarkAsPossible() {
        System.out.println("markAsPossible");
        Position pos = null;
        Application instance = new ApplicationImpl();
        instance.markAsPossible(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGoal method, of class Application.
     */
    @Test
    public void testIsGoal() {
        System.out.println("isGoal");
        Position pos = null;
        Application instance = new ApplicationImpl();
        boolean expResult = false;
        boolean result = instance.isGoal(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsDeadEnd method, of class Application.
     */
    @Test
    public void testMarkAsDeadEnd() {
        System.out.println("markAsDeadEnd");
        Position pos = null;
        Application instance = new ApplicationImpl();
        instance.markAsDeadEnd(pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Application.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Application instance = new ApplicationImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class Application.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        Position pos = null;
        Application instance = new ApplicationImpl();
        Iterator<Position> expResult = null;
        Iterator<Position> result = instance.iterator(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ApplicationImpl implements Application {

        public boolean isOK(Position pos) {
            return false;
        }

        public void markAsPossible(Position pos) {
        }

        public boolean isGoal(Position pos) {
            return false;
        }

        public void markAsDeadEnd(Position pos) {
        }

        public String toString() {
            return "";
        }

        public Iterator<Position> iterator(Position pos) {
            return null;
        }
    }
    
}
