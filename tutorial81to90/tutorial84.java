package tutorial81to90;



import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

public class tutorial84 extends JFrame{
    private Container c ;
    private JPanel panel1;
    private JLabel label;
    private JToggleButton tb;
    private JSlider sl;
   
    tutorial84() 
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
         
        tb = new JToggleButton();
         tb.setBounds(50,100,90,90);
         c.add(tb);
        
        label= new JLabel("hello there");
        label.setBounds(50,150,150,50);
        label.setBounds(50, 150, 150, 50);
        c.add(label);
         
        sl= new JSlider(0,20,0);
        sl.setBounds(50,150,150,50);
        sl.setMinorTickSpacing(1);
        sl.setMajorTickSpacing(5);
       sl.setPaintTicks(true);
       sl.setPaintLabels(true);
       
        c.add(sl);
        
       
        }
         public static void main(String[] args) {
        tutorial84 frame =  new tutorial84();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}}

 