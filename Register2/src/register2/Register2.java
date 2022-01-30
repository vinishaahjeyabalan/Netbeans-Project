/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
//Task 2
class Student{
    private String name;
    private int matricId;
    private int year;
    
    public Student(String name, int matricId, int year){
        this.name = name;
        this.matricId = matricId;
        this.year = year;
        
    }
    
    public void setName(String name){
         this.name = name;
        
    }
    
    public String getName(){
       
        return name;
    }
    
    public void setMatricId(int matricId){
         this.matricId = matricId;
        
    }
    
    public int getMatricId(){
       
        return matricId;
    }
    
    public void setYear(int year){
         this.year = year;
        
    }
    
    public int getYear(){
       
        return year;
    }
    
    public String showInfo(){
        return name + "| " + matricId + "           | " + year;
                
                
                
    }
}

public class Register2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Student alexaObj = new Student("Alexa  ", 1007, 2);
        Student siriObj = new Student("Siri ", 5018, 4);
        Student omegaObj = new Student("Omega  ", 2019, 1);
        Student betaObj = new Student("Beta   ", 2371, 3);
        
        //(e) 
        siriObj.setName("Sirius ");
        omegaObj.setMatricId(2020);
        betaObj.setYear(4);
        
        System.out.println("Name   | Matric Id	| Year");
        System.out.println(alexaObj.showInfo());
        System.out.println(siriObj.showInfo());
        System.out.println(omegaObj.showInfo());
        System.out.println(betaObj.showInfo());
        
        
        
        //(b) In task 1, no showInfo() method is used to list down all the data which are name, matricId and year. 
        //    So, the programmer need to print each and every data for each object manually because there is no method created and assigned 
        //    to print the data by calling them. Whereas, in task 2, there is a method showInfo() created by which the programmer can invoke the
        //    method in order to print each and every data of each object. By this, repeating lines of codes can be avoided and reduced.
        
        //(c) main class can still access the constructors if no access specifier stated. 
        //    but it is a good programming habit to put access specifier.
        //    But private access specifier cannot be accessed out of its class.
        
        //(d) set methods are not required if want to set in constructor. But set method is
        //    needed if the data that has been set in constructor is needed to be changed. For example 
        //    if the year wanted to be changed but not the name and matricid, then setYear() method should be used.

                           
    }
    
}
