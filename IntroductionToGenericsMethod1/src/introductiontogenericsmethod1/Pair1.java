/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontogenericsmethod1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Pair1<K, V> {
     private K key;
     private V value;
    
    public Pair1(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public void setKey(K key){
        this.key = key;
    }
    
     public void setValue(V value){
        this.value = value;
    }
     
     public K getKey(){
         return key;
     }
     
     public V getValue(){
         return value;
     }
    
    
    
}
