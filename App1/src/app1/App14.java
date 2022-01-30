/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalany
 */
public class App14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericsQueue<String> q1 = new GenericsQueue<String>(5);
        q1.enqueue("");
        GenericsQueue<Integer> q2 = new GenericsQueue<Integer>(5);
        q2.enqueue(1);
        q2.enqueue(2);
        q2.enqueue(3);
    }
    
}

class GenericsQueue<T>{
    // variables or data required for a queue
    int maxSize;
    int head;
    int tail;
    T arr[];                //T[] arr; works too
    
    // a constructor
    public GenericsQueue(int x){
        this.maxSize = x;
        this.head = 0;
        this.tail = 0;
        this.arr = (T[]) new Object[maxSize];
    }
    
    // method to check if queue is empty
    public boolean isEmpty(){
        return tail == 0;
        // return head == 0;        //wrong because head is always at index 0
    }
    
    // method to check if queue is full
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    // method to enqueue new item
    public void enqueue(T str){
        // enqueue when queue is empty? YES
        if(isEmpty()){
            arr[head] = str;         // arr[tail] = str; works too!
            tail++;
        }
        else{
             // enqueue when queue is full? NO
             if(isFull()){
                 System.out.println("Queue is full!");
             }
             else{
                 // enqueue when queue is not empty and not full? YES
                 arr[tail] = str;
                 tail++;
             }
        }  
    }
    
    // method to dequeue an item (remove from queue)
    public void dequeue(){
        // can we dequeue when queue is empty? NO
        if(isEmpty()){
            System.out.println("Queue is empty...cannot dequeue!");
        }
        else{
             // dequeue when full? YES
             // dequeue when not full but not empty? YES
             T temp = arr[head];
             for(int i=0; i<tail-1; i++){
                 arr[i] = arr[i+1];         // shifting elements
             }
             tail--;
        } 
    }
    
    // method to display items in queue
    public void display(){
        // display when queue is not empty? YES
        if(!isEmpty()){
            for(int i=0; i<tail; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            System.out.println("Nothing to display");
        }
    }
    
    // method to enqueue plural (so must stick to String type)
    public void enqueueMany(String s){
        String[] temp = s.split(" ");   //using space as a splitter
        for (int i = 0; i < temp.length; i++) {
            enqueue((T)temp[i]);
        }
    }
    
    public void dequeueAll(){           //also pop all
        //if not empty, can dequeueAll? YES
        if(isEmpty()){
            for (int i = tail-1; i >= 0; i--) {
                dequeue();
            }
        }
    }
}
