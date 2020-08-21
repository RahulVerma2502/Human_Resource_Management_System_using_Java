/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Nikhil
 */
public class Password extends JFrame implements ActionListener{
JLabel j1,j2,j3,j4;
JTextField txt1,txt2,txt3;
JButton button;
    Password()
    {
        setVisible(true);
        setSize(400, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("UPADTE");
        setLayout(null);
        setBounds(10,10,500,300);
	setLocationRelativeTo(null);
        j1= new JLabel("UPDATE PASSWORD");
        j2= new JLabel("Old Password:");
        j3= new JLabel("New Password:");
        j4= new JLabel("Confirm Password:");
        
        //JTextField
        txt1 = new JTextField(30);
        txt2 = new JTextField(30);
        txt3 = new JTextField(30);
        
        //JButton
        
        button =new JButton("Submit");
        
       j1.setBounds(800,50,400,50);                //j1_Update
       j1.setFont(new Font("ARIAL", Font.BOLD, 30));
    
       add(j1);
       j2.setBounds(200,100,200,50);                //j2_Old
       j2.setFont(new Font("ARIAL", Font.BOLD, 20));
       txt1.setBounds(400,100,100,50);
       add(j2);
       add(txt1);
       j3.setBounds(200,200,200,50);                //j3_Date
       j3.setFont(new Font("ARIAL", Font.BOLD, 20));
       txt2.setBounds(400,200,100,50);
       add(j3);
       add(txt2);
       j4.setBounds(200,300,200,50);                //j4_Advance
       j4.setFont(new Font("ARIAL", Font.BOLD, 20));
       txt3.setBounds(400,300,100,50);
       add(j4);
       add(txt3);
       
       button.setBounds(500,500,100,30);
       add(button);
       button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == button)
       {
           JOptionPane.showMessageDialog(this,"SAVED");
       }
    }
    public static void main(String[] args)
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 Password p = new Password();
			       
        			       //f1.setResizable(false);

				
			}
		});;
        
    }
            
}
