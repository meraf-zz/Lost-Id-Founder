/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

import java.sql.SQLException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pro
 */
public class RegistrarTest {
    
    public RegistrarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of search method, of class Registrar.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String keyword = "lib/9658/08";
        Registrar instance = new Registrar();
        String expResult = "96";
        String result = instance.search(keyword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRequest method, of class Registrar.
     */
    @Test
    public void testGetRequest() {
        System.out.println("getRequest");
        Registrar instance = new Registrar();
        String expResult = "";
        String result = instance.getRequest();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPending method, of class Registrar.
     */
    @Test
    public void testGetPending() {
        System.out.println("getPending");
        Registrar instance = new Registrar();
        String expResult = "";
        String result = instance.getPending();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of sendNotification method, of class Registrar.
     */
     @Test(expected = SQLException.class)
    public void testSendNotification() {
        System.out.println("sendNotification");
        String id = "";
        String description = "";
        Registrar instance = new Registrar();
        instance.sendNotification(id, description);
       
    }
    
}
