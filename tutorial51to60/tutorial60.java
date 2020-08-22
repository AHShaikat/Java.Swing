package tutorial51to60;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;



public class tutorial60 extends JFrame {
  
    private Container c;
    private Font f;
    private JComboBox cb;
   private String[] prolanguage = { "c","c++","java","php","python"};
  
    tutorial60()
    {
        initcomponents();
    }
   public void  initcomponents()
   {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,300);
        this.setTitle("ComboBox Demo");
   
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
  
         cb = new JComboBox(prolanguage);
        cb.setBounds(100, 100, 500, 500);
        cb.setEditable(true);
         cb.setBackground(Color.PINK);
         c.add(cb);
          }
       public static void main(String[] args) {
        
        tutorial60 frame = new tutorial60();
        frame.setVisible(true);
    }
}
