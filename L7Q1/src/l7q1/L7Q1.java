/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Write to the binary file
//        String path="course";
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course"));
            out.writeUTF("Course code Course Name\n");
            out.writeUTF("WXES1116    Programming I\n");
            out.writeUTF("WXES1115    Data Structure\n");
            out.writeUTF("WXES1110    Operating System\n");
            out.writeUTF("WXES1112    Computing Mathematics I\n ");
            out.close();
        } catch (IOException e) {
            System.out.println("Program with file output");
        }
        
        //Enter course code
        Scanner s=new Scanner(System.in);
        String courseCode=s.nextLine();
        String courseName="";
        
        //Read from binary file
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("course"));
            while(true) {
                String line=in.readUTF();
                if(line.substring(0,8).equals(courseCode)) {
                    courseName=line.substring(12);
                    break;
                }
            }
            System.out.println(courseName);
            in.close();
            } catch (FileNotFoundException e) {
                System.out.println("Course not found");
            } catch (IOException e) {
                System.out.println("IO Exception");
        }
        
        
    }
    
}
