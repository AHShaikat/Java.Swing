package tutorial21to30;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class tutorial27 extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
     tutorial27() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
       
          f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
        
         pf= new JPasswordField();
         //pf.setEchoChar( ' * ' );
         pf.setFont(f);
         pf.setForeground(Color.pink);
         pf.setBackground(Color.red);
         pf.setBounds(50,20,150,50);
         c.add(pf);
    }
    public static void main(String[] args) {
        tutorial27 frame =  new tutorial27();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("JPasswrodField Demo");
        frame.setResizable(false);
    }
}
