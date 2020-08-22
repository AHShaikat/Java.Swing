package tutorial41to50;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tutorial43 extends JFrame {
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JTextArea ta;
    private JButton clearbutton;
    private Container c ;
    private Font f;
    private ImageIcon img;
    tutorial43() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
          img = new ImageIcon(getClass().getResource("plc.jpg"));
           
            f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
          
          imgLabel= new JLabel(img);
          imgLabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
         
          textLabel= new JLabel("Enter any munber :");
          textLabel.setBounds(20,200,250,50);
          textLabel.setFont(f);
          c.add(textLabel);
    }
    public static void main(String[] args) {
        tutorial43 frame =  new tutorial43();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("TextArea Demo");
        frame.setResizable(false);
    }
}
