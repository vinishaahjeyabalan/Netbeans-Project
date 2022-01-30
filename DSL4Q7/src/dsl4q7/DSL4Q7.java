/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q7;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularLinkedList<String> list = new CircularLinkedList<>();
        System.out.print("Enter a sentence : ");
        String str = s.nextLine();
        String[] words = str.split(" ");
        System.out.println("The words in the circular linked list");
        for(int i=0; i<words.length; i++){
            list.addCircularNode(words[i]);
        }
        list.showCircularList();
        System.out.println("\nAfter delete a word");
        list.deleteCircularNode();
        list.showCircularList();
        System.out.println("\nThe second item in the list is " + list.getCircularItem(1));
    }
    
}
