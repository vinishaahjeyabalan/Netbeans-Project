/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = s.nextLine();
        System.out.print("Original sentence : " + sentence);
        System.out.print("\nThe sentence in reverse order : ");
        Stack<Character> revSen = new Stack<>();
        for(int i=0; i<sentence.length(); i++){
            revSen.push(sentence.charAt(i));
        }
        revSen.showStack();
        
        Stack<String> revWord = new Stack<>();
        String[] words = sentence.split(" "); //why .split("//s+") cannot? //what is .split(/\s+/)
        
        System.out.print("\nThe word in reverse order : ");
        for(int i=0; i<words.length; i++){
            revWord.push(words[i] + " ");
        }
        revWord.showStack();
        System.out.println(" ");
    }
    
}
