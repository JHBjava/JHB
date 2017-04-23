package JHB.User;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class User_Ticket extends JFrame implements ActionListener {
	GridBagConstraints GBC = new GridBagConstraints();
	JDesktopPane dtp;
	JPanel P1 = new JPanel();
	JScrollPane SP = new JScrollPane(P1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	JPanel P2 = new JPanel();
	JPanel[] P3;
	JLabel[] L1, L2, L3;
	JLabel L4 = new JLabel("RM ");
	JButton BT = new JButton("Close");
	
	public User_Ticket(String ic, String[] name, double[] price) {
		dtp = new JDesktopPane() {
			private Image image;
			{
			
				try {
					image = ImageIO.read(new File("src/JHB/g3.jpg"));
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
		this.setUndecorated(true);
		this.setBounds(100, 100, 500, 330);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.add(dtp, BorderLayout.CENTER);
		
		dtp.setLayout(new BorderLayout());
		dtp.add(SP, BorderLayout.CENTER);
		dtp.add(P2, BorderLayout.SOUTH);
		
		SP.setOpaque(false);
		SP.getViewport().setOpaque(false);
		SP.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
		
		P1.setLayout(new BoxLayout(P1, BoxLayout.Y_AXIS));
		P1.setOpaque(false);
		
		P2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P2.setOpaque(false);
		P2.add(L4);
		P2.add(BT);
		
		L4.setFont(new Font("Serif", Font.BOLD, 30));
		L4.setOpaque(true);
		L4.setBackground(Color.WHITE);
		
		BT.setFont(new Font("Serif", Font.BOLD, 30));
		BT.addActionListener(this);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		P3 = new JPanel[name.length];
		L1 = new JLabel[name.length];
		L2 = new JLabel[name.length];
		L3 = new JLabel[name.length];
		double total = 0;
		for(int i = 0; i < name.length; i++) {
			P3[i] = new JPanel();
			P3[i].setLayout(new GridBagLayout());
			P3[i].setBackground(new Color(255, 255, 255, 50));
			L1[i] = new JLabel("IC: " + ic);
			L1[i].setFont(new Font("Serif", Font.BOLD, 35));
			L1[i].setOpaque(true);
			L1[i].setBackground(Color.WHITE);
			L2[i] = new JLabel(name[i]);
			L2[i].setFont(new Font("Serif", Font.BOLD, 35));
			L2[i].setOpaque(true);
			L2[i].setBackground(Color.WHITE);
			L3[i] = new JLabel("RM " + String.valueOf(price[i]));
			L3[i].setFont(new Font("Serif", Font.BOLD, 35));
			L3[i].setOpaque(true);
			L3[i].setBackground(Color.WHITE);
			GBC.gridx = 0;
			GBC.gridy = 0;
			P3[i].add(L1[i], GBC);
			GBC.gridx = 1;
			GBC.gridy = 1;
			P3[i].add(L2[i], GBC);
			GBC.gridx = 2;
			GBC.gridy = 1;
			P3[i].add(L3[i], GBC);
			P1.add(P3[i]);
			total += price[i];
		}
		L4.setText(L4.getText() + total);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//close
		if(arg0.getSource() == BT) {
			this.dispose();
		}
	}
	
}
