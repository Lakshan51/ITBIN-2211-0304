/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilshan Tharuka
 */
public class DBConnector {
    public static Connection connect(){
          Connection conn = null;
          
          try{
              Class.forName("com.mysql.jdbc.Driver");
              conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
          } catch (Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
          
          return conn;
    
}
}