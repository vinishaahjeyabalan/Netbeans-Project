/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerq3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class TesterQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=s.nextInt();
        System.out.println("Enter height: ");
        double height=s.nextDouble();
        
        WeightCalculator1 a=new WeightCalculator1(age,height);
        a.displayage();
        a.displayheight();
        a.recommendWeight();
        // TODO code application logic here
    }
    
        // TODO code application logic here
    }
    

