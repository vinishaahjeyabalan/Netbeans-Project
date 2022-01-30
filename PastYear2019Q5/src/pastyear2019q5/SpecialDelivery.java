/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SpecialDelivery extends Delivery {
    private boolean weekendDelivery;
    private boolean nighttimeDelivery; 

    public SpecialDelivery(String sender, String recipient, double weight, boolean weekendDelivery, boolean nighttimeDelivery){
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nighttimeDelivery = nighttimeDelivery;
    }
    
    public double totalCost(){
        double total=0;
        if(weekendDelivery){
        if(weight<=5){
            total = weight*2.80;
        }
        else if(weight>5 && weight<=20){
            total = 5*2.80 + (weight-5)*5.20;
        }
        else if(weight>20 && weight<=50){
            total = 5*2.80 + 15*5.20 + (weight-20)*7.00;
        }
        else if(weight>50){
            total = 5*2.80 + 15*5.20 + 30*7.00 + (weight-50)*8.60;
        }
        return total+50;
        }
        
        if(nighttimeDelivery){
        if(weight<=5){
            total = weight*2.80;
        }
        else if(weight>5 && weight<=20){
            total = 5*2.80 + (weight-5)*5.20;
        }
        else if(weight>20 && weight<=50){
            total = 5*2.80 + 15*5.20 + (weight-20)*7.00;
        }
        else if(weight>50){
            total = 5*2.80 + 15*5.20 + 30*7.00 + (weight-50)*8.60;
        }
       return total+(total*0.2);
        }
        
        return 0;
    }

    @Override
    public String toString() {
        return  "From: " + sender +
               " To: " + recipient +
               "\nWeight of Package: " + weight + "kg" +
               "\nShipping Cost: RM" + totalCost() +
                 weekendDelivery +
                 nighttimeDelivery;
    }
    
    
    
}
