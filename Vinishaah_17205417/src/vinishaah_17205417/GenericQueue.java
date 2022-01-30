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
public class GenericQueue<T> {
    // variables or data required for a queue
    int maxSize;
    int head;
    int tail;
    String arr[];
    int count;
    
    // a constructor
    public GenericQueue(int x){
        this.maxSize = x;
        this.head = 0;
        this.tail = 0;
        this.arr = new String[maxSize];
        this.count = 0;
    }
    
    // method to check if queue is empty
    public boolean isEmpty(){
        return tail == 0;
    }
    
    // method to check if queue is full
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    // method to enqueue new item
    public void enqueue(T str){
        if(isEmpty()){
            arr[head] = (String) str;         // arr[tail] = str; works too!
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
                 arr[tail] = (String) str;
                 tail++;
                 count++;
             }
        }  
    }
    
    // method to dequeue an item (remove from queue)
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty...cannot dequeue!");
        }
        else{
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
    public String display(){
        String str = "";
        if(!isEmpty()){
            for(int i=0; i<tail; i++){
                str = "[" + arr[i] + "]";
            }
        }
        return str;
    }
    
    public void display1(){
        if(!isEmpty()){
            for(int i=0; i<tail; i++){
                System.out.print("[" + arr[i] + "]" );
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
            enqueue((T) temp[i]);
        }
    }
    
    public void dequeueAll(){           
        if(isEmpty()){
            for (int i = tail-1; i >= 0; i--) {
                dequeue();
            }
        }
    }
    
}
