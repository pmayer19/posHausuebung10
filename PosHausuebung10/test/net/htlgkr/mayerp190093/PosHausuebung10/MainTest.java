/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package net.htlgkr.mayerp190093.PosHausuebung10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mayer
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
   
    @Test
    public void testYearsBetween() {
        System.out.println("yearsBetween");
        int expResult = 1;
        int result = Main.yearsBetween();
        assertEquals(expResult, result);
    }

    /**
     * Test of monthsBetween method, of class Main.
     */
    @Test
    public void testMonthsBetween() {
        System.out.println("monthsBetween");
        int expResult = 23;
        int result = Main.monthsBetween();
        assertEquals(expResult, result);
    }

    /**
     * Test of daysBetween method, of class Main.
     */
    @Test
    public void testDaysBetween() {
        System.out.println("daysBetween");
        int expResult = 719;
        int result = Main.daysBetween();
    }

    /**
     * Test of hoursBetween method, of class Main.
     */
    @Test
    public void testHoursBetween() {
        System.out.println("hoursBetween");
        int expResult = 17256;
        int result = Main.hoursBetween();
        assertEquals(expResult, result);
    }

    /**
     * Test of minutesBetween method, of class Main.
     */
    @Test
    public void testMinutesBetween() {
        System.out.println("minutesBetween");
        int expResult = 1035410;
        int result = Main.minutesBetween();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of secondsBetween method, of class Main.
     */
    @Test
    public void testSecondsBetween() {
        System.out.println("secondsBetween");
        int expResult = 62124615;
        int result = Main.secondsBetween();
        assertEquals(expResult, result);
    }
    
}
