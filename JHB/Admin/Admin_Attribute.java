package JHB.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Admin_Attribute extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	GridBagConstraints GBC = new GridBagConstraints();
	JTabbedPane pane = new JTabbedPane();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	ImageIcon iconLogo1 = new ImageIcon("src/JHB/children/Cosmic Coaster.jpg");
	ImageIcon iconLogo2 = new ImageIcon("src/JHB/children/Cosmic Coaster.jpg");
	JButton b1 = new JButton("Login1");
	JButton b2 = new JButton("Login2");
	JLabel l1 = new JLabel("Name:");
	JLabel l2 = new JLabel("Min Age:");
	JLabel l3 = new JLabel("Max Weight:");
	JLabel l4 = new JLabel("Duration:");
	JLabel l5 = new JLabel("Price:");
	JLabel l6 = new JLabel(iconLogo1);
	
	JLabel l7 = new JLabel("Name:");
	JLabel l8 = new JLabel("Min Age:");
	JLabel l9 = new JLabel("Max Weight:");
	JLabel l10 = new JLabel("Duration:");
	JLabel l11 = new JLabel("Price:");
	JLabel l12 = new JLabel(iconLogo2);
	
	JLabel l13 = new JLabel("Name?:");
	JLabel l14 = new JLabel("Min Age:");
	JLabel l15 = new JLabel("Max Weight:");
	JLabel l16 = new JLabel("Duration:");
	JLabel l17 = new JLabel("Price:");
	
	JLabel l18 = new JLabel("Name?:");
	JLabel l19 = new JLabel("Min Age:");
	JLabel l20 = new JLabel("Max Weight:");
	JLabel l21 = new JLabel("Duration:");
	JLabel l22 = new JLabel("Price:");
	
	String children_attracion[]={"cosmic coaster",
								"Flying Ace Balloon Race",
								"linus launcher",
								"linus beetle bug",
								"lucy tugboat",
								"pirate train",};
	String thrill[]={"deliriun",
					"drowtower",
					"monsoon",
					"roller coaster",
					"thrillcone",
					"vortex"};
	
	JComboBox jc1 = new JComboBox(children_attracion);
	JComboBox jc2 = new JComboBox(thrill);
	
	public Admin_Attribute() {
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new BorderLayout());
		
		pane.insertTab("Tab 1", null, panel1, null, 0);
		pane.insertTab("Tab 2", null, panel2, null, 1);
		
		l1.setFont(new Font("Serif", Font.BOLD, 35));
		l2.setFont(new Font("Serif", Font.BOLD, 35));
		l3.setFont(new Font("Serif", Font.BOLD, 35));
		l4.setFont(new Font("Serif", Font.BOLD, 35));
		l5.setFont(new Font("Serif", Font.BOLD, 35));
		l7.setFont(new Font("Serif", Font.BOLD, 35));
		l8.setFont(new Font("Serif", Font.BOLD, 35));
		l9.setFont(new Font("Serif", Font.BOLD, 35));
		l10.setFont(new Font("Serif", Font.BOLD, 35));
		l11.setFont(new Font("Serif", Font.BOLD, 35));
		l13.setFont(new Font("Serif", Font.BOLD, 35));
		l14.setFont(new Font("Serif", Font.BOLD, 35));
		l15.setFont(new Font("Serif", Font.BOLD, 35));
		l16.setFont(new Font("Serif", Font.BOLD, 35));
		l17.setFont(new Font("Serif", Font.BOLD, 35));
		l18.setFont(new Font("Serif", Font.BOLD, 35));
		l19.setFont(new Font("Serif", Font.BOLD, 35));
		l20.setFont(new Font("Serif", Font.BOLD, 35));
		l21.setFont(new Font("Serif", Font.BOLD, 35));
		l22.setFont(new Font("Serif", Font.BOLD, 35));
		jc1.setFont(new Font("Srrif", Font.BOLD, 20));
		jc2.setFont(new Font("Srrif", Font.BOLD, 20));
		
		panel1.setLayout(new GridBagLayout());
		panel2.setLayout(new GridBagLayout());
		
		GBC.insets = new Insets(5,5,5,5);
		
		GBC.gridx = 0;
		GBC.gridy = 0;
		panel1.add(jc1, GBC);
		panel2.add(jc2, GBC);
		GBC.gridx = 1;
		GBC.gridy = 1;
		panel1.add(l1, GBC);
		panel2.add(l7, GBC);
		GBC.gridx = 0;
		GBC.gridy = 1;
		GBC.gridheight = 6;
		GBC.fill = GridBagConstraints.VERTICAL;
		panel1.add(l6, GBC);
		panel2.add(l12, GBC);
		GBC.gridx = 1;
		GBC.gridy = 2;
		GBC.gridheight = 1;
		panel1.add(l2, GBC);
		panel2.add(l8, GBC);
		GBC.gridx = 1;
		GBC.gridy = 3;
		panel1.add(l3, GBC);
		panel2.add(l9, GBC);
		GBC.gridx = 1;
		GBC.gridy = 4;
		panel1.add(l4, GBC);
		panel2.add(l10, GBC);
		GBC.gridx = 1;
		GBC.gridy = 5;
		panel1.add(l5, GBC);
		panel2.add(l11, GBC);
		GBC.gridx = 2;
		GBC.gridy = 1;
		panel1.add(l13, GBC);
		panel2.add(l18, GBC);
		GBC.gridx = 2;
		GBC.gridy = 2;
		panel1.add(l14, GBC);
		panel2.add(l19, GBC);
		GBC.gridx = 2;
		GBC.gridy = 3;
		panel1.add(l15, GBC);
		panel2.add(l20, GBC);
		GBC.gridx = 2;
		GBC.gridy = 4;
		panel1.add(l16, GBC);
		panel2.add(l21, GBC);
		GBC.gridx = 2;
		GBC.gridy = 5;
		panel1.add(l17, GBC);
		panel2.add(l22, GBC);
		
		DesktopPane.add(pane, BorderLayout.CENTER);
		this.add(DesktopPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}