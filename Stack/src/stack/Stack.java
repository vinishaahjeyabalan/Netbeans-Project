/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        stack1<String> stack = new stack1<>();
//        System.out.println("Inser three nodes into the stack");
//        stack.push("One");
//        stack.push("Two");
//        stack.push("Three");
//        System.out.println("The number of elements in the stack is " + stack.getSize());
//        stack.showStack();
//        System.out.println("\nPop one node from the stack");
//        stack.pop();
//        System.out.println("The number of elements in the stack is " + stack.getSize());
//        stack.showStack();
//        System.out.println("\nThe element on the top of the stack is " + stack.peek());
//        stack.showStack();
//        System.out.println();
        
        
        String[] infix = {"A+B", "A+B*C", "(A+B)*(C-D)", "(A*B+C)/D+E"};
        for(int i=0; i<infix.length; i++){
            System.out.println("The infix expression : " + infix[i]);
            System.out.println("The postfix expression : " + infixToPostfix(infix[i]));
            System.out.println("The prefix expression : " + infixToPrefix(infix[i]));
        }
            
        
        String[] infixValue = {"5+9", "34+11*7", "(3+2)*(7-4)", "(5*6+2)/4+7"};
        for(int j=0; j<infixValue.length; j++){
            System.out.println("The infix expression : " + infixValue[j]);
            System.out.println("The postfix expression : " + infixToPostfix(infixValue[j]));
            System.out.println("The prefix expression : " + infixToPrefix(infixValue[j]));
            System.out.println("The result using postfix expression : " + postfixEvaluation(infixToPostfix(infixValue[j])));
            System.out.println("The result using prefix expression : " + prefixEvaluation(infixToPrefix(infixValue[j])));
        }
    }
        
//        String F = "34+11*7";
//            System.out.println("The infix expression : " + F);
//            System.out.println("The postfix expression : " + infixToPostfix(F));
//            System.out.println("The prefix expression : " + infixToPrefix(F));
//            System.out.println("The result using postfix expression : " + postfixEvaluation(infixToPostfix(F)));
//            System.out.println("The result using prefix expression : " + prefixEvaluation(infixToPrefix(F)));
//        
        
        
    
    
    
    
    
    public static String infixToPostfix(String a){
        String str = ""; //the postfix expression created will be stored in str
        char c = ' ';    //
        stack1<Character> stack = new stack1<>();
        for(int i=0; i<a.length(); i++){  //for each of the character in the infix expression
            if(Character.isLetterOrDigit(a.charAt(i))){ 
                str += a.charAt(i);}
            else if(a.charAt(i) == '('){  //if character is (
                stack.push(a.charAt(i));} //push into the stack
            else if(a.charAt(i) == ')'){
                c = stack.pop();
                while(c != '('){
                    str += c;
                    c = stack.pop();  //why c=stack.pop() is written 2 times?
                }
            }
            else{
                if(!stack.isEmpty()){
                    if(stack.peek() == '('){
                        stack.push(a.charAt(i));
                    }
                    else{
                        c = stack.peek();
                        while(getPriority(a.charAt(i)) <= getPriority(c)){ //while incoming operator's priority is less than or equal to operator on top of stack
                            str += stack.pop();                            //pop the stack and print
                            if(!stack.isEmpty()){                          //if stack is not empty
                                c = stack.peek();                          
                                if (c == '('){                             //if on top of stack is '('
                                    break;
                                }
                            }
                            else{
                                break;
                            }
                        }
                        stack.push(a.charAt(i));
                    }
                }
                else{
                    stack.push(a.charAt(i));
                }
            }
            
        }
        while(!stack.isEmpty()){
            str += stack.pop();
        }
        return str;
    }
    
    
    public static String infixToPrefix(String a){
        String rev = "";  //
        String str = "";  //the prefix expression created will be stored in str
        stack1<Character> stack = new stack1<>();
        for(int i=a.length()-1; i>=0; i--){  //line 110-120 stands for the storing the infix expression in reverse in rev
            if(a.charAt(i) == '('){
                rev += ')';
            }
            else if(a.charAt(i) == ')'){
                rev += '(';
            }
            else{
                rev += a.charAt(i);
            }
        }
        rev = infixToPostfix(rev);  //call the infixToPostfix() method to convert the reversed infix expression to prefix expression
        for(int i=rev.length()-1; i>=0; i--){  //line 122-124 stands for the reversing and storing of the rev obtained to get the real prefix expression
            str += rev.charAt(i);
        }
        return str; 
    }
    
    
    public static int getPriority(char a){
        switch(a){
            case '*':
            case '/':
            case '%':
                return 2; //higher priority
            case '+':
            case '-':
                return 1; //lower priority 
            default:
                return 0;
            
        }
    }
    
    
    public static int postfixEvaluation(String a){
        stack1<String> stack = new stack1<>();  //the object that will be stored in the stack are string
        String temp;
        int num1=0, num2=0, result=0;
        for(int i=0; i<a.length(); i++){
            if(Character.isLetterOrDigit(a.charAt(i))){
                temp = a.substring(i, i+1);
                stack.push(temp);
            }
            else{ //else indicates if the character is an operator
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                result = getResult(num1, num2, a.charAt(i));
                stack.push(result+"");
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }
    
    
//     public static int postfixEvaluation(String a){
//        stack1<Character> stack = new stack1<>();  //the object that will be stored in the stack are string
//        String temp;
//        int num1=0, num2=0, result=0;
//        for(int i=0; i<a.length(); i++){
//            if(Character.isLetterOrDigit(a.charAt(i))){
//                stack.push(a.charAt(i));
//            }
//            else if(a.charAt(i)=='+' || a.charAt(i)=='-' || a.charAt(i)=='*' || a.charAt(i)=='/' || a.charAt(i)=='%'){
//                num2 = stack.pop();
//                num1 = stack.pop();
//                result = getResult(num1, num2, a.charAt(i));
//                stack.push(result);
//            }
//        }
//        result = stack.pop();
//        return result;
//    }
    
    
    public static boolean isInteger(String s){
        try{
            Integer.parseInt(s);
        }catch(NumberFormatException e){    
            return false;
        }
        return true;
    }
    
    
    public static int getResult(int a, int b, char c){
        switch(c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;
        }
        return 0;
    }
    
    
    public static int prefixEvaluation(String a){
        stack1<String> stack = new stack1<>();
        String temp;
        int num1=0, num2=0, result=0;
        temp = a.substring(0, 1);
        stack.push(temp);
        if(!Character.isLetterOrDigit(a.charAt(0))){
            stack.push("#");
        }
        for(int i=0; i<a.length(); i++){
            if(Character.isLetterOrDigit(a.charAt(i))){
                if(stack.peek().equals("#")){
                    temp = a.substring(i, i+1);
                    stack.push(temp);
                }
                else{
                    boolean first = true;
                    while(isInteger(stack.peek()) && !stack.isEmpty()){
                        num1 = Integer.parseInt(stack.pop());
                        if(first){
                            num2 = Integer.parseInt(a.substring(i, i+1));
                        }
                        else{
                            num2 = result;
                        }
                        stack.pop();
                        result = getResult(num1, num2, stack.pop().charAt(0));
                        first = false;
                    }
                    stack.push(result + "");
                }
            }
            else{
                temp = a.substring(i, i+1);
                stack.push(temp);
                stack.push("#");
            }
            
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }
    
   
        
    }
    

