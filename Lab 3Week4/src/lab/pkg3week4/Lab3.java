/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3week4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        /*
        System.out.print("Enter two integer number: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.print("Enter the operand: ");
        char operand = s.next().charAt(0);
        
        switch(operand) {
            case'+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("The operand is not detected");
                return;
        }*/
        
        
        
        /*System.out.println("Random integer: ");
        final int MAX = 6;
        int rand_integer = r.nextInt(MAX);
        switch(rand_integer) {
            case 0:
                System.out.println("0 is zero");
                break;
            case 1:
                 System.out.println("1 is one");
                 break;
            case 2:
                 System.out.println("2 is two");
                 break;
            case 3:
                 System.out.println("3 is three");
                 break;
            case 4:
                 System.out.println("4 is four");
                 break;
            case 5:
                 System.out.println("5 is five");
                 break;
            default:
                  System.out.println();
            */
        
        /*
        final int DICE = 6;
        int player1, player2, score1, score2;
        for(player1=1; player1<=2; player1++) {
            System.out.println("Score: ");
            score1= r.nextInt(DICE);
        for(player2=1; player2<=2; player2++) {
            System.out.println("Score: ");
            score2= r.nextInt(DICE);
        if(score1<=score2) {
            System.out.println("Player 2 wins");
        }
        else if(score1==score2) {
            System.out.println("Draw");
        }
        else{
            System.out.println("Player 1 wins");
            
        }
        */
        
        
        /*int num1,num2,addition,substraction,multiplication,division,remainder;
        System.out.println("Enter two integer number: ");
        num1=r.nextInt();
        num2=r.nextInt();
        System.out.println("num1:" + num1 + " and num2:" + num2);
        char operand;
        System.out.println("Enter the operand: ");
        operand=s.next().charAt(0);
        if(operand=='+') {
            addition=num1+num2;
            System.out.println(num1+ "+" +num2+ " = " +  addition);
            }
        if(operand=='-') {
            substraction=num1-(num2);
            System.out.println(num1+ "-" +num2+ " = " + substraction);
            }
        if(operand=='*') {
            multiplication=num1*num2;
            System.out.println(num1+ "*" +num2+ " = " + multiplication);
            }
        if(operand=='/') {
            division=num1/num2;
            System.out.println(num1+ "/" +num2+ " = " + division);
            }
        if(operand=='%') {
            remainder=num1%num2;
            System.out.println(num1+ "%" +num2+ " = " + remainder);
            }
        else {
            System.out.println("Operand is not detected");
            }
        */
        
        
        
        /*int rand_Int;
        rand_Int=r.nextInt(6);
        System.out.println("Random integer: " + rand_Int);
        if(rand_Int==1) {
            System.out.println("1 is one");
        }
        if(rand_Int==2) {
            System.out.println("2 is two");
        }
        if(rand_Int==3) {
            System.out.println("3 is three");
        }
        if(rand_Int==4) {
            System.out.println("4 is four");
        }
        if(rand_Int==5) {
            System.out.println("5 is five");
        }
        */
        
        
        /*int sales_volume;
        double commission;
        System.out.println("Sales volume: ");
        sales_volume=s.nextInt();
        if(sales_volume<=100) {
            commission=(5/100)*sales_volume;
            System.out.println("Commission: " + commission);
        }
        if(sales_volume>100 && sales_volume<=500) {
            commission=(7.5/100)*sales_volume;
            System.out.println("Commission: " + commission);
        }
        if(sales_volume>500 && sales_volume<=1000) {
            commission=(10/100)*sales_volume;
            System.out.println("Commission: " + commission);
        }
        if(sales_volume>1000) {
            commission=(12.5/100)*sales_volume;
            System.out.println("Commission: " + commission);
        }
        */
        
        
        
        /*final int DICE=6;
        int p11,p12,p21,p22,sum_p1,sum_p2;
        p11=r.nextInt(5)+1;
        System.out.println("Player1 1st score: " + p11);
        p12=r.nextInt(5)+1;
        System.out.println("Player1 2nd score: " + p12);
        p21=r.nextInt(5)+1;
        System.out.println("Payer2 1st score: " + p21);
        p22=r.nextInt(5)+1;
        System.out.println("Player2 2nd score: " + p22);
        
        sum_p1=p11+p12;
        sum_p2=p21+p22;
        if(sum_p1>sum_p2) {
            System.out.println("Player 1 wins");
        }
        else if(sum_p1==sum_p2) {
            System.out.println("It's a draw");
        }
        else {
            System.out.println("Payer 2 wins");
        }
        */
        
        
        /*int a,b,c,d,e,f;
        double x,y;
        System.out.println("Enter value for a: ");
        a=s.nextInt();
        System.out.println("Enter value for b: ");
        b=s.nextInt();
        System.out.println("Enter value for c: ");
        c=s.nextInt();
        System.out.println("Enter value for d: ");
        d=s.nextInt();
        System.out.println("Enter value for e: ");
        e=s.nextInt();
        System.out.println("Enter value for f: ");
        f=s.nextInt();
       
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        if((a*d-b*c)==0) {
            System.out.println("The equation has no solution");
        }
        else {
            System.out.println("The equation is solved");
        }
        */
        
        
        /*int radius,x,y;
        System.out.println("Radius of circle: ");
        radius=s.nextInt();
        System.out.println("Coordinate: ");
        x=s.nextInt();
        y=s.nextInt();
        if(x<=radius && y<=radius) {
            System.out.println("Coordinate falls on the circle");
        }
        else {
            System.out.println("Coordinate falls outside the circle");
        }
        */
        
        
        
        
        /*double radius,pythagoras_theoram;
        int x,y;
        System.out.println("Radius of the circle: ");
        radius=s.nextDouble();
        System.out.println("Coordinate: ");
        x=s.nextInt();
        y=s.nextInt();
        pythagoras_theoram=Math.pow(Math.pow(x,2.0)+ Math.pow(y,2.0),1/2);
        if(pythagoras_theoram<=radius) {
            System.out.println("The coordinate is within the circle");
            }
        else { 
            System.out.println("The coordinate is outside the circle");
            }
        */
        
        
        
        /*double radius,distance;
        int x,y;
        System.out.println("Radius of the circle: ");
        radius=s.nextDouble();
        System.out.println("Coordinate: ");
        x=s.nextInt();
        y=s.nextInt();
        distance=(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
        if(distance<=radius){
            System.out.println("The coordinate is within the circle ");
        }
        else {
            System.out.println("The coordinate is outside the circle");
        }
        */
        
        
        
        int temp,sum1=0,sum2=0;
        for(int i=1; i<=2; i++) {
            temp=r.nextInt(6)+1;
            System.out.println("Roll number" + i + " for player 1 is " + temp);
            sum1=+temp;
            temp=r.nextInt(6)+1;
            System.out.println("Roll number" + i + " for player 2 is " + temp);
            sum2=+temp;
            }
        if(sum1>sum2) {
            System.out.println("Player 1 wins");
        }
        else if(sum1<sum2) {
            System.out.println("Player 2 wins");
        }
        else {
            System.out.println("Draw");
        }
        
        
        
//        final int ROW=4,COLUMN=5,MAX=100;
//        Random g =new Random();
//        for(int i=1; i<=ROW; i++) {
//            for(int j=1; j<=COLUMN; j++)
//                System.out.printf("%3d",g.nextInt(MAX));
//            System.out.println();
//        }


        
        /*int i;
        final int DOZEN=12;
        for(i=1; i<=DOZEN; i++) {
            System.out.println(i*i + ",");
        System.out.println(i*i);
        }*/
        
        
        
        /*int num=12,ans=0;
        for(int i=1; i<=num; i++) 
            ans+=i;
        System.out.println("The sum of numbers from 1 to " + num + " is " + ans);
        */
        
        
        
        /*double ans=0;
        for(int i=25, j=1; i>0; i--, j++)
            ans+=j/(i*1.0);
        System.out.printf("The sum of the series is %.2f\n", ans);*/
            
            
        
        
        
        
        
        
        
        
        
        
        
                
                
                
                
                
                
                
        
        
        
        
        
        
        
        
        
      
        
        
        
        
        
        
        
        
           
        
            
            
        
        
        
        
               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                        
                
                
            
            
        }
        
        // TODO code application logic here
    }


    

