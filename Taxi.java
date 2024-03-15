package TaxiBooking;

public class Taxi implements Cloneable {

	private char currentlocation='A';
	private int customerId;
	private int taxiId;
	private char pickupLocation;
	private char dropLocation;
	private int pickupTime;
	private int  dropTime;
	private int earnings;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public char getCurrentlocation() {
		return currentlocation;
	}

	public void setCurrentlocation(char currentlocation) {
		this.currentlocation = currentlocation;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}

	public char getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(char pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public char getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(char dropLocation) {
		this.dropLocation = dropLocation;
	}

	public int getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}

	public int getDropTime() {
		return dropTime;
	}

	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}

	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "Taxi "+getTaxiId()+"\nCurrent Location: "+currentlocation+
				"\n Customer Id: "+customerId+"\nPickup Location: "+pickupLocation+
				"\n Drop Location: "+ dropLocation+ "\n PickupTime: "+pickupTime+
				"\nDrop Time: "+dropTime+"\n Earnings: "+earnings;
	}
	
	
	 
	
	

	
}
