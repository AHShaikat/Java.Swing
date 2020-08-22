
package Tutorial11to20;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tutorial14  extends JFrame {
    private Container c;
    private JLabel userLabel,passLabel;
    private Font f;
  tutorial14()
    {
    initialComponent();
}
    public void initialComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
        f = new Font("Comic Sans",BOLD,18 );
        
        userLabel= new JLabel();
        userLabel.setBounds(50,20,150,50);
        userLabel.setText("Enter your user name");
       
        userLabel.setFont(f);
       c.add(userLabel);
        
        
     passLabel = new JLabel("Enter your password");
        passLabel.setBounds(50,80,150,200);
        passLabel.setFont(f);
        c.add(passLabel); 
        
    }
    public static void main(String[] args) {
      tutorial14 frame = new tutorial14();
       frame.setVisible(true);
       frame.setBounds(200, 50, 500, 400);
       
       
    }
}