
import java.awt.*;

import java.awt.event.*;

import java.sql.*;

import java.util.Vector;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

 

public class Profile extends JFrame implements ActionListener {

 

    JFrame frame1;

    JLabel l0, l1, l2;

    JComboBox c1;

    JButton b1;

    Connection con;

    ResultSet rs, rs1;

    Statement st, st1;

    PreparedStatement pst;

    String ids;

    static JTable table;

    String[] columnNames = {"id","FullName"," LastName","Phone","Email","DateOfBirth", "Position","Salary","DateOfHiring","Address","EmergencyName","EmergencyPhone"};

    String from;

    JTextField idd;
JLabel ic;
    String iddd;
    Profile() {

 
 ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\search.png");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(1400,700,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
        l0 = new JLabel("Employee Information");

        l0.setForeground(Color.red);

        l0.setFont(new Font("ARIAL", Font.BOLD, 20));

        l1 = new JLabel("Enter id:");

        b1 = new JButton("Submit");

 

        l0.setBounds(500, 50, 350, 40);

        l1.setBounds(500, 110, 75, 20);

        b1.setBounds(500, 150, 150, 20);

        b1.addActionListener(this);

 

        setTitle("Fetching Employee Info From DataBase");

        setLayout(null);
        
        setVisible(true);

        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setBounds(10,10,500,500);

        add(l0);

        add(l1);;

        add(b1);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","2502");

            st = con.createStatement();

            rs = st.executeQuery("select id from newemp");

          
           idd= new JTextField(20);
           idd.setBounds(580,110,150,20);
            add(idd);

            st.close();

            rs.close();

        } catch (Exception e) {

        }

    }

 

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            showTableData();

        }

 

    }

 

    public void showTableData() {

 

        frame1 = new JFrame("Database Search Result");

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.setLayout(new BorderLayout());

//TableModel tm = new TableModel();

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames());

//table = new JTable(model);

        table = new JTable();

        table.setModel(model);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);

        scroll.setHorizontalScrollBarPolicy(

        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        scroll.setVerticalScrollBarPolicy(

        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

       // from = (String) c1.getSelectedItem();

//String textvalue = textbox.getText();

        String id1 = "";
        String FullName1= "";

        String LastName1 = "";

      
        
        String Phone1 = "";
          String Email1 = "";
          String DateOfBirth1 = "";

        String Position1 = "";
        String Salary1 = "";
        String DateOfHiring1 = "";
        String Address1 = "";
        String EmergencyName1 = "";
        String EmergencyPhone1 = "";
         
        Statement stmt;

 

        try {
             iddd= idd.getText();
            //pst = con.prepareStatement("select * from newemp where FullName='" + from + "'");
            Connection con1  = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","2502");
            st = con1.createStatement();
            ResultSet rs = st.executeQuery("select * from newemp where id='" + iddd + "'");

            int i = 0;

            if (rs.next()) {

               id1 = rs.getString("id");
                FullName1 = rs.getString("FullName");

                LastName1 = rs.getString("LastName");
                
                Phone1 = rs.getString("Phone");

                 Email1= rs.getString("Email");
                                 
                DateOfBirth1 = rs.getString("DateOfBirth");
                

                Position1 = rs.getString("Position");
                                
                Salary1 = rs.getString("Salary");
                                
                DateOfHiring1 = rs.getString("DateOfHiring");
                                
                Address1 = rs.getString("Address");
                                
                EmergencyName1 = rs.getString("EmergencyName");
                                
                EmergencyPhone1 = rs.getString("EmergencyPhone");
      
                model.addRow(new Object[]{id1,FullName1, LastName1,Phone1,Email1,DateOfBirth1, Position1,Salary1,DateOfHiring1,Address1,EmergencyName1,EmergencyPhone1});

                i++;

            }

            if (i < 1) {

                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            }

            if (i == 1) {

                System.out.println(i + " Record Found");
                System.out.println(FullName1);

            } else {

                System.out.println(i + " Records Found");

            }

        } catch (Exception ex) {

            System.out.println("Ex "+ex + " "+ex.getMessage());
            ex.printStackTrace();
        }

        frame1.add(scroll);

        frame1.setVisible(true);

        frame1.setSize(400, 300);

    }

 

    public static void main(String args[]) {

        new Profile();
                //setResizable(false);
        

    }

}
