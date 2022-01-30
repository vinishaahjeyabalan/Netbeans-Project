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
public class Node {
    // declare node data and node pointer
    private int data;       // data of type int
    private Node nextNode;  // the next node pointer, this is the 'arrow' in the drawing
    
    // don't forget the class constructor
    public Node(int data){
        this.data = data;
    }
    
    // since we have made these variables private
    // to access them, we use setters and getters
    public int getData(){
        return this.data;
    }
    public Node getNextNode(){
        return this.nextNode;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    
      @Override
    public String toString(){
        return "Data: " + this.data;
    }
}
