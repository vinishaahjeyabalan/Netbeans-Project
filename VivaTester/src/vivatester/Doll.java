/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vivatester;

import java.util.Random;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Doll {
    Random r=new Random();
    private String name;
    private int hairColor;
    private int hairLength;
    private int haircolorchange;
    private int outfit;
    private int haircut;

    public Doll(String name,int hairColor, int hairLength, int outfit) {
        this.name = name;
        this.hairColor = hairColor;
        this.outfit = outfit;
        this.hairLength = hairLength;
    }
    
    public void displayname(String name){
        System.out.println("Name: " + name);
    }
    
    public void displayhaircolor(){
         System.out.println("Hair color: ");
        int hairColor=r.nextInt(3);
        if(hairColor==0){
                System.out.println("Red");
            }
            else if(hairColor==1){
                System.out.println("Blue");
            }
            else if(hairColor==2){
                System.out.println("Green");
            }
    }

   
    
    public void Haircolorchange(){
        int haircolorchange=r.nextInt(3);
        System.out.println("New hair color: ");
        while(haircolorchange==hairColor){
            haircolorchange=r.nextInt(3);
            if(haircolorchange==0){
                System.out.println("Red");
            }
            else if(haircolorchange==1){
                System.out.println("Blue");
            }
            else if(haircolorchange==2){
                System.out.println("Green");
            }
        }
        }
    
    public void Hairlength(){
        System.out.println("Hair length: ");
        int hairLength=r.nextInt(2);
        if(hairLength==0){
                System.out.println("Short");
            }
        else if(hairLength==1){
                System.out.println("Long");
            }
    
    }
        
    
      
        
    
    
    public void outfittype(){
        System.out.println("Outfit: ");
        int outfit=r.nextInt(3);
        if(outfit==0){
            System.out.println("The doll wears shirt");
        }
        if(outfit==1){
            System.out.println("The doll wears dress");
        }
        if(outfit==2){
            System.out.println("The doll wears jacket");
        }
        
    }
    
    public void Haircut(){
        haircut=r.nextInt(2);
        while(haircut==hairLength){
            haircut=r.nextInt(2);
            if(haircut==0){
                System.out.println("Short");
            }
            else if(haircut==1){
                System.out.println("Long");
            }
       
    }
    }

    
    public String toString() {
        return "Doll{" + "haircolorchange=" + haircolorchange + ", haircut=" + haircut + '}';
    }
    
    }

    
//    public void displayChar(){
//        System.out.println("The doll is pretty");
//        System.out.println("The doll has blue eyes");
//        
//    }

