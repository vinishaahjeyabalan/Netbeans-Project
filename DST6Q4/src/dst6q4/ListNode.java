/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ListNode<T> {
    private T data;
    private ListNode link;
    
    public ListNode(){
        data = null;
        link = null;
    }
    
    public ListNode(T a, ListNode b){
        data = a;
        link = b;
    }
    
    public void setData(T a){
        data = a;
    }
    
    public T getData(){
        return data;
    }
    
    public void setLink(ListNode b){
        link = b;
    }
    
    public ListNode getLink(){
        return link;
    }
    
    public String toString(){
        return data + " --> ";
    }
}
