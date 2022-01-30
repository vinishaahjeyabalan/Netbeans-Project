/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q5;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter three numbers to be sorted(descending order): ");
        double no1=s.nextInt();
        double no2=s.nextInt();
        double no3=s.nextInt();
        displaySortedNumbers(no1, no2, no3);
        // TODO code application logic here
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1>num2 && num2>num3)
            System.out.println(num1 + " " + num2 + " " + num3);
         if(num1>num3 && num2<num3)
            System.out.println(num1 + " " + num3 + " " + num3);
         if(num2>num1 && num1>num3)
            System.out.println(num2 + " " + num1 + " " + num3);
         if(num2>num3 && num3>num1)
            System.out.println(num2 + " " + num3 + " " + num1);
         if(num3>num2 && num2>num1)
            System.out.println(num3 + " " + num2 + " " + num1);
          if(num3>num1 && num1>num2)
            System.out.println(num3 + " " + num1 + " " + num2);
        
    }
    
}
