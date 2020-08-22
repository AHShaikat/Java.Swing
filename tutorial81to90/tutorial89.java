package tutorial81to90;



import java.awt.Color;
import java.awt.Container;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JSpinner;
import javax.swing.JTabbedPane;

import javax.swing.SpinnerNumberModel;


public class tutorial89 extends JFrame    {
    private Container c ;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private JTabbedPane tp;
   private JSpinner spinner;
    
   tutorial89() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
         tp= new JTabbedPane();
         tp.setBounds(50,50,300,300);
         c.add(tp);
         
         panel1 = new JPanel();
         panel2 =new JPanel();
         panel3 =new JPanel();
         
         panel1.setBackground(Color.MAGENTA);
         panel2.setBackground(Color.BLUE);
         panel3.setBackground(Color.RED);
         
         tp.addTab("home", panel1);
         tp.addTab("home", panel2);
         tp.addTab("home", panel3);
         
        label1= new JLabel("This is label1");
        label2= new JLabel("This is label2");
        label3= new JLabel("This is label3");
        
       panel1.add(label1); 
       panel2.add(label2); 
       panel3.add(label3); 
        spinner.addChangeListener((javax.swing.event.ChangeListener) this);
    }
     


 public static void main(String[] args) {
        tutorial89 frame =  new tutorial89();
        frame.setVisible(true);
 }     
}     


    