
package tutorial41to50;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class tutorial48 extends JFrame {
    private JRadioButton male, female; 
    private Container c;
   tutorial48()
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
   
         male = new JRadioButton("male");
         male.setBounds(50, 50, 100, 50);
         c.add(male);
         female =new JRadioButton("female");
         female.setBounds(160, 50, 100, 50);
         c.add(female);
   }
    public static void main(String[] args) {
        
        tutorial48 frame = new tutorial48();
        frame.setVisible(true);
    }
}
