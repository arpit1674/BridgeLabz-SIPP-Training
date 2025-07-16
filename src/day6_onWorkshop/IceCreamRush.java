package day6_onWorkshop;
import java.util.Scanner;
public class IceCreamRush {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int[] arr = new int[9];
		for(int i=0; i<arr.length-1; i++) {
			System.out.print("Enter  sale of flavor" + count+" :");
			count++;
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int temp = 0;
		
		for(int i=0; i< arr.length-1; i++) {
			for(int j=i; j< arr.length-1; j++ ) {
				
				
			}
		}
	}
}
