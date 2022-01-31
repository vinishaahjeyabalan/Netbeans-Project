/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2_vinishaah_17205417;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    
    public LinkedList(){  // constructor method
        head = null;      // initially the linkedlist is empty. So, head is initialized as null
        //this.creditHr = creditHr;
    }
    
    public int length(){                         //method to count the number of nodes in linkedlist
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink(); //each time traversing, the currentNode is set to the latest accessed node
            count++;
        }
        return count;
    }
    
    public void clear(){ //method to make the linkedlist completely empty
        head = null;     //cannot use head.setLink(null) because it means that you're setting head node's link to null
    }
    
    public boolean isEmpty(){  //method to check whether Linkedlist is empty or not
        return (head == null); //return boolean value true if empty and false if not empty
    }
    
    public void display(){                           //method to display the linkedlist
        ListNode currentNode = head;
        System.out.println("\nDisplay linked list:");
        while(currentNode != null){
            System.out.print(currentNode.toString()); //what does currentNode.get() mean?
            currentNode = currentNode.getLink();      //each time traversing the currentNode is set to the latest accessed node
        }
    }
    
    public void addNode(T a){                       //method to insert node at the back
        System.out.println("\n\nInput: " + a);
        ListNode newNode = new ListNode(a, null);   //create new node that going to be inserted which has null link
        ListNode currentNode = head;                //create a temporary node which is going to travel to each node to check whether it's null
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){    //currentNode traverse each node to check which node is null
                currentNode = currentNode.getLink(); //each time traversing the currentNode is set to the latest accessed node
            }
            currentNode.setLink(newNode);            //after reaching the last node in the list, the link is set to the new node
        }
    }
    
    public void arrange(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        int temp;
        
        for (int i = 0; i < length(); i++) {
            previousNode.setLink(currentNode.getLink());
            //System.out.println("prev data :"+previousNode.getData());
            for (int j = i+1; j < length(); j++)  {
               //System.out.println("prev :"+previousNode.getData()+" cur:"+currentNode.getData());
                if ((Integer)previousNode.getData() > (Integer)currentNode.getData()) {
                    temp = (Integer)previousNode.getData();
                    previousNode.setData(currentNode.getData());
                    temp = (Integer)currentNode.getData();
                }
            currentNode = currentNode.getLink();
            }
        }
    }
    
    
    
    
    
//    public void add(T a, int creditHr){
//        ListNode newNode = new ListNode(a, null);   //create new node that going to be inserted which has null link
//        newNode.setCreditHr(creditHr);
//        ListNode currentNode = head;                //create a temporary node which is going to travel to each node to check whether it's null
//        if(head == null){
//            head = newNode;
//        }
//        else{
//            while(currentNode.getLink() != null){    //currentNode traverse each node to check which node is null
//                currentNode = currentNode.getLink(); //each time traversing the currentNode is set to the latest accessed node
//            }
//            currentNode.setLink(newNode);            //after reaching the last node in the list, the link is set to the new node
//        }
//    }
    
    public void addAfter(String after, String now){
        int count=1;
        ListNode newNode = new ListNode(after, null);
        newNode.setData(now);
        newNode.setLink(null);
        
        ListNode currentNode = head;
        while(!currentNode.getData().equals(after)){
            currentNode = currentNode.getLink();
            count++;
        }
        ListNode tempNode = currentNode.getLink();
        currentNode.setLink(newNode);
        newNode.setLink(tempNode);
        System.out.println("\nAdding " + now + " after " + after);
    }
    
//    public void remove(String str, int creditHr){
//        ListNode currentNode = head;                       //create a temporary node which is going to travel to each node to check whether it's null
//        while(!currentNode.getData().equals(str)){
//            currentNode = currentNode.getLink();
//        }
//        ListNode tempNote = currentNode.getLink();
//        currentNode.setLink(tempNote.getLink());
//        tempNote = null;
//        
//    }
    
    public void remove(int num){
        ListNode currentNode = head;                       
        ListNode previousNode = head;                                                
        while(!currentNode.getData().equals(num)){
            previousNode = currentNode;                                                                                            
            currentNode = currentNode.getLink();
        }
        previousNode.setLink(currentNode.getLink());
        
    }
    
    public void addManyNodes(String str){            //method to add many nodes at the same time
        String[] nodes = str.split(" ");            //store the nodes in an array called nodes
         for (int i = 0; i < nodes.length; i++) {
            addNode((T) nodes[i]);
        }
    }
    
    
    public void deleteNode(){                              //method to delete node from the back
        ListNode currentNode = head;                       //create a temporary node which is going to travel to each node to check whether it's null
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null){             //checking first node
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
    
   
    
     public void deleteManyNodes(String str){            //method to delete many nodes at the same time
        String[] nodes = str.split(" ");                 //store the nodes in an array called nodes
         for (int i = 0; i < nodes.length; i++) {
            addNode((T) nodes[i]);
        }
    }
    
    
    public void addFrontNode(T a){     //method to insert a node to the front
        head = new ListNode(a, head);  // set the memory address of the new node to the head pointer
    }
    
    
    public void deleteFrontNode(){     //method to delete node from the front
        if(head != null){
            head = head.getLink();     //assigning the head pointer to the memory address of head node
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public boolean contains(T t){                             //method to check whether an element is present in the linkedlist
        boolean found = false;                                //initializing a variable with boolean data type called found as false
        ListNode currentNode = head;
        while(currentNode != null){
            if(t.compareTo((T) currentNode.getData()) == 0){  //checking each value in linkedlist with t whether same or not by traversing node by node
                
                found = true;                                 //if the data t is found in linkedlist, assign found as true
                break;                                        //no need to proceed with checking if found. So, break the loop
            }
            currentNode = currentNode.getLink();
        }
        return found;
    }
    
   
    public void addNodeByPosition(T a, int index){                   //method to insert a node by position
//        if(index == 0){                                              
//            addFrontNode(a); 
//        }
        if(index == length()){
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
    
//    public int totalCount(){
//         ListNode currentNode = head;                       //create a temporary node which is going to travel to each node to check whether it's null
//         int total = 0;
//         while(currentNode.getLink() != null){
//                    total += (Integer)currentNode.getData();
//                    currentNode = currentNode.getLink();
//                }
//          return total;
//    }
    
    public int totalCount(){
        ListNode currentNode = head;
        int sum=0;
        
        while(currentNode!=null){
           sum += (Integer)currentNode.getData();
               currentNode = currentNode.getLink();
        }
           return sum;
    }
    
}
