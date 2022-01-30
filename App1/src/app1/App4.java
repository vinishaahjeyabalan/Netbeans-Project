/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
class Frog{
    //declare data
    private int id;
    private String name;
    
    public Frog(int id, String name){
        this.id = id;
        this.name = name;    
    }
    
    public String toString(){
        //basic return of String
//        return id + " : " + name;
        
        //bit more advanced return of String using StringBuilder
//        StringBuilder ab = new StringBuilder();
//        ab.append(id).append(" : ").append(name);
//        return ab.toString();
        
        //example of returning String using String format
        return String.format("%-6d: %s", id, name);
        
    }
}
public class App4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frog frog1 = new Frog(777, "Freddy");
        Frog frog2 = new Frog(888, "Roger");
        
        System.out.println(frog1);
        System.out.println(frog2);
        
        System.out.println(frog1.toString());
        System.out.println(frog2.toString());
    }    
}
