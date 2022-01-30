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
public class DST6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayQueue<Character> queue = new ArrayQueue<>();
        System.out.println("Queue Implementation using Array");
        System.out.println("Enqueue three nodes");
        queue.enqueue('A');
        queue.enqueue('N');
        queue.enqueue('D');
        queue.showQueue();
        System.out.println("\nDequeue one node ");
        queue.dequeue();
        queue.showQueue();
        System.out.println("\nThe front node of the queue is " + queue.peek());
        queue.showQueue();
        System.out.println("\nThe queue size is " + queue.getSize());
        System.out.println("");
    }
    
}
