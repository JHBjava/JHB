
public class Staff {
	private String staffID;
	private String password;
	private String staffname;
	
	private String gender;
	private String dob;
	private String address;
	
	public Staff( String password, String staffname,
			String gender, String dob, String address) {
		super();
	
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
	
	
	
	

}
