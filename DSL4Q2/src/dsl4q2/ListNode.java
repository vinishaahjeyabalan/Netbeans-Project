/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ListNode<T> {
     private ListNode link;
    private T data;
    
    public ListNode(T data, ListNode link){
        this.link = link;
        this.data = data;  
    }
    
    public void setLink(ListNode link){
        this.link = link;
    }
    
    public ListNode getLink(){
        return link;
    }
    
    public void setData(T data){
        this.data = data;
    }
    
    public T getData(){
        return data;
    }
    
    public String toString(){
        return data + " --> ";
    }
    
}
