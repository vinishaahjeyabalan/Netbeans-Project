/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splitmethodexp;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class SplitMethodExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "vinishaah";
        System.out.println("split(String regex):");
        String array1[] = str.split("i");
        for(String temp : array1){
            System.out.println(temp);
        }
        
        System.out.println("split(String regex, int limit)with limit=2:");
        String array2[] = str.split("/",2);
        for(String temp: array2){
            System.out.println(temp);
        }
        
        System.out.println("split(String regex, int limit)with limit=0:");
        String array3[] = str.split("/",0);
        for(String temp: array3){
            System.out.println(temp);
        }
        
        System.out.println("split(String regex, int limit)with limit=-5:");
        String array4[] = str.split("/",-5);
        for(String temp: array4){
            System.out.println(temp);
        }
        
        
        
        
        
        
        
        
        
//        String CSV = "Google,Apple,Microsoft"; 
//        String[] values = CSV.split(","); 
//        System.out.println(Arrays.toString(values));
//        
//                  //or
        String CSV = "Google, Apple, Microsoft"; 
        String[] values = CSV.split("\\s*,\\s*"); 
        System.out.println(Arrays.toString(values));
        
        
        
        
        
        
        
//        String languages = "Java,JavaScript,C++,Python,Ruby,Scala";
//
//        // splitting String by comma, it will return array
//        String[] array = languages.split(",");
//
//        // if you want, you can convert array to ArraList as shown below
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
//
//        // let's print input and output
//        System.out.println("comma separated String: " + languages);
//        System.out.println("array of String: " + Arrays.toString(array));
//        System.out.println("list of String: " + list);



        
        
        // TODO code application logic here
    }
    
}
