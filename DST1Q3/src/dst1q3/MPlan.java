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
public class MPlan extends ISP {
    
    public MPlan(){
        super("MPlan");
    }
    
    public double priceM(int mbps, int gb){
        double priceM = (mbps*5.00 + gb*0.80);
        return priceM;
      
    }
    
}
