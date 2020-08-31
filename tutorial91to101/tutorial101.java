package tutorial91to101;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class tutorial101  extends JFrame{ //implements ActionListener{
    
   
   private ImageIcon cutIcon;    
   private JMenuBar menubar;
    private JMenu file,edit,help;
    private JMenuItem newItem,openItem,exitItem,cutItem,pasteItem,copyItem,PasteItem,SelectAllItem;
    
   tutorial101() 
   {
    initialComponent();
   } 
   
      public void initialComponent()
    {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(300,100,600,500);
          this.setTitle("Menu demo");
          
         // cutIcon = new ImageIcon("src/images/cut.png")
          
          menubar =new JMenuBar();
          this.setJMenuBar(menubar);
          
          file = new JMenu("File");
          edit = new JMenu("edit");
          help = new JMenu("help");
          
          menubar.add(file);
          menubar.add(edit);
          menubar.add(help);
          
          
          newItem = new JMenuItem("New");
        //  newItem.setIcon(newIcon);
         // newItem.setAccelerator(keystroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
          
          openItem = new JMenuItem("New");
          exitItem = new JMenuItem("New");
          cutItem = new JMenuItem("New");
          
          cutItem = new JMenuItem("cut");
          cutItem.setIcon(cutIcon);
          
          copyItem = new JMenuItem("New");
          pasteItem = new JMenuItem("New");
          cutItem = new JMenuItem("New");
          SelectAllItem = new JMenuItem("New");
          
          file.add(newItem);
          file.add(openItem);
          file.add(exitItem);
        
          
          edit.add(cutItem);
          edit.addSeparator();
          edit.add(copyItem);
          edit.add(pasteItem);
          
          //newItem.addActionListener(this);
          //exitItem.addActionListener(this);
          
  }
  /*  
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource() == newItem)
        {
           tutorial100 newframe = new tutorial100();
           newframe.setVisible(true);
           newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           newFrame.setbounds(300,100,600,500);
           newFrame.setTitle("new Frame");
        }
        else  if(e.getSource() == exitItem)
        {
            System.exit(0);
        }
    
    
    
    }

}
*/


 public static void main(String[] args) {
        tutorial101 frame =  new tutorial101();
        frame.setVisible(true);
 }     
}
