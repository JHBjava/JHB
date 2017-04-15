package JHB.User;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class User_Function extends JFrame implements ActionListener {
	GridBagConstraints GBC = new GridBagConstraints();
	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JPanel P3 = new JPanel();
	JPanel P4 = new JPanel();
	JPanel P5 = new JPanel();
	JButton BT1 = new JButton("Buy Ticket");
	JLabel LB1 = new JLabel("Thrill");
	JLabel LB2 = new JLabel("Children");
	
	public User_Function(String name) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		GBC.insets = new Insets(5, 5, 5, 5);
		
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		LB1.setFont(new Font("Serif", Font.BOLD, 30));
		LB2.setFont(new Font("Serif", Font.BOLD, 30));
		
		P1.setLayout(new BorderLayout());
		P1.add(LB1, BorderLayout.NORTH);
		P1.add(P4, BorderLayout.CENTER);
		P2.setLayout(new BorderLayout());
		P2.add(P3, BorderLayout.SOUTH);
		P2.add(LB2, BorderLayout.NORTH);
		P2.add(P5, BorderLayout.CENTER);
		P3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P3.add(BT1);
		P4.setLayout(new GridBagLayout());
		
		P5.setLayout(new GridBagLayout());
		
		this.add(P1, BorderLayout.CENTER);
		this.add(P2, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
