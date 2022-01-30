/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foplab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter two integer number: ");
//        int a = s.nextInt();
//        int b = s.nextInt();
//        System.out.print("Enter the operand: ");
//        char operand = s.next().charAt(0);
//        int ans=0;
//        if(operand == '+'){
//            ans=a + b;
//        }
//        else if(operand == '-'){
//            ans=a - b;
//        }
//        else if(operand == '*'){
//            ans=a * b;
//        }
//        else if(operand == '/'){
//            ans=a / b;
//        }
//        else if(operand == '%'){
//            ans=a % b;
//        }
//        System.out.println(a + "" + operand + "" + b + "=" + ans);





//          switch(operand) {
//              case'+':
//                  ans=a+b;
//                  break;
//              case'-':
//                  ans=a-b;
//                  break;
//              case'*':
//                  ans=a*b;
//                  break;
//              case'/':
//                  ans=a/b;
//                  break;
//               case'%':
//                   ans=a%b;
//                   break;
//          }
//          System.out.println(a + "" + operand + "" + b + "=" + ans);
        







//            Random r = new Random();
//            int rand = r.nextInt(6);
//            System.out.println("The random number is " + rand);
//            switch(rand){
//                case 1:
//                    System.out.println("1 is one");
//                    break;
//                case 2:
//                    System.out.println("2 is two");
//                    break;
//                case 3:
//                    System.out.println("3 is three");
//                    break;
//                case 4:
//                    System.out.println("4 is four");
//                    break;
//                case 5:
//                    System.out.println("5 is five");
//                    break;
//                case 0:
//                    System.out.println("0 is zero");
//                    break;
//                default:
//                    System.out.println("");
//                    break;
//            }

                 
    







//            Scanner s = new Scanner(System.in);
//              System.out.print("Enter the sales volume: ");
//              double sales = s.nextDouble();
//              double commission;
//              if(sales <= 100){
//                  commission = (5.0/100)*sales;
//                  System.out.printf("Commission is %.2f\n",commission);
//              }
//              else if(sales >100 && sales<= 500){
//                  commission = (7.5/100)*sales;
//                  System.out.printf("Commission is %.2f\n",commission);
//              }
//              else if(sales >500 && sales <= 1000){
//                  commission = (10.0/100)*sales;
//                  System.out.printf("Commission is %.2f\n",commission);
//              }
//              else if(sales >1000){
//                  commission = (12.5/100)*sales;
//                  System.out.printf("Commission is %.2f\n",commission);
//              }
              
              
              double ans1 = 3/4*2.0;
              System.out.printf("%.3f\n", ans1);
              System.out.println(3.0/4*2);
              double ans = 3.0/9.0*2;
              System.out.printf("%.4f\n", ans);
              //System.out.printf("%d\n", ans);
              double ans3 = (9 * (34 / 5)) + 32;
              System.out.println(ans3);
              double unevenlyDivided = 10 / 4;
              System.out.println(unevenlyDivided);
              double age = 30;
              System.out.println(age);
  






                
//                Random r = new Random();
//                int player1_1 = r.nextInt(6)+1;
//                System.out.println("P1_1 " + player1_1);
//                int player2_1 = r.nextInt(6)+1;
//                System.out.println("P2_1 " + player2_1);
//                int player1_2 = r.nextInt(6)+1;
//                System.out.println("P1_2 " + player1_2);
//                int player2_2 = r.nextInt(6)+1;
//                System.out.println("P2_2 " + player2_2);
//                int sum1 = player1_1 + player1_2;
//                System.out.println("Sum1: " + sum1);
//                int sum2 = player2_1 + player2_2;
//                System.out.println("Sum2: " + sum2);
//                if(sum1 > sum2){
//                    System.out.println("Player 1 wins!!!");
//                }
//                else if(sum2 > sum1){
//                    System.out.println("Player 2 wins!!!");
//                }
//                else if(sum1 == sum2){
//                    System.out.println("Draw :) ");
//                }







//               Scanner s = new Scanner(System.in);
//                 System.out.println("Enter a, b, c, d, e, f: ");
//                 int a = s.nextInt();
//                 int b = s.nextInt();
//                 int c = s.nextInt();
//                 int d = s.nextInt();
//                 int e = s.nextInt();
//                 int f = s.nextInt();
//                 double x = (e*d-b*f)/(a*d-b*c);
//                 double y = (a*f-e*c)/(a*d-b*c);
//                 if( (a*d-b*c) == 0 ){
//                     System.out.println("The equation has no solution");
//                 }
//                 else if( (a*d-b*c) != 0 ){
//                     System.out.println("The result of x: " + x);
//                     System.out.println("The result of y: " + y);
//                 }
    





//                 Scanner s = new Scanner(System.in);
//                 System.out.println("Enter the radius of circle: ");
//                 double radius = s.nextDouble();
//                 System.out.println("Enter a coordinate point x and y: ");
//                 int x = s.nextInt();
//                 int y = s.nextInt();                                                   //      _________________________
//                 double distance = Math.sqrt(Math.pow((x-0), 2)+Math.pow((y-0), 2));   // d = \/ (x2 - x1)2 + (y2 - y1)2
//                 if(distance > radius ){
//                     System.out.println("The point is outside the circle");
//                 }
//                 else if(distance < radius){
//                     System.out.println("The point is inside the circle");
//                 }
//                 else if(distance == radius){
//                     System.out.println("The point is on the circle");
//                 }
  











//        System.out.println("Enter a temperature: ");
//        double t = s.nextDouble();
//        System.out.println("Temperature is in? [Enter c for celcius, f for farenheit]: ");
//        char type = s.next().charAt(0);
//        switch (type) {
//            case 'F':
//            case 'f':
//                t = 5 * (t - 32) / (double) 9;
//                break;
//            case 'C':
//            case 'c':
//                t = (9 * (t / (double) 5)) + 32;
//                break;
//            default:
//                System.out.println("Error");
//                break;
//        }
//        System.out.printf("The temperature in " + type + " is %.2f", t);

   






        
//        char letter;
//        int count = 0; // 5
//        do {
//            System.out.print("Enter a letter (Q to quit): ");
//            letter = s.next().charAt(0); // 2
//            if(letter == 'Q'){ // 3
//                break;
//            }
//            else{
//                count++ ; // 4
//            }
//            
//            
//        } while (letter != 'Q');
//        
//        System.out.printf("The total of number of character you enter is : %d",count); // 6
       
    }
    
}

                 
            
        
        
        
       
    
    

