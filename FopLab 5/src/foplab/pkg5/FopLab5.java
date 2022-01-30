/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foplab.pkg5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopLab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        Random r = new Random();
//        int i, highestscore=0, lowestscore=101, sum=0, average;
//        System.out.println("Enter N students: ");
//        int N = s.nextInt();
//        int[] score = new int[N];
//        for(i=0; i<N; i++){
//            score[i] = r.nextInt(101);
//            System.out.println(score[i]);
//        }
//        
//        for(i=0; i<N; i++){
//            if(score[i]>highestscore){
//                highestscore = score[i];
//            }
//            else if(score[i]<lowestscore){
//                lowestscore = score[i];
//            }
//            sum+=score[i];
//        }
//        System.out.println("Highest score: " + highestscore);
//        System.out.println("Lowest score: " + lowestscore);
//        average = sum/N;
//        System.out.println("Average: " + average);
        





//          Random r = new Random();
//          int num[] = new int[10];
//          int i,j=0;
//          for(i=0; i<10; i++){
//              for(i=0; j<i; j++){
//              num[i] = r.nextInt(21);
//              num[j] = r.nextInt(21);
//              while(num[i]==num[j]){
//                  num[j] = r.nextInt(21);
//              }
//              }
//                  
//           }
//           System.out.println(num[j]);





//        int size = 20;
//        ArrayList<Integer> list = new ArrayList<Integer>(size);
//        for(int i = 1; i <= size; i++) {
//            list.add(i);
//        }
//
//        Random rand = new Random();
//        while(list.size() > 0) {
//            int index = rand.nextInt(list.size());
//            System.out.println("Selected: "+list.remove(index));
//        }
//        
//        
//        
//        
//        int[] test = new int[] { 101, 102, 103, 104, 105};
//     
//        System.out.println("Original Array : size : "
//                               + test.length );
//        System.out.println("Contents : " + Arrays.toString(test));
//     
//        // let's remove or delete an element from an Array
//        // using Apache Commons ArrayUtils
//        test = ArrayUtils.remove(test, 2); //removing element at index 2
//     
//        // Size of an array must be 1 less than the original array
//        // after deleting an element
//        System.out.println("Size of the array after
//                  removing an element  : " + test.length);
//        System.out.println("Content of Array after
//                 removing an object : " + Arrays.toString(test));
     
          
         






//           Random r = new Random();
//           Scanner s = new Scanner(System.in);
//           System.out.println("Enter N employee: ");
//           int N = s.nextInt();
//           int i,j,k,sum=0;
//           int[] workhrs = new int[7];
//           String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//               
//           for(i=1; i<=N; i++){
//               for(j=0; j<7; j++){
//                  
//                   workhrs[j] = r.nextInt(8)+1;
//                   System.out.println("Employee " + i + " need to work for " + workhrs[j] + " hours on day " + (j+1) );
//               }
//           }
           
           
           
           
           
           
//             System.out.println("3 by 3 Matrix");
//             int [][] matrix = {new int[]{1,5,7}, 
//                                new int[]{3,6,9}, 
//                                new int[]{5,3,8}};
//             
//             int[][] matrix2 = new int[3][3];
//             int k=0;
//             for(int j=2; j>=0; j--){
//                 for(int i=0; i<matrix.length; i++){
//                     matrix2[i][j] = matrix[k][i];
//                 }
//                 k++;
//             }
//             for(int i=0; i<3; i++){
//                 for(int j=0; j<matrix.length; j++){
//                     System.out.println(matrix2[i][j]);
//                 }
//                 System.out.println("");
//             }



//             int [ ] [ ] scores = {   { 20, 18, 22, 20, 16 },
//                                 { 18, 20, 18, 21, 20 },
//                                 { 16, 18, 16, 20, 24 },
//                                 {  25, 24, 22, 24, 25 }
//                             };
//             System.out.println(scores);
             
       




                 int[][] multi = new int[5][];
                 multi[0] = new int[10];
                 multi[1] = new int[10];
                 multi[2] = new int[10];
                 multi[3] = new int[10];
                 multi[4] = new int[10];
                 System.out.println(multi);
                 
                 
                 
                 
                 int [][] twoDim = new int [5][5];

int a = (twoDim.length);//5
int b = (twoDim[0].length);//5

for(int i = 0; i < a; i++){ // 1 2 3 4 5
    for(int j = 0; j <b; j++) { // 1 2 3 4 5
        int x = (i+1)*(j+1);
        twoDim[i][j] = x;
        if (x<10) {
            System.out.print(" " + x + " ");
        } else {
            System.out.print(x + " ");
        }
    }//end of for J
    System.out.println();
}//end of for i
    }
    
    
    
    
           
    
    
             
             
             
             
           
           
           
              
              
          
          
          
        
        
        
        // TODO code application logic here
    }
    

