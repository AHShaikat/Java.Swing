package tutorial81to90;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class tutorial82 extends JFrame implements ActionListener{
    

    private JButton prebutton,nextbutton;
    private Container c ;
    private JPanel panel1,panel2;
    private BorderLayout blayout;
    private BoxLayout box;
    private GridLayout gl;
    private CardLayout cl;
    private ImageIcon icon;
    private JLabel label;
    private JToggleButton tb;
    tutorial82() 
   {
    initialComponent();
    showImage();
   }
    public void showImage()
    {
        String[]  imagesNames ={"1.jpg","2.jpg","3.jpg"};
        for(String n:imagesNames){
        
            Image img =icon.getImage();
            Image newImage = img.getScaledInstance(panel1.getHeight(),panel1.getWidth(),Image.SCALE_SMOOTH);
            icon = new ImageIcon("src/image/1.jpg");
    label =new JLabel(icon);
    panel1.add(label);
        }
    }
      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.PINK);
         
         tb = new JToggleButton("OFF");
         tb.setBounds(50,100,90,90);
         c.add(tb);
        
         cl=new CardLayout();
         
        label= new JLabel("hello there");
        label.setBounds(50,150,150,50);
        label.setBounds(50, 150, 150, 50);
        c.add(label);
        
       tb.addActionListener(this);
        }
       @Override
      public void actionPerformed(ActionEvent e)
      {
          if(tb.isSelected())
          {
            label.setVisible(true);  
          }
          if(tb.isSelected())
          {
               label.setVisible(false);  
          }
        
      }
      public static void main(String[] args) {
        tutorial83 frame =  new tutorial83();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}

