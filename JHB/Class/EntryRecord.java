package JHB.Class;

public class EntryRecord {
	private String attraction_name;
	private String customer_ic;
	private double entry_price;
	
	public EntryRecord(String attraction_name, String customer_ic, double entry_price) {
		this.attraction_name = attraction_name;
		this.customer_ic = customer_ic;
		this.entry_price = entry_price;
	}
	
	public void insertData() {
		ConnectionJ conn = new ConnectionJ();
		
		if (conn.Open("inchi")) {
			conn.Update("insert into entry_record(attraction_name, customer_ic, entry_date, entry_price) values ('"
						+ attraction_name + "', '" + customer_ic + "',CONVERT (date, GETDATE()), " + entry_price + ")");
			System.out.println("suceeful");
			conn.Clear();
			conn.Close();
		}
	}

	public String getAttraction_name() {
		return attraction_name;
	}

	public void setAttraction_name(String attraction_name) {
		this.attraction_name = attraction_name;
	}

	public String getCustomer_ic() {
		return customer_ic;
	}

	public void setCustomer_ic(String customer_ic) {
		this.customer_ic = customer_ic;
	}

	public double getEntry_price() {
		return entry_price;
	}

	public void setEntry_price(double entry_price) {
		this.entry_price = entry_price;
	}
	
}