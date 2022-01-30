/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2016q5;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Point extends CreditCard{

    public Point(String cardholderName, int cardNum, String cardType) {
        super(cardholderName, cardNum, cardType);
    }
    
    public double getReward(int amount){
        String day="";
        double cashreward=0;
        int points;
        if(day.equals("Friday")){
            points = amount*1;
            cashreward = 2*(points/100);
        }
        if(day.equals("Saturday")){
            points = amount*1;
            cashreward = 3*(points/100);
        }
        if(day.equals("Sunday")){
            points = amount*1;
            cashreward = 4*(points/100);
        }
        return cashreward;
        
    }

    
    
    
    
}
