package Class;

public class Attraction {
	private int attractionID;
	private String attractionName;
	private int locationX;
	private int locationY;
	private int locationZ;
	private int minimumAge;
	private int minimumHeight;
	private int minimumWeight;
	private int duration;
	private int price;
	private String status;
	
	public Attraction() {
		
	}
	
	public Attraction(String attractionName) {
		this.attractionName = attractionName;
	}

	public int getAttractionID() {
		return attractionID;
	}

	public void setAttractionID(int attractionID) {
		this.attractionID = attractionID;
	}

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public int getLocationZ() {
		return locationZ;
	}

	public void setLocationZ(int locationZ) {
		this.locationZ = locationZ;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	public int getMinimumHeight() {
		return minimumHeight;
	}

	public void setMinimumHeight(int minimumHeight) {
		this.minimumHeight = minimumHeight;
	}

	public int getMinimumWeight() {
		return minimumWeight;
	}

	public void setMinimumWeight(int minimumWeight) {
		this.minimumWeight = minimumWeight;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
