package JHB.Class;

public class EntryRecord {
	private String attraction_name;
	private String customer_ic;
	private double entry_price;
	private String[] date = new String[999];
	private String[] attractionName = new String[999];
	private int[] countNumber = new int[999];
	private String[] totalpriceinString = new String[999];
	private double[] totalprice = new double[999];
	private int[] totalpriceint = new int[999];
	private double[] totalpricedouble = new double[999];
	private String date1;
	private int i = 0;
	
	
	public EntryRecord(String attraction_name, String customer_ic, double entry_price) {
		this.attraction_name = attraction_name;
		this.customer_ic = customer_ic;
		this.entry_price = entry_price;
	}
	public EntryRecord() {
		
	}
	public EntryRecord(String date1) {
		this.date1 = date1;
	}
	public void GetDate() {
		i = 0;
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if (conn.Open("inchi")) {				
				if (conn.Query("select entry_date from entry_record group by entry_date")) {
					while(conn.Rs.next()) {
						System.out.println("gg");
						date[i] = conn.Rs.getString("entry_date");
						System.out.println(date[i]);
						i++;
					}
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
	}
	public void GetAllAttraction() {
		i = 0;
		ConnectionJ conn = new ConnectionJ();
		System.out.println(date1+"ok");
		try{
			if (conn.Open("inchi")) {																	                                                  
				if (conn.Query("select attraction_name, count(attraction_name) as number from entry_record where entry_date = '"+date1+"' group by attraction_name")) {                                   
				
					while(conn.Rs.next()) {
						
						attractionName[i] = conn.Rs.getString("attraction_name");
						countNumber[i] = conn.Rs.getInt("number");
						System.out.println(attractionName[i]);
						System.out.println((countNumber[i])+"mmm");
						i++;
					}
					attractionName[i] = "total income:";
					attractionName[i+1] = "number of people per today:";
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
	}
	public void Gettotalperice() {
		getI();
			System.out.println(i+"=i");
		ConnectionJ conn = new ConnectionJ();
		System.out.println(date1+"ok");
		try{
			if (conn.Open("inchi")) {																	                                                  
				if (conn.Query("select sum(entry_price) as total_price from entry_record where entry_date = '"+date1+"'")) {                                   
				
					while(conn.Rs.next()) {
						
						totalpriceint[i] = conn.Rs.getInt("total_price");
						totalpricedouble[i] = conn.Rs.getDouble("total_price");
						System.out.println("total_price"+totalpriceint[i]);
						countNumber[i]=totalpriceint[i] ;
						System.out.println(totalprice[i]);
						
						i++;
					}
					
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
	}
	public void Gettotalpeople() {
		getI();
			System.out.println(i+"=i");
		ConnectionJ conn = new ConnectionJ();
		System.out.println(date1+"ok");
		try{
			if (conn.Open("inchi")) {																	                                                  
				if (conn.Query("select count(customer_ic) as total from (select distinct(customer_ic) from entry_record where entry_date = '"+date1+"') p")) {                                   
				
					while(conn.Rs.next()) {
						
						totalpriceint[i] = conn.Rs.getInt("total");
						System.out.println("total123"+totalpriceint[i]);
						countNumber[i]=totalpriceint[i] ;
						System.out.println(totalprice[i]);
						
						i++;
					}
					
				}
			}
		}catch(Exception e2) {
			System.out.println("Error");
		}
		conn.Close();
		conn=null;
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
	
	
	public String[] getAttractionName() {
		return attractionName;
	}
	public void setAttractionName(String[] attractionName) {
		this.attractionName = attractionName;
	}
	public String[] getDate() {
		return date;
	}
	
	public int[] getCountNumber() {
		return countNumber;
	}
	public void setCountNumber(int[] countNumber) {
		this.countNumber = countNumber;
	}
	
	public double[] getTotalpricedouble() {
		return totalpricedouble;
	}
	public void setTotalpricedouble(double[] totalpricedouble) {
		this.totalpricedouble = totalpricedouble;
	}
	public void setDate(String[] date) {
		this.date = date;
	}
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}