package day6_onWorkshop;
import java.util.Scanner;
public class IceCreamRush {
	Scanner sc = new Scanner(System.in);	
	void takeInputs(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count++;
			while (true) {
				System.out.print("Enter sale of flavor" + count + " (between 1 to 1000) : ");
				try {
					arr[i] = sc.nextInt();
					if (arr[i] < 1 || arr[i] > 1000) {
						System.out.println("Invalid Number! Please enter a between 1 to 1000.");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Invalid Input! Please enter a number.");
					sc.nextLine(); 
				}
			}
		}
		System.out.println();
	}

	
	void iceCreamSalesSorter(int[] arr) {
		for(int i=0; i< arr.length-1; i++) {
			for(int j=0; j< arr.length- i- 1; j++ ) {
				if(arr[j]> arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}	
			}
		}
		System.out.println("Resultant Array after Bubble Sort: ");
		for(int index : arr) System.out.print(index + " ");
	}
	
	void printArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
