/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostidfounder;

/**
 *
 * @author pro
 */
public class Registrar {
    
   public String search(String keyword){
       DatabaseQuery db= new DatabaseQuery();
       String result=db.getSearchId(keyword);
       
       
       return result;
   }
   public String getRequest(){
       return "";
   }
   public String getPending(){
       return "";
   }
   
   public void sendNotification(String id, String description){
       DatabaseQuery db=new DatabaseQuery();
       db.insertNotification(id, description);
       
   }
   
    
}
