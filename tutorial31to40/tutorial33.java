package tutorial31to40;

import java.awt.Color;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class tutorial33 extends JFrame {
    private Container c;
    private JTextField tf;
    private JPasswordField pf;
    private JButton bt;
    
    
    tutorial33() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
      
         tf = new JTextField();
         tf.setBounds(50, 50, 150, 50);
         c.add(tf);
         
          bt = new JButton("submit");
         bt.setBounds(100,50,100,50);
         c.add(bt);
         
         bt.addActionListener(new ActionListener()
        {
                    public void actionPerformed(ActionEvent e)
                    {
                         tf.setText("");
    }
        });
    }
    public static void main(String[] args) {
        tutorial33 frame =  new tutorial33();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("JButton Actionlistner demo");
        frame.setResizable(false);
    }
}