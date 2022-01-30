/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2lab8q3;

import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class WeightCalculator {
    int age;
    double height;
    


public WeightCalculator(int theAge, double theHeight){
    age = theAge;
    height = theHeight;

}

public void input(){
    Scanner s = new Scanner (System.in);
    age = s.nextInt();
    System.out.println("Age: " + age);
    height = s.nextDouble();
    System.out.println("Height: " + height);
}

public double recommendWeight(){
    double recommendWeight = (height - 100 + age / 10) * 0.9;
    return recommendWeight;
}

}
