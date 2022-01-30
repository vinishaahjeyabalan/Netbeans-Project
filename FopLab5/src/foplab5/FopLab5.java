/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foplab5;

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
        Scanner s=new Scanner(System.in);
        Random r=new Random();
//        System.out.print("Enter N students: ");
//        int N=s.nextInt();
//        int[] score=new int[N];
//        int highestScore=0,lowestScore=100,average=0;
//        int i=0;
//        while(i<N) {  // N = score.length
//            score[i]=r.nextInt(101);
//            System.out.println("Student " + (i+1) + " scores " + score[i]  );
//            if(score[i]>highestScore) {
//                highestScore=score[i];
//            }
//            if(score[i]<lowestScore) {
//                lowestScore=score[i];
//            }
//            average+=score[i];
//            i++;
//        }
//        average/=2;
//        System.out.println("Highest score: " + highestScore);
//        System.out.println("Lowest score: " + lowestScore);
//        System.out.println("Average score: " + average);






//          Random r=new Random();
//          int N = 10;
//          int[] num=new int[N];
//          int temp,i=0;
//          do{
//              temp=r.nextInt(21); // generate random no from 0 to 20
//              boolean duplicate=false;
//              for(int j=0; j<10; j++) {     //j<i also correct
//              if(num[j]== temp) {
//                  duplicate=true;
//              }
//              }
//              if(!duplicate) {
//                  num[i]=temp;
//                  i++;
//                  
//              }
//          }while(i<10);
//          for(int j=0; j<10; j++) {
//              System.out.println(num[j]);
//          }


          
          
//          int N = 10;
//          int[] num=new int[N];
//          int temp,i=0;
//          while(i<10){
//              temp=r.nextInt(21); // generate random no from 0 to 20
//              boolean duplicate=false;
//              for(int j=0; j<10; j++) {     //j<i also correct
//              if(num[j]== temp) {
//                  duplicate=true;
//              }
//              }
//              if(!duplicate) {
//                  num[i]=temp;
//                  i++;
//              } 
//          }
//          for(i=0; i<10; i++) {
//              System.out.println(num[i]);
//          }





           
//            int[] num=new int[10];
//            num[0]=r.nextInt(21);
//            while(num[1] == num[0]){
//                num[1]=r.nextInt(21);
//            }
//            while(num[2] == num[1] || num[2] == num[0]){
//                num[2]=r.nextInt(21);
//            }
//            while(num[3] == num[2] || num[3] == num[1] || num[3] == num[0]){
//                num[3]=r.nextInt(21);
//            }
//            while(num[4] == num[3] || num[4] == num[2] || num[4] == num[1] || num[4] == num[0]){
//                num[4]=r.nextInt(21);
//            }
//            while(num[5] == num[4] || num[5] == num[3] || num[5] == num[2] || num[5] == num[1] ||  num[5] == num[0]){
//                num[5]=r.nextInt(21);
//            }
//            System.out.println(num[0]);
//            System.out.println(num[1]);
//            System.out.println(num[2]);
//            System.out.println(num[3]);
//            System.out.println(num[4]);
//            System.out.println(num[5]);
            
            
            
            
            









//              System.out.println("Enter N employee: "); 
//              int N=s.nextInt(); // prompt no. of employee
//              int[] days= new int[7]; // 7 days stored in array
//              for(int j=1; j<=N; j++){ // for each employee
//              for(int i=0; i<7; i++) { // for each day
//                  days[i]=r.nextInt(8)+1; // generate no. of working hrs
//                  System.out.println("Employee " + j + " working hrs on day 1: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 2: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 3: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 4: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 5: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 6: " + days[i]);
//                  System.out.println("Employee " + j + " working hrs on day 7: " + days[i]);
//                  }
//              }
              
              
              
              
//               System.out.println("Enter N employee: ");
//               int N = s.nextInt();
//               int i,j,k,sum=0;
//               int[] workhrs = new int[7];
//               String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//               
//               for(i=1; i<=N; i++){
//               for(j=0; j<7; j++){
//                  
//                   workhrs[j] = r.nextInt(8)+1;
//                   System.out.println("Employee " + i + " need to work for " + workhrs[j] + " hours on day " + (j+1) );
//               }
//           }
    







//        int[][] mat = {new int[]{1, 5, 7},
//        new int[]{3, 6, 9},
//        new int[]{5, 3, 8}};
//
//        int[][] mat2 = new int[3][3];
//        int k = 0;
//        // for (int j=2;j>=0;j--){
//        for (int j = 2; j >= 0; j--) {
//
//            for (int i = 0; i < mat.length; i++) {
//                mat2[i][j] = mat[k][i];
//                
//            }
//            k++;
//        }
//
//           for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//               System.out.print(mat2[i][j]);
//         }
//        System.out.println("");
//        }





                
          
          
          if(false){
              System.out.println("hey");
          }
          else {
              System.out.println("guy");
          }
          
          if(true) System.out.println("hii");
          char n = 'N';
          if(n=='N'){
              System.out.println("f...");
          }
          
          public static void num(){
              int numi = 8;
            
          }
          
          
          
        
        
        
        // TODO code application logic here
    }
    
}
