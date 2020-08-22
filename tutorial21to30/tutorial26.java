package tutorial21to30;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class tutorial26 extends JFrame {
    private Container c;
    private JPasswordField pf;
    private Font f;
     tutorial26() 
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
         //pf.setEchoChar( " *" );
         pf.setBounds(50,20,150,50);
         c.add(pf);
    }
    public static void main(String[] args) {
        tutorial26 frame =  new tutorial26();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("JPasswrodField Demo");
        frame.setResizable(false);
    }
}
