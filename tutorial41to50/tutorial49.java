package tutorial41to50;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class tutorial49 extends JFrame {
   private ButtonGroup grp;
    private JRadioButton male, female; 
    private Container c;
    private Font f;
   tutorial49()
    {
        initcomponents();
    }
   public void  initcomponents()
   {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("RadioButton Demo");
   
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
   
         f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
         grp = new ButtonGroup();
         
         male = new JRadioButton("male");
         male.setBounds(50, 50, 100, 50);
         male.setFont(f);
         male.setSelected(true);
         c.add(male);
         female =new JRadioButton("female");
         female.setBounds(160, 50, 100, 50);
        female.setFont(f);
         c.add(female);
         
         grp.add(male);
         grp.add(female);
   }
    public static void main(String[] args) {
        
        tutorial49 frame = new tutorial49();
        frame.setVisible(true);
    }
}
