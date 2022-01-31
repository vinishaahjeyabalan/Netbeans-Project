/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random num = new Random();
        Scanner number = new Scanner(System.in);
        
        int n=0;
        int score1 = 0;
        while(n>=0) {
            
            int a = num.nextInt(13);
            int b = num.nextInt(13);
            System.out.println("Enter negative number to quit");
            System.out.printf("%d x %d = ", a, b);
            n = number.nextInt();
            score1 += compare(a,b,n);
        }
        //System.out.println(compare(num.nextInt(13),num.nextInt(13),n));
        
        System.out.println("Your score is " + score1);
    }
    
    public static int compare(int a, int b, int c){
        int score = 0;
        
        if(c==(a*b)){
            score++;
        }
        
        return score;
        
        // TODO code application logic here
    }
    
}
