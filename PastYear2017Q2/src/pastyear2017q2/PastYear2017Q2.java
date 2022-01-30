/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2017q2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2017Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        int initialFee = s.nextInt();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = s.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = s.nextInt();
        System.out.print("\nComputed tuition fee for year " + year + " is: " + computeFee(initialFee,rate,year));
        
        // TODO code application logic here
    }
    
    public static double computeFee(int initialFee, double rate, int year){
        int sum = 0;
        for(int i=1; i<=year; i++){
            double computeFee = initialFee;
            computeFee = computeFee*(rate/100);
            sum+=computeFee;
        }
        return sum;
    }
    
}
