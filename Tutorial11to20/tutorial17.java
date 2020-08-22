
package Tutorial11to20;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


    public class tutorial17  extends JFrame {
    private Container c;
   private JLabel imglabel;
   private ImageIcon img;
   
   tutorial17 ()
    {
    initialComponent();
}
    public void initialComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
       img = new ImageIcon(getClass().getResource("image.png" ));
       imglabel = new JLabel(img);
       imglabel.setBounds(50,30, img.getIconWidth(),img.getIconHeight());
       c.add(imglabel);
    }
    public static void main(String[] args) {
       tutorial17  frame = new tutorial17 ();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(120, 50, 1200, 700);
       
       
    }
}



