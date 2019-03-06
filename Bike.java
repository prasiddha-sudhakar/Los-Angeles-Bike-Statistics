
public class Bike {
	
	private int bikeID; 
	private int tripCount; 
	private boolean shared; 
	
	public Bike(int bikeID, int tripCount, boolean shared) {
		super();
		this.bikeID = bikeID;
		this.tripCount = 0;
		this.shared = shared;
	}
	
	public Bike(int i) {
		this.bikeID = bikeID;
	}

	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public int getTripCount() {
		return tripCount;
	}
	public void setTripCount(int tripCount) {
		this.tripCount = tripCount;
	}
	public boolean isShared() {
		return shared;
	}
	public void setShared(boolean shared) {
		this.shared = shared;
	}
	
	public void incrementTripCount(){
		tripCount++; 
	} // end of addCount method 

} // end of Bike class 
