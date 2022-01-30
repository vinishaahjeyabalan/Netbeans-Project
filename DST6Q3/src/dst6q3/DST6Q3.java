/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q3;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> a = new Queue<>();
        System.out.print("Simulating a Queue to purchase MY phone");
        Random r = new Random();
        int cus =0, phone =0, noOfPhone=0, remainder=0;
        while(noOfPhone <= 30){
            phone = r.nextInt(3)+1;
            noOfPhone += phone;
            cus++;
            a.enqueue("Customer " + cus + " : " + phone + " set(s)");
        }
        if(noOfPhone!=30){
            remainder = 30-noOfPhone;
            a.enqueue("Customer " + (cus+1) + " : " + remainder + " set(s)");
        }
        a.showQueue();
        System.out.println("\nNumber of Customer : " + (cus+1));
    }
    
}
