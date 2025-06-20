package test;
import java.util.Scanner;

public class demo {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 == 0 || year % 100 == 0) {
			System.out.println("Leap");
		}
		else{
			System.out.println("No Leap");
		}
		sc.close();
	}
}