/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] coefficient = {4.0, 2.0, -0.5, -20.0};
        Polynomial a = new Polynomial(3, coefficient);
        a.calculation(2.0);
        a.calculation(-3.5);
    }
    
}
