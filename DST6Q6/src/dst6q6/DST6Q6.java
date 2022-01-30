/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q6;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<String> a = new Queue<>();
        System.out.print("Enter a sentence : ");
        String sen = s.nextLine();
        System.out.print("The original queue : ");
        String[] words = sen.split(" ");
        for(int i=0; i<words.length; i++){
            a.enqueue(words[i]);
        }
        a.showQueue();
        a.clear();
        System.out.print("\nReverse all the elements in the queue : ");
        for(int i=words.length-1; i>=0; i--){
            a.enqueue(words[i]);
        }
        a.showQueue();
        System.out.println(" ");
    }
    
}
