package JHB.Class;

public class Attribute {
	private int attributeid;
	private Attraction[] attraction = new Attraction[1000];
	private int [] countattributed = new int[100];
	private String description;
	int i =0;
	int o =0;
	
	public Attribute() {
	
	}

	public Attribute(int attributeid) {
		super();
		this.attributeid = attributeid;
	}


	public Attribute( String description,Attraction[] attraction) {
		super();
		this.attraction = attraction;
		this.description = description;
	}


	public Attribute(String description) {
		super();
		this.description = description;
	}

	

	public Attribute(Attraction[] attraction) {
		super();
		this.attraction = attraction;
	}


	public void addAttraction(Attraction attraction) {
				this.attraction[i] = attraction;
					i++;
	}
	public void countattribute(int x){
		this.countattributed[o] = x;
		o++;
	}
	public void deleteAttraction(int x2){
		     i= i-x2;
	}
	public void deletecountattribute(int x3){
		  o = o - x3;
	}

	

	public Attraction[] getAttraction() {
		return attraction;
	}


	
public int getNumberOfAttraction(){
		
		return i;
		
	}

	public int getAttributeid() {
		return attributeid;
	}
	public void setAttributeid(int attributeid) {
		this.attributeid = attributeid;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	public void toprint(){
		

		//System.out.println("child name is"+attraction[i].getAttractionName());
		System.out.println("child name is"+description);
		ConnectionJ conn = new ConnectionJ();
		if (conn.Open("inchi")){
			if (conn.Open("inchi")){
			
				//	String queryString = "insert into staff"+"(username, password) values"+ "(username, password)";
						  conn.Update("insert into attribute (description)" + "values ('"+description+"')");                          
						  System.out.println("child name is"+description);
						  conn.Clear();            
				        conn.Close(); 	
					}
		}
		for(int r =0; r<=i-1;r++){
			if (conn.Open("inchi")){
				
					System.out.println("i"+i);
				//	String queryString = "insert into staff"+"(username, password) values"+ "(username, password)";
						  conn.Update("insert into attraction (attraction_name,attribute_id)" + "values ('"+attraction[r].getAttractionName()+"','"+countattributed[r]+"')");                          
						 
						System.out.println("child name isww"+attraction[r].getAttractionName());
				
						  conn.Clear();            
				        conn.Close(); 	
					}
		}
	}
	
}