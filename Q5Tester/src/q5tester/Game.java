/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q5tester;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Game {
    private String playerName;
   
   
    public Game(String playerName) {
        this.playerName = playerName;
        
    }
    
    public void move(){
        Random r=new Random();
        int score=0,temp;
        temp=r.nextInt(6)+1;
        score+=temp;
        
    }
    
    

   
    }

    
   
    
    
    


