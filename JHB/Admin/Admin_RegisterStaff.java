package JHB.Admin;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Admin_RegisterStaff extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	GridBagConstraints GBC = new GridBagConstraints();
	JLabel LB1 = new JLabel("Register");
	JLabel LB2 = new JLabel("Staff");
	JLabel LB3 = new JLabel("User Name: ");
	JLabel LB4 = new JLabel("Password: ");
	JLabel LB5 = new JLabel("IC: ");
	JLabel LB6 = new JLabel("Age: ");
	JLabel LB7 = new JLabel("Address: ");
	JPasswordField PWF1 = new JPasswordField();
	JTextField TF1 = new JTextField();
	JTextField TF2 = new JTextField();
	JTextField TF3 = new JTextField();
	JTextField TF4 = new JTextField();
	JButton BT1 = new JButton("Register");
	
	public Admin_RegisterStaff() {
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setVisible(true);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		LB1.setFont(new Font("Serif", Font.BOLD, 35));
		LB2.setFont(new Font("Serif", Font.BOLD, 35));
		LB3.setFont(new Font("Serif", Font.BOLD, 30));
		LB4.setFont(new Font("Serif", Font.BOLD, 30));
		LB5.setFont(new Font("Serif", Font.BOLD, 30));
		LB6.setFont(new Font("Serif", Font.BOLD, 30));
		LB7.setFont(new Font("Serif", Font.BOLD, 30));
		PWF1.setFont(new Font("Serif", Font.BOLD, 30));
		TF1.setFont(new Font("Serif", Font.BOLD, 30));
		TF2.setFont(new Font("Serif", Font.BOLD, 30));
		TF3.setFont(new Font("Serif", Font.BOLD, 30));
		TF4.setFont(new Font("Serif", Font.BOLD, 30));
		BT1.setFont(new Font("Serif", Font.BOLD, 30));
		BT1.setBackground(Color.LIGHT_GRAY);
		
		BT1.addActionListener(this);
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new GridBagLayout());
		
		GBC.gridx = 1;
		GBC.gridy = 0;
		DesktopPane.add(LB1, GBC);
		GBC.gridx = 2;
		GBC.gridy = 0;
		DesktopPane.add(LB2, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		DesktopPane.add(LB3, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		DesktopPane.add(TF1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 2;
		GBC.gridwidth = 1;
		DesktopPane.add(LB4, GBC);
		GBC.gridx = 1;
		GBC.gridy = 2;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		DesktopPane.add(PWF1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 3;
		GBC.gridwidth = 1;
		DesktopPane.add(LB5, GBC);
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		DesktopPane.add(TF2, GBC);
		GBC.gridx = 0;
		GBC.gridy = 4;
		GBC.gridwidth = 1;
		DesktopPane.add(LB6, GBC);
		GBC.gridx = 1;
		GBC.gridy = 4;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		DesktopPane.add(TF3, GBC);
		GBC.gridx = 0;
		GBC.gridy = 5;
		GBC.gridwidth = 1;
		DesktopPane.add(LB7, GBC);
		GBC.gridx = 1;
		GBC.gridy = 5;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		DesktopPane.add(TF4, GBC);
		GBC.gridx = 3;
		GBC.gridy = 6;
		GBC.gridwidth = 1;
		DesktopPane.add(BT1, GBC);
		this.add(DesktopPane);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Register
		if(arg0.getSource() == BT1) {
			
		}
	}

}