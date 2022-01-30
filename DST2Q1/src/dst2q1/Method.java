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
public class Method {
    
    public static <K, V> void compare(Pair<K, V> a, Pair<K, V> d){
            System.out.println("The parameters value are : " + a.getKey() + " and " + a.getValue());
            if(a.getKey().equals(a.getValue())){
                System.out.println("The string is equal");
            }
            else{
                System.out.println("The string is not equal");
            }
            
            System.out.println("The parameters value are : " + d.getKey() + " and " + d.getValue());
            if(d.getKey().equals(d.getValue())){
                System.out.println("The string is equal");
            }
            else{
                System.out.println("The string is not equal");
            }
        }
    
    public static <K, V> void addDouble(Pair<K, V> b){
        System.out.println("The parameters value are : " + b.getKey() + " and " + b.getValue());
        double sum;
        sum = (Double)b.getKey() + (Double)b.getValue();
        System.out.println("The sum of the double is " + sum );
    }
    
    public static <K, V> void addInteger(Pair<K, V> c){
        System.out.println("The parameters value are : " + c.getKey() + " and " + c.getValue());
        int sum;
        sum = (Integer)c.getKey() + (Integer)c.getValue();
        System.out.println("The sum of the double is " + sum );
    }
    
}
