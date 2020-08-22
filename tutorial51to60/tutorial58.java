package tutorial51to60;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import tutorial51to60.tutorial53.Handler;


public class tutorial58 extends JFrame {
   private ButtonGroup grp;
    private JRadioButton male, female; 
    private Container c;
    private Font f;
  private JTextArea ta;
  private JCheckBox javaCheckbox , cCheckbox, mysqlCheckbox;
   private JLabel label;
  
    tutorial58()
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
   
         grp = new ButtonGroup();
         
         f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
         
         javaCheckbox = new JCheckBox("Java");
         javaCheckbox.setBounds(50, 100, 100, 50);
          javaCheckbox.setFont(f);
         javaCheckbox.setBackground(Color.PINK);
         c.add(javaCheckbox);
         
         cCheckbox = new JCheckBox("C");
         cCheckbox.setBounds(50, 130, 100, 50);
         cCheckbox.setBackground(Color.PINK);
        cCheckbox.setFont(f);
         c.add(cCheckbox);
        
         
      mysqlCheckbox = new JCheckBox("mysql",true);
      mysqlCheckbox.setBounds(50, 160, 100, 50);
        mysqlCheckbox.setBackground(Color.PINK);
         mysqlCheckbox.setFont(f);
         c.add(mysqlCheckbox);
         
        grp.add(javaCheckbox);
         grp.add(cCheckbox);
         grp.add(mysqlCheckbox);
         
    label = new JLabel("you havn't selected anythings ");
    label.setBounds(50,200,300,30);
    label.setFont(f);
    c.add(label);
    
    Handler handler = new Handler();
    javaCheckbox.addActionListener(handler);
    cCheckbox.addActionListener(handler);
    mysqlCheckbox.addActionListener(handler);
   }
   class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
       if(javaCheckbox.isSelected())             //e.getSource()==javaCheckbox
        {
         label.setText("You have selected java");
        }
       else if(cCheckbox.isSelected()) 
        {
         label.setText("You have selected c");
        }
       else
       {
            label.setText("You have selected mysql");
       }
    }
   }
       public static void main(String[] args) {
        
        tutorial58 frame = new tutorial58();
        frame.setVisible(true);
    }
}
