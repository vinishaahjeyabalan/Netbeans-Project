/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q7;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("The amount invested: ");
        int amount=s.nextInt();
        System.out.println("Annual interest rate; ");
        int interestRate=s.nextInt();
        System.out.println("Years    Future Value");
        for(int i=1; i<=30; i++){
             System.out.printf(i + "        " + "%.2f",futureInvestmentValue(1000, 0.09, i ) );
           
        }
        
        // TODO code application logic here
    }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureValue=investmentAmount*(Math.pow((1+monthlyInterestRate),(years*12)));
        return futureValue;
    }
    
}
