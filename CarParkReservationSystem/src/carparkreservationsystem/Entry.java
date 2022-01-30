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
public class Entry {
     final String key;
    String value;
    Entry next;
    
    Entry(String k, String v){
        this.key = k;
        this.value = v;    
    }
    
    public String getValue(){
        return this.value;
    }
    
    public void setValue(String value){
        this.value = value;
    }
    
    public String getKey(){
        return this.key;
    }
    
}
