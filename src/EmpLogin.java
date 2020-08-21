import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpLogin extends JFrame implements ActionListener {
	

    
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JLabel ic;
    JLabel jl = new JLabel("HR MANAGEMENT SYSTEM");

    EmpLogin() {
    	setVisible(true);
    	 setTitle("Login Form");
         //userTextField.setText("ffff");
         //userTextField.setEnabled(false);
         
 setBounds(10, 10, 370, 600);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\pic22.jpg");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(370,600,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
    	
    	setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        setLayout(null);
        

    }

   
    public void setLocationAndSize() {
    	userLabel.setFont(new Font("CYAN",23,16));
    	jl.setBounds(100, 50, 200, 30);
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);


    }

    public void addComponentsToContainer() {
    	add(jl);
        add(userLabel);
        add(passwordLabel);
        add(userTextField);
        add(passwordField);
        add(showPassword);
        add(loginButton);
        add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("jjjjj");
           String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
         if (e.getSource() == resetButton)
         {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword)
        {
            if (showPassword.isSelected()) 
            {
                passwordField.setEchoChar((char) 0);
            } else 
            {
                passwordField.setEchoChar('*');
            }
        }
        if(e.getSource()==loginButton)
        {
                String from=userTextField.getText();
        String password=passwordField.getText();
            System.out.println(from+" "+password);
         try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information","root","2502");
            Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from newemp where FullName='" + from + "'and password='"+password+"'");

            int i = 0;
        if(rs.next())
        {
            i++;
            System.out.println(i+"User(s) Found");
            Login2 obj = new Login2();
        }
        else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        //int x = stmt.executeUpdate(query);
                       
                     //   System.out.println(x);
                        
                        
                    } 
                    catch (ClassNotFoundException cnfe)
                    {
                    System.out.println("Ex" +cnfe);
                
            }
                    catch(SQLException sqle)
                    {
                        System.out.println("Ex" +sqle);
                    }
        }
         /*if (e.getSource() == loginButton)
        {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Rahul") && pwdText.equalsIgnoreCase("12345")) 
            {
              //  JOptionPane.showMessageDialog(this, "Login Successful");
            	setVisible(false);
            	Login2 obj = new Login2();
            }
            	
            
                
             else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
*/
      

    }
    public static void main(String[] a) {
 java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 EmpLogin frame = new EmpLogin();
			       
			      //
                              //frame.setResizable(false);

				
			}
		});
      
    }
}