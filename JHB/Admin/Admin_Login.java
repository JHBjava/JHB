package JHB.Admin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import JHB.Class.Staff;

public class Admin_Login extends JFrame implements ActionListener {
	JPanel P = new JPanel();
	GridBagConstraints GBC = new GridBagConstraints();
	JLabel LB1 = new JLabel("Admin");
	JLabel LB2 = new JLabel("Login");
	JLabel LB3 = new JLabel("User Name:");
	JTextField TF1 = new JTextField();
	JLabel LB4 = new JLabel("Password:");
	JPasswordField PWF1 = new JPasswordField();
	JLabel LB5 = new JLabel("");
	JButton BT1 = new JButton("Login");
	JButton BT2 = new JButton("EXIT");
	
	public Admin_Login() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.add(P, BorderLayout.CENTER);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		LB1.setFont(new Font("Serif", Font.BOLD, 35));
		LB2.setFont(new Font("Serif", Font.BOLD, 35));
		LB3.setFont(new Font("Serif", Font.BOLD, 25));
		TF1.setFont(new Font("Serif", Font.BOLD, 25));
		LB4.setFont(new Font("Serif", Font.BOLD, 25));
		PWF1.setFont(new Font("Serif", Font.BOLD, 25));
		LB5.setFont(new Font("Serif", Font.BOLD, 25));
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		
		P.setBackground(Color.LIGHT_GRAY);
		P.setLayout(new GridBagLayout());
		
		GBC.gridx = 1;
		GBC.gridy = 0;
		P.add(LB1, GBC);
		GBC.gridx = 2;
		GBC.gridy = 0;
		P.add(LB2, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		P.add(LB3, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 2;
		GBC.gridwidth = 1;
		P.add(LB4, GBC);
		GBC.gridx = 1;
		GBC.gridy = 2;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(PWF1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 4;
		GBC.gridwidth = 5;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(LB5, GBC);
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.gridwidth = 1;
		P.add(BT1, GBC);
		GBC.gridx = 3;
		GBC.gridy = 3;
		P.add(BT2, GBC);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Login
		if(arg0.getSource() == BT1) {
			Staff st = new Staff(TF1.getText(), PWF1.getText().toString());
			
			if(st.StaffData() == true) {
				JFrame AdminFunction = new Admin_Function();
				this.dispose();
			}else {
				TF1.setText("");
				PWF1.setText("");
				LB5.setText("Please reinsert your user name and password!");
			}
		}
		//Exit
		if(arg0.getSource() == BT2) {
			this.dispose();
		}
	}

}