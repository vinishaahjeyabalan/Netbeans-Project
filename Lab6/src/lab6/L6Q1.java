/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" = "+add(20));
    }
    public static int add(int n){
        int total=0;
        for(int i=1; i<=n; i++) {
            System.out.print(i+" ");
            total+=i;
            if (i==n)
                break;
            System.out.print(" + ");
        }
        return total;
            
        }
      
        





//          char c= 'A';
//          Scanner s=new Scanner(System.in);
//          int n=s.nextInt();
//          multiPrint(n, c);
//    }
//    public static void multiPrint(int n, char c){
//        for(int i=0; i<n; i++) {
//            System.out.print(c);
//            
//        }
//        System.out.println("");







             
        
        
        
    
}

