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
public class Update extends JFrame implements ActionListener{
    JButton jb1,jb2;
    JLabel j1;
    
    Update()
    {
        setVisible(true);
        setSize(400, 200);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("UPADTE");
        setLayout(null);
        setBounds(10,10,500,300);
	setLocationRelativeTo(null);
        j1= new JLabel("UPDATE DETAILS");
        jb1= new JButton("Update Employee");
        jb2= new JButton("Change Password");
        jb2.addActionListener(this);
        
        j1.setBounds(530,50,400,50);                //j1_Update
       j1.setFont(new Font("ARIAL", Font.BOLD, 30));
       add(j1);
       
       jb1.setBounds(300,200,150,50);               //Update
       add(jb1);
       jb2.setBounds(800,200,150,50);              //Pwd
       add(jb2);
        //
        //jb1.addActionListener(this);
        jb2.addActionListener(this);
        
    }
    public static void main(String[] args)
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 Update u= new Update();
			       
			      // f1.setResizable(false);

				
			}
		});;
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if(e.getSource() == jb1)
        {
            DisplayEmpData demp = new DisplayEmpData();
        }*/
        if(e.getSource() == jb2)
        {
            Password pwd = new Password();
        }
       
    }
}
