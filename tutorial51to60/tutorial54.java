package tutorial51to60;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class tutorial54 extends JFrame {
   private ButtonGroup grp;
    private JRadioButton male, female; 
    private Container c;
    private Font f;
  private JTextArea ta;
  private JCheckBox javaCheckbox , cCheckbox, mysqlCheckbox;
    tutorial54()
    {
        initcomponents();
    }
   public void  initcomponents()
   {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,300);
        this.setTitle("CheckBox Demo");
   
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
   
         
         
         javaCheckbox = new JCheckBox("Java");
         javaCheckbox.setBounds(50, 100, 100, 50);
         javaCheckbox.setBackground(Color.PINK);
         c.add(javaCheckbox);
         
         cCheckbox = new JCheckBox("C");
         cCheckbox.setBounds(50, 130, 100, 50);
         cCheckbox.setBackground(Color.PINK);
         c.add(cCheckbox);
        
         
      mysqlCheckbox = new JCheckBox("mysql");
      mysqlCheckbox.setBounds(50, 160, 100, 50);
        mysqlCheckbox.setBackground(Color.PINK);
         c.add(mysqlCheckbox);
         
        
         
    
   }
   
       
       public static void main(String[] args) {
        
        tutorial54 frame = new tutorial54();
        frame.setVisible(true);
    }
}
