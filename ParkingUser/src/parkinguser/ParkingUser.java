/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinguser;

import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Vinishaah Jeyabalan
 */
public class ParkingUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        User a = new User();
        a.register();
        a.login();
    }
}
    
    class User{
        private String username;
        private String email;
        private String password;
        private boolean login;
        private boolean register;
    
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    
    }
    
     public User(){
//        this.username = username;
//        this.email = email;
//        this.password = password;
    
    }
    
    public void register() throws FileNotFoundException{
        try{
            PrintWriter p = new PrintWriter (new FileOutputStream("userdata.txt",true));
//            String newUser = usernameText.getText();
//            String newPass = passwordText.getText();
             Scanner sc = new Scanner(System.in);
             String user = sc.nextLine();
             String email = sc.nextLine();
             while(!email.contains("@")){
                 System.out.println("Invalid email");
                 email = sc.nextLine();
             }
             String password = sc.nextLine();
            try{
                Scanner s = new Scanner(new FileInputStream("userdata.txt"));
                register = false;
                while(s.hasNextLine()){
                if(user.equals(s.nextLine())){
                    if(email.equals(s.nextLine())){
                         if(password.equals(s.nextLine())){
                             System.out.println("Registration failed. Try with different username and email.");
//                           success.setText("Login sucessful!");
                             register = true;
                             break;
                         }
                    }
                }
            }
            s.close();
            if(register == false){
                System.out.println("Registration successful ");
//                success.setText("Wrong!");
            }
        }catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
              
            p.println(user);
            p.println(email);
            p.println(password + "\n");
            p.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }

    public void login() {
//        String user = usernameText.getText();
//        String password = passwordText.getText();
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String email = sc.nextLine();
         while(!email.contains("@")){
                 System.out.println("Invalid email");
                 email = sc.nextLine();
             }
        String password = sc.nextLine();
        
        try{
            Scanner s = new Scanner(new FileInputStream("userdata.txt"));
            login = false;
            while(s.hasNextLine()){
                if(user.equals(s.nextLine())){
                    if(email.equals(s.nextLine())){
                         if(password.equals(s.nextLine())){
                             System.out.println("Login successful");
//                           success.setText("Login sucessful!");
                             login = true;
                             break;
                         }
                    }
                }
            }
            s.close();
            if(login == false){
                System.out.println("Wrong username or password");
//                success.setText("Wrong!");
            }
        }catch(FileNotFoundException ex){
            System.out.println("File Not Found");
        }
    }
    
    public boolean getLogin(){
        return login;
    }
    
    public boolean isRegistered(){
        return register;
    }
    
    
    }
    

