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
public class HashMap {
     private static final int SIZE = 16;
    private Entry table[] = new Entry[SIZE];
    
    public Entry get(String k){
        int hash = k.hashCode() % SIZE;      // hashing by JAVA
        Entry e = table[hash];
        
        while(e != null){                    // while not reach null
            if(e.key.equals(k)){             // if key exist
                return e;                    // return the key
            }
            e = e.next;                      //
        }
        return null;
    }
    
    public void put(String k, String v){
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];
        
        if(e != null){
            if(e.key.equals(k)){             // if no collision
                e.value = v;
            }
            else{                            // when there is a collision
                while(e != null){
                    e = e.next;              // add a new node for the linkedlist
                }
                Entry entryInOldBucket = new Entry(k, v);            // create a new Entry as a linkedlist
                e.next = entryInOldBucket;                           // connect new Entry using pointer (make a chain, like LL)
            }
        }
        else{
            Entry entryInNewBucket = new Entry(k, v);
            table[hash] = entryInNewBucket;
        }
    
}
}
