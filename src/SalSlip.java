/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Nikhil
 */
public class SalSlip extends JFrame implements ActionListener{
    JLabel j1,j2,j3,j4,j5,j6;
    JComboBox cb1,cb2;
    JButton jb1;
    JTextField jt1,jt2,jt3,jt4,jt5;
    JLabel ic;
    SalSlip()
    {
        setVisible(true);
        setSize(400, 200);
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("SALARY");
        setLayout(null);
        setBounds(10,10,500,300);
	setLocationRelativeTo(null);
        //
        ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\pic6.jpg");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(1500,1000,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
        //
        j1= new JLabel("SALARY SLIPS");
        j2= new JLabel("ID:");
        j3= new JLabel("Days:");
        j4= new JLabel("Advance:");
        j5= new JLabel("Deduction:");
        j6= new JLabel("Month:");
        int i;
        cb1= new JComboBox();
        cb1.addItem("Days");
        for(i=1;i<=31;i++)
        {
            cb1.addItem(i);
        }
        cb2= new JComboBox();
       cb2.addItem("Month");
       cb2.addItem("JAN");
       cb2.addItem("FEB");
       cb2.addItem("MAR");
       cb2.addItem("APR");
       cb2.addItem("MAY");
       cb2.addItem("JUN");
       cb2.addItem("JUL");
       cb2.addItem("AUG");
       cb2.addItem("SEP");
       cb2.addItem("OCT");
       cb2.addItem("NOV");
       cb2.addItem("DEC");
       
       jt1= new JTextField(10);
        jt2= new JTextField(30);
        jt3= new JTextField(10);
        jt4= new JTextField(10);
        jt5= new JTextField(10);
        
       jb1= new JButton("Generate Slip");
       
       j1.setBounds(550,30,400,50);                //j1_SalarySlip
       j1.setFont(new Font("ARIAL", Font.BOLD, 30));
       add(j1);
       j2.setBounds(200,100,100,50);                //j2_ID
       j2.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j2);
       jt1.setBounds(400,110,200,30);               //jt1
       add(jt1);
       j3.setBounds(200,200,100,50);                //j3_Date
       j3.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j3);
       cb1.setBounds(400,200,100,50);
       add(cb1);
       j4.setBounds(200,300,100,50);                //j4_Advance
       j4.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j4);
       jt3.setBounds(400,310,200,30);               //jt3
       add(jt3);
       j5.setBounds(200,400,120,50);                //j5_Deduction
       j5.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j5);
       jt4.setBounds(400,410,200,30);               //jt4
       add(jt4);
       j6.setBounds(200,500,100,50);                //j6_Month
       j6.setFont(new Font("ARIAL", Font.BOLD, 20));
       add(j6);
      cb2.setBounds(400,500,100,50);
      add(cb2);
     jb1.setBounds(400,600,150,50);
     add(jb1);
     
     jb1.addActionListener(this);
    }
    public static void main(String[] args)
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				  SalSlip ss= new SalSlip();
			       
			      // f1.setResizable(false);

				
			}
		});;
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1)
        {
            JOptionPane.showMessageDialog(this, "Slip Generated");
        }
    }
    
}
