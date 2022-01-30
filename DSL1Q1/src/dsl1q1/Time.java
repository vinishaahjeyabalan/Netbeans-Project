/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Time {
    private int hour;
    private int minute;
    
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        
    }
    
    public void validity(){
        boolean valid = true;
        if(hour >=0 && hour <=23 && minute >=0 && minute <=59){
            valid = true;
            display();
        }
        else{
            valid = false;
            System.out.println("Hour: " + hour + " Minute: " + minute + " " + "Invalid time input");
        }     
    }
    
    public void display(){
        if(hour >=13 && hour<=23){
             System.out.println("Hour: " + hour + " Minute: " + minute + " " + (hour-12) + ":" + minute + " PM");
        }
        else if(hour==12){
            System.out.println("Hour: " + hour + " Minute: " + minute + " " + (hour) + ":" + minute + " PM");
        }
        else{
            System.out.println("Hour: " + hour + " Minute: " + minute + " " + (hour) + ":" + minute + " AM");
        }
    }
    
    //or
//    public void check(){
//        System.out.println("Hour: " + hour + " Minute: " + minute + " ");
//        if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60){
//            if(hour > 12){
//                System.out.print(hour - 12 + ": " + minute + " PM");
//            }
//            else{
//                System.out.println(hour + ": " + minute + " PM");
//            }
//        }
//        else{
//            System.out.print("Invelid time input");
//        }
//        System.out.println("");
//    }
        
    
}
