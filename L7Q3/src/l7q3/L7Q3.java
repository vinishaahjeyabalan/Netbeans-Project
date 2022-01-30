/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q3;

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
public class L7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //read from text file
            Scanner s = new Scanner(new FileInputStream("original.txt"));
            
            
            //write text file
            PrintWriter p = new PrintWriter(new FileOutputStream("reverse.txt"));
            while(s.hasNextLine()) {
                String line = s.nextLine();
                
                //reverse using StringBuilder
                StringBuilder sb = new StringBuilder();
                sb.append(line);
                sb.reverse();
                String reversed = sb.toString();
                
                //write to text file
                p.print(reversed + "\n");
            }
            p.close();
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        // TODO code application logic here
    }
    
}
