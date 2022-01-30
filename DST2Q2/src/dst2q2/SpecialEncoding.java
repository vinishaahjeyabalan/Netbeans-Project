/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SpecialEncoding<T> {
    T[] t;
    
    public SpecialEncoding(T[] t){
        this.t = t;
        
    }
    
    public void setT(T[] t){
        this.t = t;
    }
    
    public T[] getT(){
        return t;
    }
    
    public void printCode(){
        String command ="";
        String str="";
       
        for(int i=0; i<=t.length; i++){
            str += (t[i] + " ");
        }
        System.out.print("The Code is " + str);
       
        for(int i=0; i<=t.length; i++){
            if(t[i] == (Integer)0){
                command = "Copy"; 
            }
            else if(t[i] == (Integer)1){
                command = "Delete"; 
            }
            else if(t[i] == (Integer)2){
                command = "Insert"; 
            }
            else if(t[i] == (Integer)3){
                command = "Print"; 
            }
            else if(t[i] == (Integer)4){
                command = "Rename"; 
            }
            else if(t[i] == (Integer)5){
                command = "Paste"; 
            }

            
            else if(t[i] == (Character)'C'){
                command = "Copy"; 
            }
            else if(t[i] == (Character)'D'){
                command = "Delete"; 
            }
            else if(t[i] == (Character)'I'){
                command = "Insert"; 
            }
            else if(t[i] == (Character)'P'){
                command = "Print"; 
            }
            else if(t[i] == (Character)'R'){
                command = "Rename"; 
            }
            else if(t[i] == (Character)'V'){
                command = "Paste"; 
            }
        }
        System.out.println("The Command is " + command);
       
    }
    
    
    
//    public void toString(){
//        
//
//                
//               
//    }
//    
    
//    public String printCodeInNum(){
//        String command ="";
//        for(int i=0; i<=t.length; i++){
//            System.out.println(i + " ");
//            System.out.println("The Command is " + command);
//            if(t[i] == (Integer)0){
//                command = "Copy"; 
//            }
//            else if(t[i] == (Integer)1){
//                command = "Delete"; 
//            }
//            else if(t[i] == (Integer)2){
//                command = "Insert"; 
//            }
//            else if(t[i] == (Integer)3){
//                command = "Print"; 
//            }
//            else if(t[i] == (Integer)4){
//                command = "Rename"; 
//            }
//            else if(t[i] == (Integer)5){
//                command = "Paste"; 
//            }
//        }
//        return command;
//        }
//    
//    
//    
//    public String printCodeInChar(){
//        String command ="";
//        System.out.println("The Code is " );
//        for(int i=0; i<=t.length; i++){
//            System.out.print(t[i] + " ");
//            System.out.println("The Command is " + command);
//            if(t[i] == (Character)'C'){
//                command = "Copy"; 
//            }
//            else if(t[i] == (Character)'D'){
//                command = "Delete"; 
//            }
//            else if(t[i] == (Character)'I'){
//                command = "Insert"; 
//            }
//            else if(t[i] == (Character)'P'){
//                command = "Print"; 
//            }
//            else if(t[i] == (Character)'R'){
//                command = "Rename"; 
//            }
//            else if(t[i] == (Character)'V'){
//                command = "Paste"; 
//            }
//        }
//        return command;
//    }
    
}
 
            