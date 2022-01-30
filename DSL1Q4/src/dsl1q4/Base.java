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
public abstract class Base {
    String sentence;
    
    public Base(String sentence){
        this.sentence = sentence;
    }
    
    public abstract void pattern();
    

}


