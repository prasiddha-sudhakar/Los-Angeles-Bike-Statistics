import java.util.LinkedList;

public class Biker {

	private String tripID; 
	private int duration; 
	private String startTime; 
	private String endTime; 

	private int startStationID;
	private double startStationLatitude;
	private double startStationLongitude;

	private int endStationID;
	private double endStationLatitude;
	private double endStationLongitude;

	private int bikeID; 
	private int planDuration; 
	private String tripRoute; 
	private String passHolderType; 

	private double distance; 

	public Biker(String tripID, double startStationLatitude, double startStationLongitude, double endStationLatitude,
			double endStationLongitude) {
		super();
		this.tripID = tripID;
		this.startStationLatitude = startStationLatitude;
		this.startStationLongitude = startStationLongitude;
		this.endStationLatitude = endStationLatitude;
		this.endStationLongitude = endStationLongitude;
		this.distance = distance;
	}

	public Biker() {
		// TODO Auto-generated constructor stub
	}

	public String getTripID() {
		return tripID;
	}
	public void setTripID(String tripID) {
		this.tripID = tripID;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getStartStationID() {
		return startStationID;
	}
	public void setStartStationID(int startStationID) {
		this.startStationID = startStationID;
	}
	public double getStartStationLatitude() {
		return startStationLatitude;
	}
	public void setStartStationLatitude(double startStationLatitude) {
		this.startStationLatitude = startStationLatitude;
	}
	public double getStartStationLongitude() {
		return startStationLongitude;
	}
	public void setStartStationLongitude(double startStationLongitude) {
		this.startStationLongitude = startStationLongitude;
	}
	public int getEndStationID() {
		return endStationID;
	}
	public void setEndStationID(int endStationID) {
		this.endStationID = endStationID;
	}
	public double getEndStationLatitude() {
		return endStationLatitude;
	}
	public void setEndStationLatitude(double endStationLatitude) {
		this.endStationLatitude = endStationLatitude;
	}
	public double getEndStationLongitude() {
		return endStationLongitude;
	}
	public void setEndStationLongitude(double endStationLongitude) {
		this.endStationLongitude = endStationLongitude;
	}
	public int getBikeID() {
		return bikeID;
	}
	public void setBikeID(int bikeID) {
		this.bikeID = bikeID;
	}
	public int getPlanDuration() {
		return planDuration;
	}
	public void setPlanDuration(int planDuration) {
		this.planDuration = planDuration;
	}
	public String getTripRoute() {
		return tripRoute;
	}
	public void setTripRoute(String tripRoute) {
		this.tripRoute = tripRoute;
	}
	public String getPassHolderType() {
		return passHolderType;
	}
	public void setPassHolderType(String passHolderType) {
		this.passHolderType = passHolderType;
	}

	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}

	public static double calculateDistance(double latStart, double longStart, double latEnd, double longEnd) {

		/*System.out.println("Starting latitude: " + lat1 );
		System.out.println("Starting longitude: " + lon1 );
		System.out.println("Ending latitude: " + lat2 );
		System.out.println("Ending longitude: " + lon2 );
		 */ 

		double distance = 0;
		double theta = longStart - longEnd;
		// System.out.println("The value of long1 is " + lon1 + " and long2 is " + lon2);
		double dist = Math.sin(deg2rad(latStart)) * Math.sin(deg2rad(latEnd)) + Math.cos(deg2rad(latStart)) * Math.cos(deg2rad(latEnd)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		// System.out.println("The distance is now " + dist);
		return dist; 
	} // end of distance method 

	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	} // end of deg2rad method 
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	} // end of rad2deg method 
	
	public static void setCalculatedDistance(LinkedList<Biker> bikers){
		for (int i = 0; i < bikers.size(); i++){

			double latStart = bikers.get(i).getStartStationLatitude(); 
			double longStart = bikers.get(i).getStartStationLongitude(); 
			double latEnd = bikers.get(i).getEndStationLatitude();
			double longEnd = bikers.get(i).getEndStationLongitude(); 
			
			double d = calculateDistance(latStart, longStart, latEnd, longEnd);

			d = Math.round(d * 100.0) / 100.0;
			d= Math.abs(d); 
			bikers.get(i).setDistance(d);

			// ** System.out.println("The distance is " + bikers.get(i).getDistance() + " for the index " + i);
		} // end of for loop 
	} // end of find setCalclatedDistance
	
	

} // end of class 