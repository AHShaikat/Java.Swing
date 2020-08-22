package Tutorial21to30;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;


     public class tutorial21 extends JFrame{
   
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    tutorial21() 
   {
    initialComponent();
    
   }
    public void initialComponent()
    {
        c = this.getContentPane();
       c.setLayout(null);
        c.setBackground(Color.BLUE);
       
        f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
        
        tf1 =new JTextField() ;
        tf1.setBounds(50, 50, 200, 50);
       tf1.setFont(f);
      tf1.setForeground(Color.yellow);
       tf1.setBackground(Color.BLUE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
        
        tf2 =new JTextField() ;
        tf2.setText("anisul");
        tf2.setFont(f);
        tf2.setBounds(50, 110, 200, 50);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
         tutorial21 frame =  new tutorial21();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}




