/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeightCalculator;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Q3Tester {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter age: ");
//        int age=s.nextInt();
//        System.out.println("Enter height: ");
//        double height=s.nextDouble();
        
        WeightCalculator a=new WeightCalculator(19,165);
        a.displayage();
        a.displayheight();
        a.recommendWeight();
        // TODO code application logic here
    }
    
}
