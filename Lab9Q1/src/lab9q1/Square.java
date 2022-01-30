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
public class Square extends Shape {
    protected double length;
    
    public Square(){
        super("Square");
        input();
        compute();
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 4*length;
        this.area = length*length;
    }
    
}
