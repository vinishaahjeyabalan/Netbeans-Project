/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4tester;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Q4Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int numerator=s.nextInt();
        System.out.println("Enter denominator: ");
        int denominator=s.nextInt();
        
        Fraction a = new Fraction(numerator, denominator);
        a.displaylowestterm();
        
        
        
        // TODO code application logic here
    }
    
}
