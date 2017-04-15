package JHB.Admin;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Admin_Attribute extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	GridBagConstraints GBC = new GridBagConstraints();
	/*JLabel LB1 = new JLabel("Register");
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
	JButton BT1 = new JButton("Register");*/
	/////////////////////////////////////////
	public JTabbedPane pane = new JTabbedPane();
	public JPanel panel1 = new JPanel();
	  public JPanel panel2 = new JPanel();
	  public JPanel panel3 = new JPanel();
	  ImageIcon iconLogo = new ImageIcon("D:/HTML5/html/images/iii3.jpg");
	  public JButton b1 = new JButton("Login1");
	  public JButton b2 = new JButton("Login2");
	 
	  public JLabel l1 = new JLabel("Name:");
	  public JLabel l2 = new JLabel("Min Age:");
	  public JLabel l3 = new JLabel("Max Weight:");
	  public JLabel l4 = new JLabel("Duration:");
	  public JLabel l5 = new JLabel("Price:");
	  public JLabel l6 = new JLabel(iconLogo);
	  public JLabel l7 = new JLabel("Name:");
	  public JLabel l8 = new JLabel("Min Age:");
	  public JLabel l9 = new JLabel("Max Weight:");
	  public JLabel l10 = new JLabel("Duration:");
	  public JLabel l11 = new JLabel("Price:");
	  public JLabel l12 = new JLabel(iconLogo);
	  public JLabel l13 = new JLabel("Name?:");
	  public JLabel l14 = new JLabel("Min Age:");
	  public JLabel l15 = new JLabel("Max Weight:");
	  public JLabel l16 = new JLabel("Duration:");
	  public JLabel l17 = new JLabel("Price:");
	  public JLabel l18 = new JLabel("Name?:");
	  public JLabel l19 = new JLabel("Min Age:");
	  public JLabel l20 = new JLabel("Max Weight:");
	  public JLabel l21 = new JLabel("Duration:");
	  public JLabel l22 = new JLabel("Price:");
	  
	  String children_attracion[]={"cosmic coaster","Flying Ace Balloon Race"," linus launcher","linus beetle bug",
			  "lucy tugboat","pirate train",}; 
	  String thrill[]={"deliriun","drowtower","monsoon","roller coaster","thrillcone","vortex"};
	  public JComboBox jc1 = new JComboBox(children_attracion);
	  public JComboBox jc2 = new JComboBox(thrill);
	  public JComboBox jc3 = new JComboBox(thrill);
	  public JComboBox jc4 = new JComboBox(thrill);
	
	public Admin_Attribute() {
		
		
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new GridBagLayout());
		
		 pane.insertTab("Tab 1", null, panel1, null, 0);
		    pane.insertTab("Tab 2", null, panel2, null, 1);
		    pane.setMinimumSize(new Dimension(1400,700));
		    add(pane, BorderLayout.NORTH);
		   
		   
		    /*GBC.insets = new Insets(5, 5, 5, 5);*/
		    
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
		    panel1.setLayout(new GridBagLayout());
		    panel2.setLayout(new GridBagLayout());
		   
		    
		    
		    GBC.gridx = 0;
			GBC.gridy = 0;
			/*GBC.weightx = 0.5;*/
			
			GBC.anchor = GridBagConstraints.NORTHWEST;
			GBC.insets = new Insets(30,30,0,0);
			 panel1.add(jc1,GBC);
			 panel1.add(jc2,GBC);

			
			GBC.gridx = 0;
			GBC.gridy = 1;
			/*GBC.gridwidth = 1;*/
			GBC.ipady = 0;
			GBC.ipadx = 0;
			
			l6.setPreferredSize(new Dimension(500, 450));
			l12.setPreferredSize(new Dimension(500, 450));
			GBC.anchor = GridBagConstraints.NORTHWEST;
			GBC.insets = new Insets(100,100,0,0);
			panel1.add(l6,GBC);
			panel2.add(l12,GBC);
			
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,250,400,0);
			panel1.add(l1,GBC);
			panel2.add(l7,GBC);
			
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(-100,250,100,30);
			panel1.add(l2,GBC);
			panel2.add(l8,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(100,250,100,100);
			panel1.add(l3,GBC);
			panel2.add(l9,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(300,250,100,50);
			panel1.add(l4,GBC);
			panel2.add(l10,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(500,250,100,0);
			panel1.add(l5,GBC);
			panel2.add(l11,GBC);
			
			
			/////////////////////////////
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,550,400,0);
			panel2.add(l18, GBC);
			panel1.add(l13,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,570,200,0);
			panel2.add(l19, GBC);
			panel1.add(l14,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,630,0,0);
			panel2.add(l20, GBC);
			panel1.add(l15,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,580,-200,0);
			panel2.add(l21, GBC);
			panel1.add(l16,GBC);
			
			GBC.gridx = 0;
			GBC.gridy = 1;
			GBC.weightx = 3;
			GBC.anchor = GridBagConstraints.CENTER;
			GBC.insets = new Insets(0,530,-400,0);
			panel2.add(l22, GBC);
			panel1.add(l17,GBC);
			
			
			///////////////////////////
			
			DesktopPane.add(pane);
			/*setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);*/
			
				/*((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		
				 this.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
				
		          boolean isHidden = true; 
		          isHidden = true; */
		add(DesktopPane);
		setResizable(true);
	      setMaximizable(true);
	      setClosable(true);
	      setVisible(true);
	    
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}