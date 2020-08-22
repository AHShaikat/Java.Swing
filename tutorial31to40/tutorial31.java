package tutorial31to40;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class tutorial31 extends JFrame {
    private Container c;
    private JPasswordField pf;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
     
    tutorial31() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
       
        f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
         cursor = new Cursor(Cursor.HAND_CURSOR);
         
         btn1 = new JButton("submit");
         btn1.setFont(f);
         btn1.setCursor(cursor);
         btn1.setForeground(Color.yellow);
        btn1.setBackground(Color.BLUE);
         btn1.setBounds(100,50,100,50);
         c.add(btn1);
         
         
         
         btn2 = new JButton("clear");
         btn2.setFont(f);
         btn2.setForeground(Color.yellow);
        btn2.setBackground(Color.BLUE);

         btn2.setBounds(210,50,100,50);
         c.add(btn2);
         
    }
    public static void main(String[] args) {
        tutorial31 frame =  new tutorial31();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("JPasswrodField Demo");
        frame.setResizable(false);
    }
}
