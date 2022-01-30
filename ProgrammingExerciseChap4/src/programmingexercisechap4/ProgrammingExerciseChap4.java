/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercisechap4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingExerciseChap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
//        final int NUMBER_OF_QUESTIONS=10;
//        int correctCount=0;
//        int count=0;
//        double startTime=System.currentTimeMillis();
//        String output="";
//        
//        while(count<=NUMBER_OF_QUESTIONS) {
//            int number1=r.nextInt(12)+1;
//            int number2=r.nextInt(12)+1;
//            
//            if(number1<number2) {
//                int temp=number1;
//                number1=number2;
//                number2=temp;
//            }
//            System.out.print("What is " + number1 + "-" + number2 + "? ");
//            int answer=s.nextInt();
//            
//            if(number1-number2==answer) {
//                System.out.println("You are correct!");
//                correctCount++;
//            }
//            else {
//                System.out.println("Your answer is wrong. \n" + number1 + "-" + number2 + "should be " + (number1-number2));
//                }
//            count++;
//            
//            output+= "\n" + number1 + "-" + number2 + "=" + answer + ((number1-number2==answer)?" correct": " wrong");
//            }
//        double endTime=System.currentTimeMillis();
//        double testTime=endTime-startTime;
//        
//        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime/1000 + "seconds\n" + output);
        
        
        
        
        
//        double farenheit;
//        System.out.println("Celcius         Fahrenheit");
//        int celcius=0;
//        while(celcius<=100) {
//            celcius+=2;
//            farenheit=celcius*9/5+32;
//            
//            System.out.println(celcius + "                " + farenheit);
//        }
        
        



//        double centimeters,inches;
//        System.out.println("Inches" + "             " + "Centimeters");
//        for(inches=1; inches<=10; inches++) {
//            centimeters=inches*2.54;
//            System.out.println(inches + "                " + centimeters);
//        }
        




         
         
//          int tuition=10000;
//          int sum=0;
//          int year=1;
//          while(year<=14) {
//              sum=tuition+(6/100)*tuition;
//              if(year==10) {
//                  int tenthYear=sum;
//                  System.out.println("Tuition in 10th year is " + tuition);
//              }
//              if(year>10) {
//                  int totalTuition=0;
//                  totalTuition+=sum;
//                  System.out.println("Total tuition of four years after 10th year is " + totalTuition);
//              }
//          year++;
//          }





//            System.out.println("Number of students: ");
//            int number=s.nextInt();
//            for(int i=1; i<=number; i++) {
//                System.out.println("Name of the students: ");
//                String name=s.next();
//                System.out.println("Score of " + name);
//                int score=s.nextInt();
//                int high=-1;
//                if(score>high){
//                    high=score;
//                    System.out.println("Highest score: " + name);
//                    
//                }
//            }
            
            


               String name;
               int score=0;
               int lowest=101;
               int score2=0;
               System.out.println("Number of students: ");
               int number=s.nextInt();
               for(int i=1; i<=number; i++) {
                   System.out.println("Name of student " + (i) + ": ");
                   name=s.next();
                   System.out.println("Score of " + name + ": ");
                   score=s.nextInt();
               }
                   
                   
                   if(score<lowest) {
                       lowest=score;
                       System.out.println("Lowest score: " + lowest);
                       
                   }
                   else if(score2<100 && score2>score) {
                        score2=score;
                        System.out.println("Second lowest score: " + score2);
                      
                   }
                  
                   
               
            
               
                
               
        
        
        // TODO code application logic here
    }
}
    

