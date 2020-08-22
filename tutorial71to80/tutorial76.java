package tutorial71to80;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tutorial76 extends JFrame {
    

    private JButton btn1,btn2,btn3,btn4,btn5;
    private Container c ;
    private BorderLayout blayout;
    private BoxLayout box;
    tutorial76() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
         box=new BoxLayout(c,BoxLayout.X_AXIS);
        c.setLayout(box);
         c.setBackground(Color.PINK);
         
        
         
        
        btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");

         c.add(btn1);
         c.add(Box.createHorizontalStrut(10));
         c.add(btn2);
         c.add(btn3);
         c.add(Box.createHorizontalStrut(10));
         c.add(btn4);
         c.add(btn5);
        }
          
           
           
         

    public static void main(String[] args) {
        tutorial76 frame =  new tutorial76();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}
    