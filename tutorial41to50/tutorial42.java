package tutorial41to50;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;

public class tutorial42 extends JFrame {
    private Container c;
    private JTextArea ta;
      private Font f;
      private JScrollPane scroll;
    tutorial42() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.BLUE);
       
         
          f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
         
         ta = new JTextArea("this is a text");
         ta.setBounds(170,150,200,50);
         ta.setFont(f);
         ta.setLineWrap(true);
         ta.setWrapStyleWord(true);
         ta.setForeground(Color.yellow);
         ta.setBackground(Color.PINK);
        c.add(ta);
        
         scroll =new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
scroll.setBounds(50, 50, 300, 200);
 c.add(scroll);
    }
    public static void main(String[] args) {
        tutorial42 frame =  new tutorial42();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("TextArea Demo");
        frame.setResizable(false);
    }
}
