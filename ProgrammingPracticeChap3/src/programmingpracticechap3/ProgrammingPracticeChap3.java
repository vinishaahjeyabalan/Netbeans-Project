/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        /*double a,b,c,r1,r2,equation;
        System.out.println("Enter a,b,c: ");
        a=s.nextDouble();
        b=s.nextDouble();
        c=s.nextDouble();
        equation=Math.pow(b,2)-4*a*c;
        r1= (-b+(Math.sqrt(equation)))/2*a;
        
        r2=(-b-(Math.sqrt(equation)))/2*a;
        
        if(equation>0) {
            System.out.printf("Root1: " + r1 %4.2f + " and" + " Root2: " + r2 %4.2f);
        }
        else if(equation<0) {
            System.out.println("The equation has no real roots");
            }
        else {
            System.out.printf("The root is " + r1 %4.2f + "\n");
        }
        */
        
        
        Random r=new Random();
        /*int rand=r.nextInt(11)+1;
        System.out.println("Random number: " + rand);
        switch(rand) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
            System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
                }
            */
        
        
        
//       int num1= (int)(System.currentTimeMillis()%10);
//       int num2= (int)(System.currentTimeMillis()/10%10);
//        System.out.println("What is " + num1 + " + " + num2 + " ?");
//        int answer= s.nextInt();
//        System.out.println(num1 + " + " + num2 + " = " + answer + " is " + (num1+num2==answer));
//       
        
        
        
//        int a,b,c,d,e,f;
//        double x,y;
//        System.out.println("Enter a,b,c,d,e,f: ");
//        a=s.nextInt();
//        b=s.nextInt();
//        c=s.nextInt();
//        d=s.nextInt();
//        e=s.nextInt();
//        f=s.nextInt();
//       
//        x=(e*d-b*f)/(a*d-b*c);
//        y=(a*f-e*c)/(a*d-b*c);
//        System.out.print("x is " + x + " and y is " + y + "\n");
//        if((a*d-b*c)==0) {
//            System.out.println("The equation has no solution");
//        }




//          System.out.println("Enter today's day: ");
//          int day=s.nextInt();
//          System.out.println("Number of days elapsed since today: ");
//          int elapsedDays=s.nextInt();
//          System.out.print("Today is ");
//          if(day==0) {
//              System.out.print("Sunday");
//          }
//          else if(day==1) {
//              System.out.print("Monday");
//          }
//          else if(day==2) {
//              System.out.print("Tuesday");
//          }
//          else if(day==3) {
//              System.out.print("Wednesday");
//          }
//          else if(day==4) {
//              System.out.print("Thursday");
//          }
//          else if(day==5) {
//              System.out.print("Friday");
//          }
//          else if(day==6) {
//              System.out.print("Saturday");
//          }
//          int futureDay= (day + elapsedDays);
//          System.out.print("and the future day is ");
//          if(futureDay%7==0) {
//              System.out.print("Sunday\n");
//          }
//          else if(futureDay%7==1) {
//              System.out.print("Monday\n");
//          }
//          else if(futureDay%7==2) {
//              System.out.print("Tuesday\n");
//          }
//          else if(futureDay%7==3) {
//              System.out.print("Wednesday\n");
//          }
//          else if(futureDay%7==4) {
//              System.out.print("Thursday\n");
//          }
//          else if(futureDay%7==5) {
//              System.out.print("Friday\n");
//          }
//          else if(futureDay%7==6) {
//              System.out.print("Saturday\n");
//          }
          





//           double pounds,mass,feet,inch,height,BMI;
//           final double KILOGRAMS_PER_POUND=0.45359237;
//           final double METERS_PER_INCH=0.0254;
//           final double INCHES_PER_FEET=12;
//           System.out.println("Enter weight in pounds: ");
//           pounds=s.nextDouble();
//           System.out.println("Enter feet: ");
//           feet=s.nextDouble();
//           System.out.println("Enter inches: ");
//           inch=s.nextDouble();
//           mass=pounds*KILOGRAMS_PER_POUND;
//           height=(feet*12)*0.0254;
//           BMI=mass/(height*height);
//           System.out.println("BMI is " + BMI);
//           if(BMI<18.5) {
//               System.out.println("Underweight");
//           }
//           else if(BMI>=18.5 && BMI<25.0) {
//               System.out.println("Normal");
//           }
//           else if(BMI>=25.0 && BMI<30.0) {
//               System.out.println("Overweight");
//           }
//           else if (BMI>=30.0) {
//               System.out.println("Obese");
//           }
           




//             int integer1,integer2,integer3;
//             System.out.println("Enter 3 integers: ");
//             integer1=s.nextInt();
//             integer2=s.nextInt();
//             integer3=s.nextInt();
//             if(integer1>integer2 && integer2>integer3) {
//                 System.out.println(integer3 + " , " + integer2 + " , " + integer1);
//             }
//             else if(integer1>integer3 && integer3>integer2) {
//                 System.out.println(integer3 + " , " + integer1 + " , " + integer2);
//             }
//              else if(integer2>integer1 && integer1>integer3) {
//                 System.out.println(integer3 + " , " + integer1 + " , " + integer2);
//             }
//              else if(integer2>integer3 && integer3>integer1) {
//                 System.out.println(integer1 + " , " + integer3 + " , " + integer2);
//             }
//              else if(integer3>integer1 && integer1>integer2) {
//                 System.out.println(integer2 + " , " + integer1 + " , " + integer3);
//             }
//              else if(integer3>integer2 && integer2>integer1) {
//                 System.out.println(integer1 + " , " + integer2 + " , " + integer3);
//             }




              
//              System.out.print("Enter the first 9 digits of an ISBN as integer: ");
//              int isbn = s.nextInt();
//              int d1=isbn/100000000;
//              int remainder=isbn%100000000;
//              int d2=remainder/10000000;
//              remainder%=10000000;
//              int d3=remainder/1000000;
//              remainder%=1000000;
//              int d4=remainder/100000;
//              remainder%=100000;
//              int d5=remainder/10000;
//              remainder%=10000;
//              int d6=remainder/1000;
//              remainder%=1000;
//              int d7=remainder/100;
//              remainder%=100;
//              int d8=remainder/10;
//              remainder%=10;
//              int d9=remainder;
//              int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
//              if(d10==10) {
//                  System.out.println("The ISBN-10 number is " + d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+"X");
//              }
//              else {
//                  System.out.println("The ISBN-10 number is " + d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
//              }
              




//               int num1=(int)(Math.random()*1000);
//               int num2=(int)(Math.random()*1000);
//               System.out.println("What is the answer for " + num1 + " * " + num2 + " ? ");
//               int answer=s.nextInt();
//               if(num1*num2==answer) {
//                   System.out.println("Your answer si correct!");
//               }
//               else {
//                   System.out.println("Your answer is incorrect!\n" + num1 + " * " + num2 + " should be " + (num1*num2));
//               }




  
//                System.out.println("Month: ");
//                int month=s.nextInt();
//                System.out.println("Year: ");
//                int year=s.nextInt();
//                boolean leapYear= (year%4==0 && year%100!=0) || (year%400==0);
//                if(month==1) {
//                    System.out.println("January " + year + " has 31 days. ");
//                }
//                else if(month==2 && leapYear){
//                    System.out.println("February " + year + " has 29 days. ");
//                }
//                 else if(month==2 && leapYear==false){
//                    System.out.println("February " + year + " has 28 days. ");
//                }
//                else if(month==3) {
//                    System.out.println("March " + year + " has 31 days. ");
//                }
//                else if(month==4) {
//                    System.out.println("April " + year + " has 30 days. ");
//                }
//                else if(month==5) {
//                    System.out.println("May " + year + " has 31 days. ");
//                }
//                else if(month==6) {
//                    System.out.println("June " + year + " has 30 days. ");
//                }
//                else if(month==7) {
//                    System.out.println("July " + year + " has 31 days. ");
//                }
//                else if(month==8) {
//                    System.out.println("August " + year + " has 31 days. ");
//                }
//                else if(month==9) {
//                    System.out.println("September " + year + " has 30 days. ");
//                }
//                else if(month==10) {
//                    System.out.println("October " + year + " has 31 days. ");
//                }
//                else if(month==11) {
//                    System.out.println("November " + year + " has 30 days. ");
//                }
//                else if(month==12) {
//                    System.out.println("December " + year + " has 31 days. ");
//                }




//              System.out.println("Enter a three digit integer: ");
//              int integer=s.nextInt();
//              int digit1=integer/100;
//              int remainder=integer%100;
//              int digit3=remainder%10;
//              System.out.println(integer + ((digit1==digit3)? " is a " : " is not a ") + " palindrome ");




//                int head=0,tail=1;
//                int rand=r.nextInt(2);
//                System.out.println("Guess: ");
//                int guess=s.nextInt();
//                System.out.println(((guess==rand)? "Correct" : "Incorrect") + " guess.");





//               int width=50;
//               int height=150;
//               int rand_x=r.nextInt(50)-25;
//               int rand_y=r.nextInt(150)-75;
//               System.out.println("Random coordinate is (" + rand_x + "," + rand_y + ")");
//               
                




//                int scissor=0;
//                int rock=1;
//                int paper=2;
//                System.out.print("scissor(0), rock(1), paper(2): ");
//                int player=s.nextInt();
//                int rand=r.nextInt(3);
//                System.out.print("The computer is " );
//                switch(rand) {
//                    case 0:
//                        System.out.print("scissor. ");
//                        break;
//                    case 1:
//                        System.out.print("rock. ");
//                        break;
//                    case 2:
//                        System.out.print("paper. ");
//                }
//                System.out.print("You are " );
//                switch(rand) {
//                    case 0:
//                        System.out.print("scissor. ");
//                        break;
//                    case 1:
//                        System.out.print("rock. ");
//                        break;
//                    case 2:
//                        System.out.print("paper. ");
//                }
//                if(rand==player) {
//                    System.out.println("It is a draw.");
//                }
//                else if(rand==0 && player==1) {
//                    System.out.println("You won");
//                }
//                else if(rand==0 && player==2) {
//                    System.out.println("Computer won");
//                }
//                else if(rand==1 && player==0) {
//                    System.out.println("Computer won");
//                }
//                else if(rand==1 && player==2) {
//                    System.out.println("You won");
//                }
//                else if(rand==2 && player==1) {
//                    System.out.println("Computer won");
//                }
//                else if(rand==2 && player==0) {
//                    System.out.println("You won");
//                }
                
                
                
                
              
                
               System.out.println("Enter year: ");
               int year=s.nextInt();
               System.out.println("Enter month: ");
               int m=s.nextInt();
               switch(m) {
                   case 1:
                     System.out.println("January");
                     break;
                   case 2:
                     System.out.println("February");
                     break;
                   case 3:
                     System.out.println("March");
                     break;
                   case 4:
                     System.out.println("April");
                     break;
                   case 5:
                     System.out.println("May");
                     break;
                   case 6:
                     System.out.println("Jun");
                     break;
                   case 7:
                     System.out.println("July");
                     break;
                   case 8:
                     System.out.println("August");
                     break;
                   case 9:
                     System.out.println("Sept");
                     break;
                   case 10:
                     System.out.println("Oct");
                     break;
                   case 11:
                     System.out.println("Nov");
                     break;
                   case 12:
                     System.out.println("Dec");
                     break;
                }
               System.out.println("Enter the day of the month: ");
               int q=s.nextInt();
               int j=year/100;
               int k=year%100;
               int h=((q + (26*(m+1)/10) + k + k/4 + j/4 +5*j)%7);
               System.out.print("Day of the week is ");
               switch(h) {
                   case 0:
                       System.out.print("Saturday\n");
                       break;
                   case 1:
                       System.out.print("Sunday\n");
                       break;
                   case 2:
                       System.out.print("Monday\n");
                       break;
                   case 3:
                       System.out.print("Tuesday\n");
                       break;
                   case 4:
                       System.out.print("Wednesday\n");
                       break;
                   case 5:
                       System.out.print("Thursday\n");
                       break;
                   case 6:
                       System.out.print("Friday\n");
                       break;
               }
               
               
               

               
               



              
    }
}
             
          
                  
                 
              
          
    
  
        
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
   

