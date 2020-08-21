
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//for information message

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class First extends JFrame implements ActionListener{
    JLabel j1,j2,j3,ic;
    JButton jb1,jb2;
    
    First()
    {
        setVisible(true);
        setSize(1500, 1500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("NEW");
        setLayout(null);
        setBounds(10,10,1200,800);
	setLocationRelativeTo(null);
        //to centre the frame
        //
        ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\emp1.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(1200,1800,Image.SCALE_DEFAULT));
        ic  = new JLabel();
        ic.setIcon(icon);
        setContentPane(ic);
        //
        j1= new JLabel("HUMAN RESOURCE MANAGEMENT LOGIN");
        j2= new JLabel("Login as Employee");
        j3= new JLabel("Login as Admin");
        jb1= new JButton("LOGIN");
        jb2= new JButton("LOGIN");
        
        j1.setBounds(350,20,700,200);                //j1_HRM
       j1.setFont(new Font("ARIAL", Font.BOLD, 30));
       add(j1);
       j2.setBounds(330,400,200,50);                //j2_user
       j2.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j2);
       j3.setBounds(830,400,220,50);                //j3_ADMIN
       j3.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j3);
       jb1.setBounds(300,205,220,200);
        ImageIcon img = new ImageIcon("D:\\software\\HumanResource\\PICS\\emp.png");
        jb1.setIcon(img);
        jb1.addActionListener(this);
       add(jb1);
       jb2.setBounds(800,205,220,200);
       ImageIcon img1 = new ImageIcon("D:\\software\\HumanResource\\PICS\\admin2.png");
        jb2.setIcon(img1);
        jb2.addActionListener(this);
       add(jb2);
    }
public static void main(String[] args)
{
   java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 First f1 = new First();
			       
			       f1.setResizable(false);

				
			}
		});;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb1)
        {
            EmpLogin f= new EmpLogin();
        }
        if(e.getSource()==jb2)
        {
            Login h= new Login();
        }
        }
}
