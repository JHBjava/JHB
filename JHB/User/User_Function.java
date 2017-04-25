package JHB.User;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
	JPanel P1 = new JPanel();
	JPanel P2 = new JPanel();
	JPanel P3 = new JPanel();
	JPanel P4 = new JPanel();
	JScrollPane SP1 = new JScrollPane(P4, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JPanel P5 = new JPanel();
	JScrollPane SP2 = new JScrollPane(P5, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JButton BT1 = new JButton("Buy Ticket");
	JButton BT2 = new JButton("Exit");
	JLabel LB1 = new JLabel("Children");
	JLabel LB2 = new JLabel("Thrill");
	
	String[] arrname1, arrname2, arrname1a, arrname2b;
	double[] arrprice1, arrprice2, arrprice1a, arrprice2b;
	int[] arrid1, arrid2, arrid1a, arrid2b;
	String cic = null;
	int Li = 0, Li2 = 0;
	int[] num;
	Attraction att1 = new Attraction();
	Attraction att2 = new Attraction();
	JPanel[] LPP1, LPP2;
	ImageIcon[] IMGIC1, IMGIC2;
	JLabel[] label1, label2, labelP1, labelP2;
	JCheckBox[] cb1, cb2;
	
	public User_Function(String ic) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		
		cic = ic;
		
		BT1.setFont(new Font("Serif", Font.BOLD, 25));
		BT2.setFont(new Font("Serif", Font.BOLD, 25));
		LB1.setFont(new Font("Serif", Font.BOLD, 60));
		LB2.setFont(new Font("Serif", Font.BOLD, 60));
		
		BT1.addActionListener(this);
		BT2.addActionListener(this);
		
		P1.setLayout(new BorderLayout());
		P1.add(LB1, BorderLayout.NORTH);
		P1.add(SP1, BorderLayout.CENTER);
		P2.setLayout(new BorderLayout());
		P2.add(LB2, BorderLayout.NORTH);
		P2.add(SP2, BorderLayout.CENTER);
		P3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		P4.setLayout(new FlowLayout(FlowLayout.LEFT));
		SP1.setPreferredSize(new Dimension(this.getWidth(), 450));
		P5.setLayout(new FlowLayout(FlowLayout.LEFT));
		SP2.setPreferredSize(new Dimension(this.getWidth(), 450));
		
		att1.GetChildren();
		att2.GetThrill();
		Customer CTM = new Customer();
		CTM.ICData(cic);
		arrid1 = new int[att1.getI()];
		arrid2 = new int[att2.getI()];
		arrid1a = new int[att1.getI()];
		arrid2b = new int[att2.getI()];
		arrname1 = new String[att1.getI()];
		arrname2 = new String[att2.getI()];
		arrname1a = new String[att1.getI()];
		arrname2b = new String[att2.getI()];
		arrprice1 = new double[att1.getI()];
		arrprice2 = new double[att2.getI()];
		arrprice1a = new double[att1.getI()];
		arrprice2b = new double[att2.getI()];
		LPP1 = new JPanel[att1.getI()];
		LPP2 = new JPanel[att2.getI()];
		IMGIC1 = new ImageIcon[att1.getI()];
		IMGIC2 = new ImageIcon[att2.getI()];
		label1 = new JLabel[att1.getI()];
		label2 = new JLabel[att2.getI()];
		labelP1 = new JLabel[att1.getI()];
		labelP2 = new JLabel[att2.getI()];
		cb1 = new JCheckBox[att1.getI()];
		cb2 = new JCheckBox[att2.getI()];
		num = new int[att1.getI()];
		
		for(int i = 0; i <= att1.getI()-1; i++) {
			arrid1[i] = att1.getAttraction_id()[i];
			arrname1[i] = att1.getAttraction_name()[i];
			arrprice1[i] = att1.getPrice()[i];
			LPP1[i] = new JPanel();
			LPP1[i].setLayout(new BorderLayout());
			IMGIC1[i] = new ImageIcon(att1.getImage()[i]);
			label1[i] = new JLabel(IMGIC1[i]);
			label1[i].setPreferredSize(new Dimension(300, 250));
			labelP1[i] = new JLabel("RM " + att1.getPrice()[i]);
			labelP1[i].setFont(new Font("Serif", Font.BOLD, 35));
			cb1[i] = new JCheckBox(att1.getAttraction_name()[i]);
			cb1[i].setFont(new Font("Serif", Font.BOLD, 35));
			cb1[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					for(int i = 0; i < arrid1.length; i++) {
						if(arg0.getActionCommand().equals(arrname1[i].toString())) {
							if(cb1[i].isSelected()) {
								arrname1a[Li] = cb1[i].getText();
								arrprice1a[Li] = arrprice1[i];
								arrid1a[Li] = arrid1[i];
								Li++;
							}else {
								Li--;
							}
						}
					}
				}
			});
			if(CTM.getHeight() < att1.getMinimum_height()[i] || CTM.getWeight() > att1.getMaximum_weight()[i]) {
				cb1[i].setEnabled(false);
			}
			LPP1[i].add(label1[i], BorderLayout.NORTH);
			LPP1[i].add(cb1[i], BorderLayout.CENTER);
			LPP1[i].add(labelP1[i], BorderLayout.SOUTH);
			P4.add(LPP1[i]);
		}
		
		for(int i = 0; i <= att2.getI()-1; i++) {
			arrid2[i] = att2.getAttraction_id()[i];
			arrname2[i] = att2.getAttraction_name()[i];
			arrprice2[i] = att2.getPrice()[i];
			LPP2[i] = new JPanel();
			LPP2[i].setLayout(new BorderLayout());
			IMGIC2[i] = new ImageIcon(att2.getImage()[i]);
			label2[i] = new JLabel(IMGIC2[i]);
			label2[i].setPreferredSize(new Dimension(300, 250));
			labelP2[i] = new JLabel("RM " + att2.getPrice()[i]);
			labelP2[i].setFont(new Font("Serif", Font.BOLD, 35));
			cb2[i] = new JCheckBox(att2.getAttraction_name()[i]);
			cb2[i].setFont(new Font("Serif", Font.BOLD, 35));
			cb2[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					for(int i = 0; i < arrid2.length; i++) {
						if(arg0.getActionCommand().equals(arrname2[i].toString())) {
							if(cb2[i].isSelected()) {
								arrname2b[Li2] = cb2[i].getText();
								arrprice2b[Li2] = arrprice2[i];
								arrid2b[Li2] = arrid2[i];
								Li2++;
							}else {
								Li2--;
							}
						}
					}
				}
			});
			if(CTM.getHeight() < att2.getMinimum_height()[i] || CTM.getWeight() > att2.getMaximum_weight()[i]) {
				cb2[i].setEnabled(false);
			}
			LPP2[i].add(label2[i], BorderLayout.NORTH);
			LPP2[i].add(cb2[i], BorderLayout.CENTER);
			LPP2[i].add(labelP2[i], BorderLayout.SOUTH);
			P5.add(LPP2[i]);
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
			String[] name = new String[Li + Li2];
			double[] price = new double[Li + Li2];
			int A = 0;
			for(int i = 0; i < Li; i++) {
				EntryRecord ER = new EntryRecord(arrname1a[i], cic, arrprice1a[i]);
				name[A] = arrname1a[i];
				price[A] = arrprice1a[i];
				A++;
				ER.insertData();
			}
			for(int i = 0; i < Li2; i++) {
				EntryRecord ER = new EntryRecord(arrname2b[i], cic, arrprice2b[i]);
				name[A] = arrname2b[i];
				price[A] = arrprice2b[i];
				A++;
				ER.insertData();
			}
			JFrame UserTicket = new User_Ticket(cic, name, price);
		}
		//Exit
		if(arg0.getSource() == BT2) {
			JFrame UserLogin = new User_Login();
			this.dispose();
		}
	}

}