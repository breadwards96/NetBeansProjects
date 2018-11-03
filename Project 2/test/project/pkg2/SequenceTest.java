package project.pkg2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author brandonedwards
 */
public class SequenceTest {
    
    public SequenceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of append method, of class Sequence with Integer data type.
     */
    @Test
    public void testAppendInt() {
        System.out.println("appendInt");
        int element = 1;
        Sequence<Integer> instance = new Sequence<>();
        instance.append(element);
        int result = instance.getData(0);
        assertEquals(1, result);
    }
    
    /**
     * Test of append method, of class Sequence with Integer data type.
     */
    @Test
    public void testAppendIntIncreaee() {
        System.out.println("appendInt size increase test");
        int element = 1;
        Sequence<Integer> instance = new Sequence<>();
        for (int i = 0; i < 100; i++) {
            instance.append(element);

        }
        int result = instance.getData(0);
        assertEquals(1, result);
    }
    
    /**
     * Test of append method, of class Sequence with String data type.
     */
    @Test
    public void testAppendString() {
        System.out.println("appendString");
        String element = "Hello";
        Sequence<String> instance = new Sequence<>();
        instance.append(element);
        assertEquals("Hello", instance.getData(0));
    }

    /**
     * Test of getData method, of class Sequence with Integer data type.
     */
    @Test
    public void testGetDataInt() {
        System.out.println("getData");
        int index = 0;
        Sequence<Integer> instance = new Sequence<>(10, 20);
        int expResult = 20;
        int result = instance.getData(index);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getData method, of class Sequence with String data type.
     */
    @Test
    public void testGetDataString() {
        System.out.println("getDataString");
        int index = 0;
        Sequence<String> instance = new Sequence<>(10, "Hello");
        String expResult = "Hello";
        String result = instance.getData(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of setData method, of class Sequence with the Integer data type.
     */
    @Test
    public void testSetDataInt() {
        System.out.println("setDataInt");
        int index = 0;
        int element = 1;
        Sequence<Integer> instance = new Sequence<>();
        instance.setData(index, element);
        int result = instance.getData(index);
        assertEquals(element, result);
    }
    
    /**
     * Test of setData method, of class Sequence with the String data type.
     */
    @Test
    public void testSetDataString() {
        System.out.println("setDataString");
        int index = 0;
        String element = "Hello";
        Sequence<String> instance = new Sequence<>();
        instance.setData(index, element);
        String result = instance.getData(index);
        assertEquals(element, result);
    }

    /**
     * Test of getSize method, of class Sequence with an Integer data type.
     */
    @Test
    public void testGetSizeInt() {
        System.out.println("getSizeInt");
        Sequence<Integer> instance = new Sequence<>();
        for(int x = 0; x<10; x++){
            instance.append(x);
        }
        int expResult = 10;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSize method, of class Sequence with a String data type.
     */
    @Test
    public void testGetSizeString() {
        System.out.println("getSizeString");
        Sequence<String> instance = new Sequence<>();
        for (int i = 0; i < 10; i++) {
            instance.append("hello");
        }
        int expResult = 10;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }
}
