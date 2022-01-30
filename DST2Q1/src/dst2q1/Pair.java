/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Pair<K, V> {
    
    private K key;
    private V value;
    
    public Pair(K key, V value){
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
     
//      public static <K, V> void compare(Pair<K, V> a, Pair<K, V> d){
//            System.out.println("The parameters value are : " + a.getKey() + " and " + a.getValue());
//            if(a.getKey().equals(a.getValue())){
//                System.out.println("The string is equal");
//            }
//            else{
//                System.out.println("The string is not equal");
//            }
//            
//            System.out.println("The parameters value are : " + d.getKey() + " and " + d.getValue());
//            if(d.getKey().equals(d.getValue())){
//                System.out.println("The string is equal");
//            }
//            else{
//                System.out.println("The string is not equal");
//            }
//        }
    
}
