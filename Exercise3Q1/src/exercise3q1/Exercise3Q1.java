/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3q1;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Exercise3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenericsStack<String> s1 = new GenericsStack<String>(7);
        System.out.println("Specify your day in number: ");
        s1.push("1 for Monday");
        s1.push("2 for Tuesday");
        s1.push("3 for Wednesday");
        s1.push("4 for Thursday");
        s1.push("5 for Friday");
        s1.push("6 for Saturday");
        s1.push("7 for Sunday");
        s1.display();
        int num = s.nextInt();
        System.out.println("The name of the day is: " + s1.numToDay(num));
        System.out.println("The following day of " + s1.numToDay(num) + " is: " + s1.followingDay(num));
        System.out.println("The previous day of " + s1.numToDay(num) + " is: " + s1.previousDay(num));
        System.out.println("How many days to add to the specified/current day (" + s1.numToDay(num) + ")?: " );
        int numToAdd = s.nextInt();
        if(numToAdd % 7 == 0){
            System.out.println("The new day after the addition of " + numToAdd + " day(s) is: " + s1.numToDay(num));
        }
        else{
            System.out.println("The new day after the addition of " + numToAdd + " day(s) is: " + s1.addDay((num+numToAdd)));
        }
        
    }
    
}

class GenericsStack<T>{
    int maxSize;
    int top;
    int num;
    T arr[];
    
    public GenericsStack(int x){
        this.maxSize = x;
        this.arr = (T[]) new Object[maxSize];
        this.top = -1;
        int num =0;
    }
    
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        else if(top >= maxSize){
            return false;
        }
        return false;
    }
    
    public boolean isFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(T str){
        if(!isFull()){
            arr[top+1] = str;
            top++;
        }
        else{
            System.out.println("Stack overflow!!");
        }
    }
    
    public T pop(){
        if(!isEmpty()){
            T temp = peek();
            arr[top] = null;
            top--;
            return temp;
        }
        else{
            return null;
        }
    }
    
    public T peek(){
        if(top > 0){
            return arr[top];
        }
        else{
            return null;
        }
    }
    
     public void display(){
        if(!isEmpty()){
            for(int i=0; i<maxSize; i++){
                System.out.println(arr[i] );
            }
        }
     }
     
     public String numToDay(int num){
         if(num == 1){
             return "Monday";
         }
         else if(num == 2){
             return "Tuesday";
         }
         else if(num == 3){
             return "Wednesday";
         }
         else if(num == 4){
             return "Thursday";
         }
         else if(num == 5){
             return "Friday";
         }
         else if(num == 6){
             return "Saturday";
         }
         else if(num == 7){
             return "Sunday";
         }
         else{
             return "Invalid input";
         }
     }
     
     public String followingDay(int followingNum){
         String followingDay = "";
          if(followingNum == 1){
             return "Tuesday";
         }
         else if(followingNum == 2){
             return "Wednesday";
         }
         else if(followingNum == 3){
             return "Thursday";
         }
         else if(followingNum == 4){
             return "Friday";
         }
         else if(followingNum == 5){
             return "Saturday";
         }
         else if(followingNum == 6){
             return "Sunday";
         }
         else if(followingNum == 7){
             return "Monday";
         }
         else{
             return "Invalid input";
         }
     }
     
     public String previousDay(int previousNum){
         String previousDay = "";
          if(previousNum == 1){
             return "Sunday";
         }
         else if(previousNum == 2){
             return "Monday";
         }
         else if(previousNum == 3){
             return "Tuesday";
         }
         else if(previousNum == 4){
             return "Wednesday";
         }
         else if(previousNum == 5){
             return "Thursday";
         }
         else if(previousNum == 6){
             return "Friday";
         }
         else if(previousNum == 7){
             return "Saturday";
         }
         else{
             return "Invalid input";
         }
     }
     
     public String addDay(int totalNum){
//         if(totalNum % 7 == 0){
//             //int num1 = num;
//             return numToDay(num);
//         }
         if(totalNum % 7 == 1){
             return "Monday";
         }
         else if(totalNum % 7 == 2){
             return "Tuesday";
         }
         else if(totalNum % 7 == 3){
             return "Wednesday";
         }
         else if(totalNum % 7 == 4){
             return "Thursday";
         }
         else if(totalNum % 7 == 5){
             return "Friday";
         }
         else if(totalNum % 7 == 6){
             return "Saturday";
         }
         else if(totalNum % 7 == 7){
             return "Sunday";
         }
         else{
             return "Invalid";
         }
     }
     
     
     
     
     
}
