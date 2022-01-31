/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3_vinishaah_17205417;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Q3_Vinishaah_17205417 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MyHashMap myHashMap = new MyHashMap();
        // New entry
        myHashMap.put("BruceW", "SE, 011-559 8900, 2018");
        myHashMap.put("bruce@gmail.com", "SE, 011-559 8900, 2018");
        myHashMap.put("DeanW", "AI, 017-449 2272, 2020");
        myHashMap.put("TonyS", "IS, 013-4546477, 2019");
        myHashMap.put("LaraC", "CST, 012-3453568, 2018");
        //myHashMap.put("17110022", "CST, 013-4509 722, 2018");
        System.out.println("");
        
        System.out.println("Retrieving student data: ");
        Entry e1 = myHashMap.get("DeanW");
        System.out.println("" + e1.getKey() + " : " + e1.getValue());
        Entry e2 = myHashMap.get("bruce@gmail.com");
        System.out.println("" + e2.getKey() + " : " + e2.getValue());
        System.out.println("");

        // Updating record
        myHashMap.put("BruceW", "CST, 011-559 8900, 2018");
        myHashMap.put("JeanG", "SE, 014-234 9906, 2020");

        System.out.println("Retrieving student data: ");
        Entry e3 = myHashMap.get("BruceW");
        System.out.println("" + e3.getKey() + " : " + e3.getValue());
        Entry e4 = myHashMap.get("JeanG");
        System.out.println("" + e4.getKey() + " : " + e4.getValue());
    }
    
}
