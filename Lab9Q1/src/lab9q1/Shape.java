/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Shape {
    protected String name;
    protected double perimeter, area;

    public Shape(String name) {
        this.name = name;
    }
    
    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Name of shape: " + name +
                "\nPerimeter: " + String.format("%-6.2f", perimeter) +
                "\nArea: " + String.format("%-6.2f", area);
    }
    
    
    
}
