/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2019Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Delivery a = new Delivery("Ali", "Ahmad", 4.4);
        Delivery b = new Delivery("Ah Chong", "Fatimah", 63.1);
        SpecialDelivery c = new SpecialDelivery("FSKTM,UM", "FK,UM", 32.5, true, false);
        SpecialDelivery d = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        // TODO code application logic here
    }
    
}
