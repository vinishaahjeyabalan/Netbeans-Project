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
public class ListNode<T> {
    private T data;
    private ListNode link;

    public ListNode() {
        data=null;
        link=null;
    }

    public ListNode(T data, ListNode link) {
        this.data = data;
        this.link = link;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode getLink() {
        return link;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }
    
    public String toString(){
        return data+"-->";
    }
    
}
