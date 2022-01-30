/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 * Further into Generics - casting!
 */
public class App7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //datatypes for numerical?
        byte bytevalue = 20;
        short shortvalue = 55;
        int intvalue = 888;
        long longvalue = 23355;
        
        float floatvalue = 8834.3f;       //one way to declare float
        float floatvalue2 = (float)99.3;  // 'casting' value as float type
        double doublevalue = 32.4;
                
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MAX_VALUE);   //big
        System.out.println(Long.MAX_VALUE);   //huge
        System.out.println(Double.MAX_VALUE); //too huge
        
        intvalue = (int)longvalue;
        System.out.println(intvalue);    //cast RHS to match LHS
        
        doublevalue = intvalue;          //no problem to cast int to double
        
        intvalue = (int)floatvalue;
        System.out.println("Result: " + intvalue);
        
        bytevalue = (byte)128;     //byte only handles up to 127, 128>127 because byte has only 20 space allocated
    
    
    }
    
}
