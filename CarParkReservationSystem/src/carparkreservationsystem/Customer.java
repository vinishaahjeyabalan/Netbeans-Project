/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkreservationsystem;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Customer {
    private String username;
    private String password;
    private String name;
    private String ic;
    private String phone_no;

    public Customer(String username, String password, String name, String ic, String phone_no) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.ic = ic;
        this.phone_no = phone_no;
    }
    
    public Customer(){
        
    }

    ///username?
    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getPhone_no() {
        return phone_no;
    }
    
    
    
}
