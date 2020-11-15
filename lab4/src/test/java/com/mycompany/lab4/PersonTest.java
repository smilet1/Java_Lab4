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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of set method, of class Person.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        String[] str = {"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        Person instance = new Person();
        instance.set(str);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class Person.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Person instance = new Person();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Person.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Person.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        String expResult = "Aahan";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Person.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthDay method, of class Person.
     */
    @Test
    public void testGetBirthDay() {
        System.out.println("getBirthDay");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        String expResult = "15.05.1970";
        String result = instance.getBirthDay();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class Person.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        double expResult = 4800.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubdivisionId method, of class Person.
     */
    @Test
    public void testGetSubdivisionId() {
        System.out.println("getSubdivisionId");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        double expResult = 28281+5000;
        double result = instance.getSubdivisionId();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubdivisionDivision method, of class Person.
     */
    @Test
    public void testGetSubdivisionDivision() {
        System.out.println("getSubdivisionDivision");
        Person instance = new Person();
        String[] str={"28281", "Aahan", "Male", "15.05.1970","I", "4800"};
        instance.set(str);
        String expResult = "I";
        String result = instance.getSubdivisionDivision();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
