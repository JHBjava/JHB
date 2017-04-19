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

import JHB.Class.Attraction;
import JHB.Class.Customer;
import JHB.Class.EntryRecord;

public class User_Function extends JFrame implements ActionListener {
	Attraction att1 = new Attraction();
	Attraction att2 = new Attraction();
	ImageIcon[] IMGIC1;
	ImageIcon[] IMGIC2;
	String jcdt1[], jcdt2[];
	JLabel[] labels=new JLabel[999];
	JCheckBox[] cb = new JCheckBox[999];
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
	
	String[] arr1 = new String[11];
	double[] arr2 = new double[11];
	String cic = null;
	int i = 0;
	
	public User_Function(String ic) {
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
		
		cic = ic;
		Customer ctm = new Customer(ic);
		ctm.setData(ic);
		if(ctm.getHeight() < 100 || ctm.getWeight() > 30) {
			CB1.setEnabled(false);
			CB2.setEnabled(false);
			CB3.setEnabled(false);
			CB4.setEnabled(false);
			CB5.setEnabled(false);
			CB6.setEnabled(false);
		}
		if(ctm.getHeight() < 160 || ctm.getWeight() > 80) {
			CB7.setEnabled(false);
			CB8.setEnabled(false);
			CB9.setEnabled(false);
			CB10.setEnabled(false);
			CB11.setEnabled(false);
			CB12.setEnabled(false);
		}
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		CB1.addActionListener(this);
		CB2.addActionListener(this);
		CB3.addActionListener(this);
		CB4.addActionListener(this);
		CB5.addActionListener(this);
		CB6.addActionListener(this);
		CB7.addActionListener(this);
		CB8.addActionListener(this);
		CB9.addActionListener(this);
		CB10.addActionListener(this);
		CB11.addActionListener(this);
		CB12.addActionListener(this);
		
		P1.setLayout(new BorderLayout());
		P1.add(LB1, BorderLayout.NORTH);
		P1.add(P4, BorderLayout.CENTER);
		P2.setLayout(new BorderLayout());
		P2.add(LB2, BorderLayout.NORTH);
		P2.add(P5, BorderLayout.CENTER);
		P3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P4.setLayout(new GridBagLayout());
		P4.setPreferredSize(new Dimension(this.getWidth(), 450));
		P5.setLayout(new GridBagLayout());
		
			att1.GetChildren();
			jcdt1 = new String[att1.getI()];
			IMGIC1 = new ImageIcon[att1.getI()];
			for(int i = 0; i <= att1.getI()-1; i++) {
				jcdt1[i] = att1.getAttraction_name()[i].toString();
			
				IMGIC1[i] = new ImageIcon(att1.getImage()[i].toString());
				labels[i]=new JLabel(IMGIC1[i]);
				cb[i] = new JCheckBox(att1.getAttraction_name()[i].toString());
			}
			
			for(int i = 0 ; i<=att1.getI()-1; i++){
				GBC.gridx = 0+i;
				GBC.gridy = 0;
				P4.add(labels[i], GBC);
				if(i >0){
				for(int j = 1 ; j <2 ; j++){
					GBC.gridy = 1;
					GBC.gridx = 0+i;
					P4.add(cb[i], GBC);
				}	
				}
				else{
					GBC.gridy = 1;
					GBC.gridx = 0;
					P4.add(cb[0], GBC);
				}
		
			}
			att2.GetThrill();
			
			jcdt2 = new String[att2.getI()];
			IMGIC2 = new ImageIcon[att2.getI()];
			
			for(int i = 0; i <= att2.getI()-1; i++) {
				jcdt2[i] = att2.getAttraction_name()[i].toString();
				IMGIC2[i] = new ImageIcon(att2.getImage()[i].toString());
				labels[i+6]=new JLabel(IMGIC2[i]);
				cb[i+6] = new JCheckBox(att2.getAttraction_name()[i].toString());
			}
		
			for(int i = 0 ; i<=att2.getI()-1; i++){
				GBC.gridx = 0+i;
				GBC.gridy = 0;
				P5.add(labels[i+6], GBC);
				if(i >0){
				for(int j = 1 ; j <2 ; j++){
					GBC.gridy = 1;
					GBC.gridx = 0+i;
					P5.add(cb[i+6], GBC);
				}	
				}
				else{
					GBC.gridy = 1;
					GBC.gridx = 0;
					P5.add(cb[6], GBC);
			}
		
			}
		P3.add(BT1);
		P3.add(BT2);
		
		this.add(P1, BorderLayout.NORTH);
		this.add(P2, BorderLayout.CENTER);
		this.add(P3, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Buy Ticket
		if(arg0.getSource() == BT1) {
			int ii = 0;
			while(ii < i) {
				EntryRecord ER = new EntryRecord(arr1[ii], cic, arr2[ii]);
				ER.insertData();
				ii++;
			}
		}
		//Exit
		if(arg0.getSource() == BT2) {
			JFrame UserLogin = new User_Login();
			this.dispose();
		}
	}

}