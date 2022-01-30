/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinkedlist;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SingleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        LinkedList<String> list = new LinkedList<>();
        
        //insert or delete node at the back
//        System.out.println("Linked List : Insert 3 nodes at the back");
//        list.addNode("One");
//        list.addNode("Two");
//        list.addNode("Three");
//        System.out.println("Linked List has " + list.length() + " nodes");
//        list.showList();
//        
//        Scanner s = new Scanner(System.in);
//        System.out.println("\nEnter a String to search : ");
//        String str = s.nextLine();
//        if(list.contains(str)){
//            System.out.println(str + " was found");
//        }
//        else{
//            System.out.println(str + " was not found");
//        }
//        System.out.println("Linked list: Delete 2 nodes at the back");
//        list.deleteNode();
//        list.deleteNode();
//        System.out.println("Linked list has " + list.length() + " nodes");
//        list.showList();
//        System.out.println("\nLinked List: Clear ALL");
//        list.clear();
//        System.out.println("Linked List has " + list.length() + " nodes");
//        
//        //insert or delete front node
//        System.out.println("Linked List : Insert 3 front nodes");
//        list.addFrontNode("One");
//        list.addFrontNode("Two");
//        list.addFrontNode("Three");
//        System.out.println("Linked List has " + list.length() + " nodes");
//        list.showList();
//        System.out.println("\nLinked List: Delete 2 front nodes");
//        list.deleteFrontNode();
//        list.deleteFrontNode();
//        System.out.println("Linked List has " + list.length() + " nodes");
//        list.showList();
//        System.out.println();
//        
//        //insert or delete node by position
        System.out.println("Linked list : Insert 3 nodes at the back");
        list.addNode("One");
        list.addNode("Two");
        list.addNode("Three");
        list.addManyNodes("Four Five");
        System.out.println("Linked list has " + list.length() + " nodes");
        list.showList();
        int position = 1;
        System.out.println("\nLinked List Position start at 0");
        System.out.println("Insert a node at position " + position);
        list.addNodeByPosition("Four", position);
        System.out.println("Linked List has " + list.length() + " nodes");
        list.showList();
        position = 2;
        System.out.println("\nDelete a node from position : " + position);
        list.deleteNodeByPosition(position);
        System.out.println("Linked List has " + list.length() + " nodes");
        list.showList();
        System.out.println();
        
        //update or retrieve node value by position
//        System.out.println("ListNode List : Insert 4 nodes at the back");
//        list.addNode("One");
//        list.addNode("Two");
//        list.addNode("Three");
//        list.addNode("Four");
//        System.out.println("Linked List has " + list.length() + " nodes");
//        list.showList();
//        System.out.println("\nLinked List Position starts at 0");
//        String newValue = "Five";
//        int position1 = 2;
//        System.out.println("Change value at position " + position1 + " to " + newValue);
//        list.set(newValue, position1);
//        System.out.println("Linked List has " + list.length() + " nodes");
//        list.showList();
//        position1 = 1;
//        System.out.println("\nThe value at position " + position1 + " is " + list.get(position1));
//        
        
    }
    
}
