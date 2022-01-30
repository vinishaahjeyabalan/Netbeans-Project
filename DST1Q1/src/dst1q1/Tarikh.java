/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Tarikh {
    private int day;
    private int month;
    private int year;
    
    public Tarikh(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
        
    }
    
    public String toString(){
        if(month > 12){
            return "Invalid month";
        }
        return String.format("%02d", day) + " /" + String.format("%02d", month) + " /" + year;
    }
    
    //Another way
//    public String toString(){
//        String str;
//        if(day >= 10){
//            str = day + " /";
//        }
//        else{
//            str = "0" + day + " /";
//        }
//        if(month >= 10){
//            str += month + " /" + year;
//        }
//        else{
//            str += "0" + month + " /" + year;
//        }
//        return str;
//    }    
    
}
