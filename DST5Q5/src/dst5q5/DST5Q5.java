/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst5q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        parentheses("(())");
        parentheses(")()(");
        parentheses("((())())()");
        parentheses("(())()))");
        parentheses("())");
        
    }
    
    public static void parentheses(String str){
        Stack<Character> a = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                a.push(str.charAt(i));
            }
            else if(str.charAt(i) == ')'){
                Character x = a.pop();  //why char x cannot?
                
                if(x == null){
                    System.out.println(str + " is not balanced");
                    return; //why need to use return?
                }
            }
            
        }
        if(a.peek() == null){
            System.out.println(str + " is balanced");
        }
        else{
            System.out.println(str + " is not balanced");
        }
    }
    
}
