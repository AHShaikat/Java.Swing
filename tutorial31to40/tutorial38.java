package tutorial31to40;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

import javax.swing.JTextArea;

public class tutorial38 extends JFrame {
    private Container c;
    private JTextArea ta;
    tutorial38() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
       
         ta = new JTextArea("this is a text");
    ta.setBounds(170,150,200,50);
   
    c.add(ta);
        
         
    }
    public static void main(String[] args) {
        tutorial38 frame =  new tutorial38();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("TextArea Demo");
        frame.setResizable(false);
    }
}
