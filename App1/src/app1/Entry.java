/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Entry {
    
    // this class store the Map data in the form of key and value pair (similar to class Record of HashTable)
    // However, HashMap used the linkedlist approach to avoid collisions
    // (in HashTable collision is avoided by entering new Record into the next row, or ++step)
    
    
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
