/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Lecture2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        if (false) {
            System.out.println("Condition is true");
        }
        else {
            System.out.println("Condition is false");
        }
        final int MAX=11;
        int num = r.nextInt(MAX);
        if (num>5) {
            System.out.println(num + " is graeter than 5");
        }
        else if (num==5) {
            System.out.println(num + " is equals to 5");
        }
        else {
            System.out.println(num + " is lesser than 5");
        }
        

        System.out.println("Enter the assignment mark : ");
        int assignment = s.nextInt();
        System.out.println("Enter the exam mark : ");
        int exam = s.nextInt();

        if (assignment>=25 && exam>=25){ 
        System.out.println("Pass");
        }
        else {
            System.out.println("Failed");
        }
    
        if (num%2==0 || num>6) {
            System.out.println("You Win");
        }
      
        else {
            System.out.print("You Lost");
        }
        }        
         

        
        
