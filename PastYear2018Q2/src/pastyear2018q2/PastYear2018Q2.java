/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2018q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2018Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter N number: ");
        int N = s.nextInt();
        int i, A1=0, A2=0, A3=0;
        System.out.print("The random numbers are: ");
        int[] rand = new int[N];
        for(i=0; i<N; i++){
            rand[i] = r.nextInt(101)+50;
            System.out.print(rand[i] + " ");
        }
        for(i=0; i<N; i++){
            int lastDigit = rand[i]%10;
            if(lastDigit == 0 || lastDigit == 1 || lastDigit == 2 || lastDigit == 3){
                A3++;
            }
            if(lastDigit == 4 || lastDigit == 5 || lastDigit == 6){
                A2++;
            }
             if(lastDigit == 7 || lastDigit == 8 || lastDigit == 9){
                A1++;
            }
             
        }
        System.out.println("\nGroup AAA : " + A3);
        System.out.println("Group AA : " + A2);
        System.out.println("Group A : " + A1);
        
        
        
        
        // TODO code application logic here
    }
    
}
