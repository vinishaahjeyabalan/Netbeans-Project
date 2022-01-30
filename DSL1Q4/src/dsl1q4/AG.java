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
public class AG extends Base {
    
    public AG(String sentence){
        super(sentence);
    }
    
    public void pattern(){
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)=='f'){
                printF();
            }
        } 
    }
     
    public void printF(){
        System.out.println("**** ");
        System.out.println("* ");
        System.out.println("***");
        System.out.println("*");
        System.out.println("*");
    }
    
}
