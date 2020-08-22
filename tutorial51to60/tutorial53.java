package tutorial51to60;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class tutorial53 extends JFrame {
   private ButtonGroup grp;
    private JRadioButton male, female; 
    private Container c;
    private Font f;
  private JTextArea ta;
    tutorial53()
    {
        initcomponents();
    }
   public void  initcomponents()
   {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("RadioButton Demo");
   
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.ORANGE);
   
         f = new Font ("Arial",Font.ITALIC +Font.BOLD,18);
         grp = new ButtonGroup();
         
         male = new JRadioButton("male");
         male.setBounds(50, 50, 100, 50);
         male.setFont(f);
         c.add(male);
         female =new JRadioButton("female");
         female.setBounds(160, 50, 100, 50);
        female.setFont(f);
        female.setEnabled(false);
         c.add(female);
         
         grp.add(male);
         grp.add(female);
         
         ta = new JTextArea();
         ta.setBounds(20,110,300,200);
         ta.setFont(f);
         ta.setBackground(Color.orange);
         c.add(ta);
         
         Handler handler = new Handler();
         male.addActionListener(handler);
         female.addActionListener(handler);
   }
   class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(male.isSelected())             //e.getSource()==male
        {
           //ta.setText("You have seleted male");
           ta.append("You have seleted male");
        }
        else
        {
        //ta.setText("you have selectd female");
        ta.append("you have selectd female");
        }
    }
   }
   
       
       public static void main(String[] args) {
        
        tutorial53 frame = new tutorial53();
        frame.setVisible(true);
    }
}
