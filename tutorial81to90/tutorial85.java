package tutorial81to90;



import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class tutorial85 extends JFrame {
    private Container c ;
    private JTextField rtf,gtf,btf,previewlabel;
    private JPanel panel;
    private JLabel rl,gl,bl;
    private JToggleButton tb;
    private JSlider xl,yl,zl;
   
    tutorial85() 
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
         
        tb = new JToggleButton();
         tb.setBounds(10,150,90,90);
         c.add(tb);
        
        rl= new JLabel("RED");
        rl.setBounds(50,50,80,50);
        c.add(rl);
       
        xl= new JSlider(0,20,0);
        xl.setBounds(50,150,150,50);
        c.add(xl);
        
        rtf= new JTextField();
        rtf.setBounds(400,50,80,40);
        c.add(rtf);
       
        }
         


      
      public static void main(String[] args) {
        tutorial85 frame =  new tutorial85();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}

}
