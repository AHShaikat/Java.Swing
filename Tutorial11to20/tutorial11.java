//How to change background color of JFrame
package Tutorial11to20;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


  public class tutorial11 extends JFrame{
    private ImageIcon icon;
    private Container c;
    
    tutorial11() 
   {
    initialComponent();
    
   }
    public void initialComponent()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
       
        icon = new ImageIcon(getClass().getResource("music.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) {
        tutorial11 frame =  new tutorial11();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}
