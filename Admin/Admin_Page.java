package JHB.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class Admin_Page extends JFrame implements ActionListener {
	//Bar
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton button1 = new JButton("Staff Register");
	JButton button2 = new JButton("Attraction");
	JButton button3 = new JButton("Report");
	JButton button4 = new JButton("Logout");
	//Desktop Pane
	JDesktopPane DesktopPane = new JDesktopPane();
	JInternalFrame RegisterStaff = new Register_Staff();
	
	public Admin_Page() {
		//Frame
		this.setTitle("Admin Page");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		DesktopPane.setLayout(new BorderLayout());
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		//Bar
		panel1.setLayout(new BorderLayout());
		panel1.setBackground(Color.GRAY);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.setBackground(Color.GRAY);
		panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel3.setBackground(Color.GRAY);
		button1.setBackground(Color.LIGHT_GRAY);
		button1.setPreferredSize(new Dimension(300, 70));
		button1.setFont(new Font("Serif", Font.BOLD, 25));
		button1.setBorderPainted(false);
		button2.setBackground(Color.GRAY);
		button2.setPreferredSize(new Dimension(300, 70));
		button2.setFont(new Font("Serif", Font.BOLD, 25));
		button2.setBorderPainted(false);
		button3.setBackground(Color.GRAY);
		button3.setPreferredSize(new Dimension(300, 70));
		button3.setFont(new Font("Serif", Font.BOLD, 25));
		button3.setBorderPainted(false);
		button4.setBackground(Color.GRAY);
		button4.setPreferredSize(new Dimension(300, 70));
		button4.setFont(new Font("Serif", Font.BOLD, 25));
		button4.setBorderPainted(false);
		//ActionListener
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		//Add
		panel1.add(panel2, BorderLayout.CENTER);
		panel1.add(panel3, BorderLayout.EAST);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel3.add(button4);
		DesktopPane.add(RegisterStaff, BorderLayout.CENTER);
		this.add(panel1, BorderLayout.NORTH);
		this.add(DesktopPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Button Staff
		if (arg0.getSource() == button1) {
			//Button Change Color
			button1.setBackground(Color.LIGHT_GRAY);
			button2.setBackground(Color.GRAY);
			button3.setBackground(Color.GRAY);
			//Open and Close Window
			DesktopPane.removeAll();
			DesktopPane.repaint();
			DesktopPane.add(RegisterStaff, BorderLayout.CENTER);
		}
		//Button Attribute
		if (arg0.getSource() == button2) {
			//Button Change Color
			button1.setBackground(Color.GRAY);
			button2.setBackground(Color.LIGHT_GRAY);
			button3.setBackground(Color.GRAY);
			//Open and Close Window
			JInternalFrame attribute = new Attribute();
			DesktopPane.removeAll();
			DesktopPane.repaint();
			DesktopPane.add(attribute, BorderLayout.CENTER);
		}
		//Button Report
		if (arg0.getSource() == button3) {
			//Button Change Color
			button1.setBackground(Color.GRAY);
			button2.setBackground(Color.GRAY);
			button3.setBackground(Color.LIGHT_GRAY);
			//Open and Close Window
			JInternalFrame report = new Report();
			DesktopPane.removeAll();
			DesktopPane.repaint();
			DesktopPane.add(report, BorderLayout.CENTER);
		}
		//Button Logout
		if (arg0.getSource() == button4) {
			//Back to Login
			AdminLogin_Page LoginPage = new AdminLogin_Page();
			this.dispose();
		}
	}
}