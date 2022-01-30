/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexercise2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class StackExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack a = new Stack(8);

        int Arr[] = {1, 4, 5, 6, 2, 9, 1, 0};

       System.out.print("Input: ");
        
       for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]); 
            a.push(Arr[i]);
        }
           System.out.println("");    

        System.out.print("Output: ");
        a.display();
        
       
        System.out.println("\n");
        a.showAdd();

        System.out.println("\n");
//        Scanner s = new Scanner(System.in);
//        System.out.print("Input : ");
//        int number = s.nextInt();
//        while(number!=0){
//            int digit = number % 10;
//            number /= 10;
//            a.push(digit);
//        }
//        a.push(1);
//        a.push(4);
//        a.push(5);
//        a.push(6);
//        a.push(2);
//        a.push(9);
//        a.push(1);
//        a.push(0);
//        a.display();
//        a.addInput(14562910);
//        a.showAdd();
    }
    
}

class Stack{
    private int maxSize;        
    private int top;             
    private int arr[];   
    private int total = 0;
            
   
    public Stack(int x){
        this.maxSize = x;
        this.arr = new int[maxSize];
        this.top = 0;   
    }
    
     public void push(int num){
        if(!isStackFull()){
            arr[top] = num;       
            top++;                
        }
        else{
            System.out.println("Stack overflow");
        }
    }
     
      public int pop(){
        if(!isStackEmpty()){
            int temp = peek();   
            arr[top-1] = 0;
            top--;
            return temp;
        }
        else{
            return 0;
        }
    }
      
      public int peek(){
        if(top > 0){
            return arr[top-1];
        }
        else{
            return 0;
        }
    }
      
      public boolean isStackEmpty(){
        if(top == 0){
            return true;
        }
        else if(top >= maxSize){
            return false;      
        }
        return false;
    }
    
    public boolean isStackFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int popBottom(){
        int temp = this.arr[0];
        
        if(!isStackFull()){
            for(int i=0; i<top-1; i++){
                this.arr[i] = this.arr[i+1];
            }
            pop();
            return temp;
        }
        else{
            System.out.println("Stack is empty");
        }
        return 0;
    }
    
    public void display(){
        if(!isStackEmpty()){
            for(int i=maxSize-1; i>=0; i--){
                System.out.print(arr[i]);
            }
        }
        System.out.println("");
    }
    
    public void addInput(int num){
        //int total = 0;
        total += num;
    }
    
    public void showAdd(){
        System.out.print(this.arr[top - 1]);
        addInput(arr[top-1]);

        for (int i = top - 2; i >= 0; i--) {
            System.out.print(" + " + this.arr[i]);
            addInput(this.arr[i]);
        }
        System.out.println(" = " + total);
    }

}
