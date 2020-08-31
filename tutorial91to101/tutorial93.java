package tutorial91to101;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;



import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JTextField;




public class tutorial93 extends JFrame    {
    private Container c ;
    private JButton addbutton,updatebutton,deletebutton,clearbutton;
    private JTextField  fntf, lntf,phonetf,gpatf;
    private JLabel titlelabel,fnlabel,lnlabel, phonelabel,gpalabel;
    private Font font;
   
   
     
  
   tutorial93() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setSize(780,690);
          this.setLocationRelativeTo(null);
          this.setTitle("Student table");
        
          
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.PINK);
          
          Font font=new Font("Arial",Font.BOLD,22);
          
          titlelabel = new JLabel("Student Registration");
          titlelabel.setBounds(140,10,250,50);
          titlelabel.setFont(font);
          c.add(titlelabel);
          
          fnlabel= new JLabel("first name");
          fnlabel.setBounds(10,80,140,30);
          fnlabel.setFont(font);
          c.add(fnlabel);
          
          fntf =new JTextField();
          fntf.setBounds(110,80,200,30);                   
          
          fntf.setFont(font);
          c.add(fntf);
          
          
          addbutton = new JButton("Add");
          addbutton.setBounds(400,80,100,30);
          addbutton.setFont(font);
          c.add(addbutton);
          
          lnlabel= new JLabel("last Name");
          lnlabel.setBounds(10,130,150,30);
          lnlabel.setFont(font);
          c.add(lnlabel);
          
          lntf =new JTextField();
          lntf.setBounds(110,130,200,30);
          lntf.setFont(font);
          c.add(lntf);
          
          
          updatebutton = new JButton("update");
          updatebutton.setBounds(400,130,100,30);
          updatebutton.setFont(font);
          c.add(updatebutton);
          
          phonelabel= new JLabel("Student phone");
           phonelabel.setBounds(10,230,200,30);
         phonelabel.setFont(font);
          c.add( phonelabel);
          
          phonetf =new JTextField();
          phonetf.setBounds(110,80,200,30);
          phonetf.setFont(font);
          c.add(phonetf);
          
          
          deletebutton = new JButton("delete");
          deletebutton.setBounds(400,180,100,30);
         deletebutton.setFont(font);
          c.add(deletebutton);
          
          gpalabel= new JLabel("Student gpa");
           gpalabel.setBounds(10,230,200,30);
         gpalabel.setFont(font);
          c.add( gpalabel);
          
          gpatf =new JTextField();
          gpatf.setBounds(110,230,200,30);
          gpatf.setFont(font);
          c.add(gpatf);
          
          
          clearbutton = new JButton("clear");
          clearbutton.setBounds(400,230,100,30);
         clearbutton.setFont(font);
          c.add(clearbutton);
          
  }
     public static void main(String[] args) {
        tutorial93 frame =  new tutorial93();
        frame.setVisible(true);
 }     
}     


    
