/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication132;

//import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class notepad {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);
        File fw = new File("account.txt");
        try{
            
            PrintWriter pw = new PrintWriter(fw);
            pw.println("hi");
//            String username = s.nextLine();
//            pw.println(username);
//            String password = s.nextLine();
//            pw.println(password);
            
            pw.close();
        } catch(IOException e){
            System.out.println("Registration Failed");
        }
        
        
        try{
            //FileReader fr = new FileReader("account.txt");
            //BufferedReader br = new BufferedReader(fr);
            Scanner sc = new Scanner(new FileInputStream("account.txt"));
            
            String str; 
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
            sc.close();
        } catch(IOException e){
            System.out.println("FileNot Found");
        }
    
    
    }
}
