import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
	

    
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    JLabel ic;
    JLabel jl = new JLabel("HR MANAGEMENT SYSTEM");

    Login() {
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
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();
            if (userText.equalsIgnoreCase("Rahul") && pwdText.equalsIgnoreCase("12345")) {
              //  JOptionPane.showMessageDialog(this, "Login Successful");
            	setVisible(false);
            	Login1 obj = new Login1();
            }
            	else if (userText.equalsIgnoreCase("Nikhil") && pwdText.equalsIgnoreCase("1234")) {
                    //  JOptionPane.showMessageDialog(this, "Login Successful");
                  	setVisible(false);
                  	Login1 obj = new Login1();
                
            } else {
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

        
        }
    }


    public static void main(String[] a) {
java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 Login frame = new Login();
			       
			       frame.setResizable(false);

				
			}
		});
       
    }

}