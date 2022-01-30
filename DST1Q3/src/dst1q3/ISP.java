/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q3;



/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ISP {
    private String subscriptionPlan;
    
    public ISP(String subscriptionPlan){
        this.subscriptionPlan = subscriptionPlan;
        
    }
    
    public String subscriptionPlan(){
        return subscriptionPlan;
    }
    
    public void plan(int mbps, int gb){
        System.out.println(mbps + "Mbps Subscription and " + gb + "GB");
    }
    
}
