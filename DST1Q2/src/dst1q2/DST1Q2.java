/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q2;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sentence : ");
        String sentence = s.nextLine();
        Sentence s1 = new Sentence(sentence);
        s1.display();
        s1.lengthOfSentence();
        s1.noOfVowels();
        s1.noOfWords();
    }
    
}
