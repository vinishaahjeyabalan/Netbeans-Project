/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testerq3;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class WeightCalculator1 {
    private int age;
    private double height;
    


 public WeightCalculator1(int age, double height) {
        this.age = age;
        this.height = height;
    }
    
    public void displayage(){
        
        System.out.println("Age: " + age);
    }
    
    public void displayheight(){
       
        System.out.println("Height: " + height);
    }
    
    public void recommendWeight(){
        double recommendWeight=(height-100+age/10)*0.9; 
        System.out.printf("Recommend weight: %.2f ", + recommendWeight);
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
    
    
    
    

