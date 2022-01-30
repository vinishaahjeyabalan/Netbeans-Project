/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q2 {
    public static void main(String[] args) {
       multiPrint(5,'*');
    }

   
   public static void multiPrint (int n,char c){
         for (int i = 1; i <= n; i++) {
             for (int j = n; j >= i; j--) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print(" ");
             }
             System.out.println();
         }
         System.out.println();
         System.out.println();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i*2-1; j++) {
                    System.out.println(c);
                }
                System.out.println();
            }
            for (int i = n-1; i > 0; i--) {
                for (int j = 1; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i*2-1; j++) {
                    System.out.println(c);
                }
                System.out.println();
            }
        }
   
    
}
