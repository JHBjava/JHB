package abc.User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CustomerLogin_Page extends JFrame implements ActionListener {
	//Frame
	JLabel label1 = new JLabel("Customer Login");
	JLabel label2 = new JLabel("Name: ");
	JTextField textfield1 = new JTextField();
	JButton button1 = new JButton("Register");
	JButton button2 = new JButton("Login");
	JButton button3 = new JButton("Exit");
		
	public CustomerLogin_Page() {
		//Frame
		this.setTitle("Customer Login");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setLayout(null);
		this.setVisible(true);
		//Set Place
		label1.setBounds(800, 300, 300, 70);
		label1.setFont(new Font("Serif", Font.BOLD, 35));
		label2.setBounds(700, 400, 200, 50);
		label2.setFont(new Font("Serif", Font.BOLD, 35));
		textfield1.setBounds(900, 400, 300, 50);
		textfield1.setFont(new Font("Serif", Font.BOLD, 30));
		button1.setBounds(700, 530, 200, 50);
		button1.setFont(new Font("Serif", Font.BOLD, 35));
		button1.setBackground(Color.LIGHT_GRAY);
		button2.setBounds(1000, 530, 200, 50);
	    button2.setFont(new Font("Serif", Font.BOLD, 35));
	    button2.setBackground(Color.LIGHT_GRAY);
	    button3.setBounds(1200, 800, 100, 70);
	    button3.setFont(new Font("Serif", Font.BOLD, 35));
	    button3.setBackground(Color.LIGHT_GRAY);
	    //ActionListener
	    button1.addActionListener(this);
	    button2.addActionListener(this);
	    button3.addActionListener(this);
	    //Add
	    this.add(label1);
	    this.add(label2);
	    this.add(textfield1);
	    this.add(button1);
	    this.add(button2);
	    this.add(button3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Button1 Register
		if (e.getSource() == button1) {
			textfield1.getText();
			//Close and Open Window
			JFrame CustomerRegister = new Customer_Register1();
			this.dispose();
		}
		//Button2 Login
		if (e.getSource() == button2) {
			String customername = textfield1.getText();
			Customer c1 = new Customer(customername);
			c1.toString3();
			/*ConnectionJ conn = new ConnectionJ();
			try{

		        if (conn.Open("inchi")) {
		          if (conn.Query("select * from customer where customer_name ='"+customername+"'")) {
		            if (conn.EOF()== false) {
				JFrame ChooseAttribute = new Choose_Attribute();
			}
		          }
		        }
			}
			catch(Exception e2) {
			      
			       System.out.println("Error");
			}

			       conn.Close();
			       conn=null;*/
			    
			
		}
		//Button3 Exit
		if (e.getSource() == button3) {
			this.dispose();
		}
	}	
}