/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

/**
 *
 * @author Vinishaah Jeyabalan
 */
//Task 1

class Student{
    private String name;
    private int matricId;
    private int year;
    
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
}
public class Register {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student alexaObj = new Student();
        Student siriObj = new Student();
        Student omegaObj = new Student();
        Student betaObj = new Student();
        
        alexaObj.setName("Alexa");
        siriObj.setName("Siri");
        omegaObj.setName("Omega");
        betaObj.setName("Beta");
        
        alexaObj.setMatricId(1007);
        siriObj.setMatricId(5018);
        omegaObj.setMatricId(2019);
        betaObj.setMatricId(2371);
        
        alexaObj.setYear(2);
        siriObj.setYear(4);
        omegaObj.setYear(1);
        betaObj.setYear(3);
        
        System.out.println("Name | Matric Id  | Year");
        System.out.println(alexaObj.getName()    + "|  " + alexaObj.getMatricId()       + "      |   " + alexaObj.getYear() + "\n" +
                           siriObj.getName()    + " |  " + siriObj.getMatricId()       + "      |   " + siriObj.getYear() + "\n" +
                           omegaObj.getName()    + "|  " + omegaObj.getMatricId()       + "      |   " + omegaObj.getYear() + "\n" +
                           betaObj.getName()    + " |  " + betaObj.getMatricId()       + "      |   " + betaObj.getYear() + "\n");
        
        
    }
    
}
