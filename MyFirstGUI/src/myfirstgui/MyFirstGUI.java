/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstgui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Vinishaah Jeyabalan
 */
class FirstFrame extends JFrame implements ActionListener{
    
        JButton b = new JButton("Mr. Black");       //creating button with name Mr. Black
        JPanel a = new JPanel();
        TextArea v = new TextArea();
    
        int c=0;
    
    public FirstFrame(){
        this.setSize(600, 500);
        this.setTitle("Vinishaah here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        a.setBackground(Color.red);
        a.setSize(700,400);
        a.setBounds(0,0,70,40);
        //a.setPreferredSize(new Dimension(70, 40));
        
        
        //this.add(a,BorderLayout.EAST);
        this.add(a);                                //adding jpanel inside jframe
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            
                a.setBackground(Color.black);
                if(c==0){
                    a.setBackground(Color.black);
                    c=1;
                    b.setText("Mr.Red");
                    
                    JFrame s = new JFrame();
                    s.setVisible(true);
                    s.setSize(600, 400);
                    //s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    s.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    
                    
                    s.add(v);
                    
                }else{
                    a.setBackground(Color.red);
                    c=0;
                    b.setText("Mr.Black");
                }
            }
          }
        );
        
        
        b.setBounds(50,0,100,30);
        b.setFont(new Font ("Candara", Font.BOLD, 25));         //font available in awt package
        a.add(b);                                               //add button into jpanel
        
        //to create the default layout for jpanel
        a.setLayout(null);
        //setBorderLine
        a.setBorder(BorderFactory.createLineBorder(Color.yellow));
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

//class FrameWithButton extends JFrame{
//    
//    static JButton b = new JButton("hey");
//    
//    public FrameWithButton(){
//       this.setSize(600, 500);
//       this.setTitle("Buttons Frame");
//       this.setLayout(new FlowLayout(FlowLayout.CENTER));
//       
//       //set my own layout
//       this.setLayout(null);
//       
//       //b = new JButton("Click Me");
//       b.setBounds(200, 200, 200, 60);
//       this.add(b);        //add the button created into the frame
//       
//       this.setVisible(true);
//    }  
//}

public class MyFirstGUI {

    public static void main(String[] args) {
        //frame 1
        new FirstFrame();
        //frame 2
//        new FrameWithButton();
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
    }
    
    //Component in Swing applications :
    
    //Component --> class
    //Eg: Buttons, Checkbox, TextFields, Labels...
    //javax.swing --> Component classes are available in jawax.swing
    //                where javax.swing components are purely platform independent.
    //java.awt --> Also contains Components which are platform dependent 
    //             where component creation logic is based on native code
            
    
    //Event Listeners in Swings
    
    //1. Event is an action performed on Component
    //2. When action performed, an object will be created with
    //   complete information of events and fires.
    //3. Event Listeners are interfaces
    //   eg: 1. ActionListener
    //       2. TextListener
    //       3. FocusListener
    //       4. MouseListener
    //4. Available in java.awt.event package
    //5. Implementing Listener interface in following ways
    //   eg: 1. Direct implementation using JFrame class
    //       2. Can be implemented by another class
    //       3. Can implements using inner class
    //       4. Using anonymous inner class
}
