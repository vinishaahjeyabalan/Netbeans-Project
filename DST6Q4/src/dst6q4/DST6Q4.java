/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6q4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] str = {"kayak", "Welcome", "Was it a car or a cat I saw?", "civic", "race car"};
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new Queue<>();
            
        for (String s : str){
//            Stack<Character> stack = new Stack<>();
//            Queue<Character> queue = new Queue<>();
            
            for(int i=0; i<s.length(); i++){
                stack.push(s.charAt(i));
                queue.enqueue(s.charAt(i));
            }
            while(!stack.isEmpty()){
                if(!Character.isAlphabetic(stack.peek())){
                    stack.pop();
                }
                else if(!Character.isAlphabetic(queue.peek())){
                    queue.dequeue();
                }
                String a = stack.pop().toString();
                String b = queue.dequeue().toString();
                if(a.equalsIgnoreCase(b)){
                    System.out.println(s + " is a palindrome.");
                    break;
                }
                else{
                    System.out.println(s + " is not a palindrome.");
                    break;
                }
            }
        }
    }
}
