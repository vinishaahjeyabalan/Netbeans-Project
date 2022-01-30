/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foplab4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopLab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the integer: ");
//        int num = s.nextInt();
//        int i;
//        System.out.print("The factors are: ");
//        for(i=1; i<num; i++){
//            if(num%i==0){
//                System.out.print(i + ", ");
//            }
//        }
//        System.out.print(num);
//        System.out.println("");
        
        
        
        
        
        
//       Scanner s = new Scanner(System.in);
//       System.out.println("Enter an integer n: ");
//       int n = s.nextInt(); //6
//       int sum=n; //6
//       int i;
//       int temp=0;
//       while(n>0){
//           n=n-1;
//           sum+=n;
//           
//           
//       }
//       for(i=n; i>=1; i--){
//           temp+=(sum+sum-i);
//       }
//       int ans=sum+temp;
//        System.out.println(ans);





//        Q2
//        int n, sum, finalSum = 0, i, j;
//        n = 6;
//        for(i = 1; i <= n; i++){
//            sum = 0;
//            for(j = 1; j <= i; j++){
//                sum += j;
//            }
//        finalSum += sum;
//        }
//        System.out.println("Sum : " + finalSum);



//        Q2    // Use formula i*(i+1)/2
//        int n = 5;
//        int sum = 0;
//        for(int i=5; i>=1; i--) {
//            sum += i*(i+1)/2;
//        }
//        System.out.println(sum);
        

//        Q2
//        System.out.print("Enter limit of series : ");
//	  int limit=s.nextInt();
//	  int i=1,j=1;
//	  double result=0;
//	  while(i<=limit){
//	        j=1;
//	        while(j<=i){
//		      result=result+j;
//		      j++;
//	        }
//	        i++;
//	  }
//	  System.out.println("Sum of given series is : "+result);
        






//         Scanner s = new Scanner(System.in);
//         int score, sum=0, min=100, max=0, sqr=0, sumsqr;
//         double average,sd;
//         do{
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             if(score<min && score>=0){
//                 min=score;
//             }
//             else if(score>max){
//                 max=score;
//             }
//             sqr+= Math.pow(score,2);
//             sum+=score;
//             
//         }while(score>=0);
//         average = sum/5;
//         sumsqr = (int) Math.pow(sum,2);
//         sd = Math.sqrt((sqr-(sumsqr/6))/(6-1));
//         System.out.println("Minimum score: " + min);
//         System.out.println("Maximum score: " + max);
//         System.out.println("Average score: " + average);
//         System.out.printf("Standard deviation: %.2f ", sd);

         





//         int score=0, sum=0, min=100, max=0, sqr=0, sumsqr;
//         double average=0,sd=0;
//         
//         while(score>=0){
//             System.out.print("Enter a score (negative score to quit) : ");
//             score=s.nextInt();
//             if(score<min && score>=0){
//                 min=score;
//             }
//             else if(score>max){
//                 max=score;
//             }
//         
//             sqr+= Math.pow(score,2);
//             sum+=score;
//             
//         
//         average = sum/5;
//         sumsqr = (int) Math.pow(sum,2);
//         sd = Math.sqrt((sqr-(sumsqr/5))/(5-1));
//         }
//         System.out.println("Minimum score: " + min);
//         System.out.println("Maximum score: " + max);
//         System.out.println("Average score: " + average);
//         System.out.printf("Standard deviation: %.2f ", sd);
         
         








//        System.out.print("Enter a year: ");
//        int year = s.nextInt();
//        System.out.print("Enter the first day of the year(0: Monday, 1: Tuesday): ");
//        int startDay = s.nextInt();
//        int numberOfDaysInMonth = 0;
//        for(int month =1; month<=12; month++){
//            System.out.println("          "); // Selang satu baris
//            System.out.print("          "); // To give space so that the month + year will be in the middle
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
//            System.out.println(" Mon Tue Wed Thu Fri Sat Sun ");
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
//            //month++; // used in while loop
//        }
         
         
         
        





//          Random r = new Random();
//          int player1=0, player2=0, temp1=0, temp2=0;
//          while(player1<100 || player2<100){
//              temp1 = r.nextInt(6)+1;
//              player1 += temp1;
//              while(temp1 == 6){
//                  temp1 = r.nextInt(6)+1;
//                  player1+=temp1;
//              }
//              temp2 = r.nextInt(6)+1;
//              player2+=temp2;
//              while(temp2 == 6){
//                  temp2 = r.nextInt(6)+1;
//                  player2+=temp2;
//                }
//          }
//          if(player1>=100){
//              System.out.println("Player 1 wins!!!");
//          }
//          else if(player2>=100){
//              System.out.println("Player 2 wins!!!");
//          }
          
          
          



//            int player1=0, player2=0;
//            Random r = new Random();
//            int temp1=0, temp2=0;
//            while(player1 < 100 || player2 < 100){
//                player1 = r.nextInt(6)+1;
//                System.out.println("Player 1: " + player1);
//                temp1+=player1;
//                while(player1 == 6){
//                     player1 = r.nextInt(6)+1;
//                     System.out.println("Player 1: " + player1);
//                     temp1+=player1;
//                }
//                player2 = r.nextInt(6)+1;
//                System.out.println("Player 2: " + player2);
//                temp2+=player2;
//                while(player2 == 6){
//                     player2 = r.nextInt(6)+1;
//                     System.out.println("Player 2: " + player2);
//                     temp2+=player2;
//                }
//            }
//            if(temp1 >= 100){
//                System.out.println("Player 1 wins!");
//            }
//            else if(temp2 >= 100){
//                System.out.println("Player 2 wins!");
//            }
            
                    







//              Random r = new Random();
//              int n = r.nextInt(101);
//              boolean prime = true;
//                  if(n==0 || n==1){
//                      prime = false;
//                  }
//                  else{
//                      for(int i=2; i<=n/2; i++){
//                          if(n%i==0){
//                              prime = false;
//                              break;
//                          }
//                      }
//                  
//                  }
//                  if(prime){
//                      System.out.println(n);
//                  }
                  
                  
              Random r = new Random();
              int n = r.nextInt(101);
              int i=0;
              boolean prime = true;
                  if(n==0 || n==1){
                      prime = false;
                  }
                  else{
                      while(i<=n/2){
                          if(n%i==0){
                              prime = false;
                              break;
                          }
                          i++;
                      }
                  
                  }
                  if(prime){
                      System.out.println(n);
                  }
                  
            

            






















          
         
                 
             
             
             
        
         
       
       
       
    }
}

    

