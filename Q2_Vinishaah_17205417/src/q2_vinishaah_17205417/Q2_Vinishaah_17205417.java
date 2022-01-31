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
public class Q2_Vinishaah_17205417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addNode(5);
        list.display();
        
        if(!list.contains(4)){
            list.addNode(4);
        }
        else{
            System.out.println("found a duplicate”, item not added to linked list");
        }
        list.display();
        
        
        if(!list.contains(12)){
            list.addNode(12);
        }
        else{
            System.out.println("found a duplicate”, item not added to linked list");
        }
        list.display();
        
        
        if(!list.contains(4)){
            list.addNode(4);
        }
        else{
            System.out.println("found a duplicate”, item not added to linked list");
        }
        list.display();
        
        
        if(!list.contains(2)){
            list.addNode(2);
        }
        else{
            System.out.println("found a duplicate”, item not added to linked list");
        }
        list.display();
        
        
        if(!list.contains(10)){
            list.addNode(10);
        }
        else{
            System.out.println("found a duplicate”, item not added to linked list");
        }
        list.display();
        
        //list.display();
        
        //list.arrange();
        
        System.out.println("\n\nYour linked list length is: " + list.length());
        System.out.println("Your total count is: " + list.totalCount());
        
    }
    
}
