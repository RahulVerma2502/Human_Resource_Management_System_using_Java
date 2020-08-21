/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author Nikhil
 */

public class Login2 extends JFrame implements ActionListener{
    
    JLabel hr= new JLabel("EMPLOYEE MANAGEMENT");
    JButton j1,j2,j3,j4,j5,j6,j7;
    JLabel ic;
    Login2()
    {
        setVisible(true);
        setSize(400, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Open UP");
        //
          ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\emp1.png");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(1500,1800,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
        //
        setLayout(null);
        setBounds(10,10,370,600);
	setLocationRelativeTo(null);
        j1= new JButton("My Profile");
        j1.addActionListener(this);
        //j2= new JButton("Search");
        j3= new JButton("Daily Tasks");
        j3.addActionListener(this);
        j4= new JButton("Salary Slips");
        j4.addActionListener(this);
        j5= new JButton("Update");
        j5.addActionListener(this);
        j7= new JButton("Logout");
        j7.addActionListener(this);
        
       hr.setBounds(470,50,400,50);                
       hr.setFont(new Font("ARIAL", Font.BOLD, 30));
        j1.setBounds(500,150,300,40);
        j3.setBounds(500,220,300,40);
        j4.setBounds(500,290,300,40);
        j5.setBounds(500,360,300,40);
        j7.setBounds(500,430,300,40);
        //
         
        //j7.setBounds(50,500,300,40);
       
        add(hr);
        add(j1);
        //add(j2);
        add(j3);
        add(j4);
        add(j5);
        add(j7);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Login2 h =new Login2();
			       
			      // f1.setResizable(false);

				
			}
		});;
      //  Login2 h= new Login2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==j1)
        {
          Profile em = new Profile();
        //setVisible(false);
        }
         if(e.getSource()==j3)
        {
          DailyWorks em = new DailyWorks();
        //setVisible(false);
        }
        else if(e.getSource()==j4)
        {
            SalSlip s= new SalSlip();
        }
        else if(e.getSource()==j7)
        {
            First f= new First();
        }
        else if(e.getSource()==j5)
        {
            Update u= new Update();
        }
    }
    
}
