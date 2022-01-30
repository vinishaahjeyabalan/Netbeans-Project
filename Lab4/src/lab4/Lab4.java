/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        /*int num,i;
        System.out.println("Enter an integer: ");
        num=s.nextInt();
        System.out.println("Factors of " + num + " are: " );
        for(i=1;i<=num;i++) {
            if(num%i==0) {
                System.out.print(i + " , ");
            }
        }
        */
        
        
        
        
        /*int n,sum=0;
        System.out.println("Enter integer n: ");
        n=s.nextInt();
        for(int j=0; j<=n; j++) {
             for(int i=1;i<=j;i++) {
                 sum+=i;
             }
        }
        System.out.println("Sum= " + sum);
        */
        
        
        
//        int score, sum=0, initialSumOfSquare=0, counter=-1, finalSumOfSquare, finalSum, max=-1, min=101;
//        double average, sd;
//        do{
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             if(score>max) {
//                max=score;
//            }
//            if(score>-1) {
//                if(score<min) {
//                    min=score;
//                }
//            }
//            sum+=score;
//            
//            initialSumOfSquare+=score*score;
//            counter+=1;
//           } while(score>0);
//        if(counter<=0) {
//            System.out.println("Please enter more than 1 number.");
//        }
//        else{
//            finalSum=sum-score;
//            finalSumOfSquare=initialSumOfSquare-score*score;
//            average=finalSum/counter;
//            sd=Math.sqrt((finalSumOfSquare-(finalSum*finalSum/counter)/(counter-1)));
//            System.out.println("Sum of scores = " + finalSum);
//            System.out.println("Minimum score = " + min);
//            System.out.println("Maximum score = " + max);
//            System.out.printf("Average of scores = %6.2f\n", average);
//            System.out.printf("Standard deviation = %6.2f\n",sd);
//            
//            
//        }
//    }
//}
        
        
        
        
//        System.out.print("Enter a year: ");
//        int year = s.nextInt();
//        System.out.print("Enter the first day of the year(0: Sunday, 1: Monday): ");
//        int startDay = s.nextInt();
//        int numberOfDaysInMonth = 0;
//        int month = 1;
//        while(month<=12){
//            System.out.print("          ");
//            switch (month){
//                case 1:
//                    System.out.println("January " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 2:
//                    System.out.println("February " + year);
//                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))//Checking for leap year
//                        numberOfDaysInMonth = 29;
//                    else
//                        numberOfDaysInMonth = 28;
//                    break;
//                case 3:
//                    System.out.println("March " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 4:
//                    System.out.println("April " + year);
//                    numberOfDaysInMonth = 30;
//                    break;
//                case 5:
//                    System.out.println("May " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 6:
//                    System.out.println("June " + year);
//                    numberOfDaysInMonth = 30;
//                    break;
//                case 7:
//                    System.out.println("July " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 8:
//                    System.out.println("August " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 9:
//                    System.out.println("September " + year);
//                    numberOfDaysInMonth = 30;
//                    break;
//                case 10:
//                    System.out.println("October " + year);
//                    numberOfDaysInMonth = 31;
//                    break;
//                case 11:
//                    System.out.println("November " + year);
//                    numberOfDaysInMonth = 30;
//                    break;
//                case 12:
//                    System.out.println("December " + year);
//                    numberOfDaysInMonth = 31;
//            }
//            System.out.println("-----------------------------");
//            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
//            for (int i = 0; i < startDay; i++)//Prints the number of blank spaces
//                System.out.print("    ");
//            for (int i = 1; i <= numberOfDaysInMonth; i++){//Prints the days in the month
//                if (i < 10)
//                    System.out.print("   " + i);//Used for single digit days to ensure the table looks tidy
//                else
//                    System.out.print("  " + i);//Used for double digit days to ensure the table looks tidy
//                if ((i + startDay) % 7 == 0)//To go to next line
//                    System.out.println();
//            }
//            System.out.println("");
//            startDay = (startDay + numberOfDaysInMonth) % 7;//Used to determine the number of blanks for the next month
//            month++;
//        }
//    }
//}




//
//          int score, sum = 0, inisumofsquare = 0, counter = -1, finalsumofsquare, finalsum, max = -1, min = 101;
//        double average, sd;
//
//        do {
//            System.out.print("Enter a score (negative score to quit) : ");
//            score = s.nextInt();
//            if (score > max) {
//                max = score;
//            }
//            if (score > -1) {
//                if (score < min) {
//                    min = score;
//                }
//            }
//            sum = sum + score;
//            inisumofsquare = inisumofsquare + score * score;
//            counter = counter + 1;
//        } while (score > 0);
//        
//        if(counter<=0){
//            System.out.println("Please enter more than 1 number.");
//        }
//        else{
//            finalsum = sum - score;
//        finalsumofsquare = inisumofsquare - score * score;
//        average = finalsum / counter;
//        sd = Math.sqrt((finalsumofsquare - (finalsum * finalsum / counter) / (counter - 1)));
//        System.out.println("Sum of scores = " + finalsum);
//        System.out.println("Minimum score = " + min);
//        System.out.println("Maximum score = " + max);
//        System.out.printf("Average of scores = %6.2f\n", average);
//        System.out.printf("Standard deviation = %6.2f\n", sd);
//        }




//          int player1,player2,sum1=0,sum2=0,temp,counter=1;
//          do{
//              temp=r.nextInt(6)+1;
//              sum1+=temp;
//              System.out.println("Player 1 score: " + sum1);
//              
//              counter++;
//              temp=r.nextInt(6)+1;
//              sum2+=temp;
//              System.out.println("Player 2 score: " + sum2);
//              
//              counter++;
//              }while(sum1==100 || sum1>=100);
//          System.out.println("Player 1 wins");
//          
          
          
          
          
          
          
          
        int p1 = 0, p2 = 0, start, roll;
        start = r.nextInt(2);

        if (start == 0) {
            System.out.println("Player 1 starts first!");
        } else {
            System.out.println("Player 2 starts first");
        }

        while (p1 < 100 && p2 < 100) {
            roll = r.nextInt(6)+1;
            if (start % 2 == 0) {
                p1 = p1 + roll;
                System.out.println("Player 1 rolled a " + roll + ". Total now is " + p1);
                while (roll == 6) {
                    roll = r.nextInt(6)+1;
                    p1 = p1 + roll;
                    System.out.println("6! Player 1 rolls again!\n" + "Player 1 rolled a " + roll + ". Total now is " + p1);
                    if (p1 > 99) {
                        break;
                    }

                }
                if (p1 > 99) {
                    System.out.println("Player 1 Wins!");
                    break;
                }
            } else {
                p2 = p2 + roll;
                System.out.println("Player 2 rolled a " + roll + ". Total now is " + p2);
                while (roll == 6) {
                    roll = r.nextInt(6)+1;
                    p2 = p2 + roll;
                    System.out.println("6! Player 2 rolls again!\n" + "Player 2 rolled a " + roll + ". Total now is " + p2);
                    if (p1 > 99) {
                        break;
                    }
                }
                if (p2 > 99) {
                    System.out.println("Player 2 Wins!");
                    break;
                }

            }
            start++;

        }
    }
}
        
    
    

    
        
    
          
          
              
              
    
    

        
        
    
            
        
        
        
        
        
        
       
        
        
        
        
        // TODO code application logic here
    
    


