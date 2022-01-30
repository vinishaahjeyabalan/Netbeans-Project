/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Polynomial {
    private int degree;
    private double[] coefficient;
    
    public Polynomial(int degree, double[] coefficient){
        this.degree = degree;
        this.coefficient = coefficient;
    }
    
    public void calculation(double x){
        String str="";
        System.out.print("The polynomial is ");
        //while(degree!=0){
        for(int i=0; i<coefficient.length; i++){
            str += coefficient[i] + "x^" + degree ;
            degree--;
        }
        //}
        System.out.println(str);
        double ans =0;
        System.out.println("when x = " + x);
        //while(degree!=0){
        for(int i=0; i<coefficient.length; i++){
            ans += coefficient[i]*Math.pow(x, degree);
            degree--;
        }
       // }
        System.out.println(str + " = " + ans);
        
    }
    
}
