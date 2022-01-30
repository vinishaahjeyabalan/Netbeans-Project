/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva.pkg3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Viva3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner String=new Scanner(System.in);
        /*int num1,num2,num3;
        double ans;
        char operand1,operand2;
        
        System.out.print("Enter three integers: ");
        num1=String.nextInt();
        num2=String.nextInt();
        num3=String.nextInt();
        System.out.print("Operands: ");
        operand1=String.next().charAt(0);
        operand2=String.next().charAt(0);
        if(operand1=='+' && operand2=='*') {
            ans=num1+num2*num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='+' && operand2=='/') {
            ans=num1+num2/num3;
            System.out.println("Ans: " + + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='+' && operand2=='-') {
            ans=num1+num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='+' && operand2=='%') {
            ans=num1+num2/num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='+' && operand2=='+') {
            ans=num1+num2+num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='-' && operand2=='+') {
            ans=num1-(num2+num3);
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='-' && operand2=='*') {
            ans=num1-num2*num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='-' && operand2=='/') {
            ans=num1-num2/num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='-' && operand2=='%') {
            ans=num1-num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='-' && operand2=='-') {
            ans=num1-num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='*' && operand2=='+') {
            ans=num1*num2+num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='*' && operand2=='-') {
            ans=num1*num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='*' && operand2=='/') {
            ans=num1*num2/num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='*' && operand2=='%') {
            ans=num1*num2%num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='*' && operand2=='*') {
            ans=num1*num2*num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='/' && operand2=='*') {
            ans=num1/(num2*num3);
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='/' && operand2=='%') {
            ans=(num1/num2)%num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='/' && operand2=='+') {
            ans=num1/num2+num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='/' && operand2=='-') {
            ans=num1/num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='/' && operand2=='/') {
            ans=num1/num2/num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='%' && operand2=='/') {
            ans=num1%(num2/num3);
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='%' && operand2=='*') {
            ans=num1%(num2*num3);
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='%' && operand2=='+') {
            ans=num1%num2+num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='%' && operand2=='-') {
            ans=num1%num2-num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else if(operand1=='%' && operand2=='%') {
            ans=num1%num2%num3;
            System.out.println("Ans: " + num1 + operand1 + num2 + operand2 + num3 + " = " + ans);
        }
        else{
            System.out.println("Operand is not detected");
        }
        */
        
        
        
        
        Random r=new Random();
        int temp,sum1=0,sum2=0;
        for(int i=1; i<=2; i++ ) {
            temp=r.nextInt(6)+1;
            System.out.println("Roll " + i + " for player 1 is " + temp);
            sum1+=temp;
            temp=r.nextInt(6)+1;
            System.out.println("Roll " + i + " for player 2 is " + temp);
            sum2+=temp;
            }
        
        
        
        
        
        
       
        
        
        
            
                
                    
            
            
        
        
        
    }
        
    
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    

