package day2_onWorkshop;
import java.util.*;


public class CabInvoiceGenerator {
	
	static Scanner sc = new Scanner(System.in);
	static int calculateFare(int distance, int time) {
		int totalFare = Math.max((10 * distance) + (1 * time), 5);
		return totalFare;
	}
	
	static void calculateRide(int rides) {
		for(int i = 1; i<= rides; i++) {
			System.out.print("Enter distance for ride" + i +" :");
			int rideDistance = sc.nextInt();
			System.out.print("Enter time for ride" + i +" :");
			int rideTime = sc.nextInt();
			System.out.println("Total Fare for ride" + i +" :" + calculateFare(rideDistance, rideTime) );	
		}
	}
	static void enhancedVoice() {
		
		System.out.println();
	}
	public static void main(String...args) {
		System.out.println("STEP 1 >>>");
		System.out.print("Enter distance :");
		int distance = sc.nextInt();
		System.out.print("Enter time in minutes :");
		int time = sc.nextInt();
		System.out.print("Total Fare :");
		System.out.println(calculateFare(distance,time));
		System.out.println("STEP 2 >>>");
		System.out.print("Enter the total number of rides :");
		int rides = sc.nextInt();
		calculateRide(rides);
		System.out.println("STEP 3");
		
	}
}
