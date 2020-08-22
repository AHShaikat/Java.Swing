package tutorial31to40;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class tutorial32 extends JFrame {
    private Container c;
    private JPasswordField pf;
    private JButton btn1,btn2;
    private Font f;
    private Cursor cursor;
     private ImageIcon img1,img2;
    
    tutorial32() 
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
         img1 = new ImageIcon(getClass().getResource("img.jpg"));
         img2 = new ImageIcon(getClass().getResource("img.jpg"));
         
         btn1 = new JButton(img1);
         btn1.setFont(f);
         btn1.setCursor(cursor);
         btn1.setForeground(Color.yellow);
        btn1.setBackground(Color.BLUE);
         btn1.setBounds(100,50,100,50);
         c.add(btn1);
         
         
         
         btn2 = new JButton(img2);
         btn2.setFont(f);
         btn2.setForeground(Color.yellow);
        btn2.setBackground(Color.BLUE);

         btn2.setBounds(210,50,100,50);
         c.add(btn2);
         
    }
    public static void main(String[] args) {
        tutorial32 frame =  new tutorial32();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("JPasswrodField Demo");
        frame.setResizable(false);
    }
}
