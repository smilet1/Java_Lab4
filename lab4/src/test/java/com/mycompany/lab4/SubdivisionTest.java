/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Максим Усков
 */
public class SubdivisionTest {
    
    public SubdivisionTest() {
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
     * Test of set method, of class Subdivision.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        String Division = "";
        int i = 0;
        Subdivision instance = new Subdivision();
        instance.set(Division, i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Subdivision.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Subdivision instance = new Subdivision();
        instance.set("I", 0);
        String expResult = "5000 I";
        String result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Subdivision.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Subdivision instance = new Subdivision();
        instance.set("I", 0);
        int expResult = 5000;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDivision method, of class Subdivision.
     */
    @Test
    public void testGetDivision() {
        System.out.println("getDivision");
        Subdivision instance = new Subdivision();
        instance.set("I", 0);
        String expResult = "I";
        String result = instance.getDivision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
