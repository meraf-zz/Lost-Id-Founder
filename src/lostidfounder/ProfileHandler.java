/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pro
 */
public class ProfileHandler {
    
    
    public boolean logIn(String username, String password){
        DatabaseQuery db=new DatabaseQuery();
        try { 
            return db.isValid(username, password);
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "please enter valid username");
        }
        return false;
        
    }
    
    public void logOut(){
        
        
    }
    public void forget(String answer){
        
    }
    
}
