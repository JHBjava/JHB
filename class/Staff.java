package Class;

import javax.swing.JFrame;

import JHB.Admin.Admin_Function;

public class Staff {
	private String staffID;
	private String password;
	private String staffname;
	private String gender;
	private String dob;
	private String address;
	
	public Staff() {
		
	}
	
	public Staff(String staffname, String password) {
		this.password = password;
		this.staffname = staffname;
	}
	
	public Staff( String password, String staffname, String gender, String dob, String address) {
		this.password = password;
		this.staffname = staffname;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
	}
	
	public String getStaffID() {
		return staffID;
	}
	
	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStaffname() {
		return staffname;
	}
	
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void toString1() {
		ConnectionJ conn = new ConnectionJ();
		
		if (conn.Open("inchi")){
			if (conn.Open("inchi")){
				//	String queryString = "insert into staff"+"(username, password) values"+ "(username, password)";
				conn.Update("insert into staff(pass_word, staff_name, gender, dob, address)" + "values ('"+password+"', '"+staffname+"', '"+gender+"','"+dob+"', '"+address+"')");                          
				conn.Clear();            
				conn.Close(); 	
			}
		}
	}
	
	public void toString2() {
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if(conn.Open("inchi")){
				if(conn.Query("select * from staff where staff_name ='"+staffname+"' and pass_word ='" +password+"'")){	 
					if(conn.EOF() == false){
						JFrame Admin_Page = new Admin_Function();
					}   
					conn.Clear();
				}
			}
		}catch(Exception e2){
			System.out.println("Error!!!");
		}
		conn.Close();
		conn = null;
	}
}