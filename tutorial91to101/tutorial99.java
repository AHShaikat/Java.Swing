package tutorial91to101;


import java.awt.Color;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class tutorial99  extends JFrame { 
   
    private JMenuBar menubar;
    private JMenu file,edit,help;
    private JMenuItem newItem,openItem,exitItem,cutItem,pasteItem,copyItem,PasteItem,SelectAllItem;
    
   tutorial99() 
   {
    initialComponent();
   } 
   
      public void initialComponent()
    {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(300,100,600,500);
          this.setTitle("Menu demo");
          
          menubar =new JMenuBar();
          this.setJMenuBar(menubar);
          
          file = new JMenu("File");
          edit = new JMenu("edit");
          help = new JMenu("help");
          
          menubar.add(file);
          menubar.add(edit);
          menubar.add(help);
          
          
          newItem = new JMenuItem("New");
          openItem = new JMenuItem("New");
          exitItem = new JMenuItem("New");
          cutItem = new JMenuItem("New");
          copyItem = new JMenuItem("New");
          pasteItem = new JMenuItem("New");
          cutItem = new JMenuItem("New");
          SelectAllItem = new JMenuItem("New");
          
          file.add(newItem);
          file.add(openItem);
          file.add(exitItem);
        
          
          edit.add(cutItem);
          edit.add(copyItem);
          edit.add(pasteItem);
          
          
        
          
    }
    public static void main(String[] args) {
        tutorial99 frame =  new tutorial99();
        frame.setVisible(true);
 }     

}
 