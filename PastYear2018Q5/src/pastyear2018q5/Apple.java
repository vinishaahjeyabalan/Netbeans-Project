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
public class Apple extends Fruit {
    private int quantity;

    public Apple(int quantity, String name, String type) {
        super(name, type);
        this.quantity = quantity;
    }
    
    public double totalPrice(){
        if(type.equals("Green")){
            return 1.20*quantity;
        }
        else if(type.equals("Red")){
            return 1.80*quantity;
        }
        else{
            return 0;
        }
    }

   public String toString(){
       return super.toString() + " - " + quantity + " = RM " + totalPrice();
   }
    
    
    
}
