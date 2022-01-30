/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q4;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DSL4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Character> p1 = new LinkedList<>();
        LinkedList<Character> p2 = new LinkedList<>();
        Random r = new Random();
        //int start = r.nextInt(2)+1;
        int player1=0, player2=0;
        System.out.print("Player 2 starts first");
        while(p1.length()<20 || p2.length()<20){
            player2 = r.nextInt(6)+1;
            System.out.print("\nPlayer 2: ");
            for(int i=1; i<=player2; i++){
                p2.addNode('*');
            }
            p2.showList();
            
            player1 = r.nextInt(6)+1;
            System.out.print("\nPlayer 1: ");
            for(int i=1; i<=player1; i++){
                p1.addNode('*');
            }
            p1.showList();
        }
        if(p1.length()>=20){
            System.out.println("\nPlayer 1 wins the game");
        }
        else if(p2.length()>=20){
            System.out.println("\nPlayer 2 wins the game");
        }
    }
    
}
