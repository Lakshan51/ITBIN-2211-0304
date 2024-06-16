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
public class transfer {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int number, String name, String bank, String branch, int nic, int amount){
   con = DBConnector.connect();
        
        try {
            String sqlquery = "INSERT INTO transfar(acountNumber, name, bank, branch, nic, amount) VALUES (?, ?, ?, ?, ?,?)";
            pst = con.prepareStatement(sqlquery);
          
            pst.setInt(1, number);
            pst.setString(2, name);
            pst.setString(3, bank);
            pst.setString(4, branch);
            pst.setInt(5, nic);
             pst.setInt(6, amount);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Transaction Successfuly");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
}
