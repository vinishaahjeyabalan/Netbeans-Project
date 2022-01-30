/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        System.out.print("Enter number of students: ");
        int N= sc.nextInt();
        int[] score = new int[N];
        for (int i=0;i<score.length;i++){
            score[i]=rand.nextInt(101);
        }
        
        int max=score[0],min=score[0],sum=score[0];
        System.out.println(score[0]);
        for (int i=1;i<score.length;i++){
         if (score[i]>max)
             max=score[i];
         else if (score[i]<min)
             min=score[i];
         sum+=score[i];
            System.out.println(score[i]);
             
        }
        double av=sum/N;
        System.out.println("Max "+max+"\nMin "+min+"\nAverage: "+av);

    }
    
}

        // TODO code application logic here
    