package tutorial81to90;



import java.awt.Color;
import java.awt.Container;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JSpinner;

import javax.swing.SpinnerNumberModel;


public class tutorial88 extends JFrame implements ChangeListener   {
    private Container c ;
    
    private JLabel label;
    
   private JSpinner spinner;
    
   tutorial88() 
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
        
         
        label= new JLabel();
        label.setBounds(100,200,150,50);
        c.add(label);
        
        spinner.addChangeListener((javax.swing.event.ChangeListener) this);
    }
      @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        String number = spinner.getValue().toString();
        int value = Integer.parseInt(number);
        label.setText("Current value :"+value);
    }


 public static void main(String[] args) {
        tutorial88 frame =  new tutorial88();
        frame.setVisible(true);
 }     
}     


    