/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q3;

import java.util.Scanner;


/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DPlan a = new DPlan();
        MPlan b = new MPlan();
        System.out.println("Mbps : ");
        int mbps = s.nextInt();
        System.out.println("Gb : ");
        int gb = s.nextInt();
        
       
        a.plan(mbps,gb);
        System.out.println("Plan : DPlan with price RM: " + a.priceD(mbps, gb));
        System.out.println("Plan : MPlan with price RM: " + b.priceM(mbps, gb));
        if(a.priceD(mbps, gb) < b.priceM(mbps, gb)){
            System.out.println("DPlan is cheaper as compared to MPlan");
        }
        else if(a.priceD(mbps, gb) > b.priceM(mbps, gb)){
            System.out.println("DPlan is cheaper as compared to MPlan");
        }
        else{
            System.out.println("Both plan is same in price");
    }
        
        
                
                  
         
    }
    
}
