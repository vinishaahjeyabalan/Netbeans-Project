/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foplab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        double Fahrenheit=0, Celcius;
//        Celcius = (Fahrenheit-32)/1.8;
//        System.out.println("Enter temperature in Fahrenheit: ");
//        Fahrenheit = s.nextDouble();
//        System.out.printf("Temperature in " + Fahrenheit + " degree Fahrenheit is %.2f degree Celcius\n", Celcius);
//        






//          Scanner s = new Scanner(System.in);
//          System.out.println("Enter the price of the car: ");
//          double p = s.nextDouble();
//          System.out.println("Enter the down payment: ");
//          double d = s.nextDouble();
//          System.out.println("Enter the interest rate in %: ");
//          int r = s.nextInt();
//          System.out.println("Enter the loan duration in year: ");
//          int y = s.nextInt();
//          double m = (p-d)*(1+r*y/100)/(y*12);
//          System.out.printf("Monthly payment is RM%.2f\n", m);
          
           




//           Random r = new Random();
//           int[] rand = new int [3];
//           int i;
//           double sum=0;
//           double average=0;
//           for(i=0; i<3; i++){
//               rand[i] = r.nextInt(40)+10;
//               sum+=rand[i];
//               average = sum/3;
//           }
//           System.out.println("The three random numbers are " + rand[0] + " " + rand[1] + " " + rand[2]);
//           System.out.println("The sum of the three numbers are " + sum);
//           System.out.printf("The average of the three numbers is %.2f\n",average);
//           
           





//             Scanner s = new Scanner(System.in);
//             System.out.println("Enter the number of seconds: ");
//             int seconds = s.nextInt();
//             int hrs = seconds/(60*60);
//             int min = (seconds%(60*60)/60);
//             int sec = (seconds%(60*60)%60);
//             System.out.println(seconds + " seconds is " + hrs + " hours " + min + " minutes " + sec + " seconds");
//             
           




//              Random r = new Random();
//              int rand = r.nextInt(10000);
//              System.out.println("The number is " + rand);
//              int rem;
//              int sum = 0;
//              while(rand != 0){
//                  rem = rand%10;
//                  sum+=rem;
//                  rand = rand/10;
//              }
//              System.out.println("The sum of the digits is " + sum);





               Scanner s = new Scanner(System.in);
               System.out.print("Enter the amount of water in gram: ");
               double gram = s.nextInt();
               double m = gram/1000;
               System.out.print("Enter the initial temperature in Fahrenheit: ");
               double iniTemp = s.nextDouble();
               System.out.print("Enter the final temperature in Fahrenheit: ");
               double finalTemp = s.nextDouble();
               double iniCel = (iniTemp -32)/1.8;
               double finalCel = (finalTemp -32)/1.8;
               double q = m*(finalCel-iniCel)*4184;
               System.out.printf("The energy needed is %e\n",q);
               
               
        // TODO code application logic here
    }
    
}
