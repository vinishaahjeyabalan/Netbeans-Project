/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Exercise3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q1 = new Queue(9);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.enqueue(70);
        q1.enqueue(80);
        q1.enqueue(90);
        System.out.println("The elements in the queue: ");
        System.out.println(q1.toString());
        q1.ChangeOrder(4);
        System.out.println("After changing order: ");
        System.out.println(q1.toString());
        System.out.print("The size of the queue is: ");
        System.out.print(q1.size());
        System.out.println(" ");
        
        
//        q1.enqueue(10);
//        q1.enqueue(20);
//        q1.enqueue(30);
//        q1.enqueue(40);
//        q1.enqueue(50);
//        q1.enqueue(60);
//        q1.enqueue(70);
//        q1.enqueue(80);
//        q1.enqueue(90);
//        System.out.println(q1.toString());
//        q1.ChangeOrder(6);
//        System.out.println(q1.toString());
//        System.out.print("The size of the queue is: ");
//        System.out.print(q1.size());
//        System.out.println(" ");
        
    }
    
}

class Queue{
    int maxSize;
    int head;
    int tail;
    int count;
    int arr[];              
    
    // a constructor
    public Queue(int x){
        this.maxSize = x;
        this.head = 0;
        this.tail = 0;
        this.count = 1;
        this.arr = new int [maxSize];
    }
    
    
    public boolean isEmpty(){
        return tail == 0;
        
    }
    
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    public int size(){
        return count;
    }
    
    public int peek(){
        if(tail > 0){
            int temp;
            temp = head;
            return temp;
        }
        else{
            return 0;
        }
    }
    
    public void enqueue(int num){
        if(isEmpty()){
            arr[head] = num;        
            tail++;
        }
        else{
             if(isFull()){
                 System.out.println("Queue is full!");
             }
             else{
                 arr[tail] = num;
                 tail++;
                 count++;
             }
        }  
    }
    
    public int dequeue(){
        int temp = 0;
        if(isEmpty()){
            System.out.println("Queue is empty...cannot dequeue!");
        }
        else{
             temp = arr[head];
             for(int i=0; i<tail-1; i++){
                 arr[i] = arr[i+1];       
             }
             tail--;
             count--;
        } 
        return temp;
    }
    
    public String toString(){
        if(!isEmpty()){
            for(int i=0; i<tail; i++){
                System.out.print(arr[i] + " ");
            }
        }
        else{
            return "Nothing to display";
        }
        return "";
    }
    
    public void ChangeOrder(int k){
        for(int i=0; i<k-1; i++){
//            int temp;
//            temp = peek();
            int a = dequeue();
            enqueue(a);
            
            
            //enqueue();
            //System.out.println();
        }
        
    }
}
