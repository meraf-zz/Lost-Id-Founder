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
public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of register method, of class Registration.
     */
    @Test(expected = SQLException.class)
    public void testRegister() {
        System.out.println("register");
        String fName = "sad";
        String mName = "sadas";
        String lName = "asdad";
        String email = "asdas@gmail.com";
        String studentId = "ate/3333/08";
        String password = "123213";
       
        Registration instance = new Registration();
        instance.register(fName, mName, lName, email, studentId, password);
        
        
        
    }

    /**
     * Test of register_staf method, of class Registration.
     */
    @Test(expected = SQLException.class)
    public void testRegister_staf() {
        System.out.println("register_staf");
        String fName = "";
        String mName = "";
        String lName = "";
        String email = "";
        String username = "";
        String password = "";
        Registration instance = new Registration();
        instance.register_staf(fName, mName, lName, email, username, password);
        
    }

    /**
     * Test of isRegister method, of class Registration.
     */
    @Test(expected = SQLException.class)
    public void testIsRegister() {
        System.out.println("isRegister");
        String studentId = "";
        Registration instance = new Registration();
        boolean expResult = false;
        boolean result = instance.isRegister(studentId);
        assertEquals(expResult, result);
        
    }
    
}
