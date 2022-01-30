/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkreservationsystem;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Booking {
    
    String bookingId;
    String username;
    String parkSpace;
    String timeStart;    //timeslot format DD-MM-YY:HH
    String timeEnd;
    int duration;
    
    public Booking(String username, String parkSpace, String timeStart, int duration){
        this.username = username;
        this.parkSpace = parkSpace;
        this.timeStart = timeStart;
        this.duration = duration;
        this.timeEnd = getTimeEnd(timeStart, duration);
        Random r = new Random();
        this.bookingId = parkSpace+"-"+String.format("%4d", 1000+r.nextInt(8999));
    }
    
    private String getTimeEnd(String timeStart, int dur){
        String[] dateString = timeStart.split("-"); //date format HH-DD-MM-YY
        int[] date = new int[4];
        for(int i=0; i<4; i++){
            date[i] = Integer.parseInt(dateString[i]);
        }
        
        for(int i=0; i<dur; i++){
            date[0]++;
            if (date[0] == 24){
                date[0] = 0;
                date[1]++;
            }
        }
        String timeEnd = date[0]+"-"+date[1]+"-"+date[2]+"-"+date[3];
        return timeEnd;
    }
    
}
