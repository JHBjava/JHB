package JHB.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import JHB.Class.Attraction;

public class Admin_Attribute extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	GridBagConstraints GBC = new GridBagConstraints();
	JTabbedPane pane = new JTabbedPane();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	ImageIcon[] IMGIC1;
	ImageIcon[] IMGIC2;
	
	JLabel P1LID = new JLabel("ID: ");
	JLabel P1L1 = new JLabel("Name:");
	JLabel P1L2 = new JLabel("Location X");
	JLabel P1L3 = new JLabel("Location Y");
	JLabel P1L4 = new JLabel("Location Z");
	JLabel P1L5 = new JLabel("Min Age:");
	JLabel P1L6 = new JLabel("Max Height:");
	JLabel P1L7 = new JLabel("Max Weight:");
	JLabel P1L8 = new JLabel("Duration:");
	JLabel P1L9 = new JLabel("Price:");
	JLabel P1L10 = new JLabel("Status:");
	JLabel P1L0 = new JLabel();
	JLabel P1MSG = new JLabel("");
	
	JLabel P2LID = new JLabel("ID: ");
	JLabel P2L1 = new JLabel("Name:");
	JLabel P2L2 = new JLabel("Location X");
	JLabel P2L3 = new JLabel("Location Y");
	JLabel P2L4 = new JLabel("Location Z");
	JLabel P2L5 = new JLabel("Min Age:");
	JLabel P2L6 = new JLabel("Max Height:");
	JLabel P2L7 = new JLabel("Max Weight:");
	JLabel P2L8 = new JLabel("Duration:");
	JLabel P2L9 = new JLabel("Price:");
	JLabel P2L10 = new JLabel("Status:");
	JLabel P2L0 = new JLabel();
	JLabel P2MSG = new JLabel("");
	
	JLabel P3T = new JLabel("Add Attraction");
	JLabel P3L1 = new JLabel("Name:");
	JLabel P3L2 = new JLabel("Location X");
	JLabel P3L3 = new JLabel("Location Y");
	JLabel P3L4 = new JLabel("Location Z");
	JLabel P3L5 = new JLabel("Min Age:");
	JLabel P3L6 = new JLabel("Max Height:");
	JLabel P3L7 = new JLabel("Max Weight:");
	JLabel P3L8 = new JLabel("Duration:");
	JLabel P3L9 = new JLabel("Price:");
	JLabel P3L10 = new JLabel("Status:");
	JLabel P3L0 = new JLabel("Image Name:");
	JLabel P3L101 = new JLabel("Attribute ID:");
	JLabel P3MSG = new JLabel("");
	
	JLabel P1Lid = new JLabel();
	JTextField P1L11 = new JTextField("");
	JTextField P1L12 = new JTextField("");
	JTextField P1L13 = new JTextField("");
	JTextField P1L14 = new JTextField("");
	JTextField P1L15 = new JTextField("");
	JTextField P1L16 = new JTextField("");
	JTextField P1L17 = new JTextField("");
	JTextField P1L18 = new JTextField("");
	JTextField P1L19 = new JTextField("");
	JTextField P1L20 = new JTextField("");
	
	JLabel P2Lid = new JLabel();
	JTextField P2L11 = new JTextField("");
	JTextField P2L12 = new JTextField("");
	JTextField P2L13 = new JTextField("");
	JTextField P2L14 = new JTextField("");
	JTextField P2L15 = new JTextField("");
	JTextField P2L16 = new JTextField("");
	JTextField P2L17 = new JTextField("");
	JTextField P2L18 = new JTextField("");
	JTextField P2L19 = new JTextField("");
	JTextField P2L20 = new JTextField("");
	
	JTextField P3L11 = new JTextField("");
	JTextField P3L12 = new JTextField("");
	JTextField P3L13 = new JTextField("");
	JTextField P3L14 = new JTextField("");
	JTextField P3L15 = new JTextField("");
	JTextField P3L16 = new JTextField("");
	JTextField P3L17 = new JTextField("");
	JTextField P3L18 = new JTextField("");
	JTextField P3L19 = new JTextField("");
	String CB1[] = {"operating", "breakdown"};
	JComboBox P3CB1 = new JComboBox(CB1);
	JTextField P3L21 = new JTextField("");
	String CB2[] = {"67", "68"};
	JComboBox P3CB2 = new JComboBox(CB2);
	
	JButton P1BT1 = new JButton("Edit");
	JButton P1BT2 = new JButton("Delete");

	JButton P2BT1 = new JButton("Edit");
	JButton P2BT2 = new JButton("Delete");
	
	JButton P3BT0 = new JButton("ADD");
	
	JComboBox jc1, jc2;
	Attraction att1 = new Attraction();
	Attraction att2 = new Attraction();
	String jcdt1[], jcdt2[];
	
	public Admin_Attribute() {
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		ChildrenData();
		ThrillData();
		
		jc1 = new JComboBox(jcdt1);
		jc2 = new JComboBox(jcdt2);
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new BorderLayout());
		
		pane.insertTab("Children", null, panel1, null, 0);
		pane.insertTab("Thrill", null, panel2, null, 1);
		pane.insertTab("Add", null, panel3, null, 2);
		
		P1LID.setFont(new Font("Serif", Font.BOLD, 30));
		P1L1.setFont(new Font("Serif", Font.BOLD, 30));
		P1L2.setFont(new Font("Serif", Font.BOLD, 30));
		P1L3.setFont(new Font("Serif", Font.BOLD, 30));
		P1L4.setFont(new Font("Serif", Font.BOLD, 30));
		P1L5.setFont(new Font("Serif", Font.BOLD, 30));
		P1L6.setFont(new Font("Serif", Font.BOLD, 30));
		P1L7.setFont(new Font("Serif", Font.BOLD, 30));
		P1L8.setFont(new Font("Serif", Font.BOLD, 30));
		P1L9.setFont(new Font("Serif", Font.BOLD, 30));
		P1L10.setFont(new Font("Serif", Font.BOLD, 30));
		P1L0.setFont(new Font("Serif", Font.BOLD, 30));
		P1MSG.setFont(new Font("Serif", Font.BOLD, 30));
		
		P2LID.setFont(new Font("Serif", Font.BOLD, 30));
		P2L1.setFont(new Font("Serif", Font.BOLD, 30));
		P2L2.setFont(new Font("Serif", Font.BOLD, 30));
		P2L3.setFont(new Font("Serif", Font.BOLD, 30));
		P2L4.setFont(new Font("Serif", Font.BOLD, 30));
		P2L5.setFont(new Font("Serif", Font.BOLD, 30));
		P2L6.setFont(new Font("Serif", Font.BOLD, 30));
		P2L7.setFont(new Font("Serif", Font.BOLD, 30));
		P2L8.setFont(new Font("Serif", Font.BOLD, 30));
		P2L9.setFont(new Font("Serif", Font.BOLD, 30));
		P2L10.setFont(new Font("Serif", Font.BOLD, 30));
		P2L0.setFont(new Font("Serif", Font.BOLD, 30));
		P2MSG.setFont(new Font("Serif", Font.BOLD, 30));
		
		P3T.setFont(new Font("Serif", Font.BOLD, 35));
		P3L1.setFont(new Font("Serif", Font.BOLD, 30));
		P3L2.setFont(new Font("Serif", Font.BOLD, 30));
		P3L3.setFont(new Font("Serif", Font.BOLD, 30));
		P3L4.setFont(new Font("Serif", Font.BOLD, 30));
		P3L5.setFont(new Font("Serif", Font.BOLD, 30));
		P3L6.setFont(new Font("Serif", Font.BOLD, 30));
		P3L7.setFont(new Font("Serif", Font.BOLD, 30));
		P3L8.setFont(new Font("Serif", Font.BOLD, 30));
		P3L9.setFont(new Font("Serif", Font.BOLD, 30));
		P3L10.setFont(new Font("Serif", Font.BOLD, 30));
		P3L0.setFont(new Font("Serif", Font.BOLD, 30));
		P3L101.setFont(new Font("Serif", Font.BOLD, 30));
		P3MSG.setFont(new Font("Serif", Font.BOLD, 30));
		
		P1Lid.setFont(new Font("Serif", Font.BOLD, 30));
		P1L11.setFont(new Font("Serif", Font.BOLD, 30));
		P1L12.setFont(new Font("Serif", Font.BOLD, 30));
		P1L13.setFont(new Font("Serif", Font.BOLD, 30));
		P1L14.setFont(new Font("Serif", Font.BOLD, 30));
		P1L15.setFont(new Font("Serif", Font.BOLD, 30));
		P1L16.setFont(new Font("Serif", Font.BOLD, 30));
		P1L17.setFont(new Font("Serif", Font.BOLD, 30));
		P1L18.setFont(new Font("Serif", Font.BOLD, 30));
		P1L19.setFont(new Font("Serif", Font.BOLD, 30));
		P1L20.setFont(new Font("Serif", Font.BOLD, 30));
		
		P2Lid.setFont(new Font("Serif", Font.BOLD, 30));
		P2L11.setFont(new Font("Serif", Font.BOLD, 30));
		P2L12.setFont(new Font("Serif", Font.BOLD, 30));
		P2L13.setFont(new Font("Serif", Font.BOLD, 30));
		P2L14.setFont(new Font("Serif", Font.BOLD, 30));
		P2L15.setFont(new Font("Serif", Font.BOLD, 30));
		P2L16.setFont(new Font("Serif", Font.BOLD, 30));
		P2L17.setFont(new Font("Serif", Font.BOLD, 30));
		P2L18.setFont(new Font("Serif", Font.BOLD, 30));
		P2L19.setFont(new Font("Serif", Font.BOLD, 30));
		P2L20.setFont(new Font("Serif", Font.BOLD, 30));
		
		P3L11.setFont(new Font("Serif", Font.BOLD, 30));
		P3L12.setFont(new Font("Serif", Font.BOLD, 30));
		P3L13.setFont(new Font("Serif", Font.BOLD, 30));
		P3L14.setFont(new Font("Serif", Font.BOLD, 30));
		P3L15.setFont(new Font("Serif", Font.BOLD, 30));
		P3L16.setFont(new Font("Serif", Font.BOLD, 30));
		P3L17.setFont(new Font("Serif", Font.BOLD, 30));
		P3L18.setFont(new Font("Serif", Font.BOLD, 30));
		P3L19.setFont(new Font("Serif", Font.BOLD, 30));
		P3CB1.setFont(new Font("Serif", Font.BOLD, 30));
		P3L21.setFont(new Font("Serif", Font.BOLD, 30));
		P3CB2.setFont(new Font("Serif", Font.BOLD, 30));
		
		P1BT1.setFont(new Font("Serif", Font.BOLD, 30));
		P1BT2.setFont(new Font("Serif", Font.BOLD, 30));
		
		P2BT1.setFont(new Font("Serif", Font.BOLD, 30));
		P2BT2.setFont(new Font("Serif", Font.BOLD, 30));
		
		P3BT0.setFont(new Font("Serif", Font.BOLD, 30));
		
		jc1.setFont(new Font("Srrif", Font.BOLD, 20));
		jc2.setFont(new Font("Srrif", Font.BOLD, 20));
		
		jc1.addActionListener(this);
		jc2.addActionListener(this);
		P1BT1.addActionListener(this);
		P1BT2.addActionListener(this);
		P2BT1.addActionListener(this);
		P2BT2.addActionListener(this);
		P3BT0.addActionListener(this);
		
		panel1.setLayout(new GridBagLayout());
		panel2.setLayout(new GridBagLayout());
		panel3.setLayout(new GridBagLayout());
		
		GBC.insets = new Insets(5,5,5,5);
		//X = 0
		GBC.gridx = 0;
		GBC.gridy = 0;
		panel1.add(jc1, GBC);
		panel2.add(jc2, GBC);
		GBC.gridy = 1;
		GBC.gridheight = 11;
		GBC.fill = GridBagConstraints.VERTICAL;
		panel1.add(P1L0, GBC);
		panel2.add(P2L0, GBC);
		GBC.gridheight = 1;
		panel3.add(P3L1, GBC);
		GBC.gridy = 2;
		panel3.add(P3L2, GBC);
		GBC.gridy = 3;
		panel3.add(P3L3, GBC);
		GBC.gridy = 4;
		panel3.add(P3L4, GBC);
		GBC.gridy = 5;
		panel3.add(P3L5, GBC);
		GBC.gridy = 6;
		panel3.add(P3L6, GBC);
		GBC.gridy = 7;
		panel3.add(P3L7, GBC);
		GBC.gridy = 8;
		panel3.add(P3L8, GBC);
		GBC.gridy = 9;
		panel3.add(P3L9, GBC);
		GBC.gridy = 10;
		panel3.add(P3L10, GBC);
		GBC.gridy = 11;
		panel3.add(P3L0, GBC);
		GBC.gridy = 12;
		panel3.add(P3L101, GBC);
		//X = 1
		GBC.gridx = 1;
		GBC.gridy = 0;
		panel1.add(P1LID, GBC);
		panel2.add(P2LID, GBC);
		panel3.add(P3T, GBC);
		GBC.gridy = 1;
		panel1.add(P1L1, GBC);
		panel2.add(P2L1, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L11, GBC);
		GBC.gridy = 2;
		GBC.gridwidth = 1;
		panel1.add(P1L2, GBC);
		panel2.add(P2L2, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L12, GBC);
		GBC.gridy = 3;
		GBC.gridwidth = 1;
		panel1.add(P1L3, GBC);
		panel2.add(P2L3, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L13, GBC);
		GBC.gridy = 4;
		GBC.gridwidth = 1;
		panel1.add(P1L4, GBC);
		panel2.add(P2L4, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L14, GBC);
		GBC.gridy = 5;
		GBC.gridwidth = 1;
		panel1.add(P1L5, GBC);
		panel2.add(P2L5, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L15, GBC);
		GBC.gridy = 6;
		GBC.gridwidth = 1;
		panel1.add(P1L6, GBC);
		panel2.add(P2L6, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L16, GBC);
		GBC.gridy = 7;
		GBC.gridwidth = 1;
		panel1.add(P1L7, GBC);
		panel2.add(P2L7, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L17, GBC);
		GBC.gridy = 8;
		GBC.gridwidth = 1;
		panel1.add(P1L8, GBC);
		panel2.add(P2L8, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L18, GBC);
		GBC.gridy = 9;
		GBC.gridwidth = 1;
		panel1.add(P1L9, GBC);
		panel2.add(P2L9, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L19, GBC);
		GBC.gridy = 10;
		GBC.gridwidth = 1;
		panel1.add(P1L10, GBC);
		panel2.add(P2L10, GBC);
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3CB1, GBC);
		GBC.gridy = 11;
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3L21, GBC);
		GBC.gridy = 12;
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3CB2, GBC);
		GBC.gridwidth = 3;
		panel1.add(P1MSG, GBC);
		panel2.add(P2MSG, GBC);
		GBC.gridy = 13;
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel3.add(P3MSG, GBC);
		//X = 2
		GBC.gridx = 2;
		GBC.gridy = 0;
		panel1.add(P1Lid, GBC);
		panel2.add(P2Lid, GBC);
		GBC.gridy = 1;
		GBC.gridwidth = 2;
		GBC.fill = GridBagConstraints.HORIZONTAL;
		panel1.add(P1L11, GBC);
		panel2.add(P2L11, GBC);
		GBC.gridy = 2;
		panel1.add(P1L12, GBC);
		panel2.add(P2L12, GBC);
		GBC.gridy = 3;
		panel1.add(P1L13, GBC);
		panel2.add(P2L13, GBC);
		GBC.gridy = 4;
		panel1.add(P1L14, GBC);
		panel2.add(P2L14, GBC);
		GBC.gridy = 5;
		panel1.add(P1L15, GBC);
		panel2.add(P2L15, GBC);
		GBC.gridy = 6;
		panel1.add(P1L16, GBC);
		panel2.add(P2L16, GBC);
		GBC.gridy = 7;
		panel1.add(P1L17, GBC);
		panel2.add(P2L17, GBC);
		GBC.gridy = 8;
		panel1.add(P1L18, GBC);
		panel2.add(P2L18, GBC);
		GBC.gridy = 9;
		panel1.add(P1L19, GBC);
		panel2.add(P2L19, GBC);
		GBC.gridy = 10;
		panel1.add(P1L20, GBC);
		panel2.add(P2L20, GBC);
		GBC.gridy = 11;
		GBC.gridwidth = 1;
		panel1.add(P1BT1, GBC);
		panel2.add(P2BT1, GBC);
		GBC.gridy = 13;
		GBC.gridwidth = 1;
		panel3.add(P3BT0, GBC);
		//x = 3
		GBC.gridx = 3;
		GBC.gridy = 11;
		panel1.add(P1BT2, GBC);
		panel2.add(P2BT2, GBC);
		
		DesktopPane.add(pane, BorderLayout.CENTER);
		this.add(DesktopPane, BorderLayout.CENTER);
	}
	
	public void ChildrenData() {
		att1.GetChildren();
		jcdt1 = new String[att1.getI()];
		IMGIC1 = new ImageIcon[att1.getI()];
		for(int i = 0; i <= att1.getI()-1; i++) {
			System.out.println(i);
			jcdt1[i] = att1.getAttraction_name()[i].toString();
			IMGIC1[i] = new ImageIcon(att1.getImage()[i].toString());
		}
		P1Lid.setText(String.valueOf(att1.getAttraction_id()[0]));
		P1L11.setText(att1.getAttraction_name()[0].toString());
		P1L12.setText(String.valueOf(att1.getLocationX()[0]));
		P1L13.setText(String.valueOf(att1.getLocationY()[0]));
		P1L14.setText(String.valueOf(att1.getLocationZ()[0]));
		P1L15.setText(String.valueOf(att1.getMinimum_age()[0]));
		P1L16.setText(String.valueOf(att1.getMinimum_height()[0]));
		P1L17.setText(String.valueOf(att1.getMaximum_weight()[0]));
		P1L18.setText(String.valueOf(att1.getDuration()[0]));
		P1L19.setText(String.valueOf(att1.getPrice()[0]));
		P1L20.setText(att1.getStatus()[0]);
		P1L0.setIcon(IMGIC1[0]);
	}
	
	public void ThrillData() {
		att2.GetThrill();
		jcdt2 = new String[att2.getI()];
		IMGIC2 = new ImageIcon[att2.getI()];
		for(int i = 0; i <= att2.getI()-1; i++) {
			jcdt2[i] = att2.getAttraction_name()[i].toString();
			IMGIC2[i] = new ImageIcon(att2.getImage()[i].toString());
		}
		P2Lid.setText(String.valueOf(att2.getAttraction_id()[0]));
		P2L11.setText(att2.getAttraction_name()[0].toString());
		P2L12.setText(String.valueOf(att2.getLocationX()[0]));
		P2L13.setText(String.valueOf(att2.getLocationY()[0]));
		P2L14.setText(String.valueOf(att2.getLocationZ()[0]));
		P2L15.setText(String.valueOf(att2.getMinimum_age()[0]));
		P2L16.setText(String.valueOf(att2.getMinimum_height()[0]));
		P2L17.setText(String.valueOf(att2.getMaximum_weight()[0]));
		P2L18.setText(String.valueOf(att2.getDuration()[0]));
		P2L19.setText(String.valueOf(att2.getPrice()[0]));
		P2L20.setText(att2.getStatus()[0]);
		P2L0.setIcon(IMGIC1[0]);
	}
	
	public void Refreshdata() {
		ChildrenData();
		ThrillData();
		
		jc1.removeAllItems();
		for(int i = 0; i < jcdt1.length; i++) {
			jc1.addItem(jcdt1[i]);
		}
		
		jc2.removeAllItems();
		for(int i = 0; i < jcdt2.length; i++) {
			jc2.addItem(jcdt2[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//combo box 1
		if(arg0.getSource()==jc1) {
			for(int i = 0; i <= att1.getI()-1; i++) {
				if(att1.getAttraction_name()[i].toString().equals(jc1.getSelectedItem())) {
					P1L0.setIcon(IMGIC1[i]);
					P1Lid.setText(String.valueOf(att1.getAttraction_id()[i]));
					P1L11.setText(att1.getAttraction_name()[i].toString());
					P1L12.setText(String.valueOf(att1.getLocationX()[i]));
					P1L13.setText(String.valueOf(att1.getLocationY()[i]));
					P1L14.setText(String.valueOf(att1.getLocationZ()[i]));
					P1L15.setText(String.valueOf(att1.getMinimum_age()[i]));
					P1L16.setText(String.valueOf(att1.getMinimum_height()[i]));
					P1L17.setText(String.valueOf(att1.getMaximum_weight()[i]));
					P1L18.setText(String.valueOf(att1.getDuration()[i]));
					P1L19.setText(String.valueOf(att1.getPrice()[i]));
					P1L20.setText(att1.getStatus()[i]);
					break;
				}
			}
		}
		//combo box 2
		if(arg0.getSource()==jc2) {
			for(int i = 0; i <= att2.getI()-1; i++) {
				if(att2.getAttraction_name()[i].toString().equals(jc2.getSelectedItem())) {
					P2L0.setIcon(IMGIC2[i]);
					P2Lid.setText(String.valueOf(att2.getAttraction_id()[i]));
					P2L11.setText(att2.getAttraction_name()[i].toString());
					P2L12.setText(String.valueOf(att2.getLocationX()[i]));
					P2L13.setText(String.valueOf(att2.getLocationY()[i]));
					P2L14.setText(String.valueOf(att2.getLocationZ()[i]));
					P2L15.setText(String.valueOf(att2.getMinimum_age()[i]));
					P2L16.setText(String.valueOf(att2.getMinimum_height()[i]));
					P2L17.setText(String.valueOf(att2.getMaximum_weight()[i]));
					P2L18.setText(String.valueOf(att2.getDuration()[i]));
					P2L19.setText(String.valueOf(att2.getPrice()[i]));
					P2L20.setText(att1.getStatus()[i]);
					break;
				}
			}
		}
		//add
		if(arg0.getSource() == P3BT0) {
			att1.AddAttraction(P3L11.getText(), Integer.parseInt(P3L12.getText()), Integer.parseInt(P3L13.getText()),
					Integer.parseInt(P3L14.getText()), Integer.parseInt(P3L15.getText()), Integer.parseInt(P3L16.getText()),
					Integer.parseInt(P3L17.getText()), Integer.parseInt(P3L18.getText()), Double.parseDouble(P3L19.getText()),
					P3CB1.getSelectedItem().toString(), P3L21.getText(), Integer.parseInt(P3CB2.getSelectedItem().toString()));
			Refreshdata();
			P3MSG.setText("Add New Attraction Success!");
		}
		//edit
		if(arg0.getSource() == P1BT1) {
			att1.UpdateChildren(Integer.parseInt(P1Lid.getText()), P1L11.getText(), Integer.parseInt(P1L12.getText()),
					Integer.parseInt(P1L13.getText()), Integer.parseInt(P1L14.getText()), Integer.parseInt(P1L15.getText()),
					Integer.parseInt(P1L16.getText()), Integer.parseInt(P1L17.getText()), Integer.parseInt(P1L18.getText()),
					Double.parseDouble(P1L19.getText()), P1L20.getText());
			Refreshdata();
		}
		if(arg0.getSource() == P2BT1) {
			att2.UpdateThrill(Integer.parseInt(P2Lid.getText()), P2L11.getText(), Integer.parseInt(P2L12.getText()),
					Integer.parseInt(P2L13.getText()), Integer.parseInt(P2L14.getText()), Integer.parseInt(P2L15.getText()),
					Integer.parseInt(P2L16.getText()), Integer.parseInt(P2L17.getText()), Integer.parseInt(P2L18.getText()),
					Double.parseDouble(P2L19.getText()), P2L20.getText());
			Refreshdata();
		}
		//delete
		if(arg0.getSource() == P1BT2) {
			if(att1.DeleteData(Integer.parseInt(P1Lid.getText()))) {
				P1MSG.setText("Delete Success!");
				Refreshdata();
			}
		}
		if(arg0.getSource() == P2BT2) {
			if(att2.DeleteData(Integer.parseInt(P2Lid.getText()))) {
				P2MSG.setText("Delete Success!");
				Refreshdata();
			}
		}
	}
}