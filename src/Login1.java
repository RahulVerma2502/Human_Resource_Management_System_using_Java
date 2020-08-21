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
import javax.swing.*;

/**
 *
 * @author Nikhil
 */

public class Login1 extends JFrame implements ActionListener{
    
    JLabel hr= new JLabel("HUMAN RESOURCE MANAGEMENT");
    JButton j1,j2,j3,j4,j5,j6,j7;
    JLabel ic;
    Login1()
    {
        setVisible(true);
        setSize(400, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Open UP");
        setLayout(null);
        setBounds(10,10,370,600);
        //
          ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\emp1.png");
        icon = new ImageIcon(icon.getImage().getScaledInstance(1500,1800,Image.SCALE_DEFAULT));
        ic  = new JLabel();
        ic.setIcon(icon);
        setContentPane(ic);
        //
	setLocationRelativeTo(null);
        j1= new JButton("New Employee");
        j1.addActionListener(this);
        j2= new JButton("Search");
        j2.addActionListener(this);
        j3= new JButton("Daily Tasks");
        j3.addActionListener(this);
        j4= new JButton("Salary Slips");
        j4.addActionListener(this);
        j5= new JButton("Update");
        j5.addActionListener(this);
        j6= new JButton("Login");
        j6.addActionListener(this);
        j7= new JButton("Logout");
        j7.addActionListener(this);
        
        hr.setBounds(330,50,700,30);
        hr.setFont(new Font("ARIAL", Font.BOLD, 40));
        j1.setBounds(500,150,300,40);
        j2.setBounds(500,220,300,40);
        j3.setBounds(500,290,300,40);
        j4.setBounds(500,360,300,40);
        j5.setBounds(500,430,300,40);
        j6.setBounds(500,500,300,40);
        j7.setBounds(500,570,300,40);
        add(hr);
        add(j1);
        add(j2);
        add(j3);
        add(j4);
        add(j5);
        add(j6);
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
				 Login1 l =new Login1();
			       
			       //f1.setResizable(false);

				
			}
		});;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==j1)
        {
          Newemp em = new Newemp();
        //setVisible(false);
        }
        else if(e.getSource() == j2)
        {
            DisplayEmpData demp = new DisplayEmpData();
        }
        else if(e.getSource() == j3)
        {
            DailyWorks d = new DailyWorks();
        }
        else if(e.getSource()==j4)
        {
            SalSlip s= new SalSlip();
        }
        else if(e.getSource() ==j5)
        {
            Update up =new Update();
        }
        else if(e.getSource()==j6)
        {
            Login f= new Login();
        }
        else if(e.getSource()==j7)
        {
            Login f= new Login();
            setVisible(false);
        }
    }
    
}

