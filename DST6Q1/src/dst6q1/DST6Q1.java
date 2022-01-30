/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Character> a = new Queue<>();
        //Insert three characters into the queue
        a.enqueue('B');
        a.enqueue('M');
        a.enqueue('W');
        //Remove one character from the queue
        a.dequeue();
        a.showQueue();
        System.out.println("\nThe front element of the queue is " + a.peek());
        
        System.out.println("The number of elements in the queue is " + a.getSize());
    }
    
}
