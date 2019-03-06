
public class Station {

	private int StationID; 
	private int startStationCount; 
	private int endStationCount; 

	public Station(int stationID, int startStationCount, int endStationCount) {
		super();
		StationID = stationID;
		this.startStationCount = startStationCount;
		this.endStationCount = endStationCount;
	}

	public Station(int stationID){
		StationID = stationID;
	}
	
	public int getStationID() {
		return StationID;
	}
	public void setStationID(int stationID) {
		StationID = stationID;
	}

	public int getStartStationCount() {
		return startStationCount;
	}
	public void setStartStationCount(int startStationCount) {
		this.startStationCount = startStationCount;
	}
	public int getEndStationCount() {
		return endStationCount;
	}
	public void setEndStationCount(int endStationCount) {
		this.endStationCount = endStationCount;
	}

	public void incrementStartCount(){
		startStationCount++; 
	} // end of addCount method 

	public void incrementEndCount(){
		endStationCount++; 
	} // end of addCount method 
} // end of class 
