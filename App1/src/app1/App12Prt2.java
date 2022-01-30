/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class App12Prt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
}

class Stack2{
    int maxSize;
    int top;
    String array[];
    
    public Stack2(int maxSize){
        this.maxSize = maxSize;
        this.top = 1;
        this.array = new String[maxSize];     
    }
    
    public boolean isEmpty(){
        if(top == 1){
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
            array[top-1] = str;
            top++;
        }
        else{
            System.out.println("Stack overflow!!!");
        }
    }
    
    public String pop(){
        String temp;
        if(!isEmpty()){
            temp = peek();
            array[top-2] = null;
            top--;
            return temp;
        }
        else{
            return null;
        } 
    }
    
    public String peek(){
        if(top > 0){
            String temp;
            temp = array[top-2];
            return temp;
        }
        else{
            return null;
        }
    }
    
    public void display(){
        if(!isEmpty()){
            for(int i=0; i<maxSize; i++){
                System.out.println(array[i] + " ");
            }
        }
    }
    
}
