/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class OT extends Base {
    
     public OT(String sentence){
        super(sentence);
    }
    
    public void pattern(){
         for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)=='s'){
                printS();
            }
            else if(sentence.charAt(i)=='t'){
                printT();
            }
        } 
    }
       
    
    public void printS(){
        System.out.println(" **");
        System.out.println("*");
        System.out.println(" *");
        System.out.println("  *");
        System.out.println("**");
    }
    
    public void printT(){
        System.out.println("*****");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
        System.out.println("  *  ");
    }
    
}
