/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2017q5;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2017Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar(maximum 30 marks): ");
        int grammar = s.nextInt();
        System.out.print("Enter the marks for Spelling(maximum 20 marks): ");
        int spelling = s.nextInt();
        System.out.print("Enter the marks for Length(maximum 20 marks): ");
        int length = s.nextInt();
        System.out.print("Enter the marks for Content(maximum 30 marks): ");
        int content = s.nextInt();
        
        int score = (grammar+spelling+length+content);
        
        Essay Essay = new Essay(grammar, spelling, length, content);
        System.out.println(Essay.toString());
        GradedActivity a = new GradedActivity(score);
        System.out.println(a.toString());
        // TODO code application logic here
    }
    
}
