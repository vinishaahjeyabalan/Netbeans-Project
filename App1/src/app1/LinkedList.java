/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class LinkedList {
    //in simplest form, a liked list is just this, w a pointer to the head node
    private Node head;
    
    //to add new data to the linked list
    //we always add at the head
    public void insertAtHead (int data){
        //1. create newNode object for the new data
        Node newNode = new Node(data);
        
        //2. make the nextNode of this newNode project, points to the current head
        newNode.setNextNode(this.head);
        
        //3. make the head points to the new node object, making newNode the new head element
        this.head = newNode;
        
    }
    
    public int length(){
        int length = 0;         // create a counter variable
        // 1. create a current node (or a pointer) that points to the head elemet
        // 2. use a loop (best is while loop) to traverse the linked list until reaches null
        // 3. increment the length (or your counter variable)
        // 4. before going to the next node
        Node current = this.head;
        while(current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
        
    }
    
    public void deleteFromHead(){
        // 1. make the current head pointer, points to the next node
        this.head = this.head.getNextNode();
    }
    
    // method to find data in linkedlist
    public Node find(int x){
        Node current = this.head;
        
    
    }
    // 1. create a pointer (eg. current or temp) to point at the head node
    // 2. use a loop to move through all the nodes
    // 3. if the data is equal to the data held in the current node, return that node
    // 4. and break the while loop
    // 5. otherwise, continue searching the next node
    // 6. return null if reaches the end of linkedlist without a match
    
    @Override
    public String toString(){
        String result = "{"; //variable results store data as String type
        //to print all the nodes in the LinkedList, we need to print from the head
        //1. need a variable where/pointer called current to point to the head
        Node current = this.head;
        //2. we need to use a while loop to go through all the nodes in the LinkedList until null
        //3. get the string created from the node object, and append to the result variable, separate by a comma
        //4. then we move to the next node (next arrow)
        while (current!=null){
            result += current.toString() + ",";
            current = current.getNextNode();
                
        }
        result += "}";
        return result;
    }
    
}

    
    
    
    

