/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Q1Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Number a = new Number();
        System.out.print("The 10 random numbers are: ");
        a.generate_array();
        
        Number b = new Number(5);
        System.out.print("The 5 random numbers are: ");
        b.generate_array();
        
        Number c = new Number(4, 50);
        System.out.print("The 4 random numbers are: ");
        c.generate_array();
        
       
       
        
        c.displayprime();
//        c.displayeven();
        // TODO code application logic here
    }
    
}
