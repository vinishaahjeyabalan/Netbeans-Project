/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q6;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        DoubleLinkedList<Integer> a = new DoubleLinkedList<>();
        int[] randNum = new int[10];
        System.out.print("The random numbers are : ");
        for(int i=0; i<randNum.length; i++){
            randNum[i] = r.nextInt(101);
            a.addRightNode(randNum[i]);
            System.out.print(randNum[i] + " ");
        }
        System.out.println("\nInsert the random numbers into the doubly linked list");
        a.showList();
        System.out.println("\nRemove a number from the third position");
        a.deleteNodeByPosition(2);
        a.showList();
        System.out.println("\nReplace the number in seventh position with 999");
        a.addNodeByPosition(999, 6);
        a.deleteNodeByPosition(7);
        a.showList();
        System.out.println("\nRemove all even number from the doubly linked list ");
        for(int i=0; i<a.length();i++){
            if(a.get(i)%2==0){
                a.deleteNodeByPosition(i);
            }
        }
        a.showList();
        System.out.println("");
        
        
    }
    
}
