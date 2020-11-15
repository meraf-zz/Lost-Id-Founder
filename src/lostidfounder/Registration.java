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
public class Registration {
    
        private String fName;
        private String mName;
        private String lName;
        private String email;
        private String studentId;
    
        public Registration()
        {
             this.fName=fName;
             this.lName=lName;
             this.mName=mName;
             this.email=email;
             this.studentId=studentId;
        }
        
        
        
        public void register(String fName,String mName,String lName,String email,String studentId,String password){ 
            DatabaseQuery db=new DatabaseQuery();
            db.createNewUser(fName, mName, lName, email, studentId,password);
               
        }
        public void register_staf(String fName,String mName,String lName,String email,String username,String password){ 
            DatabaseQuery db=new DatabaseQuery();
            db.createNewStafUser(fName, mName, lName, email, username,password);
        }
        public boolean isRegister(String studentId){
            return true;
            
        }
}
