package JHB.Admin;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import JHB.Class.Attraction;
import JHB.Class.EntryRecord;


public class Admin_Report extends JInternalFrame implements ActionListener {
	JDesktopPane DesktopPane = new JDesktopPane();
	GridBagConstraints GBC = new GridBagConstraints();
	JComboBox jc1;
	JPanel panel1 = new JPanel();
	JPanel panel2  = new JPanel();
	JPanel panel3 = new JPanel();
	EntryRecord  er1 = new EntryRecord();
	Attraction att1 = new Attraction();
	Attraction att2 = new Attraction();
	String jcdt1[], jcdt2[], jcer1[];
	JLabel[] labelsname = new JLabel[999];
	JLabel[] labelsnumber = new JLabel[999];
	JLabel l1 = new JLabel("total income:");
	JLabel l2 = new JLabel("number of people per today:");
	JLabel l3 = new JLabel("Select of day");
	String[] namecount = new String[100];
	String[] numbercount = new String[100];
	String ii= null;
	String ii2 = null;
	
	int i =0;
	int g =0;
	int f = 0;
	int h=0;
	int p =0;
	EntryRecord er= new EntryRecord();
	
	public Admin_Report() {
		
		//this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		//((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		
		ChildrenData();
		GetDateData();
		l1 = new JLabel("total income:");
		jc1 = new JComboBox(jcer1);
		
		DesktopPane.setBackground(Color.LIGHT_GRAY);
		panel1.setBackground(Color.LIGHT_GRAY);
		DesktopPane.setLayout(new GridBagLayout());
		//DesktopPane.setLayout(new GridBagLayout());
		panel1.setLayout(new GridBagLayout());
		//X = 0
		
		
	//	er1.GetAllAttraction();
	for(int i = 0; i <= er1.getI()-1; i++) {
		
			labelsname[i]=new JLabel(er1.getAttractionName()[i].toString());
			labelsnumber[i]=new JLabel(er1.getAttractionName()[i].toString());
		
	}
		for(int i = 0 ; i<=er1.getI()-1; i++){
			GBC.gridx = 0;
			GBC.gridy = 0+i+1;
			labelsname[i].setFont(new Font("Serif", Font.BOLD, 17));
			DesktopPane.add(labelsname[i], GBC);
			
			g++;
			f++;
	
		}
		for(int i = 0 ; i<=er1.getI()-1; i++){
			GBC.gridx = 2;
			GBC.gridy = 0+i+1;
			labelsnumber[i].setFont(new Font("Serif", Font.BOLD, 17));
			DesktopPane.add(labelsnumber[i], GBC);
			
	
		}
		if (g>er1.getI()-1){
			System.out.println("vv"+g);
			GBC.gridx = 0;
			GBC.gridy = 0+g+1;
			l1.setFont(new Font("Serif", Font.BOLD, 17));
			l1.setText(" ");
			DesktopPane.add(l1, GBC);
			f++;
		}
		if (f>g){
			System.out.println("vv"+g);
			GBC.gridx = 0;
			GBC.gridy = 0+f+1;
			l2.setText(" ");
			l2.setFont(new Font("Serif", Font.BOLD, 17));
			DesktopPane.add(l2, GBC);
			f++;
		}
		
		
	
	
		GBC.gridx = 1;
		GBC.gridy = 0;
		GBC.anchor = GridBagConstraints.NORTH;
		///GBC.fill = GridBagConstraints.HORIZONTAL;
		//GBC.gridwidth = 3;
		GBC.insets = new Insets(0, 0, 0, 15);
		jc1.addActionListener(this);
		
		panel1.add(jc1, GBC);
		GBC.gridx = 0;
		GBC.gridy = 0;
		GBC.anchor = GridBagConstraints.NORTH;
		///GBC.fill = GridBagConstraints.HORIZONTAL;
		//GBC.gridwidth = 3;
		
	
		
		panel1.add(l3, GBC);
		l3.setFont(new Font("Serif", Font.BOLD, 17));
		GBC.anchor = GridBagConstraints.NORTH;
		GBC.weighty = 0.1;
		DesktopPane.add(panel1,GBC);
		
		
		
		
		this.add(DesktopPane);
		this.setVisible(true);
		
		
	}
	
	public void ChildrenData() {
		att1.GetChildren();
		jcdt1 = new String[att1.getI()];
		
		for(int i = 0; i <= att1.getI()-1; i++) {
			System.out.println(i);
			jcdt1[i] = att1.getAttraction_name()[i].toString();
		
		
	
		System.out.println(att1.getAttraction_name()[i].toString());
		}
	}
	public void ThrillData() {
		att2.GetThrill();
		jcdt2 = new String[att2.getI()];
		
		for(int i = 0; i <= att2.getI()-1; i++) {
			jcdt2[i] = att2.getAttraction_name()[i].toString();
					}
		
		System.out.println(att2.getAttraction_name()[0].toString());
		
	}
	public void GetDateData() {
		er.GetDate();
		jcer1 = new String[er.getI()];
		for(int i = 0; i <= er.getI()-1; i++) {
			jcer1[i] = er.getDate()[i].toString();
			System.out.println(jcer1+"kkk");
			System.out.println(jcer1[i]+"kk");
			}
		
	
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == jc1) {
			f=0;
			g=0;
			
			
			System.out.println("stop");
			String date1 = (String)jc1.getSelectedItem();
			 if (jc1.getSelectedItem() == date1) {
			l1.setText(" ");
			l2.setText(" ");
			for(int k = 0; k<h; k++){
				labelsname[k].setText(" ");
				labelsnumber[k].setText(" ");
			}
			System.out.println(date1+"hhh222");
			System.out.println(date1);
			 er= new EntryRecord(date1);
			er.GetAllAttraction();
			
			
			
			
			for(int i = 0; i <= er.getI()+1; i++) {
				System.out.println(er.getI()-1+"er.get");
				labelsname[i]=new JLabel(er.getAttractionName()[i].toString());
				
				 numbercount[i] = Integer.toString(er.getCountNumber()[i]);
				
				//	calllabel(er.getAttractionName()[i].toString(),numbercount[i] );
				 labelsnumber[i]=new JLabel(numbercount[i].toString());
					labelsname[i]=new JLabel(er.getAttractionName()[i].toString());
					
				}
				
			
			
			
			
		for(int i = 0 ; i<=er.getI()+1; i++){
			System.out.println("go into2"+er.getI());
				GBC.gridx = 0;
				GBC.gridy = 0+i+1;
			//	System.out.println(labelsname[i]+"mmmmmmmmmmm");
				labelsname[i].setFont(new Font("Serif", Font.BOLD, 17));
				
				//DesktopPane.add(labelsname[i], GBC);
			//	labelsname[i].setText(er.getAttractionName()[i].toString());
			//	System.out.println(er.getAttractionName()[i].toString());
				
				DesktopPane.add(labelsname[i],GBC);
			
			
				
				g++;
				f++;
				h=g;
				
			}
		er.Gettotalperice();
		er.Gettotalpeople();
		for(int i = 0 ; i<=er.getI()-1; i++){
			 numbercount[i] = Integer.toString(er.getCountNumber()[i]);
			 System.out.println(er.getTotalpricedouble()[i]+"totalprice");
			if(er.getTotalpricedouble()[i]>0){

				GBC.gridx = 2;
				GBC.gridy = 0+i+1;
				
				numbercount[i] = Double.toString(er.getTotalpricedouble()[i]);
				
				labelsnumber[i]=new JLabel(numbercount[i].toString());
				labelsnumber[i].setFont(new Font("Serif", Font.BOLD, 17));
				
				DesktopPane.add(labelsnumber[i], GBC);
			} else {
				//	calllabel(er.getAttractionName()[i].toString(),numbercount[i] );
				 labelsnumber[i]=new JLabel(numbercount[i].toString());
				GBC.gridx = 2;
				GBC.gridy = 0+i+1;
				labelsnumber[i].setFont(new Font("Serif", Font.BOLD, 17));
				labelsnumber[i].setText(numbercount[i].toString());
				System.out.println(numbercount[i].toString()+"people");
				
				DesktopPane.add(labelsnumber[i], GBC);
			//	this.add(DesktopPane);
			}	
				
			}
			
			
			
				System.out.println("through");
				System.out.println("vv"+g+"bb"+er.getI());
				GBC.gridx = 0;
				GBC.gridy = 0+11+1;
			//	l1.setFont(new Font("Serif", Font.BOLD, 17));
				
				
			//	DesktopPane.add(l1, GBC);
				
			//	this.add(DesktopPane);
				
			
				System.out.println(f+"lllf");
				f++;
				
			
			
			
			if (f>g){
				System.out.println("vvg"+g);
				GBC.gridx = 0;
				GBC.gridy = 0+f+1;
			
				l2.setFont(new Font("Serif", Font.BOLD, 17));
				//DesktopPane.add(labelsnumber[0], GBC);
				
				
				
			}
			
			
			
			
			 }
			
			
			 }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

