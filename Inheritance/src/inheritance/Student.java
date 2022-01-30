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
public class Student extends Person {
    private String matric;
    //private String nationality = "Foreigner";
    
    public Student(/*String typeOfPerson,*/ String fullName, String matric){
        super("Student");
        this.fullName = fullName;
        this.matric = matric;
        nationality = "Foreigners";
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public void setMatric(String matric){
        this.matric = matric;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public String getMatric(){
        return matric;
    }
    
    public String toString(){
        return super.toString() + "Student: " + fullName + " (" + matric + ")";
    }
    
    public void printNationality(){
        System.out.println(super.nationality); //why it prints Foreigners instead of Malaysian
        System.out.println(nationality);
    }
    
   
    
}
