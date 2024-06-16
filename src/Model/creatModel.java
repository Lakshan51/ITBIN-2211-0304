/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilshan Tharuka
 */
public class creatModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(String acNumber, String name, int pinn, String dob, String address, String gender, int tp){
   con = DBConnector.connect();
        
        try {
            String sqlquery = "INSERT INTO userdetails(acountNo, name, pin, dateOfBirth, address, gender, telNo) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
          
            pst.setString(1, acNumber);
            pst.setString(2, name);
            pst.setInt(3, pinn);
            pst.setString(4, dob);
            pst.setString(5, address);
             pst.setString(6, gender);
              pst.setInt(7, tp);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
