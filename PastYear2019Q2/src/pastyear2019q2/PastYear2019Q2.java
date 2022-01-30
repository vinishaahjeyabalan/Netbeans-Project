/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear2019q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class PastYear2019Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
//        try{
//            PrintWriter pw = new PrintWriter(new FileOutputStream("myAmbition.txt"));
//            pw.println("Living in the modern world, a person really");
//            pw.println("needs to know what he wants to do. In order to lead");
//            pw.println("a meaningful and colorful life, everyone needs");
//            pw.println("an ambotion. If one does not have an ambition,");
//            pw.println("he will be like a ship sailing on the");
//            pw.println("wide sea blindly. That is why I have made up my");
//            pw.println("mind to become a reporter since my childhood.");
//            
//            pw.close();
//        } catch (IOException e){
//            System.out.println("Problem with file output");}
//        
//        try{  
//            Scanner sc = new Scanner(new FileInputStream("myAmbition.txt"));
//            int senSize=0, wordSize=0;
//            String str = "";
//            int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
//            System.out.print("The essay is : ");
//            while(sc.hasNextLine()){
//                System.out.print("\n"+sc.nextLine());
//                
//                
//                String[] sentences = str.split(".\\s");
//                senSize = sentences.length;
//               
//                String[] words = str.split("\\s");
//                wordSize = words.length;
//                
//                String[] letters = str.split("");
//                
//            }
//            
//             
//             System.out.println("The number of sentence : "+str.split("\\s*.\\s*").length);
//             System.out.println("\nNumber of sentences : " + senSize);
//             System.out.println("Number of words : " + wordSize);
//             
//            sc.close();
//        } catch (FileNotFoundException e){
//            System.out.println("File not found");}










       String input = "";
       int line = 0, character = 0, word = 0, cnt;
       int freq1=0,freq2=0,freq3=0,freq4=0,freq5=0,freq6=0,freq7=0,freq8=0,freq9=0,freq10=0,freq11=0,freq12=0,freq13=0,freq14=0,freq15=0,freq16=0,freq17=0,freq18=0,freq19=0,freq20=0,freq21=0,freq22=0,freq23=0,freq24=0,freq25=0,freq26=0;
       try {
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
        
           System.out.println("The essay is: ");
           while(sc.hasNextLine()){
            input = sc.nextLine();
            System.out.println(input);
            line++;
              character+=input.length();
              
          for(int i =0;i<input.length();i++){
              input.charAt(i);
              
              if(input.charAt(i) == ' '){
                  word++;
              }
              
              if(input.charAt(i) == 'A' || input.charAt(i) == 'a'){
                  freq1++;
              }
              if(input.charAt(i) == 'B'|| input.charAt(i) == 'b'){
                  freq2++;
              }
              if(input.charAt(i) == 'C'|| input.charAt(i) == 'c'){
                  freq3++;
              }
              if(input.charAt(i) == 'D'|| input.charAt(i) == 'd'){
                  freq4++;
              }
              if(input.charAt(i) == 'E'|| input.charAt(i) == 'e'){
                  freq5++;
              }
              if(input.charAt(i) == 'F'|| input.charAt(i) == 'f'){
                  freq6++;
              }
              if(input.charAt(i) == 'G'|| input.charAt(i) == 'g'){
                  freq7++;
              }
              if(input.charAt(i) == 'H'|| input.charAt(i) == 'h'){
                  freq8++;
              }
              if(input.charAt(i) == 'I'|| input.charAt(i) == 'i'){
                  freq9++;
              }
              if(input.charAt(i) == 'J'|| input.charAt(i) == 'j'){
                  freq10++;
              }
              if(input.charAt(i) == 'K'|| input.charAt(i) == 'k'){
                  freq11++;
              }
              if(input.charAt(i) == 'L'|| input.charAt(i) == 'l'){
                  freq12++;
              }
              if(input.charAt(i) == 'M'|| input.charAt(i) == 'm'){
                  freq13++;
              }
              if(input.charAt(i) == 'N'|| input.charAt(i) == 'n'){
                  freq14++;
              }
              if(input.charAt(i) == 'O'|| input.charAt(i) == 'o'){
                  freq15++;
              }
              if(input.charAt(i) == 'P'|| input.charAt(i) == 'p'){
                  freq16++;
              }
              if(input.charAt(i) == 'Q'|| input.charAt(i) == 'q'){
                  freq17++;
              }
              if(input.charAt(i) == 'R'|| input.charAt(i) == 'r'){
                  freq18++;
              }
              if(input.charAt(i) == 'S'|| input.charAt(i) == 's'){
                  freq19++;
              }
              if(input.charAt(i) == 'T'|| input.charAt(i) == 't'){
                  freq20++;
              }
              if(input.charAt(i) == 'U'|| input.charAt(i) == 'u'){
                  freq21++;
              }
              if(input.charAt(i) == 'V'|| input.charAt(i) == 'v'){
                  freq22++;
              }
              if(input.charAt(i) == 'W'|| input.charAt(i) == 'w'){
                  freq23++;
              }
             
              if(input.charAt(i) == 'X'|| input.charAt(i) == 'x'){
                  freq24++;
              }
              if(input.charAt(i) == 'Y'|| input.charAt(i) == 'y'){
                  freq25++;
              }
              if(input.charAt(i) == 'Z'|| input.charAt(i) == 'z'){
                  freq26++;
              }
          }
        }
                
                  System.out.println(input.length());
                  System.out.println("Number of line(s) in the text file: " + line);
                  System.out.println("Number of word(s) in the text file: " + (word+1));
                  System.out.println(" A : " +freq1 + " B : " +freq2 +" C : " +freq3 +" D : " +freq4 +" E : " +freq5 +" F : " +freq6 +" G : " +freq7 +" H : " +freq8 +" I : " +freq9 +" J : " +freq10 +" K : " +freq11 +" L : " +freq12 +" M : " +freq13 +" N : " +freq14 +" O : " +freq15 +" P : " +freq16 +" Q : " +freq17 +" R : " +freq18 +" S : " +freq19 +" T : " +freq20 +" U : " +freq21 +" V : " +freq22 +" W : " +freq23 +" X : " +freq24 +" Y : " +freq25 +" Z : " +freq26 );
        
        
        
        
        
        } catch (FileNotFoundException e) {
            System.out.println("File was not Found");
        }











    }
}
                        
                        
            
        
        // TODO code application logic here
    
  
