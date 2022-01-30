/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
             URL u = new URL("http://www.fsktm.um.edu.my");
             URLConnection cnn = u.openConnection();
             InputStream stream = cnn.getInputStream();
             Scanner in = new Scanner(stream);
             
             PrintWriter p = new PrintWriter(new FileOutputStream("index.htm"));
             while(in.hasNextLine()) {
                 String line = in.nextLine() + "\n";
                 p.write(line);
             }
             p.close();
             
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
             
        // TODO code application logic here
    }
    
}
