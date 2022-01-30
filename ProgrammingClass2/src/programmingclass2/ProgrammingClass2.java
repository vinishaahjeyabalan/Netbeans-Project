/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingclass2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name,major,like_programming;
        int credit_hrs,stress;
        System.out.println("Name:\nMajor:\nLike programming:\nCredit hours:\n");
        name=s.next();
        major=s.next();
        like_programming=s.next();
        credit_hrs=s.nextInt();
        if(like_programming==yes) {
            stress=credit_hrs*10;
            System.out.println("Stress: " + stress);
            }
        else {
            stress=credit_hrs*20;
            System.out.println("Stress: " + stress);
            }
        
        
        
        
        // TODO code application logic here
    }
    
}
