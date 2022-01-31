/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3_vinishaah_17205417;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class MyHashMap {
    private static final int SIZE = 32;
    private Entry table[] = new Entry[SIZE];
    
    public Entry get(String k){
        int hash = k.hashCode() % SIZE;      
        Entry e = table[hash];
        
        while(e != null){                    
            if(e.key.equals(k)){             
                return e;                    
            }
            e = e.next;                      
        }
        return null;
    }
    
    public void put(String k, String v){
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];
        
        if(e != null){
            if(e.key.equals(k)){            
                e.value = v;
            }
            else{                            
                while(e != null){
                    e = e.next;              
                }
                Entry entryInOldBucket = new Entry(k, v);           
                e.next = entryInOldBucket;                           
            }
        }
        else{
            Entry entryInNewBucket = new Entry(k, v);
            table[hash] = entryInNewBucket;
        }
    }
}
