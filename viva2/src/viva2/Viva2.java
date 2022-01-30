/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva2;

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
    Scanner s=new Scanner(System.in);
    int result=0;
    for(int i=0; i<10; i++){
        int[] a1= new int[10];
        System.out.println("Enter first 10 bits: ");
        a1[i]= s.nextInt(2);
    
    
        for(int j=0; j<10; j++){
            int[] a2=new int[10];
            System.out.println("Enter second 10 bits: ");
            a2[j]= s.nextInt(2);
            
        
        if(a1[0]==0 && a2[0]==0){
            result=0;
        }
        else if(a1[0]==0 && a2[0]==1){
            result=1;
        }
        else if(a1[0]==1 && a2[0]==0){
            result=1;
        }
        else if(a1[0]==1 && a2[0]==1){
            result=0;
        }
         else if(a1[1]==0 && a2[1]==0){
            result=0;
        }
        else if(a1[1]==0 && a2[1]==1){
            result=1;
        }
        else if(a1[1]==1 && a2[1]==0){
            result=1;
        }
        else if(a1[1]==1 && a2[1]==1){
            result=0;
        }
          if(a1[2]==0 && a2[2]==0){
            result=0;
        }
        else if(a1[2]==0 && a2[2]==1){
            result=1;
        }
        else if(a1[2]==1 && a2[2]==0){
            result=1;
        }
        else if(a1[2]==1 && a2[2]==1){
            result=0;
        }
        else if(a1[3]==0 && a2[3]==0){
            result=0;
        }
        else if(a1[3]==0 && a2[3]==1){
            result=1;
        }
        else if(a1[3]==1 && a2[3]==0){
            result=1;
        }
        else if(a1[3]==1 && a2[3]==1){
            result=0;
        }
        else if(a1[4]==0 && a2[4]==0){
            result=0;
        }
        else if(a1[4]==0 && a2[4]==1){
            result=1;
        }
        else if(a1[4]==1 && a2[4]==0){
            result=1;
        }
        else if(a1[4]==1 && a2[4]==1){
            result=0;
        }
         else if(a1[5]==0 && a2[5]==0){
            result=0;
        }
        else if(a1[5]==0 && a2[5]==1){
            result=1;
        }
        else if(a1[5]==1 && a2[5]==0){
            result=1;
        }
        else if(a1[5]==1 && a2[5]==1){
            result=0;
        }
         else   if(a1[6]==0 && a2[6]==0){
            result=0;
        }
        else if(a1[6]==0 && a2[6]==1){
            result=1;
        }
        else if(a1[6]==1 && a2[6]==0){
            result=1;
        }
        else if(a1[0]==1 && a2[0]==1){
            result=0;
        }
        
            
// public static int array(int a1, int a2){
   
        
                
                
                
                
    
        
        
    
        
        
    }
    }
        System.out.println("XOR Result: " + result);
    }
}
    

    
        // TODO code application logic here
    
    

