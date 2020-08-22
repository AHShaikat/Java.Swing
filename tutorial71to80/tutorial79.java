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

public class tutorial79 extends JFrame implements ActionListener{
    

    private JButton btn1,btn2,btn3,btn4;
    private Container c ;
    private BorderLayout blayout;
    private BoxLayout box;
    private GridLayout gl;
    private CardLayout cl;
    tutorial79() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
         cl=new CardLayout(2,2);
        c.setLayout(cl);
         c.setBackground(Color.PINK);
         
        
         
        
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
      

         c.add(btn1);
        
         c.add(btn2);
         c.add(btn3);
          
         c.add(btn4);
        
         btn1.addActionListener ( this);
         btn2.addActionListener( this);
         btn3.addActionListener( this);
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
        tutorial79 frame =  new tutorial79();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}
    
