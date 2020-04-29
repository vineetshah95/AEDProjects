/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{

    private ProductDirectory directory;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    
    
    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        directory = new ProductDirectory();
    }
    
    @Override
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
