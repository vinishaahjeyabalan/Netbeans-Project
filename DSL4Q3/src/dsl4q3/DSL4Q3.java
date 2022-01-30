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
public class DSL4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course p = new Course("WXX101", "Programming", 5, 'B');
        Course n = new Course("WXX201", "Networking", 4, 'C');
        Course o = new Course("WXX301", "Operating System", 3, 'A');
        LinkedList<String> list = new LinkedList<>();
        list.addNode("Course : " + p.getCourseCode() + " (" + p.getCourseName() + ") " + "- " + p.getCreditHrs() + " credit hours. Grade : " + p.getGrade() );
        list.addNode("Course : " + n.getCourseCode() + " (" + n.getCourseName() + ") " + "- " + n.getCreditHrs() + " credit hours. Grade : " + n.getGrade() );
        list.addNode("Course : " + o.getCourseCode() + " (" + o.getCourseName() + ") " + "- " + o.getCreditHrs() + " credit hours. Grade : " + o.getGrade() );
        System.out.print("The list consist of");
        list.showList();
        int totalPoint = p.point()+n.point()+o.point();
        System.out.println("\nTotal point is " + totalPoint);
        int totalCreditHrs = p.getCreditHrs()+n.getCreditHrs()+o.getCreditHrs();
        System.out.println("Total credit is " + totalCreditHrs);
        double gradePoint = totalPoint/totalCreditHrs;
        System.out.println("Grade point average is " + (double)gradePoint);
        
        
    }
    
}
