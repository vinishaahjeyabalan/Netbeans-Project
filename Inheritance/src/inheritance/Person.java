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
public class Person {
    private String typeOfPerson;
    protected String fullName;
    protected String nationality = "Malaysian";
    
    public Person(String typeOfPerson){    //try to replace the parameter with typerofpersonn or etc.
        this.typeOfPerson = typeOfPerson;
    }
    
    public void setTypeOfPerson(String typeOfPerson){
        this.typeOfPerson = typeOfPerson;
    }
    
    public String getTypeOfPerson(){
        return typeOfPerson;
    }
    
    public String toString(){
        return "Type of Person: " + typeOfPerson + "\n";
    }
    
     
    
    
    
}
