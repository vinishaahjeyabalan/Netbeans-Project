/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsemtestpractice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class MidSemTestPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        Random r=new Random();
//        System.out.println("Enter the number of players(2-4): ");
//        int noOfPlayers=s.nextInt();
//        int p1=0, p2=0, p3=0, p4=0;
//        int score;
//        
//        switch(noOfPlayers) {
//            case 2:
//                while(true) {
//                    score=r.nextInt(21)-10;
//                    p1+=score;
//                    System.out.println("Player 1: " + score);
//                    score=r.nextInt(21)-10;
//                    p2+=score;
//                    System.out.println("Player 2: " + score);
//                    
//                    if(p1>=50 || p2>=50) {
//                        break;
//                    }
//                }
//                if(p1>=50) {
//                    System.out.println("Player 1 wins!");
//                }
//                else if(p2>=50) 
//                    System.out.println("Player 2 wins!");
//                    System.out.println("Player 1: " + p1);
//                    System.out.println("Player 2: " + p2);
//                    break;  
//                
//              
//                
//            case 3:
//                while(true) {
//                    score=r.nextInt(21)-10;
//                    p1+=score;
//                    System.out.println("Player 1: " + score);
//                    score=r.nextInt(21)-10;
//                    p2+=score;
//                    System.out.println("Player 2: " + score);
//                    score=r.nextInt(21)-10;
//                    p3+=score;
//                    System.out.println("Player 3: " + score);
//                    
//                    if(p1>=50 || p2>=50 ||p3>=50) {
//                        break;
//                    }
//                }
//                if(p1>=50) {
//                    System.out.println("Player 1 wins!");
//                }
//                else if(p2>=50) {
//                   System.out.println("Player 2 wins!");
//                }
//                else if(p3>=50) 
//                   System.out.println("Player 3 wins!");
//                    System.out.println("Player 1: " + p1);
//                    System.out.println("Player 2: " + p2);
//                    System.out.println("Player 3: " + p3);
//                    break;
//                
//                
//                    
//            case 4:
//                while(true) {
//                    score=r.nextInt(21)-10;
//                    p1+=score;
//                    System.out.println("Player 1: " + score);
//                    score=r.nextInt(21)-10;
//                    p2+=score;
//                    System.out.println("Player 2: " + score);
//                    score=r.nextInt(21)-10;
//                    p3+=score;
//                    System.out.println("Player 3: " + score);
//                    score=r.nextInt(21)-10;
//                    p4+=score;
//                    System.out.println("Player 4: " + score);
//                    
//                    if(p1>=50 || p2>=50 ||p3>=50 || p4>=50) {
//                        break;
//                    }
//                }
//                
//                
//                if(p1>=50) {
//                    System.out.println("Player 1 wins!");
//                }
//                else if(p2>=50) {
//                   System.out.println("Player 2 wins!");
//                }
//                else if(p3>=50) {
//                   System.out.println("Player 3 wins!");
//                }
//                 else if(p4>=50) 
//                   System.out.println("Player 4 wins!");
//                    System.out.println("Player 1: " + p1);
//                    System.out.println("Player 2: " + p2);
//                    System.out.println("Player 3: " + p3);
//                    System.out.println("Player 4: " + p4);
//                     break;
//                
//               
//                 default:
//                System.out.println("Invalid player");
//                 
//                    
//                }






//           Scanner s=new Scanner(System.in);
//           Random r=new Random();
//           System.out.println("Enter the number of players: ");
//           int noOfPlayers=s.nextInt();
//           int p1=0, p2=0, p3=0, p4=0;
//           int score;
//           switch(noOfPlayers) {
//               case 2:
//                   while(true) {
//                        score=r.nextInt(21)-10;
//                        p1+=score;
//                        System.out.println("Player 1: " + score);
//                        score=r.nextInt(21)-10;
//                        p2+=score;
//                        System.out.println("Player 2: " + score);
//                   
//                        if(p1>50 || p2>50) {
//                        break;
//                        }
//                   }
//                   if(p1>50) {
//                       System.out.println("Player 1 wins!");
//                   }
//                   else if(p2>50) 
//                       System.out.println("Player 2 wins!");
//                       System.out.println("Player 1:" + p1);
//                       System.out.println("Player 2:" + p2);
//                       break;
//               
//               
//               case 3:
//                   while(true) {
//                       score=r.nextInt(21)-10;
//                       p1+=score;
//                       System.out.println("Player 1: " + score);
//                       score=r.nextInt(21)-10;
//                       p2+=score;
//                       System.out.println("Player 2: " + score);
//                       score=r.nextInt(21)-10;
//                       p3+=score;
//                       System.out.println("Player 3: " + score);
//                   
//                       if(p1>50 || p2>50 || p3>50) {
//                       break;
//                       }
//                   }
//                   if(p1>50) {
//                       System.out.println("Player 1 wins!");
//                   }
//                   else if(p2>50) {
//                       System.out.println("Player 2 wins!");
//                   }
//                   else if(p2>50) 
//                       System.out.println("Player 3 wins!");
//                       System.out.println("Player 1:" + p1);
//                       System.out.println("Player 2:" + p2);
//                       System.out.println("Player 3:" + p3);
//                       break;
//                   
//                   
//               case 4:
//                    while(true) {
//                       score=r.nextInt(21)-10;
//                       p1+=score;
//                       System.out.println("Player 1: " + score);
//                       score=r.nextInt(21)-10;
//                       p2+=score;
//                       System.out.println("Player 2: " + score);
//                       score=r.nextInt(21)-10;
//                       p3+=score;
//                       System.out.println("Player 3: " + score);
//                       score=r.nextInt(21)-10;
//                       p4+=score;
//                       System.out.println("Player 4: " + score);
//                   
//                       if(p1>50 || p2>50 || p3>50 || p4>50) {
//                       break;
//                       }
//                   }
//                   if(p1>50) {
//                       System.out.println("\nPlayer 1 wins!");
//                   }
//                   else if(p2>50) {
//                       System.out.println("\nPlayer 2 wins!");
//                   }
//                   else if(p3>50) {
//                       System.out.println("\nPlayer 3 wins!");
//                   }
//                   else if(p4>50)
//                       System.out.println("\nPlayer 4 wins!");
//                       System.out.println("Player 1:" + p1);
//                       System.out.println("Player 2:" + p2);
//                       System.out.println("Player 3:" + p3);
//                       System.out.println("Player 4:" + p4);
//                       break;
//                   
//               default:
//                   System.out.println("Invalid player");
//                   
//                   
//               }
           
           /*
                for(int i=1; i<=6; i++) {
                   
                    for(int j=1; j<=1; j++) {
                        System.out.print("1 2 3 4 5 6 7 8 9");
                    }
                    System.out.println("");
                }
                */
                int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.printf("%3d",matrix[i][j]);
                    }
                    System.out.println("");
//                    System.out.println("");
                }
                
               
                
               
                
        
        // TODO code application logic here
    }
    
}
