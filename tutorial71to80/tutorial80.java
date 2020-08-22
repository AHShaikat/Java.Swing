package tutorial71to80;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tutorial80 extends JFrame implements ActionListener{
    

    private JButton prebutton,nextbutton;
    private Container c ;
    private JPanel panel1,panel2;
    private BorderLayout blayout;
    private BoxLayout box;
    private GridLayout gl;
    private CardLayout cl;
    tutorial80() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
      
  c.setLayout(null);
         c.setBackground(Color.PINK);
         
        panel1 = new JPanel();
           panel1.setBounds(100,100,250,300);
           panel1.setBackground(Color.GREEN);
           c.add(panel1);   
         
        prebutton =new JButton(" Previous");
        prebutton.setBounds(10,400,100,50);
       c.add(prebutton);
       
     nextbutton =new JButton("Next ");
        nextbutton.setBounds(470,400,100,50);
       c.add(nextbutton);
        }
          
    @Override
      public void actionPerformed(ActionEvent e)
      {
          cl.next(c);
          cl.previous(c);
          cl.show(c, "third");
          cl.last(c);
          cl.first(c);
      }
      public static void main(String[] args) {
        tutorial80 frame =  new tutorial80();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}
    
