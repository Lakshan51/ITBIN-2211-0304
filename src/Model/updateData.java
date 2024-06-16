/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilshan Tharuka
 */
public class updateData {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String acNumber, String name, int pinn, String dob, String address, String gender, int tp){
        
        con = DBConnector.connect();
        
        try {
            String sqlquery = "UPDATE userdetails SET acountNo = '"+acNumber+"', name = '"+name+"', pin = '"+pinn+"', dateOfBirth = '"+dob+"', address = '"+address+"', gender = '"+gender+"', telNo = '"+tp+"' WHERE acountNo = '"+acNumber+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
    }
    
}
