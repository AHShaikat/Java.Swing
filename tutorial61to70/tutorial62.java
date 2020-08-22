package tutorial61to70;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class tutorial62 extends JFrame {
  
    private Container c;
    private Font f;
    private JComboBox cb;
   private String[] prolanguage = { "c","c++","java","php","python"};
  private JLabel label;
  private JButton btn;
    tutorial62()
    {
        initcomponents();
    }
   public void  initcomponents()
   {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("ComboBox Demo");
   
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
  
         cb = new JComboBox(prolanguage);
        cb.setBounds(100, 100, 500, 500);
        cb.setEditable(true);
         cb.setBackground(Color.PINK);
         cb.setSelectedItem("java");
         cb.setEditable(true);
         cb.addItem("Fortran");
         cb.removeItem("c++");
         //c.removeAll();
         c.add(cb);
         
      btn= new JButton("show");
       btn.setBounds(160,150,200,50);
       c.add(btn);
       label = new JLabel();
       label.setBounds(160,150,200,50);
       c.add(label);
       
       btn.addActionListener( new ActionListener()
       {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
       String s =cb.getSelectedItem().toString();
       label.setText("you have selected:" +s);
   }
   });  
   }
       public static void main(String[] args) 
       {
        
        tutorial62 frame = new tutorial62();
        frame.setVisible(true);
    
}
}
