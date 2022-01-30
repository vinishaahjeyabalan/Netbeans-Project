/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6tester;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class BurgerStall {
    private static int totalsale;
    private int daysale, ID,a;
    
    public BurgerStall(int ID, int daysale){
        this.daysale = daysale;
        this.ID = ID;
        BurgerStall.totalsale += daysale;
    }
    
    public void sold(int a){
        this.daysale += a;
        BurgerStall.totalsale += a;
    }

    public static int getTotalsale() {
        return totalsale;
    }

    public int getDaysale() {
        return daysale;
    }

    public int getID() {
        return ID;
    }
    
    }
    

