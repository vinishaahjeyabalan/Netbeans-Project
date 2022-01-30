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
public class HN extends Base {
    
     public HN(String sentence){
        super(sentence);
    }
    
    public void pattern(){
         for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)=='k'){
                printK();
            }
            else if(sentence.charAt(i)=='m'){
                printM();
            }
        } 
    }
    
    public void printK(){
        System.out.println("*  *");
        System.out.println("* *");
        System.out.println("**");
        System.out.println("* *");
        System.out.println("*  *");
    }
    public void printM(){
        System.out.println("*   *");
        System.out.println("** **");
        System.out.println("* * *");
        System.out.println("*   *");
        System.out.println("*   *");
    }
}
