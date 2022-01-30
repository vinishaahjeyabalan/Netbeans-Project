/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q2;

import java.util.EmptyStackException;

/**
 *
 * @author Vinishaah Jeyabalan
 * @param <T>
 */
public class ArrayStack<T> implements StackInterface<T> {
    
//    private T[] stack;
//    private int index = -1;
// 
//    public ArrayStack(){
//        stack = (T[]) new Object[10]; 
//        
//    }
//    
//    @Override
//    public boolean isEmpty(){
//        if(getSize()==0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    
//    @Override
//    public boolean isFull(){
//        return stack[stack.length] != null;
//    }
//    
//    @Override
//    public int getSize(){
//        return index+1;
//    }
//    
//    @Override
//    public void Push(T a){
//        if(!isFull()){
//            index++;
//            stack[index] = a;
//           
//        }
//        else{
//            System.out.println("The stack is full");
//        }
//    }
//    
//    @Override
//    public T Pop(){
//        T onTop;
//        if(!isEmpty()){
//            index--;
//            onTop = stack[index];
//            stack[index] = null;
//            
//        }
//        else{
//            throw new EmptyStackException();
//        }
//        return onTop;
//    }
//    
//    @Override
//    public T Peek(){
//        T peek;
//        if(!isEmpty()){
//            peek = stack[index];
//        }
//        else{
//            throw new EmptyStackException();
//        }
//        return peek;
//    }
//    
//    @Override
//    public void showStack(){
//        if(isEmpty()){
//            System.out.println("The stack is empty");
//        }
//        else{
//            for(int i=index; i>0; i-- ){
//                System.out.println(" <-- " + stack[i]);
//            }
//        }
//    }
    
    
    private T[] stack;
    private int count;
 
    public ArrayStack(){
        stack = (T[]) new Object[10]; 
        count = 0;
        
    }
    
    @Override
    public boolean isEmpty(){
       return (stack[0]==null);
    }
    
    @Override
    public boolean isFull(){
        return(stack.length == (count));
    }
    
    @Override
    public int getSize(){
        return count;
    }
    
    @Override
    public void Push(T a){
        if(count==stack.length){
            System.out.println("Stack is full");
            return;
        }
        else{
            stack[count] = a;
            count++;
        }
    }
    
    @Override
    public T Pop(){
       if(isEmpty()){
           throw new EmptyStackException();
       }
       count--;
       T output = stack[count];
       stack[count] = null;
       return output;
    }
    
    @Override
    public T Peek(){
        if(isEmpty()){
           throw new EmptyStackException();
       }
       return stack[count];
    }
    
    @Override
    public void showStack(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            for(int i=count-1; i>=0; i-- ){// try with i=index
                System.out.print(" <-- " + stack[i]);
            }
        }
    }
}
