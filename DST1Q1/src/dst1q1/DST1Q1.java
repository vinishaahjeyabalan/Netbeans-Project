/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q1;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int day, month, year;
        System.out.print("Day : ");
        day = s.nextInt();
        System.out.print("Month : ");
        month = s.nextInt();
        System.out.print("Year : ");
        year = s.nextInt();
        Tarikh a = new Tarikh(day, month, year);
        String sentence_a = a.toString();
        System.out.println(sentence_a);
    }
    
}
