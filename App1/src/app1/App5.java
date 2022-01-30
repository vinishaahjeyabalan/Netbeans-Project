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
class MMachine{
    
    //data
    protected String name = "Machine Type 1";
    
    public void start(){
        System.out.println("MMachine started...");
    }
    
    public void stop(){
        System.out.println("MMachine stopped...");
    }
    
    public void showInfo(){
        System.out.println("MMachine detail is: " + name);
    }
    
    public String toString(){
        //basic return of String 
        return name;
    }
}

class Car extends MMachine{
    // Car is child class of MMachine, likewise MMachine is the parent class of Car
    // Car is derived from MMachine
    // Car is MMachine
    // Car can inherit from MMachine
    
    public void wipeWindShield(){
        System.out.println("Wiping windshield");
    }
    
    @Override
     public void start(){          //this method overrides method in parent
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        super.stop(); 
//          System.out.println("Car stopped");
    }
    
    public void showInfo(){
        System.out.println("Car name is: " + name);
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

//    @Override
//    public void showInfo() {
//        super.showInfo(); 
//    }
     
    
}


public class App5 {

    /**
     * @param args the command line arguments
     * Inheritance
     * Method overriding
     */
    
    public static void main(String[] args) {
        MMachine mach0;
        new MMachine();
        MMachine mach1 = new MMachine();
        mach1.start();
        mach1.stop();
        mach1.toString();   //not giving output! I wanted to get only name from MMachine
        System.out.println(mach1.toString());
        
        System.out.println("\n");
        Car car1 = new Car();
        car1.wipeWindShield();
        car1.start();
        car1.stop();
        car1.showInfo();
        car1.toString();   //not giving output! I wanted to get only name from MMachine
        System.out.println(car1.toString());
        
    }
    
}

