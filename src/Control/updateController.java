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
public class updateController {
    
    public void products(String acNumber, String name, int pinn, String dob, String address, String gender, int tp){
        new Model.updateData().update(acNumber, name, pinn, dob, address, gender, tp);
    }
    
}
