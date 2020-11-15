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
public class EmployeesTest {
    
    public EmployeesTest() {
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
     * Test of Read method, of class Employees.
     */
    @Test
    public void testRead() throws Exception {
        System.out.println("Read");
        String csvFilePath = "foreign_names.csv";
        Employees instance = new Employees();
        instance.Read(csvFilePath);
        instance.Print();
        assertEquals(instance.Get(0),"28281 Aahan Male 15.05.1970 33281 I 4800.0");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Print method, of class Employees.
     */
    @Test
    public void testPrint() {
        System.out.println("Print");
        Employees instance = new Employees();
        instance.Print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Get method, of class Employees.
     */
    @Test
    public void testGet() {
        System.out.println("Get");
        int i = 0;
        Employees instance = new Employees();
        instance.Read("foreign_names.csv");
        String expResult = "28281 Aahan Male 15.05.1970 33281 I 4800.0";
        String result = instance.Get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
