package JHB.Class;

public class Attraction {
	private int[] attraction_id = new int[999];
	private String[] attraction_name = new String[999];
	private int[] locationX = new int[999];
	private int[] locationY = new int[999];
	private int[] locationZ = new int[999];
	private int[] minimum_age = new int[999];
	private int[] minimum_height = new int[999];
	private int[] maximum_weight = new int[999];
	private int[] duration = new int[999];
	private double[] price = new double[999];
	private String[] status = new String[999];
	private int[] attribute_id = new int[999];
	private String[] image = new String[999];
	private int i = 0;
	
	public Attraction() {
		
	}
	
	public void GetThrill() {
		i = 0;
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if (conn.Open("inchi")) {				
				if (conn.Query("select * from attraction where attribute_id = 67")) {
					while(conn.Rs.next()) {
						attraction_id[i] = conn.Rs.getInt("attraction_id");
						attraction_name[i] = conn.Rs.getString("attraction_name");
						locationX[i] = conn.Rs.getInt("location_x");
						locationY[i] = conn.Rs.getInt("location_y");
						locationZ[i] = conn.Rs.getInt("location_z");
						minimum_age[i] = conn.Rs.getInt("minimum_age");
						minimum_height[i] = conn.Rs.getInt("minimum_height");
						maximum_weight[i] = conn.Rs.getInt("maximum_weight");
						duration[i] = conn.Rs.getInt("duration");
						price[i] = conn.Rs.getDouble("price");
						status[i] = conn.Rs.getString("status");
						attribute_id[i] = conn.Rs.getInt("attribute_id");
						image[i] = conn.Rs.getString("image");
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
	
	public void GetChildren() {
		i = 0;
		ConnectionJ conn = new ConnectionJ();
		
		try{
			if (conn.Open("inchi")) {				
				if (conn.Query("select * from attraction where attribute_id = 68")) {
					while(conn.Rs.next()) {
						attraction_id[i] = conn.Rs.getInt("attraction_id");
						attraction_name[i] = conn.Rs.getString("attraction_name");
						locationX[i] = conn.Rs.getInt("location_x");
						locationY[i] = conn.Rs.getInt("location_y");
						locationZ[i] = conn.Rs.getInt("location_z");
						minimum_age[i] = conn.Rs.getInt("minimum_age");
						minimum_height[i] = conn.Rs.getInt("minimum_height");
						maximum_weight[i] = conn.Rs.getInt("maximum_weight");
						duration[i] = conn.Rs.getInt("duration");
						price[i] = conn.Rs.getDouble("price");
						status[i] = conn.Rs.getString("status");
						attribute_id[i] = conn.Rs.getInt("attribute_id");
						image[i] = conn.Rs.getString("image");
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
	
	public void AddAttraction(String attraction_name, int locationX, int locationY, int locationZ, int minimum_age, int minimum_height,
			int maximum_weight, int duration, double price, String status, String image, int attribute_id) {
		ConnectionJ conn = new ConnectionJ();
		if(attribute_id == 67) {
			try {
				if (conn.Open("inchi")) {
					conn.Update("insert into attraction(attraction_name, location_x, location_y, location_z, minimum_age, minimum_height, maximum_weight, duration, price, status, attribute_id, image) values ('"
								+ attraction_name + "', " + locationX + ", " + locationY + ", " + locationZ + ", " + minimum_age + ", " + minimum_height + ", " + maximum_weight + ", " + duration + ", "
								+ price + ", '" + status + "', " + attribute_id + ", 'src/JHB/thrill/" + image + "')");
					System.out.println("suceeful");
					conn.Clear();
					conn.Close();
				}
			}catch (Exception e) {
				System.out.println("faill");
			}
		}else {
			try {
				if (conn.Open("inchi")) {
					conn.Update("insert into attraction(attraction_name, location_x, location_y, location_z, minimum_age, minimum_height, maximum_weight, duration, price, status, attribute_id, image) values ('"
								+ attraction_name + "', " + locationX + ", " + locationY + ", " + locationZ + ", " + minimum_age + ", " + minimum_height + ", " + maximum_weight + ", " + duration + ", "
								+ price + ", '" + status + "', " + attribute_id + ", 'src/JHB/children/" + image + "')");
					System.out.println("suceeful");
					conn.Clear();
					conn.Close();
				}
			}catch (Exception e) {
				System.out.println("faill");
			}
		}
	}
	
	public void UpdateThrill(int attraction_id, String attraction_name, int locationX, int locationY, int locationZ, int minimum_age, int minimum_height,
			int maximum_weight, int duration, double price, String status) {
		ConnectionJ conn = new ConnectionJ();
		
		try {
			if (conn.Open("inchi")) {
				if(conn.Update("update attraction set attraction_name='" + attraction_name + "', location_x=" + locationX + ", location_y=" + locationY +
						", location_z=" + locationZ + ", minimum_age=" + minimum_age + ", minimum_height=" + minimum_height + ", maximum_weight=" + maximum_weight +
						", duration=" + duration + ", price=" + price + ", status='" + status + "', attribute_id=67, image='src/JHB/thrill/'" +
						" where attraction_id=" + attraction_id + "") != -1) {
					System.out.println("suceeful");
				}
				conn.Clear();
				conn.Close();
			}
		}catch (Exception e) {
			System.out.println("faill");
		}
	}
	
	public boolean UpdateChildren(int attraction_id, String attraction_name, int locationX, int locationY, int locationZ, int minimum_age, int minimum_height,
			int maximum_weight, int duration, double price, String status) {
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		
		try {
			if (conn.Open("inchi")) {
				if(conn.Update("update attraction set attraction_name='" + attraction_name + "', location_x=" + locationX + ", location_y=" + locationY +
						", location_z=" + locationZ + ", minimum_age=" + minimum_age + ", minimum_height=" + minimum_height + ", maximum_weight=" + maximum_weight +
						", duration=" + duration + ", price=" + price + ", status='" + status + "', attribute_id=68, image='src/JHB/children/'" +
						" where attraction_id=" + attraction_id + "") != -1) {
					System.out.println("suceeful");
					BL = true;
				}
				conn.Clear();
				conn.Close();
			}
		}catch (Exception e) {
			System.out.println("faill");
			BL = false;
		}
		return BL;
	}
	
	public boolean DeleteData(int attraction_id) {
		ConnectionJ conn = new ConnectionJ();
		boolean BL = false;
		
		try {
			if (conn.Open("inchi")) {
				if(conn.Update("delete from attraction where attraction_id=" + attraction_id) != -1) {
					System.out.println("suceeful");
					BL = true;
				}
				conn.Clear();
				conn.Close();
			}
		}catch (Exception e) {
			System.out.println("faill");
			BL = false;
		}
		return BL;
	}
	
	public int[] getAttraction_id() {
		return attraction_id;
	}

	public void setAttraction_id(int[] attraction_id) {
		this.attraction_id = attraction_id;
	}

	public String[] getAttraction_name() {
		return attraction_name;
	}

	public void setAttraction_name(String[] attraction_name) {
		this.attraction_name = attraction_name;
	}

	public int[] getLocationX() {
		return locationX;
	}

	public void setLocationX(int[] locationX) {
		this.locationX = locationX;
	}

	public int[] getLocationY() {
		return locationY;
	}

	public void setLocationY(int[] locationY) {
		this.locationY = locationY;
	}

	public int[] getLocationZ() {
		return locationZ;
	}

	public void setLocationZ(int[] locationZ) {
		this.locationZ = locationZ;
	}

	public int[] getMinimum_age() {
		return minimum_age;
	}

	public void setMinimum_age(int[] minimum_age) {
		this.minimum_age = minimum_age;
	}

	public int[] getMinimum_height() {
		return minimum_height;
	}

	public void setMinimum_height(int[] minimum_height) {
		this.minimum_height = minimum_height;
	}

	public int[] getMaximum_weight() {
		return maximum_weight;
	}

	public void setMaximum_weight(int[] maximum_weight) {
		this.maximum_weight = maximum_weight;
	}

	public int[] getDuration() {
		return duration;
	}

	public void setDuration(int[] duration) {
		this.duration = duration;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

	public double[] getPrice() {
		return price;
	}

	public void setPrice(double[] price) {
		this.price = price;
	}

	public int[] getAttribute_id() {
		return attribute_id;
	}

	public void setAttribute_id(int[] attribute_id) {
		this.attribute_id = attribute_id;
	}

	public String[] getImage() {
		return image;
	}

	public void setImage(String[] image) {
		this.image = image;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}