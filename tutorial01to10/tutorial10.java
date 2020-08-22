
package tutorial01to10;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class tutorial10 extends JFrame {
    private ImageIcon icon;
   // private Container c;
    
    tutorial10() 
   {
    initialComponent();
    
   }
    public void initialComponent()
    {
           icon = new ImageIcon(getClass().getResource("music.png"));
            this.setIconImage(icon.getImage());
    }
     public static void main(String[] args) {
        tutorial10 frame =  new tutorial10();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}
