/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 */

// Static and Final

class Thing{
    public String name;  // name is a non-static instance or variable
    public static String description;  // this is how to declare static instances or variables
    public final static int LUCKYNUM = 7;
    
    public void showName(){  // non-static method
        System.out.println(name);
    }
    
    public static void showDescription(){  // static method
        System.out.println(description);
    }
}

public class App3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        
        thing1.name = "Box";
        thing2.name = "Pen";
        
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        
        Thing.description = "I am a thing!";
        System.out.println(Thing.description);
        
        //Thing.name = "Mouse"; // non-static variable cannot be referenced from static context
        
        thing1.showName();
        thing2.showName();
        Thing.showDescription();
        
        System.out.println(Math.PI);
        // try re-assigning Math.PI = 3; // Math is a class
        // Math.PI = 3; //  shows error because PI is a final static variable
        //Thing.LUCKYNUM = 10;
    }
    
}
