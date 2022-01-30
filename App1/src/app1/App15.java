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
public class App15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericsStack<String> s1 = new GenericsStack<String>(5);
        s1.push(str);
    }
    
}

class GenericsStack<T>{
    int maxSize;
    int top;
    T arr[];
    
    public GenericsStack(int x){
        this.maxSize = x;
        this.arr = (T[]) new Object[maxSize];
        this.top = -1;
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
                System.out.println("[" + arr[i] + "]");
            }
        }
    }
}
