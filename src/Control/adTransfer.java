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
public class adTransfer {
    
    
    public void products(int number, String name, String bank, String branch, int nic, int amount){
        new Model.transfer().addProduct(number, name, bank, branch, nic, amount);
    }
}
