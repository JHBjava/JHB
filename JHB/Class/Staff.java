package JHB.Class;

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
		this.staffname = staffname;
		this.password = password;
	}
	
	public Staff(String staffname, String password, String gender, String dob, String address) {
		this.staffname = staffname;
		this.password = password;
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
	
	public boolean AddStaff() {
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		
		try {
			if (conn.Open("inchi")){
				conn.Update("insert into staff(staff_name, pass_word, gender, dob, address) values ('"
						+ staffname + "', '" + password + "', '" + gender + "','" + dob + "', '" + address + "')");
				BL = true;
			}
		}catch(Exception e) {
			BL = false;
		}
		conn.Clear();
		conn.Close();
		return BL;
	}
	
	public boolean StaffData() {
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		
		try{
			if(conn.Open("inchi")){
				if(conn.Query("select * from staff where staff_name ='" + staffname + "' and pass_word ='" + password + "'")){
					if(conn.EOF() == false) {
						BL = true;
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Error!!!");
		}
		conn.Clear();
		conn.Close();
		conn = null;
		return BL;
	}
}