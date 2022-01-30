/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        for(int i=0; i<15; i++){
        a.addNode(a.randomNum());
        }
        System.out.println("Linked List has " + a.length() + " node(s) ");
        a.showList();
        System.out.println("\nDelete the number 4 from the list");
        a.delete(4);
        System.out.println("Linked List has " + a.length() + " node(s) ");
        a.showList();
        System.out.println(" ");
        
    }
    
}
