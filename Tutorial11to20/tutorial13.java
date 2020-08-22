
package Tutorial11to20;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tutorial13 extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    
tutorial13 ()
    {
    initialComponent();
}
    public void initialComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        userLabel= new JLabel();
         userLabel.setBounds(50,20,150,50);
        userLabel.setText("Enter your user name");
        c.add(userLabel);
        
        passLabel = new JLabel("Enter you password");
        passLabel.setBounds(50,80,150,200);
        c.add(passLabel);
    }
    public static void main(String[] args) {
       tutorial13 frame = new tutorial13 ();
       frame.setVisible(true);
       frame.setBounds(200, 50, 500, 400);
       
       
    }
}

