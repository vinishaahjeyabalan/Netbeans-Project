/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ArrayQueue<T> implements QueueInterface<T> {
    private T[] queue;
    private int count;
    private int front;
    private int rear;
    
    public ArrayQueue(){
        queue = (T[]) new Object[10];
        count = 0;
        front = 0;
        rear = 0;
    }
    
    public boolean isEmpty(){
        return (queue[0] == null);
    }
    
    public boolean isFull(){
        return (count == queue.length);
    }
    
    public int getSize(){
        return count;
    }
    
    public void enqueue(T a){
        if(isFull()){
            System.out.println("The queue is full");
        }
        else{
            count++;
            queue[count] = a;
        }
    }
    
    public T dequeue(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        count--;
        T output = queue[front];
        queue[front] = null;
        front = ++front % queue.length;
        return output;
    }
    
    public T peek(){
        if(queue[0]== null){
            return null;
        }
        else{
            T output = queue[0];
            return output;
        }
    }
    
    public void showQueue(){
         if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
             for(int i=0; i<queue.length; i++){
                 System.out.println(queue[i] + " --> ");
             }
        
        }
    }
    
}
