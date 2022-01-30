/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //object without argumets
        Student a = new Student();
        a.setFullName("Ahmad");
        a.setMatric("WEK111");
        System.out.println(a.toString());
        
        //object with arguments
        Student b = new Student("Siti", "WEK222");
        System.out.println(b.toString());
        
        System.out.println("List of students matric number");
        System.out.println("1. " + a.getMatric());
        System.out.println("2. " + b.getMatric());
        
        //object in array
        String[] name = {"Ahmad", "Siti", "Thomas"};
        String[] matric = {"WEK111", "WEK222", "WEK333"};
        
        Student[] c = new Student[3];
        for(int i=0; i<c.length; i++){
            c[i] = new Student (name[i], matric[i]);
        }
        
        System.out.println("\nList of students: ");
        for(int i=0; i<c.length; i++){
            System.out.println(c[i].toString());
        }
        
        System.out.println("List of students matric number: ");
        for(int i=0; i<c.length; i++){
            System.out.println(i+1 + ". " + c[i].getMatric());
        }
        
        
    }
    
}
