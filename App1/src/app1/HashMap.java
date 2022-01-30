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
public class HashMap {

    /**
     * @param args the command line arguments
     * A simple implementation of HashMap
     * HashMap is an extension to HashTable, or, we can say a dynamic version of HashTable
     */
    
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
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("Siva", "0171234567");
        hm.put("Ain", "0119876543");
        hm.put("Xuhan", "0139987699");
        hm.put("Pavan", "0123456789");
        System.out.println("");
        
        System.out.println("Retrieving DS student phone number: ");
        Entry e1 = hm.get("Siva");
        System.out.println("" + e1.getKey() + " : " + e1.getValue());
        Entry e2 = hm.get("Ain");
        System.out.println("" + e2.getKey() + " : " + e2.getValue());
        
        //Updating the entry
        hm.put("Siva", "0154675869");
        Entry e3 = hm.get("Siva");
        System.out.println("" + e3.getKey() + " : " + e3.getValue());
    }
    
}
