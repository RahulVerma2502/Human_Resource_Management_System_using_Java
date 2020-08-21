//import com.mysql.jdbc.Connection;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Connection;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;



public class Newemp extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,label,l14;
	JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10;
	JButton button,b2;
	JComboBox dd,mm,yyyy,dd1,mm1,yyyy1;
        JLabel label1 = new JLabel();
        JPasswordField pass;
        JLabel ic;
    ImageIcon icon = new ImageIcon();
	@SuppressWarnings("unchecked")
	Newemp()
	{
		setVisible(true);
		setSize(1500,1500);
		setLayout(null);
        
		setBounds(10, 10, 370, 1000);
               ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\pic12.jpg");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
		//JLABEL
		l1 = new JLabel("NEW EMPLOYEE");
		l2 = new JLabel("ID");
		l3 = new JLabel("First Name");
		l4 = new JLabel("Last Name");
		l5 = new JLabel("Phone");
		l6 = new JLabel("Email");
		l7 = new JLabel("Date of Birth");
		l8 = new JLabel("Post");
		l9 = new JLabel("Salary");
		l10 = new JLabel("Date of Hiring");
		l11 = new JLabel("Address");
		l12= new JLabel("Emergency Name");
		l13 = new JLabel("Emergency Phone");
		label = new JLabel();
                l14 = new JLabel("Set Password");
		//password
                pass = new JPasswordField(10);
		//JTEXTFIELD
		f1 = new JTextField(20);
		f2 = new JTextField(20);
		f3 = new JTextField(20);
		f4 = new JTextField(20);
		f5 = new JTextField(20);
		f6 = new JTextField(20);
		f7 = new JTextField(20);
		f8 = new JTextField(20);
		f9 = new JTextField(20);
		f10 = new JTextField(20);
		
		//JButton
		 button = new JButton("Browse Image");
		 b2 = new JButton("Save");
		 
		//JCombobox
		 String  d[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		 dd = new JComboBox(d);
		 String m[] = { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		 mm = new JComboBox(m);
		 String y[] = { "Year", "1985", "1987", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" };
		 yyyy= new JComboBox(y);
		 //////////
		 String  d1[] = {"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		 dd1 = new JComboBox(d);
		 String m1[] = { "Month", "Jan", "Feb", "Mar", "Aprl", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
		 mm1 = new JComboBox(m);
		 String y1[] = { "Year", "1985", "1987", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" ,"2018","2019"};
		 yyyy1= new JComboBox(y1);
		 
		 //setBound
		 l1.setBounds(50,50, 100, 30);
		 
		 l2.setBounds(50,90, 100, 30);
		 f1.setBounds(150,90,100,30);
		 
		 l3.setBounds(50,130, 100, 30);
		 f2.setBounds(150,130,100,30);
		 
		 l4.setBounds(50,170, 100, 30);
		 f3.setBounds(150,170,100,30);
		 
		 l5.setBounds(50,210, 100, 30);
		 f4.setBounds(150,210,100,30);
		 
		 l6.setBounds(50,240, 100, 30);
		 f5.setBounds(150,240,100,30);
		 
		 l7.setBounds(50,290, 100, 10);
		 dd.setBounds(150,290,50,30);
		 mm.setBounds(220,290,70,30);
		 yyyy.setBounds(310,290,70,30);
		
		 l8.setBounds(50,330, 100, 30);
		 f6.setBounds(150,330,100,30);
		 
		 l9.setBounds(50,370, 100, 30);
		 f7.setBounds(150,370,100,30);
		 
		 l10.setBounds(50,410, 100, 30);
		 dd1.setBounds(150,410,50,30);
		 mm1.setBounds(220,410,70,30);
		 yyyy1.setBounds(310,410,70,30);
		 
		 l11.setBounds(50,480, 100, 30);
		 f8.setBounds(150,480,100,30);
		 
		 l12.setBounds(400,370, 100, 30);
		 f9.setBounds(550,370,100,30);
		 l13.setBounds(400,400, 120, 30);
		 f10.setBounds(550,400,100,30);
                 
                 l14.setBounds(400,430,100,30);
                 pass.setBounds(550,430,100,30);
		 
		 //
		 label.setBounds(800,100,400,250);
		 button.setBounds(950,400,100,30);
		 b2.setBounds(600,550,100,30);
		 
		 b2.addActionListener(this);
		 //Add
		 add(l1);
		 add(l2);
		 add(f1);
		 
		 add(l3);
		 add(f2);
		 
		 add(l4);
		 add(f3);
		 
		 add(l5);
		 add(f4);
		 
		 add(l6);
		 add(f5);
		 
		 add(l7);
		 add(dd);
		 add(mm);
		 add(yyyy);
		 
		 add(l8);
		 add(f6);
		 add(label);
		 add(button);
		 add(l9);
		 add(f7);
		 add(l10);
		 add(dd1);
		 add(mm1);
		 add(yyyy1);
		 
		 add(l11);
		 add(f8);
		 add(l12);
		 add(f9);
		 add(l13);
		 add(f10);
                 add(l14);
                 add(pass);
		 add(b2);
		 button.addActionListener(this);
                 //
                  icon  = new ImageIcon("D:\\software\\HumanResource\\PICS\\images.png");
			icon=new ImageIcon(icon.getImage().getScaledInstance(400,250, Image.SCALE_DEFAULT));
			label1 = new JLabel();
			label1.setIcon(icon);
			label1.setBounds(800,100,400,250);
			add(label1);
		 
	}
	public ImageIcon ResizeImage(String ImagePath)
	{
		ImageIcon MyImage = new ImageIcon(ImagePath);
		Image img = MyImage.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		return image;
	}
		 
		 
	 
		 
	




	@Override
	

	        public void actionPerformed(ActionEvent e) {
                    
                 //    Date day = (Date) dd.getSelectedItem(); 
                  String day = (String) dd.getSelectedItem();
                  String month = (String) mm.getSelectedItem();
                  String year = (String) yyyy.getSelectedItem();
                  String date =  year+"-"+ month +"-"+day;
                  int id = Integer.parseInt( f1.getText());
                    String FirstName = f2.getText(); 
                    String LastName = f3.getText();
                    int Phone = Integer.parseInt(f4.getText()); 
                    String Email = f5.getText();
                    String Position = f6.getText(); 
                    int Salary = Integer.parseInt(f7.getText()); 
                    String day1 = (String) dd1.getSelectedItem();
                  String month1 = (String) mm1.getSelectedItem();
                  String year1 = (String) yyyy1.getSelectedItem();
                  String date1 = year1 +"-"+ month1 +"-"+day1;
                    String Address = f8.getText();
                    String EmergencyName = f9.getText(); 
                    int EmergencyPhone =Integer.parseInt( f10.getText()); 
                    String  SetPassword = pass.getText();
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","2502");
            Statement stmt = con.createStatement();
        String query = "insert into newemp (id,FullName,LastName,Phone,Email,DateOfBirth,Position,Salary,DateOfHiring,Address,EmergencyName,EmergencyPhone,Password) values('"+id+"','"+FirstName+"','"+LastName+"','"+Phone+"','"+Email+"','"+date+"','"+Position+"','"+Salary+"','"+date1+"','"+Address+"','"+EmergencyName+"','"+EmergencyPhone+"','"+SetPassword+"')";
        int x = stmt.executeUpdate(query);
                       
                        System.out.println(x);
                         
                        
                    } 
                    catch (ClassNotFoundException cnfe)
                    {
                    System.out.println("Ex" +cnfe);
                
            }
                    catch(SQLException sqle)
                    {
                        System.out.println("Ex" +sqle);
                    }
		if(e.getSource() == b2)
		{
			JOptionPane.showMessageDialog(this, "Information Saved");
		}
	if(e.getSource() == button)
		{
	        
	          JFileChooser file = new JFileChooser();
	          file.setCurrentDirectory(new File(System.getProperty("user.home")));
	          //filter the files
	          FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
	          file.addChoosableFileFilter(filter);
	          int result = file.showSaveDialog(null);
	           //if the user click on save in Jfilechooser
	          if(result == JFileChooser.APPROVE_OPTION){
	              File selectedFile = file.getSelectedFile();
	              String path = selectedFile.getAbsolutePath();
	              label.setIcon(ResizeImage(path));
	          }
	           //if the user click on save in Jfilechooser


	          else if(result == JFileChooser.CANCEL_OPTION){
	              System.out.println("No File Select");
	          }
	        }
	 
	}
	
		 
	public static void main(String[] args)
	{
	/*java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 Newemp frame = new Newemp();
			       
			      // frame.setResizable(false);

				
			}
		});*/
            Newemp frame = new Newemp();
	}
}
		

