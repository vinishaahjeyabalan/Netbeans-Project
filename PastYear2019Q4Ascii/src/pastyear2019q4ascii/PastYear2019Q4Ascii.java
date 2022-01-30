/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q4ascii;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2019Q4Ascii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sentenceCount = 0, wordCount = 0;
        int[] letterArray = new int[26];

        String line = "";
        try {
            Scanner scanner = new Scanner(new FileInputStream(new File("myAmbition.txt")));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                char letter;
                int asciiIndex;
                for (int i = 0; i < line.length(); i++) {
                    letter = line.charAt(i);
                    asciiIndex = letter; // A char is also an integer
                    if (letter == '.') sentenceCount++;
                    if (letter == ' ') wordCount++;
                    if (asciiIndex >= 65 && asciiIndex <= 90)letterArray[asciiIndex - 65]++;
                    if (asciiIndex >= 97 && asciiIndex <= 122) letterArray[asciiIndex - 97]++;
                }
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        wordCount++; // Since we were only counting spaces, word count has to increment by one

        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of words: " + wordCount);
        char ascii;
        for (int i = 0; i < letterArray.length; i++) {
            ascii = (char) (65 + i);
            System.out.printf(ascii + " : " + letterArray[i] + " ");
            if ((i+1) % 8 == 0) System.out.println();
        }

    }
}
        // TODO code application logic here
    
    

