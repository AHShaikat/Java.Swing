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

public class tutorial81 extends JFrame implements ActionListener{
    

    private JButton prebutton,nextbutton;
    private Container c ;
    private JPanel panel1,panel2;
    private BorderLayout blayout;
    private BoxLayout box;
    private GridLayout gl;
    private CardLayout cl;
    private ImageIcon icon;
    private JLabel label;
    tutorial81() 
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
         
        cl=new CardLayout();
         
         panel1 = new JPanel(cl);
           panel1.setBounds(100,100,250,300);
           panel1.setBackground(Color.GREEN);
           c.add(panel1);   
         
        prebutton =new JButton(" Previous");
        prebutton.setBounds(10,400,100,50);
       c.add(prebutton);
       
     nextbutton =new JButton("Next ");
        nextbutton.setBounds(470,400,100,50);
       c.add(nextbutton);
       
       prebutton.addActionListener(this);
       nextbutton.addActionListener(this);
       
        }
          
    @Override
      public void actionPerformed(ActionEvent e)
      {
          if(e.getSource() == prebutton)
          {
            cl.previous(panel1);  
          }
          if(e.getSource() == nextbutton)
          {
              cl.next(panel1);
          }
        
      }
      public static void main(String[] args) {
        tutorial81 frame =  new tutorial81();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}
    
