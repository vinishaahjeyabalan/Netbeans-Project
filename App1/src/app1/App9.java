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
import java.util.ArrayList;
public class App9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Before JAVA ver 5 (before 2004) -- THERE WAS NO GENERICS
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("mango");
        
        String fruit = (String)list.get(3);     // Downcasting from Object to String
        System.out.println(fruit);
        
        // Beginning JAVA 5, generics is introduced
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("cat");
        list2.add("dog");
        list2.add("horse");
        list2.add("worm");
        
        String animal = list2.get(3);
        System.out.println(animal);
        
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        
        int number = list3.get(0);
        System.out.println(number);
        
        ArrayList<Double> list4 = new ArrayList<Double>();
        list4.add(9297.2874);
        list4.add(2023.09);
        list4.add(1928309274836832.21321);
        list4.add(32.4284027402);
        
        double doubleval = list4.get(0);
        System.out.println(doubleval);
    }
    
}
