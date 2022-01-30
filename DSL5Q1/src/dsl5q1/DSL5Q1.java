/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q1;

import java.util.ArrayList;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        System.out.println("The candies in the container:");
        a.push("Orange");
        a.push("Red");
        a.push("Blue");
        a.push("Orange");
        a.push("Yellow");
        a.push("Yellow");
        a.push("Blue");
        a.showStack();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("\nAli takes all the candies one by one from the container and eats the blue ones.");
        System.out.println("He puts back the rest of candies in the container");
        System.out.println("The candies in the container:");
        while(!a.isEmpty()){
           if(a.peek()== "Blue"){
               a.pop();
           }
           list.add(a.pop());
        }
        for(int i=list.size()-1; i>=0; i--){
            a.push(list.get(i));
        }
        a.showStack();
        System.out.println("");
    }
    
}
