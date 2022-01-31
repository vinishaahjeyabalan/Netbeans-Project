/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q6;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L6Q6 {

   
    public static boolean prime(int n) {
        int p,rev,s=0,c=0;
        p=n; //store the entered number in p variable
        for(int i=1; i<=p; i++){
            if(p%i==0){
                c++;
            }
        }
        while(n>0){
            rev=n%10; //extract last digit of the number
            s=s*10+rev; //store the digit last digit
            n=n/10; //extract all digits except the last
        }
        if(p==s && c==2){ //comparing with original number
            System.out.println("Number is Palindromic prime: " + p);
            return true;
        }
        else{
            System.out.println("Number is not Palindromic prime: " + p);
            return false;
        }
    }
    
    public static boolean isPrime(int n){
        // corner case
        if(n<=1){
            return false;
        }
        
        // check from 2 to n-1
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEmirp(int n){
        //check if n is prime
        if (isPrime(n)==false){
            return false;
        }
        
        //find reverse of n
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        
        // If both original and reverse are prime, then it is an Emirp number
        return isPrime(rev);
    }
    
    public static void main(String [] args){
        prime(23);
        if(isEmirp(23)==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        // TODO code application logic here
    }
    
}
