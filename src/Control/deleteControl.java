/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Dilshan Tharuka
 */
public class deleteControl {
    public void delete(int id){
        
        new Model.deleteTrnsfer().delete(id);
        
    }
    
      public void delete1(String id){
        
        new Model.deleteTrnsfer().delete1(id);
        
    }
}
