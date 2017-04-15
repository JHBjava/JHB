package JHB.User;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class User_Function extends JFrame implements ActionListener {
	GridBagConstraints GBC = new GridBagConstraints();
	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JPanel P3 = new JPanel();
	JPanel P4 = new JPanel();
	JPanel P5 = new JPanel();
	JButton BT1 = new JButton("Buy Ticket");
	JButton BT2 = new JButton("Exit");
	JLabel LB1 = new JLabel("Children");
	JLabel LB2 = new JLabel("Thrill");
	JLabel LBIMG1 = new JLabel(new ImageIcon("src/JHB/children/Cosmic Coaster.jpg"));
	JLabel LBIMG2 = new JLabel(new ImageIcon("src/JHB/children/Flying Ace Balloon Race.jpg"));
	JLabel LBIMG3 = new JLabel(new ImageIcon("src/JHB/children/Linus Launcher.jpg"));
	JLabel LBIMG4 = new JLabel(new ImageIcon("src/JHB/children/Linus' Beetle Bugs.jpg"));
	JLabel LBIMG5 = new JLabel(new ImageIcon("src/JHB/children/Lucys Tugboat.jpg"));
	JLabel LBIMG6 = new JLabel(new ImageIcon("src/JHB/children/Pirate Train.jpg"));
	JLabel LBIMG7 = new JLabel(new ImageIcon("src/JHB/thrill/Delirium.jpg"));
	JLabel LBIMG8 = new JLabel(new ImageIcon("src/JHB/thrill/drowtower.jpg"));
	JLabel LBIMG9 = new JLabel(new ImageIcon("src/JHB/thrill/Monsoon 360.jpg"));
	JLabel LBIMG10 = new JLabel(new ImageIcon("src/JHB/thrill/Roller coasters .jpg"));
	JLabel LBIMG11 = new JLabel(new ImageIcon("src/JHB/thrill/thrillcone.jpg"));
	JLabel LBIMG12 = new JLabel(new ImageIcon("src/JHB/thrill/Vortex.jpg"));
	JCheckBox CB1 = new JCheckBox("Cosmic Coaster");
	JCheckBox CB2 = new JCheckBox("Flying Ace Balloon Race");
	JCheckBox CB3 = new JCheckBox("Linus Launcher");
	JCheckBox CB4 = new JCheckBox("Linus Beetle Bug");
	JCheckBox CB5 = new JCheckBox("Lucy Tugboat");
	JCheckBox CB6 = new JCheckBox("Pirate Train");
	JCheckBox CB7 = new JCheckBox("Deliriun");
	JCheckBox CB8 = new JCheckBox("Drowtower");
	JCheckBox CB9 = new JCheckBox("Monsoon");
	JCheckBox CB10 = new JCheckBox("Roller Coaster");
	JCheckBox CB11 = new JCheckBox("Thrillcone");
	JCheckBox CB12 = new JCheckBox("Vortex");
	
	public User_Function(String name) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		LB1.setFont(new Font("Serif", Font.BOLD, 60));
		LB2.setFont(new Font("Serif", Font.BOLD, 60));
		LBIMG1.setPreferredSize(new Dimension(300, 200));
		LBIMG2.setPreferredSize(new Dimension(300, 200));
		LBIMG3.setPreferredSize(new Dimension(300, 200));
		LBIMG4.setPreferredSize(new Dimension(300, 200));
		LBIMG5.setPreferredSize(new Dimension(300, 200));
		LBIMG6.setPreferredSize(new Dimension(300, 200));
		LBIMG7.setPreferredSize(new Dimension(300, 200));
		LBIMG8.setPreferredSize(new Dimension(300, 200));
		LBIMG9.setPreferredSize(new Dimension(300, 200));
		LBIMG10.setPreferredSize(new Dimension(300, 200));
		LBIMG11.setPreferredSize(new Dimension(300, 200));
		LBIMG12.setPreferredSize(new Dimension(300, 200));
		CB1.setFont(new Font("Serif", Font.BOLD, 25));
		CB2.setFont(new Font("Serif", Font.BOLD, 25));
		CB3.setFont(new Font("Serif", Font.BOLD, 25));
		CB4.setFont(new Font("Serif", Font.BOLD, 25));
		CB5.setFont(new Font("Serif", Font.BOLD, 25));
		CB6.setFont(new Font("Serif", Font.BOLD, 25));
		CB7.setFont(new Font("Serif", Font.BOLD, 25));
		CB8.setFont(new Font("Serif", Font.BOLD, 25));
		CB9.setFont(new Font("Serif", Font.BOLD, 25));
		CB10.setFont(new Font("Serif", Font.BOLD, 25));
		CB11.setFont(new Font("Serif", Font.BOLD, 25));
		CB12.setFont(new Font("Serif", Font.BOLD, 25));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		
		P1.setLayout(new BorderLayout());
		P1.add(LB1, BorderLayout.NORTH);
		P1.add(P4, BorderLayout.CENTER);
		P2.setLayout(new BorderLayout());
		P2.add(LB2, BorderLayout.NORTH);
		P2.add(P5, BorderLayout.CENTER);
		P3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P3.add(BT1);
		P3.add(BT2);
		P4.setLayout(new GridBagLayout());
		P4.setPreferredSize(new Dimension(this.getWidth(), 450));
		GBC.gridx = 0;
		GBC.gridy = 0;
		P4.add(LBIMG1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		P4.add(CB1, GBC);
		GBC.gridx = 1;
		GBC.gridy = 0;
		P4.add(LBIMG2, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		P4.add(CB2, GBC);
		GBC.gridx = 2;
		GBC.gridy = 0;
		P4.add(LBIMG3, GBC);
		GBC.gridx = 2;
		GBC.gridy = 1;
		P4.add(CB3, GBC);
		GBC.gridx = 3;
		GBC.gridy = 0;
		P4.add(LBIMG4, GBC);
		GBC.gridx = 3;
		GBC.gridy = 1;
		P4.add(CB4, GBC);
		GBC.gridx = 4;
		GBC.gridy = 0;
		P4.add(LBIMG5, GBC);
		GBC.gridx = 4;
		GBC.gridy = 1;
		P4.add(CB5, GBC);
		GBC.gridx = 5;
		GBC.gridy = 0;
		P4.add(LBIMG6, GBC);
		GBC.gridx = 5;
		GBC.gridy = 1;
		P4.add(CB6, GBC);
		P5.setLayout(new GridBagLayout());
		GBC.gridx = 0;
		GBC.gridy = 0;
		P5.add(LBIMG7, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		P5.add(CB7, GBC);
		GBC.gridx = 1;
		GBC.gridy = 0;
		P5.add(LBIMG8, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		P5.add(CB8, GBC);
		GBC.gridx = 2;
		GBC.gridy = 0;
		P5.add(LBIMG9, GBC);
		GBC.gridx = 2;
		GBC.gridy = 1;
		P5.add(CB9, GBC);
		GBC.gridx = 3;
		GBC.gridy = 0;
		P5.add(LBIMG10, GBC);
		GBC.gridx = 3;
		GBC.gridy = 1;
		P5.add(CB10, GBC);
		GBC.gridx = 4;
		GBC.gridy = 0;
		P5.add(LBIMG11, GBC);
		GBC.gridx = 4;
		GBC.gridy = 1;
		P5.add(CB11, GBC);
		GBC.gridx = 5;
		GBC.gridy = 0;
		P5.add(LBIMG12, GBC);
		GBC.gridx = 5;
		GBC.gridy = 1;
		P5.add(CB12, GBC);
		this.add(P1, BorderLayout.NORTH);
		this.add(P2, BorderLayout.CENTER);
		this.add(P3, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Buy Ticket
		if(arg0.getSource() == BT1) {
			
		}
		//Exit
		if(arg0.getSource() == BT2) {
			JFrame UserLogin = new User_Login();
			this.dispose();
		}
	}

}
