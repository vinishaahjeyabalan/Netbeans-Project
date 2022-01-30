/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4q3;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public int length(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink(); //each time traversing the currentNode is set to the latest accessed node
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null; //cannot use head.setLink(null) because it means that you're head node's link to null
    }
    
    public boolean isEmpty(){
        return (head == null); //return boolean value (true or false)
    }
    
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString()); //what does currentNode.get() mean?
            currentNode = currentNode.getLink(); //each time traversing the currentNode is set to the latest accessed node
        }
    }
    
    //insert node at the back
    public void addNode(T a){
        ListNode newNode = new ListNode(a, null); //create new node that going to be inserted which has null link
        ListNode currentNode = head; //create a temporary node which is going to travel to each node to check whether it's null
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){ //currentNode traverse each node to check which node is null
                currentNode = currentNode.getLink(); //each time traversing the currentNode is set to the latest accessed node
            }
            currentNode.setLink(newNode);
        }
    }
    
    //delete node from the back
    public void deleteNode(){
        ListNode currentNode = head; //create a temporary node which is going to travel to each node to check whether it's null
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null){ //checking first node
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);//
            }
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    //insert node to the front
    public void addFrontNode(T a){
        head = new ListNode(a, head);// set the memory address of the new node to the head pointer
    }
    
    //delete node from the front
    public void deleteFrontNode(){
        if(head != null){
            head = head.getLink();//assigning the head pointer to the memory address of head node
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public boolean contains(T t){
        boolean found = false;
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo((T) currentNode.getData()) == 0){
                found = true;
                break;
            }
            currentNode = currentNode.getLink();
        }
        return found;
    }
    
    //insert node by position
    public void addNodeByPosition(T a, int index){
        if(index == 0){
            addFrontNode(a); 
        }
        else if(index == length()){
            addNode(a);
        }
        else if(index>length()){
            System.out.println("Invalid index. No node inserted");
        }
        else{
            ListNode newNode = new ListNode(a, null);
            ListNode currentNode = head;
            for(int i=1; i<index; i++){
                currentNode = currentNode.getLink();
            }
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }
    }
    
    //delete node by position
    public void deleteNodeByPosition(int index){
        if(index == 0){
            deleteFrontNode();
        }
        else if(index == length()-1){
            deleteNode();
        }
        else if(index>=length()){
            System.out.println("Invalid index. No node deleted");
        }
        else{
            ListNode currentNode = head;
            for(int i=1; i<index; i++){
                currentNode = currentNode.getLink();
            }
            ListNode tempNote = currentNode.getLink();
            currentNode.setLink(tempNote.getLink());
            tempNote = null;
        }
    }
    
    //setfront
    public void setFront(T t){
        if(head != null){
            head.setData(t); //setting data of head node to value t
        }else{
            System.out.println("Invalid update. List is empty");
        }
    }
    
    //setback
    public void setBack(T t){
        if(head != null){
            ListNode currentNode = head;
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
        else{
            System.out.println("Invalid update. List is empty");
        }
    }
    
    //set
    public void set(T t, int index){
        if(index == 0){
            setFront(t);
        }
        else if(index == length()-1){
            setBack(t);
        }
        else if(index >= length()){
            System.out.println("Invalid index. Update failed");
        }
        else{
            ListNode currentNode = head;
            for(int i=1; i<=index; i++){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
    }
    
    //getFront
    public T getFront(){
        if(head != null){
            return (T) head.getData();
        }
        else{
            return null;
        }
    }
    
    //getBack
    public T getBack(){
        if(head != null){
            ListNode currentNode = head;
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
        else{
            return null;
        }
    }
    
    //get
    public T get(int index){
        if(index == 0){
            return getFront();
        }
        else if(index == length()-1){
            return getBack();
        }
        else if(index >= length()){
            return null;
        }
        else{
            ListNode currentNode = head;
            for(int i=1; i<=index; i++){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
    
}
}
