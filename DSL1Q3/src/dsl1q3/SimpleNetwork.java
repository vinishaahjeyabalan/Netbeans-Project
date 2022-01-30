/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q3;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SimpleNetwork {
    String name;
    String IP_Address;
    String subnetMask;
    String status;
    
    public SimpleNetwork(){
        this.name = name;
        this.IP_Address = IP_Address;
        this.subnetMask = subnetMask;
        this.status = status;
        
    }
    
    public String toString(){
        return "Host Name: " + name + " IP: " + IP_Address + " Subnet Mask: " + subnetMask + " Status: " + status;
    }
    
    public void ping(){
        if((IP_Address && subnetMask) == ())
    }
}
