/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q3;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class Course {
    private String courseCode;
    private String courseName;
    private int creditHrs;
    private char grade;

    public Course(String courseCode, String courseName, int creditHrs, char grade) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHrs = creditHrs;
        this.grade = grade;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHrs(int creditHrs) {
        this.creditHrs = creditHrs;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHrs() {
        return creditHrs;
    }

    public char getGrade() {
        return grade;
    }
    
    public int point(){
        int point=0;
        switch(grade){
            case 'A':{
                point = 4;
                break;
            }
            case 'B':{
                point = 3;
                break;
            }
            case 'C':{
                point = 2;
                break;
            }
            case 'D':{
                point = 1;
                break;
            }
            case 'F':{
                point = 0;
                break;
            }
        }
        return point;
    }

//    @Override
//    public String toString() {
//        return 
//    }
    
    
    
    
}
