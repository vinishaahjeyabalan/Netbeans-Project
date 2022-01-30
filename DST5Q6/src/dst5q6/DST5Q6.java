/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q6;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack<Integer> odd = new Stack<>();
        Stack<Integer> even = new Stack<>();
        Stack<Integer> order = new Stack<>();
        Random r = new Random();
        int[] num = new int[10];
        System.out.print("The random numbers are: ");
        for(int i=0; i<num.length; i++){
            num[i] = r.nextInt(100)+1;
            System.out.print(num[i] + " ");
            
                if(num[i]%2==1){
                    odd.push(num[i]);
                }
                else if(num[i]%2==0){
                    even.push(num[i]);
                }
        }
        System.out.println("\n");
        odd.showStack();
        System.out.println("\n");
        even.showStack();
        while((!odd.isEmpty()) && (!even.isEmpty())){
            int o = odd.pop();
            order.push(o);
            int ev = even.pop();
            order.push(ev);
            
        }
        System.out.print("\nThe numbers in stack are: ");
        order.showStack();
        System.out.println("\nThe total numbers in stack is: " + order.getSize());
        
        
    }
    
}

//        Stack<Integer> a = new Stack<>();
//        Random r = new Random();
//        int[] num = new int[10];
//        for(int i=0; i<num.length; i++){
//            num[i] = r.nextInt(100)+1;
//            
//            for(int j=0; j<i; j++){
//                if(num[i]%2==1){
//                    a.push(i);
//                }
//            }
//        }
