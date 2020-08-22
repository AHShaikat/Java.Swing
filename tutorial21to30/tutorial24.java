
package Tutorial21to30;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


     public class tutorial24 extends JFrame{
   
    private Container c;
    private JTextField tf1,tf2;
    private Font f;
    tutorial24() 
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
        
   Handler handler = new Handler();
   tf1.addActionListener(handler);
   tf2.addActionListener(handler);
    }
       class Handler implements ActionListener
       {
           public void actionPerformed(ActionEvent e)
                    {
                        if(e.getSource()==tf1)
                        {
                            String s = tf1.getText();
                        if(s.isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "you didn't enter anything");
                        }
                        else{
                        
                        }
                        JOptionPane.showMessageDialog(null, "tf1 ="+s);
                        }
                        else
                        {
                            String s = tf2.getText();
                        if(s.isEmpty())
                        {
                            JOptionPane.showMessageDialog(null, "you didn't enter anything");
                        }
                        else{
                        
                        }
                        JOptionPane.showMessageDialog(null, "tf2 ="+s);
                        }
                        
                    }
                }
    
public static void main(String[] args) {
         tutorial24 frame =  new tutorial24();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("ActionListner Demo");
        frame.setResizable(false);
    }
}





