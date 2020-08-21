import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DailyWorks extends JFrame {
	JLabel label,label1,label2,label3;
	JTextField txt1,txt2,txt3;
	JLabel ic;
	JButton b1,b2;
	DailyWorks()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
                
                ImageIcon icon = new ImageIcon("D:\\software\\HumanResource\\PICS\\pic11.png");
    	icon = new ImageIcon(icon.getImage().getScaledInstance(1500,1800,Image.SCALE_DEFAULT));
    	ic = new JLabel();
    	ic.setIcon(icon);
    	setContentPane(ic);
		//JLabel
                label = new JLabel("DAILY WORKS");
                label.setFont(new Font("Arial",Font.BOLD,40));
		label1 = new JLabel("ID");
                 label1.setFont(new Font("Arial",Font.BOLD,18));
		label2 = new JLabel("Attendance");
                 label2.setFont(new Font("Arial",Font.BOLD,18));
		label3 = new JLabel("Daily Work");
                 label3.setFont(new Font("Arial",Font.BOLD,18));
		//JTextField
		txt1 = new JTextField(20);
		txt2 = new JTextField(30);
		txt3 = new JTextField(30);
		//JButton
		b1 = new JButton("Submit");
		b2 = new JButton("Clear");
		
		//SetBounds
                label.setBounds(500,50,300,30);
		label1.setBounds(50,150,100,30);
		txt1.setBounds(170,150,100,30);
		
		label2.setBounds(50,220,100,30);
		txt2.setBounds(170,220,200,30);
		
		label3.setBounds(50,270,100,30);
		txt3.setBounds(170,270,200,50);
                
                //JButton
                 b1 = new JButton("Submit");
                 b2 = new JButton("Clear");
                 
                 b1.setBounds(380,400,100,40);
		b2.setBounds(600,400,100,40);
		
		//Add
                add(label);
		add(label1);
		add(txt1);
		
		add(label2);
		add(txt2);
		
		add(label3);
		add(txt3);
		
		add(b1);
                add(b2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 DailyWorks dw = new DailyWorks();
			       
			      //
                              //frame.setResizable(false);

				
			}
		});
		
	}

}
