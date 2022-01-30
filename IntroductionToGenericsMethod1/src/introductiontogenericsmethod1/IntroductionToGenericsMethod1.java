/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductiontogenericsmethod1;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class IntroductionToGenericsMethod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pair1<Integer, String> p1 = new Pair1<>(1, "apple");
        Pair1<Integer, String> p2 = new Pair1<>(1, "apple");
        boolean same = compare(p1, p2);
        System.out.println(same);
        
        
            
        
    }



    
    public static <K, V> boolean compare(Pair1<K, V> p1, Pair1<K, V> p2){
            return p1.getKey()== p2.getKey() && p1.getKey().equals(p2.getKey());
        }
}
    

