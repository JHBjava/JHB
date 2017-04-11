package JHB.Class;

import javax.swing.JFrame;

import JHB.User.User_Function;

public class Customer {
	private String customerID;
	private String customerName;
	private String dateOfBirth;
	private String gender;
	private String nationally;
	private Attribute attribute;
	private int weight;
	private int height;
	
	public Customer(String customerName) {
		this.customerName = customerName;
	}
	
	public Customer(String customerName, String dateOfBirth, String gender, String nationally, int weight, int height) {
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.nationally = nationally;
		this.weight = weight;
		this.height = height;
	}
	
	public void toString1(){
		ConnectionJ conn = new ConnectionJ();
		
		if (conn.Open("inchi")){
			//String queryString = "insert into Users"+"(username, password) values"+ "(username, password)";
			conn.Update("insert into customer(customer_name, dob, gender, nationality, weight, height)" +
					"values ('" + customerName + "', '" + dateOfBirth + "','" + gender + "', '" +
					nationally + "', " + weight + ", " + height + ")");
			JFrame ChooseAttribute = new User_Function(customerName);
			System.out.println("suceeful");
			conn.Clear();
			conn.Close();
		}
	}
	
	public void toString2(){
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if (conn.Open("inchi")) {
				if (conn.Query("select * from customer where customer_name ='"+customerName+"'")) {
					if (conn.EOF()== false) {
						JFrame ChooseAttribute = new User_Function(customerName);
					}
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationally() {
		return nationally;
	}

	public void setNationally(String nationally) {
		this.nationally = nationally;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
