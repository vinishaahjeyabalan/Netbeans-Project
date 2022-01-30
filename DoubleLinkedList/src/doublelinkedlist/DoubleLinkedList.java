/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkdList<String> list = new DoubleLinkdList<>();
        System.out.println("Double Linked List : Insert 3 nodes at right site");
        list.addRightNode("One");
        list.addRightNode("Two");
        list.addRightNode("Three");
        System.out.println("Double Linked List has " + list.length() + " nodes");
        list.showList();
        System.out.println("\nDelete two nodes from the right site");
        list.deleteRightNode();
        list.deleteRightNode();
        System.out.println("Double Linked List has " + list.length() + " nodes");
        list.showList();
        
        
        System.out.println("\nDouble Linked List : Insert 3 nodes at the right site");
        list.addRightNode("One");
        list.addRightNode("Two");
        list.addRightNode("Three");
        System.out.println("Double Linked List has " + list.length() + " nodes");
        list.showList();
        int position = 1;
        System.out.println("\nDouble Linked List Position start at 0");
        System.out.println("Insert a node at position : " + position);
        list.addNodeByPosition("Four", position);
        System.out.println("Double Linked List has " + list.length() + " nodes");
        list.showList();
        position = 2;
        System.out.println("\nDelete a node from position : " + position);
        list.deleteNodeByPosition(position);
        System.out.println("Double Linked List has " + list.length() + " nodes");
        list.showList();
        System.out.println();
        
        
        
    }
    
}

 





