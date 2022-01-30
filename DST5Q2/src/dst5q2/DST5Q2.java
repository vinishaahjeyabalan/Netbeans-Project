/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack<Character> stack = new ArrayStack<>();
        System.out.println("Stack implementation using Array");
        System.out.println("Insert three nodes into the stack ");
        stack.Push('A');
        stack.Push('N');
        stack.Push('D');
        stack.showStack();
        System.out.println("\nPop one node from the stack ");
        stack.Pop();
        stack.showStack();
        System.out.println("\nThe element on the top of the stack is " + stack.Peek());
        stack.showStack();
        System.out.println("\nThe number of elements in the stack is " + stack.getSize());
        System.out.println("");
        
    }
    
}
