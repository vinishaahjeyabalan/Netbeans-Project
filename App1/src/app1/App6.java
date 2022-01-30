/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app1;

/**
 *
 * @author Vinishaah Jeyabalan
 * Polymorphism = many shapes
 * Poly means you can use an object of child class anywhere
 * What is the difference between inheritance and polymorphism
 */

// create a class Tree, as a child class to Plant
class Plantt{
    
    public void grow(){
        System.out.println("Plant growing...");
    }  
}

class Tree extends Plantt{

    @Override
    public void grow() {
        //super.grow(); 
        System.out.println("Tree growing...");
    }
    
    public void shedLeaves(){
        System.out.println("Leaves shredding...");
    }  
}

public class App6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plantt plantt1 = new Plantt();    //no issue
        Tree tree1 = new Tree();          //no issue
        Tree tree2 = new Tree();
        
        Plantt plantt2 = tree2;
        //Plantt plantt2 = new Tree();         //something new today! trying to use child object as parent object
        //Tree tree2 = plantt2;
        plantt2.grow();
        
        tree1.shedLeaves();
        //plantt2.shedLeaves();           //shows that poly plantt2 can access only overriden methods!
        
    }
    
}
