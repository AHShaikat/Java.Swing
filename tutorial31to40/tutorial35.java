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

public class tutorial35 extends JFrame {
     private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginbutton,clearbutton;
    private Container c ;
    private Font f;
    tutorial35() 
   {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,500,500,400);
        this.setTitle("Login Demo");
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
   
        f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
        
    userLabel = new JLabel("Username :");
    userLabel.setBounds(50,50,150,50); 
   userLabel.setFont(f);
    c.add(userLabel);
    
    tf = new JTextField();
    tf.setBounds(170,150,200,50);
    tf.setFont(f);
    c.add(tf);
     
    passLabel = new JLabel("Password :");
    passLabel.setBounds(50,150,150,50); 
   passLabel.setFont(f);
    c.add(passLabel);
    
    pf = new JPasswordField();
    pf.setBounds(170,50,200,50);
    pf.setFont(f);
    c.add(pf);
    
    loginbutton = new JButton("Login");
    loginbutton.setBounds(170,250,90,50);
    loginbutton.setFont(f);
    c.add(loginbutton);
    
   clearbutton = new JButton("clear");
    clearbutton.setBounds(280,250,90,50);
    clearbutton.setFont(f);
    c.add(clearbutton);
    
    loginbutton.addActionListener(new ActionListener()
    {
           @Override
           public void actionPerformed(ActionEvent ae){
        String userName = tf.getText();
        String password = pf.getText();
        
        if( userName.equals("shaikat") ||  password.equals("789") )
        {
            JOptionPane.showMessageDialog(null, "you are successfully login in");
            dispose();
            tutorial36 frame = new tutorial36();
            frame.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null," invalid user");
        }
           
    
   }
    });
   }
         public static void main(String[] args) {
         tutorial35 frame =  new tutorial35();
        frame.setVisible(true);
    }
}


