package tutorial71to80;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tutorial77 extends JFrame {
    

    private JButton btn1,btn2,btn3,btn4;
    private Container c ;
    private BorderLayout blayout;
    private BoxLayout box;
    private GridLayout gl;
    tutorial77() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
         gl=new GridLayout(2,2);
        c.setLayout(gl);
         c.setBackground(Color.PINK);
         
        
         
        
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
      

         c.add(btn1);
        
         c.add(btn2);
         c.add(btn3);
      
         c.add(btn4);
        
        }
          
      public static void main(String[] args) {
        tutorial77 frame =  new tutorial77();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}
    