package JHB.User;

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
import javax.swing.JTextField;

public class User_Register extends JFrame implements ActionListener {
	JPanel P = new JPanel();
	GridBagConstraints GBC = new GridBagConstraints();
	JLabel LB1 = new JLabel("Register");
	JLabel LB2 = new JLabel("Name:");
	JTextField TF1 = new JTextField();
	JLabel LB3 = new JLabel("Date Of Birth:");
	JTextField TF2 = new JTextField();
	JLabel LB4 = new JLabel("Gender:");
	JTextField TF3 = new JTextField();
	JLabel LB5 = new JLabel("Nationality:");
	JTextField TF4 = new JTextField();
	JLabel LB6 = new JLabel("Weight(KG):");
	JTextField TF5 = new JTextField();
	JLabel LB7 = new JLabel("Height(CM):");
	JTextField TF6 = new JTextField();
	JButton BT1 = new JButton("Register");
	JButton BT2 = new JButton("Cancel");
	
	public User_Register() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.add(P, BorderLayout.CENTER);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		LB1.setFont(new Font("Serif", Font.BOLD, 30));
		LB2.setFont(new Font("Serif", Font.BOLD, 25));
		TF1.setFont(new Font("Serif", Font.BOLD, 25));
		LB3.setFont(new Font("Serif", Font.BOLD, 25));
		TF2.setFont(new Font("Serif", Font.BOLD, 25));
		LB4.setFont(new Font("Serif", Font.BOLD, 25));
		TF3.setFont(new Font("Serif", Font.BOLD, 25));
		LB5.setFont(new Font("Serif", Font.BOLD, 25));
		TF4.setFont(new Font("Serif", Font.BOLD, 25));
		LB6.setFont(new Font("Serif", Font.BOLD, 25));
		TF5.setFont(new Font("Serif", Font.BOLD, 25));
		LB7.setFont(new Font("Serif", Font.BOLD, 25));
		TF6.setFont(new Font("Serif", Font.BOLD, 25));
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		
		P.setBackground(Color.LIGHT_GRAY);
		P.setLayout(new GridBagLayout());
		
		GBC.gridx = 1;
		GBC.gridy = 0;
		P.add(LB1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		P.add(LB2, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 2;
		GBC.gridwidth = 1;
		P.add(LB3, GBC);
		GBC.gridx = 1;
		GBC.gridy = 2;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF2, GBC);
		GBC.gridx = 0;
		GBC.gridy = 3;
		GBC.gridwidth = 1;
		P.add(LB4, GBC);
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF3, GBC);
		GBC.gridx = 0;
		GBC.gridy = 4;
		GBC.gridwidth = 1;
		P.add(LB5, GBC);
		GBC.gridx = 1;
		GBC.gridy = 4;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF4, GBC);
		GBC.gridx = 0;
		GBC.gridy = 5;
		GBC.gridwidth = 1;
		P.add(LB6, GBC);
		GBC.gridx = 1;
		GBC.gridy = 5;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF5, GBC);
		GBC.gridx = 0;
		GBC.gridy = 6;
		GBC.gridwidth = 1;
		P.add(LB7, GBC);
		GBC.gridx = 1;
		GBC.gridy = 6;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF6, GBC);
		GBC.gridx = 1;
		GBC.gridy = 7;
		GBC.gridwidth = 1;
		P.add(BT1, GBC);
		GBC.gridx = 3;
		GBC.gridy = 7;
		P.add(BT2, GBC);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Register
		if(arg0.getSource() == BT1) {
			
		}
		//Cancel
		if(arg0.getSource() == BT2) {
			JFrame UserLogin = new User_Login();
			this.dispose();
		}
	}
}
