/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontogenerics1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class IntroductionToGenerics1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1<Integer> a = new Test1<>();
        Test1<Double> b = new Test1<>();
        Test1<String> c = new Test1<>();
        a.set(100);
        b.set(20.16);
        c.set("Introdection to Generics");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        

//          String[] str = {"one", "two", "three"};
//          Test1<Integer, String> a = new Test1<>(100, str);
//          System.out.println(a.toString());
    }
    
}
