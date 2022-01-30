/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
//        int score;
//        do{
//            System.out.println("Enter your score: ");
//            score=s.nextInt();
//            if(score==-1) {
//                System.out.println("No numbers are entered except 0");
//                break;
//            }
//            else if(score>=60) {
//                System.out.println("You pass the exam");
//            }
//            else {
//                System.out.println("You don't pass the exam");
//            }
//        }while(score!=-1);





//          double fahrenheit;
//          System.out.println("Celcius              Fahrenheit");
//          for(int cel=0; cel<=100; cel+=2) {
//              fahrenheit=(cel*9/5+32);
//              System.out.printf("%-25d%6.1f\n",cel,fahrenheit);
//          }




//           int tuition=10000;
//           int tenthYear=0;
//           int total=0;
//           for(int i=1; i<=14; i++) {
//              tuition+=tuition*0.06;
//              if(i==10) {
//                  tenthYear=tuition;
//              }
//              else if(i>10) {
//                  total+=tuition;
//              }
//               
//           }
//           System.out.println("Tuition in 10th year is $" + tenthYear);
//           System.out.println("Total tuition of 4 years after 10th year is $" + total);
            
        



//           final int NUMBER_OF_PRIMES_PER_LINE=8;
//           int count=0;
//           System.out.println("The prime numbers between 2 and 1200, inclusive are \n");
//           
//           for(int number=2; number<=1200; number++) {
//               boolean isPrime=true;
//               
//               for(int divisor=2; divisor<=number/2; divisor++) {
//                   if(number%divisor==0) {
//                       isPrime=false;
//                       break;
//                   }
//               }
//     
//           if(isPrime) {
//               count++;
//               
//               if(count%NUMBER_OF_PRIMES_PER_LINE==0) {
//                   System.out.println(number);
//               }
//               else{
//                   System.out.println(number + " ");
//               }
//           }
            
            




//            double sum1=0;
//            double sum2=0;
//            for(int i=1; i<=50000; i++) {
//                double leftToRight=1/i;
//                sum1=sum1+leftToRight;
//            }
//            for(int i=50000; i>=1; i--) {
//                double rightToLeft=1/i;
//                sum2=sum2+rightToLeft;
//            }
//            System.out.println("Left to right is " + sum1 );
//            System.out.println("Right to left is " + sum2 );






//            System.out.println("Enter numbers: ");
//            int max=s.nextInt();
//            int count=1;
//            
//            
//                int number=s.nextInt();
//                if(number>max) {
//                    max=number;
//                    count=1;
//                }
//                else if(number==max) {
//                    count++;
//                }
//                System.out.println("The largest number is " + max);
//                System.out.println("The occurrence count of largest number is " + count);




//             int count = 0;
//             int number = -1;
//             int max = -1;
//
////Create a scanner
//             Scanner input = new Scanner(System.in);
//             System.out.println("Enter numbers (the input ends if it is 0): ");
//
////input user data but end when user enter 0
//             while (number != 0) {
//             number = input.nextInt();
////check if number is bigger than max
//             if (number > max) {
////if yes, set the number to max
//             max = number;
//             count = 1;
//             }
////if number is equal to max then increment count by 1
//             else if (number == max){
//             count++;
//             }
//             }
//
////Display max and occurrence
//             System.out.println("The largest number is: " +max);
//             System.out.println("The occurrence count of the largest number is " +count);






//        System.out.println("Enter string to reverse:");
//        
//        Scanner read = new Scanner(System.in);
//        String str = read.nextLine();
//        String reverse = "";
//        
//        for(int i = str.length()-1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        
//        System.out.println("Reversed string is:");
//        System.out.println(reverse);




//          double sum=0;
//          double mean;
//          double sd=0;
//          double xsquared=0;
//          double sum2=0;
//          System.out.print("Enter 10 numbers: ");
//          for(int i=1; i<=10; i++) {
//              double numbers=s.nextDouble();
//              sum=sum+numbers;
//              xsquared=xsquared+Math.pow(numbers,2);
//              sum2=Math.pow(sum,2);
//          }
//          mean=sum/10;
//          sd=Math.sqrt((xsquared-sum2/10)/9);
//          System.out.println("Standard deviation: " + sd);
//          System.out.println("Mean: " + mean);



            
//            double sum=0;
//            int time=0;
//            System.out.println("Enter the initial deposit amount: ");
//            double deposit=s.nextInt();
//            System.out.println("Enter the annual percentage yield: ");
//            double percentage=s.nextDouble();
//            System.out.println("Enter maturity period: ");
//            int months=s.nextInt();
//            System.out.println("Months" + "           " + "CD Value");
//            for(int i=1; i<=months; i++) {
//                deposit=(deposit+(deposit*percentage)/1200);
//                sum=deposit;
//                 System.out.printf("%-17d%.2f",i,sum);
//                System.out.println();
//            }





//            System.out.print("Enter an integer: ");
//            int number=s.nextInt();
//            String bits="";
//            for(int i=0; i<16; i++) {
//                bits=(number & 1) + bits;
//                number>>=1;
//            }
//            System.out.println("The bits are " + bits);
            




//             System.out.println("Enter a string: ");
//             String str=s.nextLine();
//             String even = "";
//             for(int i=1; i<str.length(); i+=2) {
//                 even+=str.charAt(i);
//             }
//             System.out.println(even);




       
//               final int NUMBERS_OF_PRIME_PER_LINE=8;
//               int count=0;
//               int number=2;
//               System.out.println("The prime numbers between 2 and 1200 are ");
//               while(number<=1200) {
//                   boolean prime=true;
//                   
//                   for(int divisor=2; divisor<=number/2; divisor++) {
//                       if(number%divisor==0) {
//                           prime=false;
//                           break;
//                       }
//                   }
//                   if(prime) {
//                       count++;
//                   
//                       if(count%NUMBERS_OF_PRIME_PER_LINE==0) {
//                           System.out.println(number);
//                       }
//                       else {
//                           System.out.println(number + "");
//                       }
//                       
//                   }
//                   number++;
//               }
             





//                 int sum=0;
//                 int score;
//                 System.out.print("Enter how many players(2-4): ");
//                 int numOfPlayer=s.nextInt();
//                 String player="";
//                 switch(numOfPlayer) {
//                     case 1:
//                         player="Player 1";
//                         break;
//                     case 2:
//                         player="Player 2";
//                         break;
//                     case 3:
//                         player="Player 3";
//                         break;
//                     case 4:
//                         player="Player 4";
//                         break;
//                 }
//                 do{
//                     score=r.nextInt(21)-10;
//                     sum+=score;
//                     System.out.println(player + " = " + sum);
//                 }while(score<50);
//                 if(score>=50) {
//                     System.out.println(player + "wins");
//                 }
                 
                 
                 
                 int score=0;
                 int temp;
                 System.out.print("Enter how many players(2-4): ");
                 int numOfPlayer=s.nextInt();
                 for(int i=1; i<=numOfPlayer; i++) {
                     for(score=0; score<50; score+=temp) {
                     temp=r.nextInt(21)-10;
                     score+=temp;
                     System.out.println("Player " + i + ":" + score);
                     
                     if(score>=50) {
                         System.out.println("Player " + i + " wins");
                     }
                 }
                 }
                   
              
           
            
            
             
            
          
          






















            }





           
           }
           
               
           

               
               
               
               
               
               
               
               
               
               
               
               
               
               
        
        // TODO code application logic here
               

    




        


    




