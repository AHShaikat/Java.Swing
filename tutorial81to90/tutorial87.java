package tutorial81to90;



import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;

public class tutorial87 extends JFrame {
    private Container c ;
    private JTextField rtf,gtf,btf,previewlabel;
    private JPanel panel;
    private JLabel rl,gl,bl;
    private JToggleButton tb;
    private JSlider xl,yl,zl;
   private JSpinner spinner;
    tutorial87() 
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
         
         SpinnerNumberModel value = new SpinnerNumberModel(10,0,30,5);
         
        spinner = new JSpinner();
        spinner.setBounds(100,100,70,50);
        c.add(spinner);
    }
 public static void main(String[] args) {
        tutorial87 frame =  new tutorial87();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,400,300);
        frame.setTitle("MouseMotionListener Demo");
     
}
}