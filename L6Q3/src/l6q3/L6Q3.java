/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        array(2);
    }
    public static void array(int n){
        Scanner s=new Scanner(System.in);
        int[] array = new int[n];
        int[] rem = new int [n];
        int[] rev = new int [n];
        for(int i=0; i<n; i++){
            array[i]=s.nextInt();
            rev[i]=0;
        }
        for(int i=0; i<n; i++) {
            while(array[i]!=0){
                rem[i]=array[i]%10;
                rev[i]=rev[i]*10+rem[i];
                array[i]=array[i]/10;
            }
            System.out.println(rev[i]);
        }
        // TODO code application logic here
    }
    
}
