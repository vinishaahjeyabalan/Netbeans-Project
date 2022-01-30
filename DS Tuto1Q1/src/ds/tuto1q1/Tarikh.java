/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.tuto1q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Tarikh {
    private int day;
    private int month;
    private int year;

    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Day: " + day + " Month: " + month + " Year: " + year + "\n" +
                "Date is : 0" + day + "/" + month + "/" + year; 
                
                
    }
    
    
    
}
