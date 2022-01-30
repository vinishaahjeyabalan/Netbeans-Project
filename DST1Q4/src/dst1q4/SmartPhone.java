/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SmartPhone implements Comparable {
    String modelName;
    int modelPrice;
    
    public SmartPhone(String modelName, int modelPrice ){
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }
    
    public String toString(){
        return modelName + " (RM " + modelPrice + ") ";
    }
    
}
