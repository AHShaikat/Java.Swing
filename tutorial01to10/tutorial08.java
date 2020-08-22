
package tutorial01to10;

import javax.swing.JFrame;

public class tutorial08 extends JFrame {
    public static void main(String[] args) {
       
        
      tutorial08 frame = new tutorial08();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setLocation(200,500);
        frame.setBounds(200,50,400,300); */
        frame.setTitle("Hi");
        frame.setResizable(false);
    }
}