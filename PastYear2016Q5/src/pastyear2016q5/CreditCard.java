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
public class CreditCard {
    protected String cardholderName;
    protected int cardNum;
    private String cardType;
    protected int cashReward;

    public CreditCard(String cardholderName, int cardNum, String cardType) {
        this.cardholderName = cardholderName;
        this.cardNum = cardNum;
        this.cardType = cardType;
    }

    public int getCashReward() {
        return cashReward;
    }

    public void setCashReward(int cashReward) {
        this.cashReward = cashReward;
    }

    @Override
    public String toString() {
        return "Credit Card : " + cardholderName +
               "Card Type : " + cardType +
               "Total Cash Reward : " + cashReward;
               
    }
    
    
    
    
    
}
