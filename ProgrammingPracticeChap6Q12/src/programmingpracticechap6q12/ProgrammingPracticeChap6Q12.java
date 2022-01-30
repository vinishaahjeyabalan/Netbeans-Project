/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q12;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1=s.nextInt();
        System.out.println("Enter num2: ");
        int num2=s.nextInt();
        System.out.println("Characters in between " + (num1) + " and " + (num2) + " are ");
        printNumbers(num1, num2, 9);
        
        // TODO code application logic here
    }
    
    public static void printNumbers(int num1, int num2, int numberPerLine){
        for(int i=num1+1; i<=num2-1; i++){
        System.out.println(i);
        }
        
    }
    
}
