/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2q3;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maximum(42, 15, 58);
        maximum(12.45, 41.28, 19.82);
        
    }
    
    public static<T extends Comparable<T>> void maximum(T a, T b, T c){
        Integer ans=0;
        System.out.println("\nThe maximum of " + a + " " + b + " " + c + " is " );
        if(((Integer)a).compareTo((Integer)b)>0 && ((Integer)a).compareTo((Integer)c)>0){
            System.out.print(a);
            //ans = (Integer)a;
        }
        else if(((Integer)b).compareTo((Integer)a)>0 && ((Integer)b).compareTo((Integer)c)>0){
            System.out.print(b);
            //ans = (Integer)a;
        }
        else if(((Integer)c).compareTo((Integer)b)>0 && ((Integer)c).compareTo((Integer)a)>0){
            System.out.print(c);
            //ans = (Integer)a;
        }
        else if(((Double)a).compareTo((Double)b)>0 && ((Double)a).compareTo((Double)c)>0){
            System.out.print(a);
        }
        else if(((Double)b).compareTo((Double)a)>0 && ((Double)b).compareTo((Double)c)>0){
            System.out.print(b);
        }
        else if(((Double)c).compareTo((Double)b)>0 && ((Double)c).compareTo((Double)a)>0){
            System.out.print(c);
        }
        
    }
    
}
