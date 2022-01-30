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
public class App13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enqueueMany("A B C D");
        q1.enqueue("E");
        q1.display();
        System.out.println("\n");
        q1.dequeueInMiddle();
        q1.display();
        
    }
    
}

class Queue{
    // variables or data required for a queue
    int maxSize;
    int head;
    int tail;
    String arr[];
    int count;
    
    // a constructor
    public Queue(int x){
        this.maxSize = x;
        this.head = 0;
        this.tail = 0;
        arr = new String[maxSize];
        this.count = 0;
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
    public void enqueue(String str){
        // enqueue when queue is empty? YES
        if(isEmpty()){
            arr[head] = str;         // arr[tail] = str; works too!
            tail++;
            count++;
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
                 count++;
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
             String temp = arr[head];
             for(int i=0; i<tail-1; i++){
                 arr[i] = arr[i+1];         // shifting elements
             }
             tail--;
             count--;
        } 
    }
    
    public String dequeueInMiddle(){
        // can we dequeue when queue is empty? NO
        if(isEmpty()){
            System.out.println("Queue is empty...cannot dequeue!");
        }
        else{
            if(count%2==1){
                int mid = (count/2);
                String temp = arr[mid];
                for(int i=mid; i<tail-1; i++){
                     arr[i] = arr[i+1];
                 }
                dequeue();
                return temp;
            }
            else{
                return null;
            }
    }
        return null;
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
    
    // method to enqueue plural
    public void enqueueMany(String s){
        String[] temp = s.split(" ");   //using space as a splitter
        for (int i = 0; i < temp.length; i++) {
            enqueue(temp[i]);
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
