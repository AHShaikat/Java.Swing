package tutorial31to40;

import java.awt.Color;
import java.awt.Container;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tutorial37 extends JFrame {
     private JLabel label,userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginbutton,clearbutton;
    private Container c ;
    private Font f;
    tutorial37() 
   {
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(420,50,400,400);
        this.setTitle("new frame");
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
   
        label = new JLabel("Hello everyone welcome to the new frame");
        label.setBounds(50,50,250,50);
        c.add(label);
   }
}