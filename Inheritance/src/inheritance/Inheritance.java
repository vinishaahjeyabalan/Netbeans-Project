/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person a = new Person("Teacher");
        Student b = new Student("Ahmad", "WEK1111");
        System.out.println(a.getTypeOfPerson());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println("They are " + b.getTypeOfPerson());
        b.printNationality();
        
        
        
        //Polymorphism
//        Student c = new Student("Ahmad", "WEK111");
//        display(c);
//        System.out.println("They are " + getType(c));
//    }
//        
//        public static void display(Person c){
//            System.out.println(c.toString());
//        }
//
//        
//        public static String getType(Person c){
//            return c.getTypeOfPerson();
//        }
    }
}
    


