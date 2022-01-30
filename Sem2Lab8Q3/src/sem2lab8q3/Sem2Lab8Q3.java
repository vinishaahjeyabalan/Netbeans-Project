/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2lab8q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Sem2Lab8Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        WeightCalculator a = new WeightCalculator(s.nextInt(), s.nextDouble());
        System.out.println("Age: " + a.age);
        System.out.println("Height: " + a.height);
        System.out.println("Recommend Weight: " + a.recommendWeight());
        // TODO code application logic here
    }
    
}
