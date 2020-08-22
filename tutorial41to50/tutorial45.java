package tutorial41to50;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tutorial45 extends JFrame {
    private JLabel imgLabel,textLabel;
    private JTextField tf;
    private JTextArea ta;
    private JButton clearbutton;
    private Container c ;
    private Font f;
    private ImageIcon img;
    tutorial45() 
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
          
          tf = new JTextField();
           tf.setBounds(230,200,90,50);
           tf.setBackground(Color.GREEN);
           tf.setFont(f);
           tf.setHorizontalAlignment(JTextField.CENTER);
           c.add(tf);   
    
           //cursor = new Cursor(Cursor.HAND_CURSOR);
 
  
           clearbutton = new JButton("clear");
  
           clearbutton.setBounds(230,260,90,50);
           clearbutton.setFont(f);
           //clearbutton.setCursor(cursor);
  
           clearbutton.setBackground(Color.GREEN);
  
           c.add(clearbutton);
  
           ta = new JTextArea();
           ta.setBounds(20,350,300,300);
           ta.setBackground(Color.GREEN);
           ta.setFont(f);
          
           c.add(ta);   
           
           
           tf.addActionListener(new ActionListener()
    {
           @Override
           public void actionPerformed(ActionEvent ae){
           int num= Integer.parseInt(tf.getText());
           for(int i = 1; i<=10;i++)
           {
              ta.setText(" ");
               int result = num*i;
               String r = String.valueOf(result);
               String n = String.valueOf(num);
               String incr = String.valueOf(i);
          ta.append(n+" X" + incr +" = " +r+"\n");
           }
           }
    });
    
      
        clearbutton.addActionListener(new ActionListener()
    {
           @Override
           public void actionPerformed(ActionEvent e){
            ta.setText(" ");
    }
    });
}
    public static void main(String[] args) {
        tutorial45 frame =  new tutorial45();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Multiplication table Demo");
     
    }
}
