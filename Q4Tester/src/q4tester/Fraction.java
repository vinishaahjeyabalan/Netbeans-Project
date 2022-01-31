/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4tester;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Fraction {
     private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    public int GCD(){
        int remainder;
        int a = numerator, b = denominator;
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
        
    }
    
    public void displaylowestterm(){
        int a = numerator, b = denominator;
        String s1 = "";
        a = a / GCD();
        b = b / GCD();
        s1 = a + "/" + b;
        System.out.println("GCD is " + b);
        System.out.println("Simplest form is " + s1);
        
    }
    
    
}
    

