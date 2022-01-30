/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vinishaah_17205417;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Vinishaah_17205417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>(8);
        stack.pushMany("R O T A T O R");
        System.out.println("The elements in the stack:");
        stack.display();
        System.out.println("\nThe element in the stack after middle element is popped:");
        stack.popInMiddle();
        stack.display();
        
        GenericQueue<String> queue = new GenericQueue<String>(8);
        int pointer = 0;
        for(int i=0; i<=stack.count/2; i++  ){
            String top = stack.pop();
            queue.enqueue(top);
        }
        System.out.println("\nThe elements in first queue:");
        queue.display1();
        
        GenericQueue<String> queue2 = new GenericQueue<String>(8);
        for(int i=(stack.count/2)+1; i>=0; i--){
            String bottom = stack.popBottom();
            queue2.enqueue(bottom);
        }
        System.out.println("\n");
        System.out.println("The elements in second queue:");
        queue2.display1();
        
        String str = queue.display();
        String str2 = queue2.display();
        if(str.contentEquals(str2)){
            System.out.println("\nThe element in stack is palindrome");
        }
        else{
            System.out.println("\nThe element in stack is not palindrome");
        }

        

    }
}
   
    

