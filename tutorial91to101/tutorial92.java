package tutorial91to101;

//PICTURE ADD korte hobe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;


import javax.swing.JTable;




public class tutorial92 extends JFrame    {
    private Container c ;
    private JButton bt;
    private Font font;
    private JTable table;
    private JLabel label1;
    private JScrollPane scroll;
    
    private String[] cols ={"Name","GPA","ID"};
    private String[] [] rows={
        
        {"101","Shaikat","3094" },
        {"101","Shaikat","3094" },
        {"101","Shaikat","3094" },
        {"101","Shaikat","3094" },
        
        
        
    };
   
     
  
   tutorial92() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(100,100,750,450);
          this.setTitle("Tabel Demo");
        
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.PINK);
          
          font=new Font("Arial",font.BOLD,22);
          
          label1 = new JLabel("Student Details");
          label1.setBounds(250,20,200,50);
          label1.setFont(font);
          c.add(label1);
          
          table = new JTable(rows,cols);
          table.setSelectionBackground(Color.PINK);
          table.setEnabled(false); 
          
          
          
          scroll = new JScrollPane(table);
          scroll.setBounds(50,80,600,150);
          c.add(scroll);
          
          
          
          
         
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


    
