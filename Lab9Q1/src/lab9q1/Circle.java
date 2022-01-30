/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q1;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Circle extends Shape{
    protected double diameter;
    
    public Circle(){
        super("Circle");
        input();
        compute();
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        diameter = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = Math.PI*diameter;
        this.area = Math.pow((diameter/2), 2);
    }
    
}
