/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4q6;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.addFrontNode(78);
        a.addFrontNode(45);
        a.addFrontNode(34);
        a.addFrontNode(23);
        a.addFrontNode(17);
        a.addFrontNode(10);
        a.addFrontNode(8);
        a.showList();
        System.out.println("\nThe median is " + a.median());
    }
    
}
