/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Viva2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int result;
        String[] a1 = new String[10];
        String[] a2 = new String[10];
        System.out.print("Enter first 10 bits: ");
        

        for (int i = 0; i <a1.length; i++) {
            a1[i] = s.nextLine();}
                  System.out.print("Enter second 10 bits: ");  
            for (int j = 0; j <a2.length; j++) {
            a2[j]=s.nextLine();}
            
            
           
              
         
            for (int j = 0; j <a1.length; j++) {
                for (int i = 0; i<a2.length; i++) {
              
        if (a1[i].equals("0")  && a2[j].equals("0")) {
                    result  = 0;
                    System.out.print(result);
                } else if (a1[i].equals("0") && a2[j].equals("1")) {
                    result  = 1;
                    System.out.print(result);
                } else if (a1[i].equals("1") && a2[j].equals("0")) {
                    result  = 1;
                    System.out.print(result);
                } else if (a1[i].equals("1") && a2[j].equals("1")) {
                    result = 0;
                    System.out.print(result);
                }
        
                
        
       
    
       
    
    }
        }
        
    }
}
         
    
        
                
     
        
    


       
