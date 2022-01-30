/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdatatypes;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class AbstractDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array Tester
        ArrayLog<Integer> a = new ArrayLog<>(10);
        a.insert(20);
        a.insert(15);
        a.insert(13);
        System.out.println("Log Size: " + a.size());
        System.out.println(a.toString());
        
        int num = 12;
        if(a.search(num)){
            System.out.println("Log contains " + num);
        }
        else{
            System.out.println("Log does not contain " + num);
        }
        
        //Array Tester2
        ArrayLog<String> b = new ArrayLog<>(5);
        b.insert("James");
        b.insert("Ahmad");
        b.insert("Siti");
        b.insert("Ramesh");
        b.insert("John");
        b.insert("Abdullah");
        System.out.println(b.toString());
        
        String name = "Siti";
        if(b.search(name)){
            System.out.println("Log contains " + name);
        }
        else{
            System.out.println("Log does not contain " + name);
        }
        b.clear();
        System.out.println("Log Size " + b.size());
        
        
        //
        //ArrayList Tester
        ArrayListLog<Integer> c = new ArrayListLog<>(10);
        c.insert(20);
        c.insert(15);
        c.insert(13);
        System.out.println("Log Size: " + c.size());
        System.out.println(c.toString());
        
        int num1 = 12;
        if(c.search(num)){
            System.out.println("Log contains " + num1);
        }
        else{
            System.out.println("Log does not contain " + num1);
        }
        
        //ArrayList Tester2
        ArrayListLog<String> d = new ArrayListLog<>(5);
        d.insert("James");
        d.insert("Ahmad");
        d.insert("Siti");
        d.insert("Ramesh");
        d.insert("John");
        d.insert("Abdullah");
        System.out.println(d.toString());
        
        String name1 = "Siti";
        if(b.search(name1)){
            System.out.println("Log contains " + name1);
        }
        else{
            System.out.println("Log does not contain " + name1);
        }
        d.clear();
        System.out.println("Log Size " + d.size());
        
    }
}

    

