/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random r = new Random();
        int[] num = new int[100];

        for (int i=1; i<=100; i++)
            num[i-1] = getPentagonalNumber(i);
            
        for (int i = 0; i < 100; i=i+10) {
            System.out.printf("%7d \t%7d \t%7d \t%7d \t%7d \t%7d \t%7d \t%7d \t%7d \t%7d \n", num[i], num[i+1], num[i+2], num[i+3], num[i+4], num[i+5], num[i+6], num[i+7], num[i+8], num[i+9]); 
            }
             
    } 
    
    public static int getPentagonalNumber(int n){
          int pentagon=1;
          for(int i=1; i<=n; i++){
              pentagon = (i*(3*i-1)/2);    
          }
          return pentagon;
          
       }
    }
    

