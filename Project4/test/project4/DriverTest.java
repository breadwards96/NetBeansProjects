/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brandonedwards
 */
public class DriverTest {
    
    /**
     * Test of palindrome method, of class Driver.
     * This test is meant to test a confirmed palindrome and should return
     * palindrome
     */
    @Test
    public void testPalindromeSucceed() {
        LinkedList<MyVector> list = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            double number = Math.abs(Math.pow((i-5), 2));
            System.out.println(number);
            double[] filler = new double[1];
            filler[0] = number;
            list.add(new MyVector(filler));
        }
        assertEquals("Palindrome", new Driver().palindrome(list));
        
    }
    
    /**
     * Test of palindrome method, of class Driver.
     * this test is meant to test the not palindrome response with a series of
     * numbers counting up from 0 to 10
     */
    @Test
    public void testPalindromeFail() {
        LinkedList<MyVector> list = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            double number = i;
            System.out.println(number);
            double[] filler = new double[1];
            filler[0] = number;
            list.add(new MyVector(filler));
        }
        assertEquals("Not Palindrome", new Driver().palindrome(list));
    }
    
}
