/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fopmidsempractice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FopMidSemPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int x,y;
//        String move;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the coordinate x and y: ");
//        x=s.nextInt();
//        y=s.nextInt();
//         
//        s.nextLine();
//        System.out.print("Enter the move: ");
//        move = s.nextLine();
//       
//        System.out.println("Initial coordinate (" + x + "," + y + ")");
//        
//        for(int i=0; i<move.length(); i++) {
//            if (move.charAt(i)== 'L') {
//                x=x-1;
//            }
//            else if(move.charAt(i)=='R') {
//                x=x+1;
//            }
//            else if(move.charAt(i)=='U') {
//                y=y+1;
//            }
//            else if(move.charAt(i)=='D') {
//                y=y-1;
//            }
//        }
//            
//            System.out.println("Final coordinate (" + x + "," + y + ")");
            
                
            
        
        
        
//        String durianType;
//        double sales, total=0;
//        do{
//            System.out.print("Enter the type of durian (Quit) to terminate: ");
//            durianType=s.next();
//            if(durianType.equals("Quit")) {
//                break;
//            }
//            System.out.print("Enter the sales in kg: ");
//            sales=s.nextDouble();
//            switch (durianType) {
//                case"MK":
//                    total += sales * 25;
//                    break;
//                case"HL":
//                    total += sales * 22;
//                    break;    
//                case"D24":
//                    total += sales * 20;
//                    break;
//                case"UM":
//                    total += sales * 18;
//                    break;
//            }
//        }while(!durianType.equals("Quit"));
//        System.out.printf("Total sales: %.2f\n",total);





//          System.out.print("Enter nine digit integer : ");
//          int num=s.nextInt();
//          int digit, sum=0;
//          System.out.print("10-digit ISBN : ");
//          for(int temp=num, i=100000000, j=1; i>0; i/=10, j++) {
//              digit=temp/i;
//              System.out.print(digit);
//              sum+=(digit*j); //j is n
//              temp=temp%i;
//              if(j==1 || j==4 || j==9) {
//                  System.out.print("-");
//              }
//          }
//          digit=sum%11;
//          if(digit==10) {
//              System.out.println("X");
//          }
//          else {
//              System.out.println(digit);
//          }
        
        
        
        
        

//           int num, cnt=0, min=10;
//           System.out.println("Enter integer -1 to quit : ");
//           do {
//               num=s.nextInt();
//               if(num==-1) {
//                   break;
//               }
//               else if(num>=1 && num<=9) {
//                   System.out.print(num + " ");
//                   if(min>num) {
//                       min=num;
//                       cnt=1;
//                   }
//                   else if(min==num) {
//                       cnt++;
//                   }
//               }
//           }while(num!=-1);
//          
//          System.out.println("\nThe minimum number is " + min);
//          System.out.println("The occurrence count of " + min + " is " + cnt);
          
          
          


          //Exercise(Revision)
          //Tutorial
          Random r=new Random();
//          int points=0;
//          
//          for(int i=0; i<=9; i++) {
//          int color=r.nextInt(4);
//          String colour="";
//          switch(color) {
//              case 0:
//                  colour="red";
//                  break;
//              case 1:
//                  colour="green";
//                  break;
//              case 2:
//                  colour="blue";
//                  break;
//              case 3:
//                  colour="orange";
//                  break;
//              case 4:
//                  colour="yellow";
//                  break;
//          }
//              System.out.println("Enter a color: ");
//              String guess=s.next();
//              if(guess.equalsIgnoreCase(colour)){
//                  points=points+1;
//                  System.out.println("The answer is correct");
//              }
//              else {
//                  System.out.println("The answer is wrong");}
//          }
//          System.out.println("The number of correct answers: "+points);
              
            



            int head=0,tail=0;
            for(int i=0;i<20;i++){  
            int initialFaceUp=r.nextInt(2);
            if(initialFaceUp==0){
                System.out.println("Head");
                head+=1;
                
            }else if(initialFaceUp==1){
                System.out.println("Tail");
                tail+=1;
            }
               
            }
        System.out.println("Number of head: "+head);
        System.out.println("Number of tail: "+tail);

            
           
        
        
        
        
           
        
//            System.out.println("Enter the number of food orders purchased this month: ");
//            int order=s.nextInt();
//            String m=s.nextLine();
//            if(order==0) {
//                System.out.println("You earn 0 points");
//            }
//            else if(order==1) {
//                System.out.println("You earn 5 points");
//            }
//            else if(order==2) {
//                System.out.println("You earn 15 points");
//            }
//            else if(order==3) {
//                System.out.println("You earn 30 points");
//            }
//            else if(order>=4) {
//                System.out.println("You earn 40 points");
//            }
            



             
            
            
          
          
          
         
          
          
              
          
          
          
          
          
    }
}
           
          
           
    
        
                
          
    





            
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    
    

