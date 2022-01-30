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
public class Rebate extends CreditCard{

    public Rebate(String cardholderName, int cardNum, String cardType) {
        super(cardholderName, cardNum, cardType);
    }
    
    public double getReward(int amount){
        String type="";
        double cashreward;
        if(type.equals("fuel")){
            cashreward = (8/100)*amount;
        }
        else if(type.equals("utility")){
            cashreward = (5/100)*amount;
        }
        else if(type.equals("grocery")){
            cashreward = (2/100)*amount;
        }
        else{
            cashreward = (0.2/100)*amount;
        }
        return cashreward;
    }
    
    
}
