/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2017q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }
    
    

    @Override
    public String toString() {
        return "Essay score: " +
               "Grammar Marks: " + grammar +
               "Spelling Marks: " + spelling +
               "Length Marks: " + length +
               "Content Marks: " + content;
    }
    
    
    
}
