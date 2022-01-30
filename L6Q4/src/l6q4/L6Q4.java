/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("gcd of 24 and 8 is " + gcd(24,8));
        System.out.println("gcd of 200 and 625 is " + gcd(200,625));
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        else if(b==0){
            return a;
        }
        else if(a==b){
            return a;
        }
        else if(a>b){
            return gcd(a-b, b);
        }
        else{
            return gcd(a,b-a);
        }
        // TODO code application logic here
    }
    
}
