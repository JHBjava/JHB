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

public class User_Login extends JFrame implements ActionListener {
	JDesktopPane dtp;
	JPanel P = new JPanel();
	GridBagConstraints GBC = new GridBagConstraints();
	JLabel LB1 = new JLabel("User");
	JLabel LB2 = new JLabel("Login");
	JLabel LB3 = new JLabel("User IC:");
	JLabel LB4 = new JLabel("");
	JTextField TF1 = new JTextField();
	JButton BT1 = new JButton("Register");
	JButton BT2 = new JButton("Login");
	JButton BT3 = new JButton("EXIT");
	
	public User_Login() {
		dtp = new JDesktopPane() {
			private Image image;
			{
			
				try {
					image = ImageIO.read(new File("src/JHB/g1.jpg"));
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
		
		LB1.setFont(new Font("Serif", Font.BOLD, 35));
		LB1.setOpaque(true);
		LB1.setBackground(Color.WHITE);
		LB2.setFont(new Font("Serif", Font.BOLD, 35));
		LB2.setOpaque(true);
		LB2.setBackground(Color.WHITE);
		LB3.setFont(new Font("Serif", Font.BOLD, 25));
		LB3.setOpaque(true);
		LB3.setBackground(Color.WHITE);
		LB4.setFont(new Font("Serif", Font.BOLD, 25));
		LB4.setOpaque(true);
		LB4.setBackground(Color.WHITE);
		TF1.setFont(new Font("Serif", Font.BOLD, 25));
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		BT3.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		BT3.addActionListener(this);
		
		P.setLayout(new GridBagLayout());
		P.setOpaque(false);
		
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
		GBC.gridx = 1;
		GBC.gridy = 3;
		GBC.gridwidth = 1;
		P.add(BT1, GBC);
		GBC.gridx = 3;
		GBC.gridy = 3;
		P.add(BT2, GBC);
		GBC.gridx = 4;
		GBC.gridy = 4;
		P.add(BT3, GBC);
		GBC.gridx = 0;
		GBC.gridy = 4;
		GBC.gridwidth = 4;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		P.add(LB4, GBC);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Register
		if(arg0.getSource() == BT1) {
			JFrame UserRegister = new User_Register();
			this.dispose();
		}
		//Login
		if(arg0.getSource() == BT2) {
			Customer ct = new Customer(TF1.getText());
			if(ct.customerData() == true) {
				JFrame UserFunction = new User_Function(TF1.getText());
				this.dispose();
			}else {
				TF1.setText("");
				LB4.setText("Please reinsert your ic number");
			}
		}
		//Exit
		if(arg0.getSource() == BT3) {
			this.dispose();
		}
	}

}