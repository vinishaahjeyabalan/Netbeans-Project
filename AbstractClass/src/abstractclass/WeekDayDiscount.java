/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class WeekDayDiscount extends Discount {
    
    private final double rate = 0.3;
    private double sales;
    
    public WeekDayDiscount(double sales){
        this.sales = sales;
    }
    
    public double getDiscount(){
        return (1-rate)*sales;
    }
    
    public String toString(){
        return "Normal Price (discount 10%) : " + getNormalDiscount(sales) +
               "\nWeekday Price (discount 30%) : " + getDiscount();
        
    }
}
