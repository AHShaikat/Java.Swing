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



public class tutorial63 extends JFrame implements ActionListener  {
  
    private Container c;
    private Font f;
    private JComboBox cb;
   private String[] prolanguage = { "c","c++","java","php","python"};
  private JLabel label;
  private JButton redbutton,greenbutton,bluebutton;
    tutorial63()
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
  
         //creating and adding button1
        redbutton = new JButton("RED");
        redbutton.setBounds(50,50,100,50);
        c.add(redbutton);
         
//creating and adding button2
        greenbutton = new JButton("GREEN");
        greenbutton.setBounds(50,110,100,50);
        c.add(greenbutton);
         
//creating and adding button1
        bluebutton = new JButton("Blue");
        bluebutton.setBounds(50,170,100,50);
        c.add(bluebutton);
         
        redbutton.addActionListener(this);
        greenbutton.addActionListener(this);
        bluebutton.addActionListener(this);
   }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if( redbutton.isSelected())            
        {
        c.setBackground(Color.RED); 
        }
       else if(greenbutton.isSelected()) 
        {
        c.setBackground(Color.GREEN);
        }
       else if(bluebutton.isSelected()) 
       {
         c.setBackground(Color.BLUE);
       }
        }      
    
    public static void main(String[] args) 
       {
        
        tutorial63 frame = new tutorial63();
        frame.setVisible(true);
    
}

   
    }

    


   /*    redbutton.addActionListener( new ActionListener()
       {
   @Override
   public void actionPerformed(ActionEvent e)
   {
      c.setBackground(Color.RED);
   }
   });  
   
       greenbutton.addActionListener( new ActionListener()
       {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
      c.setBackground(Color.GREEN);
   }
   });  
   
       bluebutton.addActionListener( new ActionListener()
       {
   @Override
   public void actionPerformed(ActionEvent ae)
   {
      c.setBackground(Color.BLUE);
   }
   });  
   }
   */
  
         
    