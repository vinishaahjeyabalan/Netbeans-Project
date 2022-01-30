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
public class DST1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] name = {"iPhone", "Samsung", "Nokia", "LG"};
        int[] price = {2400, 2200, 1400, 1800};
        
    
    SmartPhone[] a = new SmartPhone[4];
    for(int i=0; i<a.length; i++){
        a[i] = new SmartPhone(name[i], price[i]);
    }
    
        System.out.println("List of Smart Phone: ");
        for(int i=0; i<a.length; i++){
        System.out.print(a[i].toString());
        }
        
        int temp;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(price[i] > price[j]){
                    temp = price[i];
                    price[i] = price[j];
                    price[j] = temp;
                    
                }
            }
        }
    }
    
}
