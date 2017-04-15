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

public class Admin_Function extends JFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JPanel P3 = new JPanel();
	JButton BT1 = new JButton("Register Staff");
	JButton BT2 = new JButton("Attraction");
	JButton BT3 = new JButton("Report");
	JButton BT4 = new JButton("Logout");
	
	JInternalFrame RegisterStaff = new Admin_RegisterStaff();
	
	public Admin_Function() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		DesktopPane.setLayout(new BorderLayout());
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		
		P1.setLayout(new BorderLayout());
		P1.setBackground(Color.GRAY);
		P2.setLayout(new FlowLayout(FlowLayout.LEFT));
		P2.setBackground(Color.GRAY);
		P3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P3.setBackground(Color.GRAY);
		BT1.setBackground(Color.LIGHT_GRAY);
		BT1.setPreferredSize(new Dimension(250, 50));
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT1.setBorderPainted(false);
		BT2.setBackground(Color.LIGHT_GRAY);
		BT2.setPreferredSize(new Dimension(250, 50));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setBorderPainted(false);
		BT3.setBackground(Color.LIGHT_GRAY);
		BT3.setPreferredSize(new Dimension(250, 50));
		BT3.setFont(new Font("Serif", Font.BOLD, 25));
		BT3.setBorderPainted(false);
		BT4.setBackground(Color.LIGHT_GRAY);
		BT4.setPreferredSize(new Dimension(250, 50));
		BT4.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT4.setBorderPainted(false);
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		BT3.addActionListener(this);
		BT4.addActionListener(this);
		
		P1.add(P2, BorderLayout.CENTER);
		P1.add(P3, BorderLayout.EAST);
		P2.add(BT1);
		P2.add(BT2);
		P2.add(BT3);
		P3.add(BT4);
		DesktopPane.add(RegisterStaff, BorderLayout.CENTER);
		this.add(P1, BorderLayout.NORTH);
		this.add(DesktopPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Register Staff
		if (arg0.getSource() == BT1) {
			BT1.setBackground(Color.LIGHT_GRAY);
			BT2.setBackground(Color.GRAY);
			BT3.setBackground(Color.GRAY);
			
			DesktopPane.removeAll();
			DesktopPane.repaint();
			DesktopPane.add(RegisterStaff, BorderLayout.CENTER);
		}
		//Attribute
		if (arg0.getSource() == BT2) {
			BT1.setBackground(Color.GRAY);
			BT2.setBackground(Color.LIGHT_GRAY);
			BT3.setBackground(Color.GRAY);
			
			
			DesktopPane.removeAll();
			DesktopPane.repaint();
			JInternalFrame Attribute = new Admin_Attribute();
			DesktopPane.add(Attribute, BorderLayout.CENTER);
		}
		//Report
		if (arg0.getSource() == BT3) {
			BT1.setBackground(Color.GRAY);
			BT2.setBackground(Color.GRAY);
			BT3.setBackground(Color.LIGHT_GRAY);
			
			JInternalFrame Report = new Admin_Report();
			DesktopPane.removeAll();
			DesktopPane.repaint();
			DesktopPane.add(Report, BorderLayout.CENTER);
		}
		//Logout
		if (arg0.getSource() == BT4) {
			Admin_Login Login = new Admin_Login();
			this.dispose();
		}
	}
}
