/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n=s.nextInt();
        System.out.println("The sum of digits in number " + n + " is " + sumDigits(n));
        
        
        // TODO code application logic here
    }
    public static int sumDigits(long n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
        
    }
    
}
