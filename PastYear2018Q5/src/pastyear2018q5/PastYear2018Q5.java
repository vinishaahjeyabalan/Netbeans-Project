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
public class PastYear2018Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Apple ap1 = new Apple(8, "Apple", "Red");
        Apple ap2 = new Apple(11, "Apple", "Green");
        Watermelon wm1 = new Watermelon(7.6, "Watermelon", "Local");
        Watermelon wm2 = new Watermelon(4, "Watermelon", "Imported");
        display1(ap1);
        display1(ap2);
        display1(wm1);
        display1(wm2);
        
        Fruit f;
        f= cheapest(ap1, ap2);
        f= cheapest(f, wm1);
        f= cheapest(f, wm2);
        System.out.println("The cheapest item is " + f.toString());
        
    }
    
    public static Fruit cheapest(Fruit f1, Fruit f2) {
        if (f1.totalPrice()>=f2.totalPrice()) {
            return f2;
        }
        else {
            return f1;
        }
    }
    
    public static void display1(Fruit f) {
        System.out.println(f.toString());
    }
        
        // TODO code application logic here
    }
    

