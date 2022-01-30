/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner (System.in);
        double num = s.nextDouble();
        System.out.println("The temperature in degree fahrenheit is ");
        double cel = (num-32)/1.8;
        System.out.printf("The temperature in degree celcius is %.2f", cel);
        
    }
    
}
