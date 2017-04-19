package JHB.User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import JHB.Class.Customer;

public class User_Register extends JFrame implements ActionListener {
	JDesktopPane dtp;
	JPanel P = new JPanel();
	GridBagConstraints GBC = new GridBagConstraints();
	JLabel LB1 = new JLabel("Register");
	JLabel LB2 = new JLabel("Name:");
	JTextField TF1 = new JTextField();
	JLabel LB3 = new JLabel("IC:");
	JTextField TF2 = new JTextField();
	JLabel LB4 = new JLabel("Date Of Birth:");
	JTextField TF3 = new JTextField();
	JLabel LB5 = new JLabel("Gender:");
	JTextField TF4 = new JTextField();
	JLabel LB6 = new JLabel("Nationality:");
	JTextField TF5 = new JTextField();
	JLabel LB7 = new JLabel("Weight(KG):");
	JTextField TF6 = new JTextField();
	JLabel LB8 = new JLabel("Height(CM):");
	JTextField TF7 = new JTextField();
	JLabel LB9 = new JLabel("");
	JButton BT1 = new JButton("Register");
	JButton BT2 = new JButton("Cancel");
	
	public User_Register() {
		dtp = new JDesktopPane() {
			private Image image;
			{
			
				try {
					image = ImageIO.read(new File("src/JHB/g2.jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
			}
		};
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.add(dtp, BorderLayout.CENTER);
		
		dtp.setLayout(new BorderLayout());
		dtp.add(P, BorderLayout.CENTER);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		LB1.setFont(new Font("Serif", Font.BOLD, 30));
		LB1.setOpaque(true);
		LB1.setBackground(Color.WHITE);
		LB2.setFont(new Font("Serif", Font.BOLD, 25));
		LB2.setOpaque(true);
		LB2.setBackground(Color.WHITE);
		TF1.setFont(new Font("Serif", Font.BOLD, 25));
		LB3.setFont(new Font("Serif", Font.BOLD, 25));
		LB3.setOpaque(true);
		LB3.setBackground(Color.WHITE);
		TF2.setFont(new Font("Serif", Font.BOLD, 25));
		LB4.setFont(new Font("Serif", Font.BOLD, 25));
		LB4.setOpaque(true);
		LB4.setBackground(Color.WHITE);
		TF3.setFont(new Font("Serif", Font.BOLD, 25));
		LB5.setFont(new Font("Serif", Font.BOLD, 25));
		LB5.setOpaque(true);
		LB5.setBackground(Color.WHITE);
		TF4.setFont(new Font("Serif", Font.BOLD, 25));
		LB6.setFont(new Font("Serif", Font.BOLD, 25));
		LB6.setOpaque(true);
		LB6.setBackground(Color.WHITE);
		TF5.setFont(new Font("Serif", Font.BOLD, 25));
		LB7.setFont(new Font("Serif", Font.BOLD, 25));
		LB7.setOpaque(true);
		LB7.setBackground(Color.WHITE);
		TF6.setFont(new Font("Serif", Font.BOLD, 25));
		LB8.setFont(new Font("Serif", Font.BOLD, 25));
		LB8.setOpaque(true);
		LB8.setBackground(Color.WHITE);
		TF7.setFont(new Font("Serif", Font.BOLD, 25));
		LB9.setFont(new Font("Serif", Font.BOLD, 25));
		LB9.setOpaque(true);
		LB9.setBackground(Color.WHITE);
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		
		P.setLayout(new GridBagLayout());
		P.setOpaque(false);
		
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
		GBC.gridx = 0;
		GBC.gridy = 7;
		GBC.gridwidth = 1;
		P.add(LB8, GBC);
		GBC.gridx = 1;
		GBC.gridy = 7;
		GBC.gridwidth = 3;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(TF7, GBC);
		GBC.gridx = 0;
		GBC.gridy = 9;
		GBC.gridwidth = 5;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(LB9, GBC);
		GBC.gridx = 1;
		GBC.gridy = 8;
		GBC.gridwidth = 1;
		P.add(BT1, GBC);
		GBC.gridx = 3;
		GBC.gridy = 8;
		P.add(BT2, GBC);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Register
		if(arg0.getSource() == BT1) {
			try {
				int weight = Integer.parseInt(TF6.getText());
				int height = Integer.parseInt(TF7.getText());
				Customer ctm = new Customer(TF1.getText(), TF2.getText(), TF3.getText(), TF4.getText(), TF5.getText(), weight, height);
				if(ctm.AddCustomer() != false) {
					JFrame UserFunction = new User_Function(TF2.getText());
					this.dispose();
				}else {
					LB9.setText("Register Faill! Please Register again!");
				}
			}catch (Exception e) {
				LB9.setText("Please fail all the blank!");
			}
		}
		//Cancel
		if(arg0.getSource() == BT2) {
			JFrame UserLogin = new User_Login();
			this.dispose();
		}
	}
}
