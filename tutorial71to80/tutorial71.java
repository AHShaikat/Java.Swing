//ai code ta agei kora hoye geche 
//just ekbar dekhlei hobe 
package tutorial71to80;


import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


  public class tutorial71 extends JFrame{
    private ImageIcon icon;
    private Container c;
    
    tutorial71() 
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
        tutorial71 frame =  new tutorial71();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}
