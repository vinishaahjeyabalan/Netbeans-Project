/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time a = new Time(13, 45);
        Time b = new Time(33, 15);
        Time c = new Time(10, 52);
        a.validity();
        b.validity();
        c.validity();
    }
    
}
