/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pro
 */
public class ProfileHandlerTest {
    
    public ProfileHandlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of logIn method, of class ProfileHandler.
     */
    @Test
    public void testLogIn() {
        System.out.println("logIn");
        String username = "asdasd";
        String password = "asdasdadas";
        ProfileHandler instance = new ProfileHandler();
        boolean expResult = false;
        boolean result = instance.logIn(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

//    /**
//     * Test of logOut method, of class ProfileHandler.
//     */
//    @Test
//    public void testLogOut() {
//        System.out.println("logOut");
//        ProfileHandler instance = new ProfileHandler();
//        instance.logOut();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of forget method, of class ProfileHandler.
//     */
//    @Test
//    public void testForget() {
//        System.out.println("forget");
//        String answer = "";
//        ProfileHandler instance = new ProfileHandler();
//        instance.forget(answer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
