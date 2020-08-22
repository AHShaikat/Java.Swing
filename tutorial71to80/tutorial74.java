package tutorial71to80;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tutorial74 extends JFrame {
    

    private JButton btn1,btn2,btn3,btn4,btn5;
    private Container c ;
    private JPanel panel1,panel2;
    private JLabel label;
   private BorderLayout blayout;
    tutorial74() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
        blayout = new BorderLayout();
        blayout.setHgap(10);
        blayout.setVgap(10);
        c.setLayout(blayout);
         c.setBackground(Color.PINK);
         
           panel1 = new JPanel();
           panel1.setBounds(100,100,250,300);
           panel1.setBackground(Color.GREEN);
           c.add(panel1);   
          
           panel2 = new JPanel();
           panel2.setBounds(355,100,250,300);
           panel2.setBackground(Color.RED);
           c.add(panel2);   
    
         label= new JLabel("new label");
           label.setBounds(50,20,205,50);
           c.add(label);
                  
           
           btn1= new JButton("1");
        btn2= new JButton("2");
        btn3= new JButton("3");
        btn4= new JButton("4");
        btn5= new JButton("5");

         c.add(btn1,BorderLayout.NORTH);
         c.add(btn2,BorderLayout.WEST);
         c.add(btn3,BorderLayout.CENTER);
         c.add(btn4,BorderLayout.EAST);
         c.add(btn5,BorderLayout.SOUTH);
        
                 panel1.add(btn1);
        panel1.add(btn3);
        panel2.add(btn2);
           
         
}
    public static void main(String[] args) {
        tutorial74 frame =  new tutorial74();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
    }
}
    