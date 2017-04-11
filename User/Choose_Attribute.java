package JHB.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import JHB.Class.Attraction;
import JHB.Class.Attribute;
import JHB.Class.ConnectionJ;

public class Choose_Attribute extends JFrame implements ActionListener {
	int i=0;
	int y =0;
	int[] count1 = new int[100];
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	String[] abc3 = new String[i];
	Attribute abc8 = new Attribute();
	Attribute[] abc2 = new Attribute[100];
	Attraction[] abc1 = new Attraction[1000000];
	Attraction abc7 = new Attraction("ygj");
  //  Employee[] abc2 = new Employee[i];
	JLabel label1 = new JLabel("Choose Attribute");
	JLabel label2 = new JLabel("abc");
	JTextField textfield1 = new JTextField();
	JTextField textfield2 = new JTextField();
	JTextField textfield3 = new JTextField();
	
	ImageIcon imgThisImg = new ImageIcon("D:/HTML5/html/images/angry.png");
	ImageIcon imgThisImg2 = new ImageIcon("D:/HTML5/html/images/angry.png");
	JLabel label3 = new JLabel();
	JLabel label4 = new JLabel();
	JButton button1 = new JButton("Cancel");
	JButton button2 = new JButton("Buy Ticket");
	
	 JComboBox jc1 = new JComboBox();
	 DefaultComboBoxModel d = new DefaultComboBoxModel(); 
     
	 JCheckBox chkApple = new JCheckBox("Apple");
	 JCheckBox chkOrange = new JCheckBox("Orange");
     JScrollPane p1;
     DefaultListModel m1;
	
	public Choose_Attribute(String name) {
		//Frame
		this.setTitle("Choose Attribute");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.setVisible(true);
		
		label3.setIcon(imgThisImg);
		label4.setIcon(imgThisImg);
		///////////////////////////combobox
	
	              
         jc1.setModel(populate()); 
         jc1.setBounds(240,60,150,30);
		//Set Place
        chkApple.setFont(new Font("Serif", Font.BOLD, 15));
    	chkApple.setBackground(Color.LIGHT_GRAY);
    	chkApple.setBounds(30, 30, 100, 20);
    	chkOrange.setFont(new Font("Serif", Font.BOLD, 15));
     	chkOrange.setBackground(Color.LIGHT_GRAY);
     	chkOrange.setBounds(30, 50, 100, 20);
     	panel1.setBounds(100,100,600,600);
     	panel2.setBounds(100,100,600,600);
		label1.setBounds(750, 80, 300, 70);
		label1.setFont(new Font("Serif", Font.BOLD, 35));
		label2.setBounds(300, 150, 200, 70);
		label2.setFont(new Font("Serif", Font.BOLD, 35));
		label3.setBounds(550, 120, 200, 70);
		label3.setFont(new Font("Serif", Font.BOLD, 35));
		label4.setBounds(550, 220, 200, 70);
		label4.setFont(new Font("Serif", Font.BOLD, 35));
		textfield1.setBounds(150, 80, 300, 70);
		textfield1.setFont(new Font("Serif", Font.BOLD, 35));
		textfield2.setBounds(100, 150, 200, 70);
		textfield2.setFont(new Font("Serif", Font.BOLD, 35));
		textfield3.setBounds(150, 120, 200, 70);
		textfield3.setFont(new Font("Serif", Font.BOLD, 35));
		panel1.add(chkOrange);
		panel2.add(chkApple);
		
	/*	button1.setBounds(300, 950, 200, 70);
	    button1.setFont(new Font("Serif", Font.BOLD, 35));
	    button1.setBackground(Color.LIGHT_GRAY);
	    button2.setBounds(1300, 950, 200, 70);
	    button2.setFont(new Font("Serif", Font.BOLD, 35));
	    button2.setBackground(Color.LIGHT_GRAY);*/
		button1.setBounds(400, 550, 200, 70);
	    button1.setFont(new Font("Serif", Font.BOLD, 35));
	    button1.setBackground(Color.LIGHT_GRAY);
	    button2.setBounds(700, 550, 200, 70);
	    button2.setFont(new Font("Serif", Font.BOLD, 35));
	    button2.setBackground(Color.LIGHT_GRAY);
	    //AddCtionListener
	    chkApple.addActionListener(this);
	    chkOrange.addActionListener(this);
	    jc1.addActionListener(this);
	    button1.addActionListener(this);
	    button2.addActionListener(this);
		//Add
	   // this.add(new JLabel(new ImageIcon("abc/src/abc/User/brazil.png")));
	    this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.add(button1);
		this.add(button2);
		this.add(jc1);
		this.add(textfield1).setVisible(false);
		this.add(textfield2).setVisible(false);
		this.add(textfield3).setVisible(false);
	//	this.add(chkApple);
		
	//	this.add(chkOrange);
		 ConnectionJ j = new ConnectionJ();
	       
	      try {
	        
	        if (j.Open("inchi")) {
	        	if (j.Query("select * from customer where customer_name ='"+name+"'")) {
	            if (j.EOF()== false) {
	               
	            	textfield1.setText(""+j.Rs.getString("customer_name"));   // (userid, accnumber, name, icno, race, nati, day, month, year, address, contact, email, amount)"
	            	textfield2.setText(""+j.Rs.getString("weight"));
	            	textfield3.setText(""+j.Rs.getString("height"));
	              
	              
	             
	            } // end of if
	            
	            j.Clear();
	          } // end of if
	          
	        } // end of if
	        
	    }  catch(Exception e2) {
	      
	       System.out.println("Error");
	}

	       j.Close();
	       j=null;
		
	}
	 private DefaultComboBoxModel populate()                      
     {
    DefaultComboBoxModel d = new DefaultComboBoxModel();
    d.addElement(("thriller"));
    d.addElement(("non- thriller"));
      return d;
      }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//Button1 cancel
		if (arg0.getSource() == button1) {
			JFrame CustomerLogin = new CustomerLogin_Page();
			this.dispose();
		}
		//Button2 Buy Ticket
		if (arg0.getSource() == button2) {
			System.out.println(y);
			for(int u=0 ; u<=y-1 ; u++){
	    		System.out.println(y);
	    		//abc8= new Attribute(1);
	    		/*abc8.addAttraction(abc1[u]);*/
	    		/*abc2[u]= new Attribute("1");
	    		abc2[u].addAttraction(abc1[u]);*/
	    		System.out.println("fbgfbfgbhhhhhhh"+abc8.getAttraction()[u].getAttractionName());
	    		//System.out.println("fbgfbfgb"+abc2[u].getAttraction()[u].getAttractionName());
	    		//System.out.println("fgfdgfg"+abc2[u].getAttraction()[u].getAttractionName());
	    		if(u==1){
	    		//System.out.println("fbgfbtttttttttfgb"+abc8.getAttraction()[1].getAttractionName());
	    		}
	    		System.out.println("fdffb");
	    		}
	            	//for(int k=0; k<=0;k++){
			/*for(int u=0 ; u<=y-1 ; u++){
        		//String nn = abc3[u];
        		abc2[u]= new Attribute(1);
        		abc2[u].addAttraction(abc1[u]);
        		
        		}*/
	            		abc8.toprint();
	          //  	}
	            	
	            	
			
		}
		
		if(arg0.getSource()==jc1) {
			if (jc1.getSelectedIndex() == 0) {
				this.add(panel1).setVisible(false);
				this.add(panel2).setVisible(true);
			}
			else if(jc1.getSelectedIndex() == 1){
				this.add(panel1).setVisible(true);
				this.add(panel2).setVisible(false);
			}
          
		} // end of if
		if(arg0.getSource() == chkApple) {
			if(chkApple.isSelected()){
				System.out.println("" + chkApple.getText());
				
				//abc3[i] = chkApple.getText();
				abc1[i] = new Attraction(chkApple.getText());
				abc8.addAttraction(abc1[i]);
				abc8.countattribute(1);
				System.out.println("" + chkApple.getText());
				i++;
				y=i;
		}else {
			--i;
			y=i;
			abc8.deleteAttraction(1);
			abc8.deletecountattribute(1);
			System.out.println(chkApple.getText() + "cancel");
		}
		
		
	}
		
		if(arg0.getSource() == chkOrange) {
			if(chkOrange.isSelected()){
				System.out.println("" + chkOrange.getText());
				
				//abc3[i] = chkApple.getText();
				abc1[i] = new Attraction(chkOrange.getText());
				abc8.addAttraction(abc1[i]);
				abc8.countattribute(1);
				System.out.println("" + chkOrange.getText());
				i++;
				y=i;
					
		}else {
			--i;
			y=i;
			abc8.deleteAttraction(1);
			abc8.deletecountattribute(1);
			System.out.println(chkOrange.getText() + "cancel");
		}
		
		
	}
		
		
	}
	

}