/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pro
 */
public class DatabaseQueryTest {
    
    public DatabaseQueryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of connect method, of class DatabaseQuery.
     */
    @Test
    public void testConnect() throws Exception {
        System.out.println("connect");
        DatabaseQuery instance = new DatabaseQuery();
        Connection expResult = null;
        Connection result = instance.connect();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of close method, of class DatabaseQuery.
     */
    @Test(expected = NullPointerException.class)
    public void testClose() throws Exception {
        System.out.println("close");
        Connection conn = null;
        
        DatabaseQuery instance = new DatabaseQuery();
        instance.close(conn);
        
    }

    /**
     * Test of isValid method, of class DatabaseQuery.
     */
    @Test
    public void testIsValid() throws Exception {
        System.out.println("isValid");
        DatabaseQuery instance = new DatabaseQuery();
        assertEquals(true, instance.isValid("ate/9774/08", "9774"));
        //assertEquals(false, instance.isValid("ate/9774/08", "9774"));
        
        
        
    }

    /**
     * Test of changePassword method, of class DatabaseQuery.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        String newPassword = "";
        DatabaseQuery instance = new DatabaseQuery();
        instance.changePassword(newPassword);
        
    }

    /**
     * Test of insertRequest method, of class DatabaseQuery.
     */
    @Test(expected = SQLException.class)
    public void testInsertRequest() throws Exception {
        System.out.println("insertRequest");
        String fName = "sad";
        String mName = "asdad";
        String lName = "sadas";
        String studentId = "ate/9864/08";
        DatabaseQuery instance = new DatabaseQuery();
         
        instance.insertRequest(fName, mName, lName, studentId);
        
    }

    /**
     * Test of insertNotification method, of class DatabaseQuery.
     */
    @Test(expected = SQLException.class)
    public void testInsertNotification() {
        System.out.println("insertNotification");
        String id = "";
        String notification = "";
        DatabaseQuery instance = new DatabaseQuery();
        instance.insertNotification(id, notification);
       
    }

    /**
     * Test of getNotification method, of class DatabaseQuery.
     */
    @Test
    public void testGetNotification() {
        System.out.println("getNotification");
        DatabaseQuery instance = new DatabaseQuery();
        String expResult = "";
        String result = instance.getNotification();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createNewUser method, of class DatabaseQuery.
     */
    @Test(expected = SQLException.class)
    public void testCreateNewUser() {
        System.out.println("createNewUser");
        String fName = "";
        String mName = "";
        String lName = "";
        String email = "";
        String studentId = "";
        String password = "";
        DatabaseQuery instance = new DatabaseQuery();
        instance.createNewUser(fName, mName, lName, email, studentId, password);
        
    }

    /**
     * Test of getSearchId method, of class DatabaseQuery.
     */
    @Test
    public void testGetSearchId() {
        System.out.println("getSearchId");
        String keyword = "lib/9658/08";
        DatabaseQuery instance = new DatabaseQuery();
        String expResult = "96";
        String result = instance.getSearchId(keyword);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRequest method, of class DatabaseQuery.
     */
    @Test
    public void testGetRequest() {
        System.out.println("getRequest");
        DatabaseQuery instance = new DatabaseQuery();
        DefaultTableModel expResult = null;
        DefaultTableModel result = instance.getRequest();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of createNewStafUser method, of class DatabaseQuery.
     */
    @Test(expected = SQLException.class)
    public void testCreateNewStafUser() {
        System.out.println("createNewStafUser");
        String fName = "ww";
        String mName = "wwe";
        String lName = "wee";
        String email = "eww";
        String username = "we";
        String password = "wewe";
        DatabaseQuery instance = new DatabaseQuery();
        instance.createNewStafUser(fName, mName, lName, email, username, password);
        
    }
    
}
