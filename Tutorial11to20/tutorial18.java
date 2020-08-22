
package Tutorial11to20;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;


     public class tutorial18 extends JFrame{
   
    private Container c;
    private JTextField tf1,tf2;
    tutorial18() 
   {
    initialComponent();
    
   }
    public void initialComponent()
    {
        c = this.getContentPane();
       c.setLayout(null);
        c.setBackground(Color.BLUE);
       
        tf1 =new JTextField() ;
        tf1.setBounds(50, 50, 200, 50);
        c.add(tf1);
        
        tf2 =new JTextField() ;
        tf2.setText("anisul");
        tf2.setBounds(50, 110, 200, 50);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        tutorial18 frame =  new tutorial18();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}


