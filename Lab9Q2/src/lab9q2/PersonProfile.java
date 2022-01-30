/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q2;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PersonProfile {
    protected String name, gender, dateOfBirth;

    public PersonProfile(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString(){
        return "Name: " + name +
                "\nGender: " + gender +
                "\nDate of Birth: " + dateOfBirth;
    }
    
    
    
    
}
