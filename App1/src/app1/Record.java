/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 * This is for HashTable, Record is similar to LinkedList Node with getters and setters 
 */
public class Record {
    
    Object key;
    Object data;
    
    public Record(Object key, Object data){
        this.key = key;
        this.data = data;
    }
    
    public Object getKey(){
        return this.key;
    }
    
    public Object getData(){
        return this.data;
    }

  
  
    
}
