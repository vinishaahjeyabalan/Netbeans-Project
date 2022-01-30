/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2018q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Watermelon extends Fruit {
    private double weight;
    
    public Watermelon(double weight, String name, String type){
        super(name, type);
        this.weight = weight;
    }
    
    public double totalPrice(){
        if(type.equals("Local")){
            if(weight>5){
                return 1.65*weight;
            }
            else if(weight>=2){
                return 2.25*weight;
            }
        }
        else if(type.equals("Imported")){
            if(weight>5){
                return 3.15*weight;
            }
            else{
                return 3.75*weight;
            }
        }
        else{
            return 0;
        }
        return 0;
    }
    
    public String toString(){
        return super.toString() + " - " + weight + "kg = RM " + totalPrice();
    }
}
    
    

