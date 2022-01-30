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

class Plant{
    String name;
    int age;
    
    public String getName(){  // creating a method to perform get name ONLY and nothing else
        return name;
    }
    
    public void setName(String newName){  // create setters for name, use "this" to emphasize it is from local class
        this.name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
}

class Robot{
    //Notes : Encapsulation using private parameters
    //because you are hiding the data inside a particular classes (e.g private name and private age
    //inside Robot class), not allowing them being directly accessed anywhere else (i.e other classes)
    
    //data
    private String name;
    private int age;
    
    //Notes : methods can have access specifier like public, private, protected
    //methods can have one return argument or an array of arguments
    //methods can carry many input parameters/arguments
    //methods can simplify data fetching using getters and setters
    
    public String getName(){    // creating a method to perform get name ONLY and nothing else
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setName(String newName){  // create setters for name, use "this" to emphasize it is from local class
        this.name = newName;
    }
    
    public void setAge(int newAge){
        this.age = newAge;
    }
        
    
    public void speak(String text){
        System.out.println(text);
    }
    
    public int jump(int height){
        //System.out.println("Jumping: " + height);
        return height;
    }
    
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + "km in " + direction + " direction");
    }
}
public class App1 {
    public static void main(String[] args) { //interfacing program, gui, user input comes under main method
        
        Robot robot1 = new Robot();
        robot1.speak("Hi, I am Vini");
        System.out.println("Jumping: " + robot1.jump(7));
        robot1.move("West", 15.7);
        String greeting = "Holla amigos!";
        robot1.speak(greeting);
        
        //robot1.name = "Robota";       // can omit this line with setters
        System.out.println("\n" + robot1.getName());
        robot1.setName("Robota");
        robot1.setAge(18);
        System.out.println(robot1.getName());
        System.out.println(robot1.getAge());
        
        Robot robot2 = new Robot();
        robot2.setName("Bobot");
        System.out.println(robot2.getName());
        
        Plant plant1 = new Plant();
        plant1.name = "Rose";
        plant1.setName("Daisy");
        System.out.println(plant1.name);
        System.out.println(plant1.getName());
        plant1.setAge(100);
        System.out.println(plant1.getAge());
    }
    // setter has this.name
}
