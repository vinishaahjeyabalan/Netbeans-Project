/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.repetiotn;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Week4Repetiotn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        /*
        System.out.print("Enter five integer: ");
        int a;
        int i=1;
        while(i<=5) {
            a= s.nextInt();
            i++;
        
        }
        */
        
        /*
        System.out.println("Ten random number (0-100)");
        final int MAX = 101;
        for(int j=1; j<=10; j++) {
            System.out.print(r.nextInt(MAX)+ " ");
        }
        System.out.println();
        */
        
        /*
        int num, odd=0, even=0;
        final int MAX = 101;
        System.out.println("Ten random number (0-100)");
        for(int j=1; j<=10; j++) {
            num = r.nextInt(MAX-10)+10;
            System.out.print(num + " ");
            if(num%2==0) {
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("\nOdd number: " + odd);
        System.out.println("Even number: " + even);
        */
        
        /*
        int row=4, column=5;
        char c = 'A';
        for(int i=1; i<=row; i++) {
           for(int j=1; j<=column; j++) {
               System.out.print( (char) (c+r.nextInt(26)) + " ");
               //System.out.print("* ");
           }
           System.out.println();
        }
        */
        
        /*
        int u=0, m=0;
        String str;
        System.out.print("Enter a sentence: ");
        str= s.nextLine();
        
        for(int i=0; i<str.length(); i++) {
            String temp = str.substring(i, i+1);
            if (temp.contains("U") || temp.contains("u")) {
                u++;
            }
            else if (temp.contains("M") || temp.contains("m")) {
                m++;
            }
            switch (str.charAt(i)) {
                case 'M':
                case 'm':
                    m++;
                    break;
                case 'U':
                case 'u':
                    break;
            }
        }
        System.out.println("The number of [M,m] : " + m);
        System.out.println("The number of [U,u] : " + u);
        */
        
        
        /*
        String str;
        System.out.print("Enter an input [quit] to exit: ");
        str = s.nextLine();
        if(!str.equals("quit")) {
            System.out.print("Enter an input [quit] to exit: ");
            str = s.nextLine();
        }
        else {
            System.out.println("Done");
        }
        */
        
        
        
        String str;
        do {
            System.out.print("Enter an input [quit] to exit: ");
            str = s.nextLine(); 
        }while(!str.equals("quit"));
        
        
        
        
                
                
        
        
        
        
                       
                
             
        
        
        // TODO code application logic here
    }
    
}
