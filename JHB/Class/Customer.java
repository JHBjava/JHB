package JHB.Class;

public class Customer {
	private int customerID;
	private String customerName;
	private String customeric;
	private String dateOfBirth;
	private String gender;
	private String nationally;
	private int weight;
	private int height;
	
	public Customer(String customeric) {
		this.customeric = customeric;
	}
	
	public Customer(){
		
	}

	public Customer(String customerName, String customeric, String dateOfBirth, String gender, String nationally, int weight, int height) {
		this.customerName = customerName;
		this.customeric = customeric;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.nationally = nationally;
		this.weight = weight;
		this.height = height;
	}
	
	public boolean AddCustomer(){
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		
		try {
			if(conn.Open("inchi")) {
				if(conn.Update("insert into customer(ic, customer_name, dob, gender, nationality, weight, height)values ('"
							+ customeric + "', '" + customerName + "', '" + dateOfBirth + "','" + gender + "', '"
							+ nationally + "', " + weight + ", " + height + ")") != -1) {
					System.out.println("suceeful");
					BL = true;
				}
				conn.Clear();
				conn.Close();
			}
		}catch(Exception e) {
			System.out.println ("Update Fail");
			BL = false;
		}
		return BL;
	}
	
	public boolean customerData(){
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		try{
			if (conn.Open("inchi")) {
				if (conn.Query("select * from customer where ic ='"+customeric+"'")) {
					if (conn.EOF()== false) {
						BL = true;
					}
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
		return BL;
	}
	
	public void setData(String cic){
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if (conn.Open("inchi")) {				
				if (conn.Query("select * from customer where ic ='"+cic+"'")) {
					while(conn.Rs.next()) {
						customerID = conn.Rs.getInt("customer_id");
						customerName = conn.Rs.getString("customer_name");
						dateOfBirth = conn.Rs.getString("dob");
						gender = conn.Rs.getString("gender");
						nationally = conn.Rs.getString("nationality");
						weight = conn.Rs.getInt("weight");
						height = conn.Rs.getInt("height");
					}
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
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

	public String getCustomeric() {
		return customeric;
	}

	public void setCustomeric(String customeric) {
		this.customeric = customeric;
	}
	
}
