package abc.Admin;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Register_Staff extends JInternalFrame implements ActionListener {
	JDesktopPane desktop1 = new JDesktopPane();
	JLabel label1 = new JLabel("Staff Register");
	JLabel label2 = new JLabel("Password: ");
	JPasswordField textfield1 = new JPasswordField();
	JLabel label3 = new JLabel("Name: ");
	JTextField textfield2 = new JTextField();
	JLabel label4 = new JLabel("Gender: ");
	JTextField textfield3 = new JTextField();
	JLabel label5 = new JLabel("Bod: ");
	JTextField textfield4 = new JTextField();
	JLabel label6 = new JLabel("Address: ");
	JTextField textfield5 = new JTextField();
	JButton button1 = new JButton("Register");
	
	public Register_Staff() {
		//Frame
		this.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
		((BasicInternalFrameUI)this.getUI()).setNorthPane(null);
		this.setVisible(true);
		desktop1.setBackground(Color.LIGHT_GRAY);
		desktop1.setLayout(null);
		//Set Place
		label1.setBounds(800, 100, 350, 60);
		label1.setFont(new Font("Serif", Font.BOLD, 35));
		label2.setBounds(600, 170, 200, 60);
		label2.setFont(new Font("Serif", Font.BOLD, 35));
	    textfield1.setBounds(800, 170, 300, 60);
		textfield1.setFont(new Font("Serif", Font.BOLD, 30));
		label3.setBounds(600, 240, 200, 60);
		label3.setFont(new Font("Serif", Font.BOLD, 35));
	    textfield2.setBounds(800, 240, 300, 60);
		textfield2.setFont(new Font("Serif", Font.BOLD, 30));
		label4.setBounds(600, 310, 200, 60);
		label4.setFont(new Font("Serif", Font.BOLD, 35));
	    textfield3.setBounds(800, 310, 300, 60);
		textfield3.setFont(new Font("Serif", Font.BOLD, 30));
		label5.setBounds(600, 380, 200, 60);
		label5.setFont(new Font("Serif", Font.BOLD, 35));
	    textfield4.setBounds(800, 380, 300, 60);
		textfield4.setFont(new Font("Serif", Font.BOLD, 30));
		label6.setBounds(600, 450, 200, 60);
		label6.setFont(new Font("Serif", Font.BOLD, 35));
	    textfield5.setBounds(800, 450, 300, 60);
		textfield5.setFont(new Font("Serif", Font.BOLD, 30));
		button1.setBounds(800, 520, 300, 60);
	    button1.setFont(new Font("Serif", Font.BOLD, 25));
	    button1.setBackground(Color.LIGHT_GRAY);
	    //ActionListener
	    button1.addActionListener(this);
	    //Add
	    desktop1.add(label1);
	    desktop1.add(label2);
	    desktop1.add(textfield1);
	    desktop1.add(label3);
	    desktop1.add(textfield2);
	    desktop1.add(label4);
	    desktop1.add(textfield3);
	    desktop1.add(label5);
	    desktop1.add(textfield4);
	    desktop1.add(label6);
	    desktop1.add(textfield5);
	    desktop1.add(button1);
	    this.add(desktop1);
	}
	
	public void Close() {
		this.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Button Register
		if (e.getSource() == button1) {
			String staffpassword = textfield1.getText();
			String staffname = textfield2.getText();
			String gender = textfield3.getText();
			String dob = textfield4.getText();
			String address = textfield5.getText();
			Staff s1 = new Staff(staffpassword, staffname, gender, dob, address);
			
		/*	if (conn.Open("inchi")){
				
		//	String queryString = "insert into staff"+"(username, password) values"+ "(username, password)";
				  conn.Update("insert into staff(pass_word, staff_name, gender, dob, address)" + "values ('"+staffpassword+"', '"+staffname+"', '"+gender+"','"+dob+"', '"+address+"')");                          
			   conn.Clear();            
		        conn.Close(); 	
			}*/
			s1.toString1();
		}
	}

}
