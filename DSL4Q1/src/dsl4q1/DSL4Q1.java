/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        System.out.println("The random numbers are : ");
        int[] num = new int[10];
        for(int i=0; i<10; i++){
            num[i] = a.generate();
            System.out.print(num[i] + " ");
        }
        System.out.println("\nInsert the random numbers at the back of the linked list ");
        for(int i=0; i<10; i++){
            a.addNode(num[i]);
        }
        a.showList();
        a.clear();
        System.out.println("\nInsert the random numbers in front of the linked list ");
        for(int i=0; i<10; i++){
            a.addFrontNode(num[i]);
        }
        a.showList();
        a.clear();
        System.out.println("\nInsert the random numbers in a sorted linked list ");
        for(int i=0; i<10; i++){
            a.addSortNode(num[i]);
        }
        a.showList();
        System.out.println("");
        
    }
    
}
