/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class FrontPage extends JFrame {

    JButton b;
    JPanel p;

    FrontPage() {
        p = new JPanel(new BorderLayout());
        b = new JButton();
        b.setBackground(Color.black);
        ImageIcon img = new ImageIcon("D:\\software\\HumanResource\\PICS\\images.png");
        b.setIcon(img);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        p.add(b);
        add(p);
       validate();

   }
    public static void main(String args[]) throws IOException {
         java.awt.EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				 FrontPage ob = new FrontPage();
			       ob.setVisible(true);
			     //  f1.setResizable(false);

				
			}
		});;
       
       
    }
}
