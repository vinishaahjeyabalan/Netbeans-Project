/*
 * in every .java file, you can have only 1 public class
 * and for each public class, you need to declare 1 one main method
 * in every .java file, you can have non public classes
 * definition of a class - a template for creating objects
 * definition of an object - 'everything can be an object'
 */
package ds2020;

/**
 *
 * @author Vinishaah Jeyabalan
 */

// declare class1 here, make sure name of class starts with Capital letter (Good programming habit)
class Person{
    // classes can contain 2 things: (1) data, (2) methods (subroutine/behaviour)
    // data
    String name;
    //Integer age;  // age is defined as an object of class Integer
    int age;        // age is defined as an object type int
    String breakfast;
    
    //method
    void speak(){   // void means the method does not require a return type
        //System.out.println("Hello");
        
        for(int i=0; i<1; i++){
            System.out.println("My name is " + name + " and I am " + age + " years old");
        }
        
        // ???? it means I'm not returning any data
    }
    
    void eat(){
        System.out.println("I had " + breakfast);
    }
    
    int calculateYearToMarry(){
        int yearsToMarry = 23 - age;
        System.out.println("Years to marry for " + name + " is " + yearsToMarry);
        
        return yearsToMarry;
    }
    
    int calculateYearsToHaveChildren(int yearsToMarry){
        int haveChild = yearsToMarry + 2;
        System.out.println("Years to have child for " + name + " is " + haveChild);
        
        return haveChild;
                
                
    }  
}
// declare class2 here
// declare class3 here

public class DS2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person(); // create a new object for class Person
        person1.name = "Vini";
        person1.age = 20;
        person1.breakfast = "chapati";
        
        Person person2 = new Person(); // create a new object for class Person
        person2.name = "Ain";
        person2.age = 18;
        person2.breakfast = "nasi lemak";
        
//        System.out.println(person1); // pointing only the memory location or address of where object person1 is stored in physical hard disk without fetching the data
//        System.out.println("Hello " + person1.name);
//        System.out.println("Age : " + person1.age);
//        System.out.println("Hello " + person2.name);
//        System.out.println("Age : " + person2.age);
        
        person1.speak();
        person1.eat();
        
        int a = person1.calculateYearToMarry();
        int b = person1.calculateYearsToHaveChildren(a);
        System.out.println("Years left to have child for " + person1.name + " is " + b);
         
        person2.speak();
        person2.eat();
        
        person2.calculateYearToMarry();
        System.out.println("Ain has " + person2.calculateYearToMarry() + " years to marry");
        int c = person2.calculateYearToMarry();
        int d = person2.calculateYearsToHaveChildren(c);
        System.out.println("Years left to have child for " + person2.name + " is " + d);
         
        
    }
    
}
