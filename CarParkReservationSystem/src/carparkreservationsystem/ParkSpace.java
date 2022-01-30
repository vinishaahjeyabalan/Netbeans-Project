/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkreservationsystem;

//import java.util.HashMap;
//import java.util.Map;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ParkSpace {
    String spaceId;
    public HashMap data = new HashMap();
    
    public ParkSpace(String id){
        spaceId = id;
    }
    
    public void addBooking(String timeslot, String code){
        data.put(timeslot, code);
    }
    
}
