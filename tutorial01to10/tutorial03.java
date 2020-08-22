
package tutorial01to10;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class tutorial03 {
    public static void main(String[] args) {
          ImageIcon img =new ImageIcon("music.png");
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning" , JOptionPane.PLAIN_MESSAGE, img);
    }
}
