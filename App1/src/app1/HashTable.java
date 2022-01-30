/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 * A very simple implementation of a HashTable DS
 */
public class HashTable {

    /**
     * @param args the command line arguments
     */
    
    static final int TABLE_SIZE = 100;             // fix table size to 100
    Record[] tabledata = new Record[TABLE_SIZE];   // only accept new data not more than TABLE_SIZE
    
  
    public void put(Object key, Object value){
        
        int keyCode = key.hashCode();              // hashing function
        int step = 0;                              // step is like a pointer for the table
        int slot = hash(keyCode, step);            // the hash formula comes from our own encryption
        
        while(!isEmpty(slot)){                     // while the table is not empty
            slot = hash(keyCode, ++step);          // find a slot
        }
        tabledata[slot] = new Record(key, value);  // add the new data at the slot
    }
    
    public boolean keyExist(Object key){
        
        int keyCode = key.hashCode();              // hashing function
        int step = 0;                              // step is like a pointer for the table
        int slot = hash(keyCode, step);            // the hash formula comes from our own encryption
        
        while(tabledata[slot] != null && !tabledata[slot].getKey().equals(key)){       // if match not found, go to next row
            slot = hash(keyCode, ++step);
        }
        if(tabledata[slot] != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public Object get(Object key){
        
        int keyCode = key.hashCode();              // hashing function
        int step = 0;                              // step is like a pointer for the table
        int slot = hash(keyCode, step);            // the hash formula comes from our own encryption
        
        while(tabledata[slot] != null && !tabledata[slot].getKey().equals(key)){       // if match not found, go to next row
             slot = hash(keyCode, ++step);
        }
        if(tabledata[slot] != null){
            return tabledata[slot].getData();
        }
        else{
            return null;
        }
    }
    
    
    int hash(int key, int step){
        if(step == 0){
            return key % TABLE_SIZE;                // encrypt formula when step is 0
        }
        else{
        return (key % TABLE_SIZE + step*step) % TABLE_SIZE;    // formula to encrypt formula when step is not 0
    }
    }
    
    public boolean isEmpty(int slot){
        return tabledata[slot] == null;             // check if slot is occupied or empty
    }
    
    
    
    
    public static void main(String[] args) {
        
        HashTable ht = new HashTable();
        ht.put("4", 40);
        ht.put("6", 60);
        ht.put("8", 80);
        ht.put("10", 100);
        ht.put("12", 120);
        ht.put("4", 41120);
        ht.put("4", 41121);
        
        System.out.println(ht.keyExist("4"));
        System.out.println(ht.keyExist("1"));
        Object r1 = ht.get("8");
        //System.out.println("" + r1.getKey() + " : " + r1.getData());
        System.out.println(r1);
        System.out.println(ht.get("1"));
        System.out.println(ht.get("4"));
        
    }
    
}
