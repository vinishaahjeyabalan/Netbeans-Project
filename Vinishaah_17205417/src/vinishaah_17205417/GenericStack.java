/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinishaah_17205417;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class GenericStack<T> {
    // data for stackk
    int maxSize;         // declare size of the array
    int top;             // declare pointer to the stack
    String[] arr;           // declare an int array
    int count;
            
    // a constructor
    public GenericStack(int x){
        this.maxSize = x;
        this.arr = new String[maxSize];
        this.top = 0;   // point top pointer to zero at initialization
        this.count = 0;
    }

    GenericStack() {
        this.maxSize = maxSize;
        this.arr = new String[maxSize];
        this.top = 0;   // point top pointer to zero at initialization
        this.count = 0;
        
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
    public void push(String a){
        
        if(!isFull()){
            arr[top] = a;       // insert an element where top is pointing
            top++;                // make sure to move the top pointer one up
            count++;
        }
        else{
            System.out.println("Stack overflow!!");
        }
    }
    
    public void pushMany(String s){
         String[] temp = s.split(" ");   //using space as a splitter
         for (int i = 0; i < temp.length; i++) {
            push(temp[i]);
        }
    }
    
    public void pushInMiddle(String a){
        if(!isFull()){
            if(count%2==0){
                int mid = (count/2);
                String temp = arr[mid];
                for(int i=mid; i<top-mid; i++){
                     arr[i] = arr[i+1];
                }
                push(a);
            }
        }
        System.out.println("Stack is full!");
    }
    
    // method pop to delete an element of stack
    public String pop(){
        if(!isEmpty()){
            String temp = peek();    // just to know what we are popping
            arr[top-1] = null;
            top--;
            count--;
            return temp;
        }
        else{
            return null;
        }
    }
    
    public void popAll(){
         if(!isEmpty()){
            for (int i = maxSize-1; i >= 0; i--) {
                pop();
            }
        }
    }
    
    public String popBottom(){
        String temp = arr[0];
        
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
        return null;
    }
    
    public String popInMiddle(){
        if(!isEmpty()){
            if(count%2==1){
                int mid = (count/2);
                String temp = arr[mid];
                for(int i=mid; i<top-1; i++){
                     arr[i] = arr[i+1];
                 }
                pop();
                return temp;
            }
            else{
                return null;
            }
        }
        return null;
    }
    
    // good to have a method that peeks at the top elemnt of the stack
    public String peek(){
        if(top > 0){
            return arr[top-1];
        }
        else{
            return null;
        }
    }
    
    // method display to show stack elements
    public void display(){
        //if(!isEmpty()){
        System.out.println("\n");
            for(int i=0; i<=maxSize-1; i++){
                System.out.println("[" + arr[i] + "]");
            }
        //}
    }
    
    public void displayReverse(){
        if(!isEmpty()){
            for(int i=maxSize-1; i>=0; i--){
                System.out.println("[" + arr[i] + "]" + " at index " + i);
            }
        }
    }
    
}
