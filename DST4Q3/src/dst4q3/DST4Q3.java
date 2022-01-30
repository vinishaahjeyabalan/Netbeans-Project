/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> currencyNote = new LinkedList<>();
        currencyNote.addNode(100);
        currencyNote.addNode(50);
        currencyNote.addNode(20);
        currencyNote.addNode(10);
        currencyNote.addNode(5);
        currencyNote.addNode(1);
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int amount = s.nextInt();
        System.out.println("Total amount: " + amount);
        
        LinkedList<Integer> noOfNotes = new LinkedList<>();
        noOfNotes.addNode(amount/100);
        amount%=100;
        noOfNotes.addNode(amount/50);
        amount%=50;
        noOfNotes.addNode(amount/20);
        amount%=20;
        noOfNotes.addNode(amount/10);
        amount%=10;
        noOfNotes.addNode(amount/5);
        amount%=5;
        noOfNotes.addNode(amount/1);
        amount%=1;
        
        for(int i=0; i<currencyNote.length(); i++){
            System.out.println("MYR " + currencyNote.get(i) + " : " + noOfNotes.get(i));
        }
        
        
    }
    
}
