/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class DST2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] num = {3, 2, 5, 0, 1};
        Character[] letter = {'P', 'I', 'V', 'C', 'D'};
        SpecialEncoding<Integer> a = new SpecialEncoding<>(num);
        SpecialEncoding<Character> b = new SpecialEncoding<>(letter);
        a.printCode();
        //System.out.println(b.toString());
    
}
}
