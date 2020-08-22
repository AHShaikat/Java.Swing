
package Tutorial11to20;
import java.awt.Color;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tutorial12  extends JFrame {
    private Container c;
    private JLabel userLabel;
   
  tutorial12()
    {
    initialComponent();
}
    public void initialComponent()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.yellow);
        
         userLabel= new JLabel();
          userLabel.setText("Enter your user name");
           userLabel.setBounds(50,20,150,50);
       c.add(userLabel);
        
    }
    public static void main(String[] args) {
      tutorial12 frame = new tutorial12();
       frame.setVisible(true);
       frame.setBounds(200, 50, 500, 400);
       
       
    }
}
