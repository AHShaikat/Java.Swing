
package tutorial01to10;

import javax.swing.JOptionPane;

public class tutorial07 {
  public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit this ?","title", JOptionPane.YES_NO_CANCEL_OPTION );
        if(choice == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        else{
            System.out.println("you have chosen no_option");
        }
    }
} 

