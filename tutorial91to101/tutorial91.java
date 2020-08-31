package tutorial91to101;

//PICTURE ADD korte hobe;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JSpinner;
import javax.swing.JTabbedPane;




public class tutorial91 extends JFrame    {
    private Container c ;
    private JButton bt;
   
   tutorial91() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,400);
        this.setTitle("ColorChooser Demo");
        
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
        tutorial91 frame =  new tutorial91();
        frame.setVisible(true);
 }     
}     


    