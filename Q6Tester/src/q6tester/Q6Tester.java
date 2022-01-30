/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6tester;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Q6Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BurgerStall a = new BurgerStall(1000, 100);
        BurgerStall b = new BurgerStall(1001, 200);
        BurgerStall c = new BurgerStall(1002, 300);
        a.sold(500);
        b.sold(600);
        
        System.out.println("Stall " + a.getID() + " sold " + a.getDaysale() + " burgers.");
        System.out.println("Stall " + b.getID() + " sold " + b.getDaysale() + " burgers.");
        System.out.println("Total sold : " + BurgerStall.getTotalsale());
        // TODO code application logic here
    }
    
}
