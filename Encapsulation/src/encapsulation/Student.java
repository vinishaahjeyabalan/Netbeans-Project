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
public class Student {
    private String fullName;
    private String matric;
    
    public Student(){
        this.fullName = fullName;
        matric = "";
    }
    
    public Student(String fullName, String matric){
        this.fullName = fullName;
        this.matric = matric;
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
        return "Student: " + fullName + " (" + matric + ") ";
    }
    
}
