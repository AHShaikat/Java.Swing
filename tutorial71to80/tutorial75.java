package tutorial71to80;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




import javax.swing.JTextArea;
import javax.swing.JTextField;

public class tutorial75 extends JFrame {
    

    private JButton button[];
    private Container c ;
    private JPanel panel1,panel2;
    private JLabel label;
    private FlowLayout flayout;
    private BorderLayout blayout;
    tutorial75() 
   {
    initialComponent();
    
   }

      public void initialComponent()
    {
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,150,180);
        this.setTitle("Mouse Listener");
        
        c = this.getContentPane();
        flayout = new FlowLayout(FlowLayout.LEFT);
        flayout.setHgap(10);
        flayout.setVgap(10);
        c.setLayout(flayout);
         c.setBackground(Color.PINK);
         
         button=new JButton[9];
         
        for (int i = 0; i < 9; i++) {
         
            button[i] = new JButton(" "+ (i+1));
            c.add(button[i]);
        }
          
           
           
         
}
    public static void main(String[] args) {
        tutorial75 frame =  new tutorial75();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
    }
}
    