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
public class DST2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pair<String, String> a = new Pair<>("Hello", "World");
        Pair<Double, Double> b = new Pair<>(12.4, 64.3);
        Pair<Integer, Integer> c = new Pair<>(20, 35);
        Pair<String, String> d = new Pair<>("Welcome", "Welcome");
        Method.compare(a, d);
        Method.addDouble(b);
        Method.addInteger(c);
        
        
//        generic("Hello", "World");
//        generic(12.4, 64.3);
//        generic(20, 35);
//        generic("Welcome", "Welcome");
        
    }
    
    
//    public static<T> void generic(T t, T u){
//        if(t instanceof Integer){
//            System.out.println("The parameters value are : " + (Integer)t + " and " + (Integer)u);
//            System.out.println("The sum of the integer is " + ((Integer)t + (Integer)u));
//        }
//        else if(t instanceof Double){
//            System.out.println("The parameters value are : " + (Double)t + " and " + (Double)u);
//            System.out.println("The sum of the integer is " + ((Double)t + (Double)u));
//        }
//        else if(t instanceof String){
//            System.out.println("The parameters value are : " + (String)t + " and " + (String)u);
//            if(((String)t).equals((String)u)){
//                System.out.println("The string is equal");
//            }
//            else{
//                System.out.println("The string is not equal");
//            }
//        }
    }
        
    

