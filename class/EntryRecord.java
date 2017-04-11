package JHB.Class;

import java.util.Date;
public class EntryRecord {
	private int entryRecordID;
	private int attractionID;
	private String customerID;
	private Date entryDate;
	private double entryPrice;
	public int getEntryRecordID() {
		return entryRecordID;
	}
	public void setEntryRecordID(int entryRecordID) {
		this.entryRecordID = entryRecordID;
	}
	public int getAttractionID() {
		return attractionID;
	}
	public void setAttractionID(int attractionID) {
		this.attractionID = attractionID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public double getEntryPrice() {
		return entryPrice;
	}
	public void setEntryPrice(double entryPrice) {
		this.entryPrice = entryPrice;
	}
	
	
}
