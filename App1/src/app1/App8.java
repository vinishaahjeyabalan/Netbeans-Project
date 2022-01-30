/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 * Upcasting and Downcasting
 * Important for generics
 */

class Machine2{
     public void start(){
        System.out.println("Machine started...");
     }   
     
     public void stop(){
         System.out.println("Machine stopped!!!");
     }
}

class Camera extends Machine2{
    
    @Override
    public void start(){
        System.out.println("Camera started...");
    }
    
    public void snap(){
        System.out.println("Photo taken...");
    }
}
public class App8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Machine2 mach1 = new Machine2();
        Camera cam1 = new Camera();
        System.out.println("normal output---------------");
        mach1.start();
        cam1.start();
        cam1.snap();
        
        System.out.println("Upcasting output----------------");
        // Upcasting example
        //Machine2 mach2 = new Camera();     //something new today! similar to polymorphism
        Machine2 mach2 = cam1;             //line 28 means the same as line 29
        mach2.start();
        //mach2.snap();                     //not allowed because method not overriden in child
        
        System.out.println("Downcasting output------------------");
        //Downcasting 
        //Machine2 mach3 = new Machine2();         //mach3 is object of parent, no big deal
        Machine2 mach3 = new Camera();            //mach3 is object of child
        //Camera cam3 = (Camera)new Machine2();    //another way to downcast
        Camera cam2 = (Camera) mach3;          //casting allows 'downcasting'
        cam2.start();                             //method overidden
        cam2.snap();
        cam2.stop();                              //method not overidden
}
}
