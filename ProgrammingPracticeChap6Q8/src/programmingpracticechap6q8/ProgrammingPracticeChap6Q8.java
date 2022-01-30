/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingpracticechap6q8;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ProgrammingPracticeChap6Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Miles        Kilometers    |    Kilometers        Miles");
        for(int m=1; m<=10; m++){
        System.out.println(m + "            " + mileToKilometer(m) + "    |    " + (m+10) + "            " + kilometerToMile(m+10));
        }
        // TODO code application logic here
    }
    
    public static double mileToKilometer(double mile){
        double mileToKilometer=mile*1.6;
        return mileToKilometer;
    }
    
    public static double kilometerToMile(double kilometer){
        double kilometerToMile=kilometer/1.6;
        return kilometerToMile;
    }
    
}
