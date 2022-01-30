/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9q2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Student extends PersonProfile{
    protected String filename;
    protected ArrayList<String> coursecode = new ArrayList<>();
    protected ArrayList<String> courseName = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<String> grade = new ArrayList<>();
    protected ArrayList<String> mark = new ArrayList<>();
    
    public Student(String name, String gender, String dateOfBirth, String filename){
        super(name, gender, dateOfBirth);
        this.filename = filename;
        
        
        try{
            Scanner s = new Scanner(new FileInputStream("course.txt"));
            while(s.hasNextLine()){
                coursecode.add(s.nextLine());
                courseName.add(s.nextLine());
                session.add(s.nextLine());
                semester.add(s.nextLine());
                
                int markCopy = Integer.parseInt(s.nextLine());
                mark.add(markCopy);
                grade.add(getGrade(markCopy));
            }
        }
    }
    
}
