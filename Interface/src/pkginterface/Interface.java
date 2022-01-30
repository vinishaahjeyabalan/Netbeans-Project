/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sales = 310, pay =400;
        WeekEndDiscount a = new WeekEndDiscount(sales, pay);
        FirstDayOfYear b = new FirstDayOfYear(sales, pay);
        System.out.println("Original Price : " + sales);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
    
}
