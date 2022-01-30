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
// today lesson on constructor
// Constructor is actually like a special method which you run every time you
// create an instance/object of your class

class Machine{
    
    private String name;
    private int age;
    
    //so normally, you create data and method
    //formula to create a method
    // accessSpecifier (1)returnType (2)methodName((3)can have a few parameters here){}
    
    // formula to create a constructor,
    // (1) does not have a returnType, but has accessSpecifier
    // (2) name of constructor must copy exactly name of Class
    // (3) can have as many input parameters
    // example: public Machine(){}
    
    // can call an constructor within another constructor
    // example: public Machine()()
    // RULE(1): must be the first statement (meaning can only call 1 other constructor)
    // RULE(2): must call other constructor, cannot call/invoke itself
    // RULE(3): must only call a more complex constructor than itself
    
    public Machine(){   // a constructor without input parameter, the simplest base form
        
        // calling another constructor, must be the first statement!
        this("Zidane");
        System.out.println("Constructor 1 running!");
        
        //name = "Zidane";  
    }
    
    public Machine(String name){ // a constructor with 1 parameter type String
        
        // calling another constructor must be the first statement!
        this("Safawi", 10);
        this.name = name;
        //String name1 = "Zidane";
        System.out.println("Constructor 2 running! ");
    }
    
    public Machine(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor 3 running! ");
    }
    
}

public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Machine machine0;
        //new Machine();                    //also print output
        
        Machine machine1 = new Machine();   //new Machine(); is actually a constructor for class Machine
        Machine machine2 = new Machine("Zidane");
        Machine machine3 = new Machine("Safawi", 10);
    }
    
}
