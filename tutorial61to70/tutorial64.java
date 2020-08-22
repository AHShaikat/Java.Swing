package tutorial61to70;

import java.awt.Color;
import java.awt.Container;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tutorial64 extends JFrame {
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JTextArea ta;
    private JButton clearbutton;
    private Container c ;
    
   
    tutorial64() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
           tf = new JTextField();
           tf.setBounds(230,200,90,50);
           tf.setBackground(Color.GREEN);
            c.add(tf);   
    
           ta = new JTextArea();
           ta.setBounds(20,350,300,300);
           ta.setBackground(Color.GREEN); 
           c.add(ta);   
           
           
         tf.addKeyListener(new KeyListener(){
            @Override
            public void keyPressed(KeyEvent ke)
            {
                ta.append("Key typed:"+ke.getKeyChar()+"\n");
            }

             @Override
             public void keyTyped(KeyEvent ke) {
                  ta.append("Key typed:"+ke.getKeyChar()+"\n");
             }

             @Override
             public void keyReleased(KeyEvent ke) {
                  ta.append("Key typed:"+ke.getKeyChar()+"\n");
             }
        });
         }
    public static void main(String[] args) {
        tutorial64 frame =  new tutorial64();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("keylistener Demo");
     
    }
}
