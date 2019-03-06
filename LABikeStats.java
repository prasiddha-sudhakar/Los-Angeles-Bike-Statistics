import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class LABikeStats {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("LABikeStats.csv"); 
		BufferedReader br = new BufferedReader(fr);

		Scanner kb = new Scanner(System.in); 

		boolean endoffile = false; 
		int count = 20; 
		int values = 132428; 
		int linenumber = 0; 

		LinkedList<Biker> bikers = new LinkedList<Biker>();

		// array with all the values 
		String[] tripIDs = new String[values]; 
		int[] durations = new int[values]; 
		String[] startTimes = new String[values]; 
		String[] endTimes = new String[values]; 

		int[] startStationIDs = new int[values]; 
		double [] startStationLatitudes = new double[values]; 
		double[] startStationLongitudes = new double[values]; 

		int[] endStationIDs = new int[values]; 
		double[] endStationLatitudes = new double[values]; 
		double [] endStationLongitudes = new double[values]; 

		int[] bikeIDs = new int[values];
		int[] planDurations = new int [values]; 
		String[] tripRoutes = new String[values];
		String[] passHolderTypes = new String[values]; 

		/*String[] startLats = new String[values];
		String[] startLongs = new String[values];
		String[] startrecordings = new String[values]; 

		String[] endLats = new String[values];
		String[] endLongs = new String[values];
		String[] endrecordings = new String[values]; 
		*/
		// end of array with all the values 

		String line = br.readLine(); 

		while (endoffile == false){

			line = br.readLine();

			if (line == null){
				endoffile = true;
			} // end of if 

			else {
				String[] temparray = new String[count];
				temparray = line.split(","); 
				Biker LAbiker = new Biker(); 

				// ** System.out.println("The ID is " + temparray[0]);
				if (!temparray[0].equals("")){
					tripIDs[linenumber] = temparray[0];
					LAbiker.setTripID(temparray[0]);
				}
				else {
					tripIDs[linenumber] = ""; 
					LAbiker.setTripID(""); 
				}

				// ** System.out.println("The duration is " + temparray[1]);
				if (!temparray[1].equals("")){
					durations[linenumber] = Integer.parseInt(temparray[1]); 
					LAbiker.setDuration(Integer.parseInt(temparray[1]));
				}
				else {
					durations[linenumber] = 0; 
					LAbiker.setDuration(0); 
				}

				// ** System.out.println("The start time is " + temparray[2]);
				if (!temparray[2].equals("")){
					startTimes[linenumber] = temparray[2];
					LAbiker.setStartTime(temparray[2]);
				}
				else {
					startTimes[linenumber] =""; 
					LAbiker.setStartTime(""); 
				}

				// ** System.out.println("The end time is " + temparray[3]);
				if (!temparray[3].equals("")){
					endTimes[linenumber] = temparray[3];
					LAbiker.setEndTime(temparray[3]);
				}
				else {
					endTimes[linenumber] ="";
					LAbiker.setEndTime("");
				}

				// ** System.out.println("The start station ID is " + temparray[4]);
				if (!temparray[4].equals("")){
					startStationIDs[linenumber] = Integer.parseInt(temparray[4]);
					LAbiker.setStartStationID(Integer.parseInt(temparray[4]));
				} // end of if 
				else {
					startStationIDs[linenumber] = 0; 
					LAbiker.setStartStationID(0); 
				} // end of else 

				// ** System.out.println("The start station latitude is " + temparray[5]);
				if (!temparray[5].equals("")){
					startStationLatitudes[linenumber] = Double.parseDouble(temparray[5]);
					LAbiker.setStartStationLatitude(Double.parseDouble(temparray[5]));
				}
				else {
					startStationLatitudes[linenumber] = 0; 
					LAbiker.setStartStationLatitude(0); 
				}

				// ** System.out.println("The start station longitude is " + temparray[6]);
				if (!temparray[6].equals("")){
					startStationLongitudes[linenumber] = Double.parseDouble(temparray[6]);
					LAbiker.setStartStationLongitude(Double.parseDouble(temparray[6]));
				}
				else {
					startStationLongitudes[linenumber] =0; 
					LAbiker.setStartStationLongitude(0); 
				}

				// ** System.out.println("The end station ID is " + temparray[7]);
				if (!temparray[7].equals("")){
					endStationIDs[linenumber] = Integer.parseInt(temparray[7]);
					LAbiker.setEndStationID(Integer.parseInt(temparray[7]));
				} // end of if 
				else {
					endStationIDs[linenumber] =0; 
					LAbiker.setEndStationID(0);
				} // end of else 

				// ** System.out.println("The end station latitude is " + temparray[8]);
				if (!temparray[8].equals("")){
					endStationLatitudes[linenumber] = Double.parseDouble(temparray[8]);
					LAbiker.setEndStationLatitude(Double.parseDouble(temparray[8]));
				} // end of if temparray is empty 
				else {
					endStationLatitudes[linenumber]=0.0; 
					// ** System.out.println("After end station latitude");
					LAbiker.setEndStationLatitude(0.0);
					// ** System.out.println("Success!");
				} // end of else when it's not empty, another value is kept in place 

				// ** System.out.println("The end station longitude is " + temparray[9]);
				if (!temparray[9].equals("")){
					endStationLongitudes[linenumber] = Double.parseDouble(temparray[9]);
					LAbiker.setEndStationLongitude(Double.parseDouble(temparray[9]));
				} // end of if 
				else {
					endStationLongitudes[linenumber]=0.0; 
					LAbiker.setEndStationLatitude(0.0);
				} // end of else 

				// ** System.out.println("The bike ID is " + temparray[10]);
				if (!temparray[10].equals("")){
					bikeIDs[linenumber] = Integer.parseInt(temparray[10]);
					LAbiker.setBikeID(Integer.parseInt(temparray[10]));
				}
				else {
					bikeIDs[linenumber] =0;
					LAbiker.setBikeID(0);
				}

				// ** System.out.println("The plan duration is " + temparray[11]);
				if (!temparray[11].equals("")){
					planDurations[linenumber] = Integer.parseInt(temparray[11]);
					LAbiker.setPlanDuration(Integer.parseInt(temparray[11]));
				} // end of if 
				else {
					planDurations[linenumber] = 0; 
					LAbiker.setPlanDuration(0); 
				} // end of else 

				// ** System.out.println("The trip route is " + temparray[12]);
				if (!temparray[12].equals("")){
					tripRoutes[linenumber] = temparray[12];
					LAbiker.setTripRoute(temparray[12]);
				}
				else {
					tripRoutes[linenumber] = "";
					LAbiker.setTripRoute("");
				}

				// ** System.out.println("The passholder type is " + temparray[13]);
				if (!temparray[13].equals("")){
					passHolderTypes[linenumber] = temparray[13];
					LAbiker.setPassHolderType(temparray[13]);
				}
				else {
					passHolderTypes[linenumber] ="";
					LAbiker.setPassHolderType(""); 
				}

				bikers.add(LAbiker);
				linenumber++; 

			} // end of else 

		} // end of while loop 

		br.close();
		fr.close();

		// make this a new function all together and see if it can be used for both start and end 
		LinkedList<Station> stationList = new LinkedList<Station>();
		Station firstStation = new Station(startStationIDs[0],1,1); 
		stationList.add(firstStation);

		for (int i = 1; i < startStationIDs.length; i++){
			boolean found = searchStationList(startStationIDs[i], stationList);

			if (found == false){
				Station startStation = new Station(startStationIDs[i]); 
				startStation.incrementStartCount();
				stationList.add(startStation);
			} // end of if statement 
			else {
				int n = searchStationListIndex(startStationIDs[i], stationList); 
				stationList.get(n).incrementStartCount();
			} // end of else statement 
		} // end of for loop 

		Station firstendStation = new Station(endStationIDs[0],1,1); 
		stationList.add(firstendStation);

		for (int i = 1; i < endStationIDs.length; i++){
			boolean found = searchStationList(endStationIDs[i], stationList);

			if (found == false){
				Station startendStation = new Station(endStationIDs[i]); 
				startendStation.incrementEndCount();
				stationList.add(startendStation);
			} // end of if statement 
			else {
				int n = searchStationListIndex(endStationIDs[i], stationList); 
				stationList.get(n).incrementEndCount();
			} // end of else statement 
		} // end of for loop 

		
	// findAverageDistance()

		LinkedList<Bike> bikeList = new LinkedList<Bike>();
		Bike firstBike = new Bike(bikeIDs[0], 1, false); 
		bikeList.add(firstBike);

		for (int i = 0; i < bikeIDs.length; i++){
			boolean found = searchBikeList(bikeIDs[i], bikeList); 

			if (found == false){
				Bike LAbike = new Bike(bikeIDs[i]); 
				LAbike.incrementTripCount();
				LAbike.setShared(false);
				bikeList.add(LAbike);
			} // end of if 
			else {
				int n = searchBikeListIndex(bikeIDs[i], bikeList); 
				bikeList.get(n).incrementTripCount();
				bikeList.get(n).setShared(true);
			} // end of else statement 
		} // end of for loop 

		System.out.println("The number of bike sharers are " + findNumberOfBikeSharers(bikeList));
		int countBikeSharers = findNumberOfBikeSharers(bikeList); 

		// seasons in LA are:
		/* June - August: Summer (06-08)
		 * September - November: Autumn (09-11)
		 * December - February: Winter (12-02)
		 * March - May: Spring (03-05)
		 */

		int january=0, february=0, march=0, april=0, may=0, june=0, july=0, august=0, september=0, october=0, november=0, december=0; 
		int spring=0, summer=0, autumn=0, winter=0; 
		
		String[][] datesAndBikes = new String[13][2]; 

		for (int i = 0; i < bikers.size(); i++){
			String date = bikers.get(i).getStartTime();
			String month = date.substring(5, 6); 

			if (month != null){
				switch (month){
				case("01"):
					january++;
				winter++; 
				break;
				case("02"):
					february++; 
				winter++;
				break;
				case("03"):
					march++;
				spring++;
				break;
				case("04"):
					april++;
				spring++;
				break;
				case("05"):
					may++;
				spring++;
				break;
				case("06"):
					june++;
				summer++;
				break;
				case("07"):
					july++;
				summer++;
				break;
				case("08"):
					august++;
				summer++;
				break;
				case("09"):
					september++;
				autumn++;
				break;
				case("10"):
					october++;
				autumn++;
				break;
				case("11"):
					november++;
				autumn++;
				break;
				case("12"):
					december++;
				winter++;
				} // end of switch case 
			} // end of if statement 		

		} // end of for loop 
		
		datesAndBikes[0][0] = "Month"; 
		datesAndBikes[1][0] = "January";
		datesAndBikes[2][0] = "February"; 
		datesAndBikes[3][0] = "March"; 
		datesAndBikes[4][0] = "April"; 
		datesAndBikes[5][0] = "May"; 
		datesAndBikes[6][0] = "June"; 
		datesAndBikes[7][0] = "July"; 
		datesAndBikes[8][0] = "August"; 
		datesAndBikes[9][0] = "September"; 
		datesAndBikes[10][0] = "October"; 
		datesAndBikes[11][0] = "November"; 
		datesAndBikes[12][0] = "December"; 
		
		datesAndBikes[0][1] = "Count"; 
		datesAndBikes[1][1] = Integer.toString(january);
		datesAndBikes[2][2] = Integer.toString(february);
		datesAndBikes[3][3] = Integer.toString(march);
		datesAndBikes[4][4] = Integer.toString(april);
		datesAndBikes[5][5] = Integer.toString(may);
		datesAndBikes[6][6] = Integer.toString(june);
		datesAndBikes[7][7] = Integer.toString(july);
		datesAndBikes[8][8] = Integer.toString(august);
		datesAndBikes[9][9] = Integer.toString(september);
		datesAndBikes[10][10] = Integer.toString(october);
		datesAndBikes[11][11] = Integer.toString(november);
		datesAndBikes[12][12] = Integer.toString(december);
		
		LinkedList<Biker> januaryBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> februaryBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> marchBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> aprilBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> mayBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> juneBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> julyBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> augustBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> septemberBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> octoberBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> novemberBikers = new LinkedList<Biker>(); 
		LinkedList<Biker> decemberBikers = new LinkedList<Biker>(); 
		
		for (int i = 0; i < bikers.size(); i++){
			String date = bikers.get(i).getStartTime();
			String month = date.substring(5, 6); 
			
			if (date != null){
				switch (month){
				case("01"):
					januaryBikers.add(bikers.get(i));  
				break;
				case("02"):
					februaryBikers.add(bikers.get(i));
				break;
				case("03"):
					marchBikers.add(bikers.get(i));
				break;
				case("04"):
					aprilBikers.add(bikers.get(i));
				break;
				case("05"):
					mayBikers.add(bikers.get(i)); 
				break;
				case("06"):
					juneBikers.add(bikers.get(i));
				break;
				case("07"):
					julyBikers.add(bikers.get(i));
				break;
				case("08"):
					augustBikers.add(bikers.get(i));
				break;
				case("09"):
					septemberBikers.add(bikers.get(i));
				break;
				case("10"):
					octoberBikers.add(bikers.get(i));
				break;
				case("11"):
					novemberBikers.add(bikers.get(i));
				break;
				case("12"):
					decemberBikers.add(bikers.get(i));
				} // end of switch case
			} // end of if statement 
		} // end of for loop 
		
		// Call method findmostCommonPassType on every single list and then discuss 
		// Use methods for finding average distances and durations for each month 
		
		LinkedList<Biker> TwoThousand16 = new LinkedList<Biker>(); 
		LinkedList<Biker> TwoThousand17 = new LinkedList<Biker>(); 
		
		for (int i = 0; i < startTimes.length;i++){
			String year = startTimes[i].substring(0, 3); 
			
			if (year.equals("2016")){
				TwoThousand16.add(bikers.get(i)); 
			}
			else if (year.equals("2017")){
				TwoThousand17.add(bikers.get(i)); 
			}
			
		} // end of for loop 
		
		LinkedList<Biker> Y2016_morning = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2016_afternoon = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2016_evening = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2016_night = new LinkedList<Biker>(); 
		
		for (int i = 0; i < TwoThousand16.size(); i++){
			String time = TwoThousand16.get(i).getStartTime().substring(14, 15); 
			
			if (time.equals("05") || time.equals("06") || time.equals("07") || time.equals("08") || time.equals("09") ||time.equals("10") || time.equals("11") || time.equals("12")){
				Y2016_morning.add(TwoThousand16.get(i)); 
			}

			else if (time.equals("13") || time.equals("14") || time.equals("15") || time.equals("16") || time.equals("17") || time.equals("18")){
				Y2016_afternoon.add(TwoThousand16.get(i)); 
			}
			
			else if (time.equals("19") ||time.equals("20") ||time.equals("21")){
				Y2016_evening.add(TwoThousand16.get(i)); 
			}
			else if (time.equals("22") || time.equals("23") || time.equals("00") ||time.equals("01") ||time.equals("02") ||time.equals("03") ||time.equals("104")){
				Y2016_night.add(TwoThousand16.get(i)); 
			}
		} // end of for loop 
		
		LinkedList<Biker> Y2017_morning = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2017_afternoon = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2017_evening = new LinkedList<Biker>(); 
		LinkedList<Biker> Y2017_night = new LinkedList<Biker>(); 
		
		for (int i = 0; i < TwoThousand17.size(); i++){
			String time = TwoThousand17.get(i).getStartTime().substring(14, 15); 
			
			if (time.equals("05") || time.equals("06") || time.equals("07") || time.equals("08") || time.equals("09") ||time.equals("10") || time.equals("11") || time.equals("12")){
				Y2017_morning.add(TwoThousand16.get(i)); 
			}

			else if (time.equals("13") || time.equals("14") || time.equals("15") || time.equals("16") || time.equals("17") || time.equals("18")){
				Y2017_afternoon.add(TwoThousand16.get(i)); 
			}
			
			else if (time.equals("19") ||time.equals("20") ||time.equals("21")){
				Y2017_evening.add(TwoThousand16.get(i)); 
			}
			else if (time.equals("22") || time.equals("23") || time.equals("00") ||time.equals("01") ||time.equals("02") ||time.equals("03") ||time.equals("104")){
				Y2017_night.add(TwoThousand16.get(i)); 
			}
		} // end of for loop 
		
		// Now finding the most popular trip route possibilities - call the mode method 
		

		System.out.println("What would you like to do today?");
		System.out.println("1. Find out the most popular destinations");
		System.out.println("2. Find out what are the average distances travelled by the bikes");
		System.out.println("3. Find out when bikes are most popular");
		System.out.println("4. Find out the changes that are made to bikes rentals during the day");
		System.out.println("5. Combinations of duration of trips and type of passholder ");

		int answer = Integer.parseInt(kb.nextLine()); 

		switch(answer){
		case 1: 
			int mode_starting = mode(startStationIDs);
			System.out.println("The most popular starting desination seems to be " + mode_starting);


			int mode_ending = mode(endStationIDs); 
			System.out.println("The most popular ending destination seems to be " + mode_ending);


			System.out.println("The ");

			break;
		case 2: 
			double total = 0; 
			double average = 0; 
			for (int i = 0; i < bikers.size(); i++){
				total = total + bikers.get(i).getDistance(); 
			}

			average = total/bikers.size(); 
			// System.out.println("The average is " + average);

			break;
		case 3:
			break;
		case 4:
			break;
		case 5: 
			break; 
		}


	} // end of main method 

	public static int mode(int [] arr) 
	{
		int maxValue = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; ++i) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; ++j) 
			{
				if (arr[j] == arr[i])
					count++;
			}
			if (count > maxCount) 
			{
				maxCount = count;
				maxValue = arr[i];
			} // end of if 
		} 

		return maxValue;
	} // end of mode method 

	public static boolean searchStationList(int id, LinkedList<Station> stationList){
		boolean found = false; 

		for (int i = 0; i <stationList.size(); i++){
			if (stationList.get(i).getStationID() == id){
				found = true; 
				break; 
			} // end of if statement 
			else {
				found = false;  
			}// end of else 
		} // end of for loop 

		return found; 
	} // end of method 

	public static int searchStationListIndex(int id, LinkedList<Station> stationList){
		int n = 0; 
		for (int i = 0; i <stationList.size(); i++){
			if (stationList.get(i).getStationID() == id){
				n = i; 
			} // end of if statement 
		} // end of for loop 
		return n; 
	} // end of method 

	public static boolean searchBikeList(int id, LinkedList<Bike> bikeList){
		boolean found = false; 

		for (int i = 0; i <bikeList.size(); i++){
			if (bikeList.get(i).getBikeID() == id){
				found = true; 
				break; 
			} // end of if statement 
			else {
				found = false;  
			}// end of else 
		} // end of for loop 

		return found; 
	} // end of method 

	public static int searchBikeListIndex(int id, LinkedList<Bike> bikeList){
		int n = 0; 
		for (int i = 0; i <bikeList.size(); i++){
			if (bikeList.get(i).getBikeID() == id){
				n = i; 
			} // end of if statement 
		} // end of for loop 
		return n; 
	} // end of method 

	public static int findNumberOfBikeSharers(LinkedList<Bike> bikeList){
		int count = 0; 

		for (int i = 0; i < bikeList.size(); i++){
			if (bikeList.get(i).isShared() == true){
				count++;
			} // end of if statement 
		} // end of for loop 
		return count; 
	} // end of method 
	
	public static String findmostCommonPassType(LinkedList<Biker> bikerList){
		int max = 0; 
		String mostCommon = ""; 
		
		int monthlyPassCount = 0;  
		int flexPassCount = 0; 
		int walkInCount = 0; 
		int annualPassCount = 0; 
		
		
		for (int i = 0; i< bikerList.size(); i++){
			String passValue = bikerList.get(i).getPassHolderType(); 
			
			if(passValue != ""){
				
				if (passValue.contains("Monthly")){
					monthlyPassCount++; 
				}
				else if (passValue.contains("Flex")){
					flexPassCount++;
				}
				else if (passValue.contains("Walk")){
					walkInCount++;
				}
				else if (passValue.contains("annual")){
					annualPassCount++; 
				}
				
			} // end of if statement 
			
		} // end of for loop 
		
		int[] passValues = new int[4]; 
		passValues[0] = monthlyPassCount;
		passValues[1] = flexPassCount; 
		passValues[2] = walkInCount; 
		passValues[3] = annualPassCount; 
		
		for (int i = 0; i < passValues.length; i++){
			if(passValues[i] > max){
				max = i; 
			} // end of if 
		} // end of for loop 
		
		switch(max){
		case(0):
			mostCommon = "Monthly";
		break;
		case(1):
			mostCommon = "Flex";
		break; 
		case(2):
		mostCommon = "Walk-Up";
		break;
		case(3):
			mostCommon = "Annual"; 
		break; 
		}
		
		return mostCommon; 
	} // end of method findmostCommonPassType
	
	public double findAveragePlanDuration(LinkedList<Biker> biker){
		double sum = 0; 
		double count = 0; 
		double average = 0;
		
		for (int i = 0; i < biker.size(); i++){
			sum = sum + biker.get(i).getPlanDuration(); 
			count++;
		} // end of for loop 
		
		average = sum/count; 
		return average; 
	} // end of findAveragePlanDuration
	
	public double findAverageDuration(LinkedList<Biker> biker){
		double sum = 0; 
		double count = 0; 
		double average = 0;
		
		for (int i = 0; i < biker.size(); i++){
			sum = sum + biker.get(i).getDuration(); 
			count++;
		} // end of for loop 
		
		average = sum/count; 
		return average; 
	} // end of find Average duration method 
	
	public String findMostPopularTripRoute(LinkedList<Biker> biker){
		String mostPopular = ""; 
		int roundTripCount = 0; 
		int oneWayCount = 0; 
		
		for (int i = 0; i < biker.size(); i++){
			String route = biker.get(i).getTripRoute();
			
			if (!route.equals("")){
			if (route.equalsIgnoreCase("Round Trip")){
				roundTripCount++;
			} // end of if statement 
			else if (route.equalsIgnoreCase("One way")){
				oneWayCount++; 
			} // end of else if statement 
			} // end of if route equals "" 
		} // end of for loop 
		
		if (roundTripCount > oneWayCount){
			mostPopular = "Round Trip"; 
		}
		else if (oneWayCount > roundTripCount){
			mostPopular = "One way";
		}
		else {
			mostPopular = "There are the same number of round trips as one way trip routes"; 
		}
		
		return mostPopular; 
		
	} // end of method 

} // end of class 
