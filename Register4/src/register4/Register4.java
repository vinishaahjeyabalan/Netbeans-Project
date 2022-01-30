/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register4;

/**
 *
 * @author Vinishaah Jeyabalan
 */
//Task 4

class Student{
    private String name;
    private int matricId;
    private int year;
    
    public Student(String name, int matricId, int year){
        this.name = name;
        this.matricId = matricId;
        this.year = year;
        
    }
    
    public Student(String name){
        this("No name", 9999, 1);
        this.name = name;
    }
    
    public Student(String name, int matricId){
        this("No name", 9999, 1);
        this.name = name;
        this.matricId = matricId;
    }
    
    public Student(){
        this("No name", 9999, 1);
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
        return name + " |  " + matricId + "         |   " + year;
                
    }
}

public class Register4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student alexaObj = new Student("Alexa  ", 1007, 2);
        Student siriusObj = new Student("Sirius ", 5018, 4);
        Student omegaObj = new Student("Omega  ", 2020, 1);
        Student betaObj = new Student("Beta   ", 2371, 4);
        Student thanosObj = new Student("Thanos ");
        Student ironmanObj = new Student("Ironman", 2012);
        Student nonameObj = new Student();
        
        System.out.println("Name    | Matric Id	| Year");
        System.out.println(alexaObj.showInfo());
        System.out.println(siriusObj.showInfo());
        System.out.println(omegaObj.showInfo());
        System.out.println(betaObj.showInfo());
        System.out.println(thanosObj.showInfo());
        System.out.println(ironmanObj.showInfo());
        System.out.println(nonameObj.showInfo());
        
    }
    
}
