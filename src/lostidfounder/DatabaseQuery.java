/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pro
 */
public class DatabaseQuery {
    String location = "jdbc:mysql://localhost:3306/lif";
    
    
    public Connection connect() throws SQLException{
        
          try{
              Connection con = DriverManager.getConnection(location, "root", "");
              return con;
          }
          catch(SQLException ex){
            System.out.println("ecxeption" +ex);
          }     
        return null;
    }
    
    public void close(Connection conn) throws SQLException{

        conn.close();
    
    }
    
    
    String pass;
    public boolean isValid(String username,String password) throws SQLException{
       
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            rs = stmt.executeQuery("SELECT password from Register_Student where studentId='"+username+"';");
            System.out.println("after alll********");
           
            
            while(rs.next()){           
                   pass = rs.getString("password");
                   System.out.println(pass);
                   
                return pass.equals(password);
                   
                   
              }
            
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "invalid account name");
            System.out.println("ecxeption" +ex);
            
            } 
        
        return false;
        
        

    }
    
    public void changePassword(String newPassword){
        
        
    }
    
    public void insertRequest(String fName, String mName, String lName, String studentId ) throws SQLException{
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            PreparedStatement ps = con.prepareStatement("insert into Register_Student(fName,mName,lName,studentId) values(?,?,?,?);");
            System.out.println("after alll********");
            
            ps.setString(1,fName);
            ps.setString(2,mName);
            ps.setString(3,lName);
            ps.setString(4,studentId);
            
            
               
         }
            
        
        
        catch(SQLException ex){
            System.out.println("ecxeption" +ex);
            JOptionPane.showMessageDialog(null, ex.toString());
            
         } 
        
        
    }
    
    public void insertNotification(String id, String notification){
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            java.util.Date date = new java.util.Date();
            
            String date1=date.toGMTString();
            PreparedStatement ps = con.prepareStatement("insert into Request_Answer(description,studentId,date) values(?,?,?);");
            System.out.println("after alll********");
            
            ps.setString(1,notification);
            ps.setString(2,id);
            ps.setString(3,date1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "success");
            
                
         }
            
        
        
        catch(Exception ex){
            System.out.println("ecxeption" +ex);
            JOptionPane.showMessageDialog(null, ex.toString());
            
         } 
        
    }
    
    public String getNotification(){
        // for student project only
        return "";
    }
    
    public void createNewUser(String fName, String mName, String lName, String email, String studentId, String password){
        
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            PreparedStatement ps = con.prepareStatement("insert into Register_Student(fName,mName,lName,email,studentId,password) values(?,?,?,?,?,?);");
            System.out.println("after alll********");
            
            ps.setString(1,fName);
            ps.setString(2,mName);
            ps.setString(3,lName);
            ps.setString(4,email);
            ps.setString(5,studentId);
            ps.setString(6,password);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "nice man! keep coding");
            
                
         }
            
        
        
        catch(Exception ex){
            System.out.println("ecxeption" +ex);
            JOptionPane.showMessageDialog(null, ex.toString());
            
         } 
        
    }
    public String getSearchId(String keyword){
        
         try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            rs = stmt.executeQuery("SELECT description from Captured_Id where studentId='"+keyword+"';");
            System.out.println("after alll********");
           
            
            while(rs.next()){           
                   pass = rs.getString("description");
                   
                   
                   return pass;
                   
              }
            
        }
        
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "error");
            System.out.println("ecxeption" +ex);
            
            } 
        
        
        return "";
    }
    
    String fName,mName,lName,studentId;
    
    public DefaultTableModel getRequest(){
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            rs = stmt.executeQuery("SELECT fName,studentId from  Student_Request;");
            System.out.println("after alll********");
            
            DefaultTableModel tableModel = new DefaultTableModel();

            //Retrieve meta data from ResultSet
            ResultSetMetaData metaData = rs.getMetaData();

            //Get number of columns from meta data
            int columnCount = metaData.getColumnCount();

            //Get all column names from meta data and add columns to table model
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++){
                tableModel.addColumn(metaData.getColumnLabel(columnIndex));
            }

            //Create array of Objects with size of column count from meta data
            Object[] row = new Object[columnCount];

            //Scroll through result set
            while (rs.next()){
                //Get object from column with specific index of result set to array of objects
                for (int i = 0; i < columnCount; i++){
                    row[i] = rs.getObject(i+1);
                }
                //Now add row to table model with that array of objects as an argument
                tableModel.addRow(row);
            }
            return tableModel;
           
            
           /* while(rs.next()){           
                   fName=rs.getString("fName");
                   mName=rs.getString("mName");
                   lName=rs.getString("lName");
                   studentId=rs.getString("studentId");
                   
                   
                   
                   String mix=fName+" "+mName+" "+lName;
                   String[] array={mix,studentId};
                  
                  return array;
                   
                   
                   
              }*/
            
        }
        
        catch(SQLException ex){
            System.out.println("ecxeption" +ex);
            
            } 
        return null;
        
    }

    void createNewStafUser(String fName, String mName, String lName, String email, String username, String password) {
        try{
            Connection con=this.connect();
            Statement stmt = con.createStatement();
            ResultSet rs;
            System.out.println("fahsfjahsjfgashjfgashfhasjfaskjfakj********");
            PreparedStatement ps = con.prepareStatement("insert into Register_Staf(fName,mName,lName,email,username,password) values(?,?,?,?,?,?);");
            System.out.println("after alll********");
            
            ps.setString(1,fName);
            ps.setString(2,mName);
            ps.setString(3,lName);
            ps.setString(4,email);
            ps.setString(5,username);
            ps.setString(6,password);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "nice man! keep coding");
            
                
         }
            
        
        
        catch(Exception ex){
            System.out.println("ecxeption" +ex);
            JOptionPane.showMessageDialog(null, ex.toString());
            
         } 
        
    }
}
