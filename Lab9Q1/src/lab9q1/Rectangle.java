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
public class Rectangle extends Shape{
    protected double width, height;
    
    public Rectangle(){
        super("Rectangle");
        input();
        compute();
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = s.nextDouble();
        System.out.print("Enter height: ");
        height = s.nextDouble();
    }
    
    public void compute(){
        this.perimeter = 2*(width + height);
        this.area = width*height;
    }
    
}
