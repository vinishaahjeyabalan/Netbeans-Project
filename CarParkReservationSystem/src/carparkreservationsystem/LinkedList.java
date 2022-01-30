/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkreservationsystem;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class LinkedList<T> {
     private ListNode head;

    public LinkedList(){
        head=null;
    }
    
    public int length(){
        ListNode currentNode=head;
        int count=0;
        while(currentNode!=null){
            count++;
            currentNode=currentNode.getLink();
        }
        return count;
    }
    
    public void showList(){
        ListNode currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode=currentNode.getLink();
        }
        System.out.println("");
    }
    
    public void clear(){
        head=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void add(T a){
        ListNode currentNode=head;
        ListNode newNode=new ListNode(a,null);
        if(head!=null){
            while(currentNode.getLink()!=null)
                currentNode=currentNode.getLink();
            currentNode.setLink(newNode);
        }
        else
            head=newNode;
    }
    
    public void delete(){
        ListNode previousNode=head;
        ListNode currentNode=head;
        if(head!=null){
            if(currentNode.getLink()==null)
                head=null;
            else{
                while(currentNode.getLink()!=null){
                    previousNode=currentNode;
                    currentNode=currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else
            System.out.println("The list is empty");
    }
    
    public void addFront(T a){
        head=new ListNode(a,head);
    }
    
    public void deleteFront(){
        if(head!=null)
            head=head.getLink();
        else
            System.out.println("The list is empty");
    }
    
    public void add(T a,int index){
        if(index==0)
            addFront(a);
        else if(index==length())
            add(a);
        else if(index>length())
            System.out.println("Invalid index.No node inserted");
        else{
            ListNode currentNode=head;
            ListNode newNode=new ListNode(a,null);
            for(int i=1;i<length();i++)
                currentNode=currentNode.getLink();
            ListNode tempNode=currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }
    }
    
    public void delete(int index){
        if(index==0)
            deleteFront();
        else if(index==length()-1)
            delete();
        else if(index>=length())
            System.out.println("Invalid index.No node deleted");
        else{
            ListNode currentNode=head;
            for(int i=1;i<index;i++){
                currentNode=currentNode.getLink();
            }
            ListNode tempNode=currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode=null;
        }
    }
    
    public void setFront(T a){
        if(head!=null)
            head.setData(a);
        else
            System.out.println("Invalid update.The list is empty");
    }
    
    public void setBack(T a){
        if(head!=null){
            ListNode currentNode=head;
            while(currentNode.getLink()!=null)
                currentNode=currentNode.getLink();
            currentNode.setData(a); 
        }
        else
            System.out.println("Invalid update.The list is empty");
    }
    
    public void set(T a,int index){
        if(index==0)
            setFront(a);
        else if(index==length()-1)
            setBack(a);
        else if(index>=length())
            System.out.println("Invalid index.Update failed");
        else{
            ListNode currentNode=head;
            for(int i=1;i<=index;i++)
                currentNode=currentNode.getLink();
            currentNode.setData(a);
        }
    }
    
    public T getFront(){
        return(T)head.getData();
    }
    
    public T getBack(){
        ListNode currentNode=head;
        while(currentNode.getLink()!=null)
            currentNode=currentNode.getLink();
        return(T)currentNode.getData();
    }
    
    public T get(int index){
        if(index==0)
            return getFront();
        else if(index==length()-1)
            return getBack();
        else if(index>=length())
            return null;
        else{
            ListNode currentNode=head;
            for(int i=1;i<=index;i++)
                currentNode=currentNode.getLink();
            return(T)currentNode.getData();
        }
    }
    
}
