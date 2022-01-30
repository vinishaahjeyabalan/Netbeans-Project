/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class FileIOExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
            //read from text file
            Scanner s = new Scanner(new FileInputStream("fruit.txt"));
            //write to text file
            PrintWriter p = new PrintWriter(new FileOutputStream("split.txt"));
            
            while(s.hasNextLine()){
                String str = s.nextLine();
                String[] list = str.split(",");
                String yellow = list[0];
                String red = list[3];
                
                //write to text file
                p.print(Arrays.toString(list));
                
            }
            s.close();
            p.close();
        } catch (IOException e){
            System.out.println("IO Exception");
        }
        
            
            
        }
        // TODO code application logic here
    }
    

