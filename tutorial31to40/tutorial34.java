package tutorial31to40;

import java.awt.Color;
import java.awt.Container;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tutorial34 extends JFrame {
     private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginbutton,clearbutton;
    private Container c ;
    private Font f;
    tutorial34() 
   {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,50,400,300);
        this.setTitle("JPasswrodField Demo");
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
   
        f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
        
    userLabel = new JLabel("Username :");
    userLabel.setBounds(50,50,150,50); 
   userLabel.setFont(f);
    c.add(userLabel);
    
    tf = new JTextField();
    tf.setBounds(170,50,200,50);
    tf.setFont(f);
    c.add(tf);
     
    passLabel = new JLabel("Password :");
    passLabel.setBounds(50,120,150,50); 
   passLabel.setFont(f);
    c.add(userLabel);
    
    pf = new JPasswordField();
    pf.setBounds(170,50,200,50);
    pf.setFont(f);
    c.add(pf);
    
    loginbutton = new JButton("Login");
    loginbutton.setBounds(170,190,90,50);
    loginbutton.setFont(f);
    c.add(loginbutton);
    
   clearbutton = new JButton("clear");
    clearbutton.setBounds(170,190,90,50);
    clearbutton.setFont(f);
    c.add(clearbutton);
   }
    public static void main(String[] args) {
         tutorial34 frame =  new tutorial34();
        frame.setVisible(true);
    }
   }
   

