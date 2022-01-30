/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsq4_sem1_2018;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ListNode<T> {
    
    private T data;
    private ListNode link;
    private int creditHr;
    
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
    
    public void setLink(ListNode a){
        link = a;
    }
    
    public ListNode getLink(){
        return link;
    }

    public int getCreditHr() {
        return creditHr;
    }

    public void setCreditHr(int creditHr) {
        this.creditHr = creditHr;
    }
    
    public String toString(){
        return data + " : " + creditHr;
    }
    
}
