package abc.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import abc.Admin.ConnectionJ;
import abc.Admin.Staff;

public class Customer_Register1 extends JFrame implements ActionListener {
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel("Register");
	JLabel label2 = new JLabel("Name: ");
	JTextField textfield1 = new JTextField();
	JLabel label3 = new JLabel("Date Of Birth: ");
	JTextField textfield2 = new JTextField();
	JLabel label4 = new JLabel("Gender: ");
	JTextField textfield3 = new JTextField();
	JLabel label5 = new JLabel("Nationality: ");
	JTextField textfield4 = new JTextField();
	JLabel label6 = new JLabel("Weight(KG): ");
	JTextField textfield5 = new JTextField();
	JLabel label7 = new JLabel("Height(CM): ");
	JTextField textfield6 = new JTextField();
	JButton button1 = new JButton("Cancel");
	JButton button2 = new JButton("Register");
		
	public Customer_Register1() {
		//Frame
		this.setTitle("Register");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.setVisible(true);
		//Set Place
		label1.setBounds(900, 200, 200, 70);
		label1.setFont(new Font("Serif", Font.BOLD, 35));
		label2.setBounds(700, 290, 200, 50);
		label2.setFont(new Font("Serif", Font.BOLD, 30));
		textfield1.setBounds(900, 290, 300, 50);
		textfield1.setFont(new Font("Serif", Font.BOLD, 30));
		label3.setBounds(700, 350, 200, 50);
		label3.setFont(new Font("Serif", Font.BOLD, 30));
		textfield2.setBounds(900, 350, 300, 50);
		textfield2.setFont(new Font("Serif", Font.BOLD, 30));
		label4.setBounds(700, 410, 200, 50);
		label4.setFont(new Font("Serif", Font.BOLD, 30));
		textfield3.setBounds(900, 410, 300, 50);
		textfield3.setFont(new Font("Serif", Font.BOLD, 30));
		label5.setBounds(700, 470, 200, 50);
		label5.setFont(new Font("Serif", Font.BOLD, 30));
		textfield4.setBounds(900, 470, 300, 50);
		textfield4.setFont(new Font("Serif", Font.BOLD, 30));
		label6.setBounds(700, 530, 200, 50);
		label6.setFont(new Font("Serif", Font.BOLD, 30));
		textfield5.setBounds(900, 530, 300, 50);
		textfield5.setFont(new Font("Serif", Font.BOLD, 30));
		label7.setBounds(700, 590, 200, 50);
		label7.setFont(new Font("Serif", Font.BOLD, 30));
		textfield6.setBounds(900, 590, 300, 50);
		textfield6.setFont(new Font("Serif", Font.BOLD, 30));
		button1.setBounds(700, 700, 200, 70);
	    button1.setFont(new Font("Serif", Font.BOLD, 35));
	    button1.setBackground(Color.LIGHT_GRAY);
	    button2.setBounds(1000, 700, 200, 70);
	    button2.setFont(new Font("Serif", Font.BOLD, 35));
	    button2.setBackground(Color.LIGHT_GRAY);
	    //ActionListener
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    //Add
	    this.add(label1);
	    this.add(label2);
	    this.add(textfield1);
	    this.add(label3);
	    this.add(textfield2);
	    this.add(label4);
	    this.add(textfield3);
	    this.add(label5);
	    this.add(textfield4);
	    this.add(label6);
	    this.add(textfield5);
	    this.add(label7);
	    this.add(textfield6);
	    this.add(button1);
	    this.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Button1 cancel
		if (e.getSource() == button1) {
			JFrame CstomerLoginPage = new CustomerLogin_Page();
			this.dispose();
		}
		//Button2 Register
		if (e.getSource() == button2) {
			String customername = textfield1.getText();
			String customerdob = textfield2.getText();
			String gender = textfield3.getText();
			String nationality = textfield4.getText();
			String weight = textfield5.getText();
			Integer weight2 = Integer.valueOf(weight);
			String height = textfield6.getText();
			Integer height2 = Integer.valueOf(height);
			Customer c1 = new Customer(customername, customerdob, gender, nationality, weight2,height2);
			ConnectionJ conn = new ConnectionJ();
			/*if (conn.Open("inchi")){
				
				//	String queryString = "insert into Users"+"(username, password) values"+ "(username, password)";
					conn.Update("insert into customer(customer_name, dob, gender, nationality, weight, height)" + "values ('"+customername+"', '"+customerdob+"','"+gender+"', '"+nationality+"', "+weight2+", "+height2+")");                               
					JFrame ChooseAttribute = new Choose_Attribute();
					this.dispose();   
					conn.Clear();            
				        conn.Close(); 	
					}*/
			c1.toString2();
			this.dispose(); 
			
		}
	}	
}