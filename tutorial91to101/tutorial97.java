package tutorial91to101;



import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class tutorial97  extends JFrame{ // implements ActionListener {
   
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    
    private Container c ;
    private JButton addbutton,updatebutton,deletebutton,clearbutton;
    private JTextField  fntf, lntf,phonetf,gpatf;
    private JLabel titlelabel,fnlabel,lnlabel, phonelabel,gpalabel;
    private Font font;
    
    private String[] cols ={"first Name ","Last Name","Phone Number","GPA"};
    private String[] rows= new String[4];
   
   tutorial97() 
   {
    initialComponent();
    
   }
      public void initialComponent()
    {
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setSize(780,690);
          this.setLocationRelativeTo(null);
          this.setTitle("Student table");
        
          
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.PINK);
          
          Font font=new Font("Arial",Font.BOLD,22);
          
          titlelabel = new JLabel("Student Registration");
          titlelabel.setBounds(140,10,250,50);
          titlelabel.setFont(font);
          c.add(titlelabel);
          
          fnlabel= new JLabel("first name");
          fnlabel.setBounds(10,80,140,30);
          fnlabel.setFont(font);
          c.add(fnlabel);
          
          fntf =new JTextField();
          fntf.setBounds(110,80,200,30);                   
          
          fntf.setFont(font);
          c.add(fntf);
          
          
          addbutton = new JButton("Add");
          addbutton.setBounds(400,80,100,30);
          addbutton.setFont(font);
          c.add(addbutton);
          
          lnlabel= new JLabel("last Name");
          lnlabel.setBounds(10,130,150,30);
          lnlabel.setFont(font);
          c.add(lnlabel);
          
          lntf =new JTextField();
          lntf.setBounds(110,130,200,30);
          lntf.setFont(font);
          c.add(lntf);
          
          
          updatebutton = new JButton("update");
          updatebutton.setBounds(400,130,100,30);
          updatebutton.setFont(font);
          c.add(updatebutton);
          
          phonelabel= new JLabel("phone");
           phonelabel.setBounds(10,230,200,30);
         phonelabel.setFont(font);
          c.add( phonelabel);
          
          phonetf =new JTextField();
          phonetf.setBounds(110,80,200,30);
          phonetf.setFont(font);
          c.add(phonetf);
          
          
          deletebutton = new JButton("delete");
          deletebutton.setBounds(400,180,100,30);
         deletebutton.setFont(font);
          c.add(deletebutton);
          
          gpalabel= new JLabel("GPA");
           gpalabel.setBounds(10,230,200,30);
         gpalabel.setFont(font);
          c.add( gpalabel);
          
          gpatf =new JTextField();
          gpatf.setBounds(110,230,200,30);
          gpatf.setFont(font);
          c.add(gpatf);
          
          
          clearbutton = new JButton("clear");
          clearbutton.setBounds(400,230,100,30);
         clearbutton.setFont(font);
          c.add(clearbutton);
          
          table = new JTable();
          
          model = new DefaultTableModel(); //constructs a default TableModel which ....
          model.setColumnIdentifiers(cols); //Replace the column identifiers in the ......
          table.setModel(model);
          table.setFont(font);
          table.setSelectionBackground(Color.YELLOW);
          table.setBackground(Color.BLUE);
          table.setRowHeight(30);
           table.getSelectedRow();
          
          scroll = new JScrollPane(table);
          scroll.setBounds(10, 360, 740, 265);
          c.add(scroll); }
  /*         
          table.addMouseListener(new MouseAdapter()
                  {
                      @Override
                      public void mouseClicked( MouseEvent me){
                         int numberofRow = table.getSelectedRow();
                         
                         String f_name =  modal.getValueAt(numberofRow,0).to string();
                         String l_name =  modal.getValueAt(numberofRow,1).to string();
                         String gpa =  modal.getValueAt(numberofRow,2).to string();
                         String phone =  modal.getValueAt(numberofRow,3).to string();
                          
                          fntf.setText(f_name);
                          lntf.setText(l_name);
                          phonetf.setText(phone_name);
                          gpatf.setText(gpa_name);
                      }
                  });
      
          
          
   }
  @Override
    public void actionPerformed(ActionEvent ae) {
     if ( e.getSource() == addbutton){
             rows[0] =fntf.getText();
             rows[1] =lntf.getText();
             rows[2] =phonetf.getText();
             rows[3] =gpatf.getText();
             model.addRow(rows);
       }
 else if ( e.getSource()==clearbutton) {
          
          fntf.setText(" ");
          lntf.setText(" ");
          phonetf.setText(" ");
          gpatf.setText(" ");
        }
 else if( e.getSource()==deletebutton){
     int numberofRow = table.getSelectedRow();
     if(numberOfRow>=0){
         model.removeRow(numberofRow);
     }
     else{
         JOptionPane.showMessageDialog(null,"No row has been selected or entered");
     }
 }
  }
*/
    public static void main(String[] args) {
        tutorial97 frame =  new tutorial97();
        frame.setVisible(true);
 }     

}
 