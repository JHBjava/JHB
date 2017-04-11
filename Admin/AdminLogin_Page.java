package JHB.Admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import JHB.Class.Staff;

public class AdminLogin_Page extends JFrame implements ActionListener {
	//Frame
	JLabel label1 = new JLabel("Login");
	JLabel label2 = new JLabel("User Name: ");
	JTextField textfield1 = new JTextField();
	JLabel label3 = new JLabel("Password: ");
	
	JPasswordField textfield2 = new JPasswordField();
	JButton button1 = new JButton("Login");
	JButton button2 = new JButton("EXIT");
		
	public AdminLogin_Page() {
		//Frame
		this.setTitle("Login");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.setVisible(true);
		//Set Place
		
		label1.setBounds(900, 300, 200, 70);
		label1.setFont(new Font("Serif", Font.BOLD, 35));
		label2.setBounds(700, 400, 200, 50);
		label2.setFont(new Font("Serif", Font.BOLD, 35));
		textfield1.setBounds(900, 400, 300, 50);
		textfield1.setFont(new Font("Serif", Font.BOLD, 30));
		label3.setBounds(700, 460, 200, 50);
		label3.setFont(new Font("Serif", Font.BOLD, 35));
		textfield2.setBounds(900, 460, 300, 50);
		textfield2.setFont(new Font("Serif", Font.BOLD, 30));
		button1.setBounds(1000, 530, 200, 50);
		button1.setFont(new Font("Serif", Font.BOLD, 35));
		button1.setBackground(Color.LIGHT_GRAY);
		button2.setBounds(1200, 800, 100, 70);
	    button2.setFont(new Font("Serif", Font.BOLD, 25));
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
	    this.add(button1);
	    this.add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Button1 Login
		if (e.getSource() == button1) {
			String Sdata1 = textfield1.getText();
			String Sdata2 = textfield2.getText();
			Staff s1 = new Staff(Sdata1,Sdata2);
			s1.toString2();
			this.dispose();
			/*ConnectionJ conn = new ConnectionJ();
			 try{
				 if(conn.Open("inchi")){
					 if(conn.Query("select * from staff where staff_name ='"+Sdata1+"' and pass_word ='" +Sdata2+"'")){	 
						 if(conn.EOF() == false){
							 JFrame Admin_Page = new Admin_Page();
									this.dispose();
						 
			 }   
						 conn.Clear();
					 }
				 }
				 

			 }   catch(Exception e2){
		       
		       System.out.println("Error!!!");   
		       
		}
			 conn.Close();
			 conn = null;*/
		//	JFrame AdminPage = new Admin_Page();
		//	this.dispose();
		}
		//Button2 Exit
		if (e.getSource() == button2) {
			this.dispose();
		}
	}	
}
