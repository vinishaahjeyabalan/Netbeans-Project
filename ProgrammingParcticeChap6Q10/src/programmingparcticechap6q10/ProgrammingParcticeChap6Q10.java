/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingparcticechap6q10;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingParcticeChap6Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(isPrime(1000));
        // TODO code application logic here
    }
    
    public static int isPrime(int number){
        int num = 0;
        int cnt=0;
        for(num=3; num<1000; num++){
            for(int j=2; j<=Math.sqrt(num); j++){
                 boolean isPrime = true;
                 if(num%j==0){
                     isPrime = false;
                     break;
                 }
                 else if(num%j!=0){
                     System.out.println(num);
                     cnt++;
                 }
            }
            boolean isPrime = true;
            num++;
           
        }
        return num;
    }
    
}
