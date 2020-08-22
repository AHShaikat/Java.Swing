package tutorial91to101;

//PICTURE ADD korte hobe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JSpinner;
import javax.swing.JTabbedPane;

import javax.swing.SpinnerNumberModel;


public class tutorial92 extends JFrame    {
    private Container c ;
    private JButton bt;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private JTabbedPane tp;
   private JSpinner spinner;
    
   tutorial92() 
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
         
         bt = new JButton("choose a color");
         bt.setBounds(100,50,150,50);
        c.add(bt);
        bt.addActionListener(new ActionListener()
        {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 Color color =JColorChooser.showDialog(null, "Select a color", Color.yellow);
            c.setBackground(color);
             }
        
    });
    }
     public static void main(String[] args) {
        tutorial92 frame =  new tutorial92();
        frame.setVisible(true);
 }     
}     


    
