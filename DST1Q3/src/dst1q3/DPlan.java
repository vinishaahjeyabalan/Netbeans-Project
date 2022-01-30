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
public class DPlan extends ISP {
    
    public DPlan(){
        super("DPlan");
    }
    
    public double priceD(int mbps, int gb){
        double priceD = (mbps*10.00 + gb*0.20);
        return priceD;
       
    }
    
    
}
