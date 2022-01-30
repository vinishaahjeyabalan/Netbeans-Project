/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivevoidmethod1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class RecursiveVoidMethod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        displayDigit(3456);
//        System.out.println(" ");
//        reverse("hello", 4);
//        factorial(5);

        for(int i=0; i<=6; i++){
             System.out.println(fib(i) + " ");
        }
       
    }
    
//    public static void displayDigit(int n){
//        if(n<10){
//            System.out.println(n);
//        }
//        else{
//            displayDigit(n/10);
//            System.out.println(n%10);
//        }
//    }
//        
//    public static void reverse(String s, int size){
//        if(size==1){
//            System.out.println(s.charAt(size-1));
//        }
//        else{
//            System.out.println(s.charAt(size-1));
//            reverse(s, --size);
//        }
//    }
//    
//    public static void factorial(int num){
//        if(num==1){
//            System.out.println(num);
//        }
//        else{
//            factorial(num-1);
//            System.out.println(num * (num-1));
//        }
//    }
    
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    }
    

