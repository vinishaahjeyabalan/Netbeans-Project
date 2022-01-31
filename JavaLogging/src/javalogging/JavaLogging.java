/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalogging;

import java.util.logging.Level;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class JavaLogging {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Log my_log = new Log("log.txt");
            my_log.logger.setLevel(Level.WARNING);
            my_log.logger.info("Info msg");
            my_log.logger.warning("warning msg");
            my_log.logger.severe("Severe msg");
            
        } catch (Exception e){
        // TODO code application logic here
    }
    
}
}
