/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Character> a = new Stack<>();
        System.out.println("Stack implementation using linked list");
        System.out.println("Insert three nodes into the stack");
        a.push('A');
        a.push('N');
        a.push('D');
        a.showStack();
        System.out.println("\nPop one node from the stack");
        a.pop();
        a.showStack();
        System.out.println("\nThe element on the top of the stack is " + a.peek());
        a.showStack();
        System.out.println("\nThe number of elements in the stack is " + a.getSize());
    }
    
}
