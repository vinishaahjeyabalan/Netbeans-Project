/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=s.nextInt();
        System.out.println("Reverse of the number is " + reverse(number));
        System.out.println("Number " + number + " is palindromic: " + isPalindromic(number));
        // TODO code application logic here
    }
    public static int reverse(int number){
        int reverse=0;
        while(number!=0){
           int digit = number%10;
           reverse= reverse*10 + digit;
           number= number/10;
            
        }
        return reverse;
    }
    public static boolean isPalindromic(int number){
        int temp,sum=0;
        boolean ans = true;
        temp=number;
        while(number > 0){
           int digit = number%10;
           sum=(sum*10)+digit;
           number/=10;
        }
        if(sum==temp)
               ans = true;
        
           
        else if(sum!=temp)
               ans = false;
        
       return ans;
    }

}

           
    


    
    
    

