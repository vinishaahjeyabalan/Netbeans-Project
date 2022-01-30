/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q4;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to be reversed: ");
        int number=s.nextInt();
        System.out.println(reverse(number));
        // TODO code application logic here
    }
    public static String reverse(int number){
        String reverse = ""; //holds reversed number
        String n = number + ""; //convert number to string
        for(int i=n.length()-1; i>=0; i--){
            reverse+=n.charAt(i);
        }
        return reverse;
    }
    
    
}
