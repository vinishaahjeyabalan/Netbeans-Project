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
public class Test1<T> {
    private T t;
    
    public Test1(){
    this.t = t;
}    

public void set(T t){
    this.t = t;
}

public T get(){
    return t;
}

public String toString(){
    return t + "";
}

    
//    public Test1(T t, U[] u){
//        this.t = t;
//        this.u = u;
//    }
//    
//    public void setT(T t){
//        this.t = t;
//    }
//    
//    public T getT(){
//        return t;
//    }
//    
//    public void setU(U[] U){
//        this.u = u;
//    }
//    
//     public U[] getU(){
//        return u;
//    }
//     
//     public String toString(){
//         String a = "";
//         a = "T is " + a + "\n";
//         for(U value : u){
//             a += value + " ";
//         }
//         return a;
         
     




}
