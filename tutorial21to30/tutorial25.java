
package tutorial21to30;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class tutorial25 extends JFrame {
    private Container c;
    private JPasswordField pf;
     tutorial25() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
       
         pf= new JPasswordField();
       // pf.setEchoChar(*);
         pf.setBounds(50,20,150,50);
         c.add(pf);
    }
    public static void main(String[] args) {
        tutorial25 frame =  new tutorial25();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("ActionListner Demo");
        frame.setResizable(false);
    }
}
