package app1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class App12Prt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack1 stack = new Stack1(7);
        stack.push("Hi");
        stack.push("there");
        stack.push("I'm");
        stack.push("Vini");
        stack.push("here");
        stack.popInMiddle();
        stack.display();
        //stack.pop();
        //System.out.println(stack.peek());
        
        
    }
    
}

class Stack1{
    int maxSize;
    int top;
    String arr[];
    int count;
    
    public Stack1(int x){
        this.maxSize = x;
        this.arr = new String[maxSize];
        this.top = -1;
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
    
    public boolean isFull(){
        if(top >= maxSize){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void push(String str){
        if(!isFull()){
            arr[top+1] = str;
            top++;
            count++;
        }
        else{
            System.out.println("Stack overflow!!");
        }
    }
    
    public void pushMany(String[] s){
        for (int i = 0; i < s.length; i++) {
            push(s[i]);
        }
    }
    
    public String pop(){
        if(!isEmpty()){
            String temp = peek();
            arr[top] = null;
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
            for(int i=0; i<top; i++){
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
                for(int i=mid; i<top; i++){
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
    
    public String peek(){
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
                System.out.println("[" + arr[i] + "]");
            }
        }
    }
}


