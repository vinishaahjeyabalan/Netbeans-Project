/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

import java.util.Random;


/**
 *
 * @author Vinishaah Jeyabalan
 */
public class App12 {

    /**
     * @param args the command line arguments
     * Stack Implementation from Scratch
     */
    public static void main(String[] args) {
        
        Stack<Integer> myStack = new Stack<Integer>(10);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        
        int[] manyNo = {50, 60, 70, 80};
        myStack.pushMany(manyNo);
        
        myStack.pushInMiddle(45);
        
        System.out.println("Display:");
        myStack.displayReverse();
        
        myStack.popBottom();            // should print stack overflow!!
        System.out.println("Display:");
        myStack.displayReverse();
        
        myStack.popAll();
        System.out.println("Display:");
        myStack.displayReverse();

//        Stack<Integer> odd = new Stack<>(10);
//        Stack<Integer> even = new Stack<>(10);
//        Stack<Integer> order = new Stack<>(10);
//        Random r = new Random();
//        int[] num = new int[10];
//        System.out.print("The random numbers are: ");
//        for(int i=0; i<num.length; i++){
//            num[i] = r.nextInt(100)+1;
//            System.out.print(num[i] + " ");
//            
//                if(num[i]%2==1){
//                    odd.push(num[i]);
//                }
//                else if(num[i]%2==0){
//                    even.push(num[i]);
//                }
//        }
//        System.out.println("\n");
//        odd.display();
//        System.out.println("\n");
//        even.display();
//        while((!odd.isEmpty()) && (!even.isEmpty())){
//            int o = odd.pop();
//            order.push(o);
//            int ev = even.pop();
//            order.push(ev);
//            
//        }
//        System.out.print("\nThe numbers in stack are: ");
//        order.display();
//        System.out.println("\nThe total numbers in stack is: " + order.count);
      
        
    }
    
}

class Stack<Integer>{
    // data for stack
    int maxSize;         // declare size of the array
    int top;             // declare pointer to the stack
    int[] arr;           // declare an int array
    int count;
            
    // a constructor
    public Stack(int x){
        this.maxSize = x;
        this.arr = new int[maxSize];
        this.top = 0;   // point top pointer to zero at initialization
        this.count = 0;
    }
    
    // good to know if stack is empty or not
    // because, if stack is full, cannot insert new element
    // and if stack is empty, cannot pop
    public boolean isEmpty(){
        if(top == 0){
            return true;
        }
        else if(top >= maxSize){
            return false;      
        }
        return false;
    }
    
    // because, if stack is full, 
    public boolean isFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    // method push to insert an element into stack
    public void push(int str){
        // before push, test if stack full
        if(!isFull()){
            arr[top] = str;       // insert an element where top is pointing
            top++;                // make sure to move the top pointer one up
            count++;
        }
        else{
            System.out.println("Stack overflow!!");
        }
    }
    
    public void pushMany(int[] s){
        for (int i = 0; i < s.length; i++) {
            push(s[i]);
        }
    }
    
    public void pushInMiddle(int str){
        if(!isFull()){
            if(count%2==0){
                int mid = (count/2);
                int temp = arr[mid];
                for(int i=mid; i<top-mid; i++){
                     arr[i] = arr[i+1];
                }
                push(str);
            }
        }
        System.out.println("Stack is full!");
    }
    
    // method pop to delete an element of stack
    public int pop(){
        if(!isEmpty()){
            int temp = peek();    // just to know what we are popping
            arr[top-1] = 0;
            top--;
            count--;
            return temp;
        }
        else{
            return 0;
        }
    }
    
    public void popAll(){
         if(!isEmpty()){
            for (int i = maxSize-1; i >= 0; i--) {
                pop();
            }
        }
    }
    
    public int popBottom(){
        int temp = arr[0];
        
        if(!isFull()){
            for(int i=0; i<top-1; i++){
                arr[i] = arr[i+1];
            }
            pop();
            return temp;
        }
        else{
            System.out.println("Stack is empty");
        }
        return 0;
    }
    
    public int popInMiddle(){
        if(!isEmpty()){
            if(count%2==1){
                int mid = (count/2);
                int temp = arr[mid];
                for(int i=mid; i<top-1; i++){
                     arr[i] = arr[i+1];
                 }
                pop();
                return temp;
            }
            else{
                return 0;
            }
        }
        return 0;
    }
    
    // good to have a method that peeks at the top elemnt of the stack
    public int peek(){
        if(top > 0){
            return arr[top-1];
        }
        else{
            return 0;
        }
    }
    
    // method display to show stack elements
//    public void display(){
//        if(!isEmpty()){
//            for(int i=0; i<=maxSize-1; i++){
//                System.out.println("[" + arr[i] + "]" + " at index " + i);
//            }
//        }
//    }
    
    public void displayReverse(){
        if(!isEmpty()){
            for(int i=maxSize-1; i>=0; i--){
                System.out.println("[" + arr[i] + "]" + " at index " + i);
            }
        }
    }
}