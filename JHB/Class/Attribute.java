package JHB.Class;

public class Attribute {
	private int attributeid;
	private Attraction[] attraction = new Attraction[1000];
	private int [] countattributed = new int[100];
	private String description;
	int i = 0;
	int o = 0;
	
	public Attribute() {
		
	}
	
	public Attribute(int attributeid) {
		this.attributeid = attributeid;
	}
	
	public Attribute(String description, Attraction[] attraction) {
		this.attraction = attraction;
		this.description = description;
	}
	
	public Attribute(String description) {
		this.description = description;
	}
	
	public Attribute(Attraction[] attraction) {
		this.attraction = attraction;
	}
	
	public void addAttraction(Attraction attraction) {
		this.attraction[i] = attraction;
		i++;
	}
	
	public void countattribute(int x) {
		this.countattributed[o] = x;
		o++;
	}
	
	public void deleteAttraction(int x) {
		i -= x;
	}
	
	public void deletecountattribute(int x) {
		o -= x;
	}
	
	public int getNumberOfAttraction() {
		return i;
	}
	
	public void toPrint() {
		System.out.println("child name is" + description);
		ConnectionJ conn = new ConnectionJ();
		
		if(conn.Open("inchi")) {
			if(conn.Open("inchi")) {
				conn.Update("insert into attribute (description)" + "values ('"+description+"')");
				System.out.println("child name is" + description);
				conn.Clear();
				conn.Close();
			}
		}
		for(int f = 0; f <= i-1; f++) {
			if(conn.Open("inchi")) {
				System.out.println("i" + i);
				conn.Update("insert into attraction (attraction_name,attribute_id)" + "values ('"+attraction[f].getAttractionName()+"','"+countattributed[f]+"')");
				System.out.println("child name isww"+attraction[f].getAttractionName());
				conn.Clear();
				conn.Close();
			}
		}
	}

	public int getAttributeid() {
		return attributeid;
	}

	public void setAttributeid(int attributeid) {
		this.attributeid = attributeid;
	}

	public Attraction[] getAttraction() {
		return attraction;
	}

	public void setAttraction(Attraction[] attraction) {
		this.attraction = attraction;
	}

	public int[] getCountattributed() {
		return countattributed;
	}

	public void setCountattributed(int[] countattributed) {
		this.countattributed = countattributed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getO() {
		return o;
	}

	public void setO(int o) {
		this.o = o;
	}
	
}
