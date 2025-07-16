package day6_onWorkshop;
import java.util.Scanner;
public class IceCreamRush {
	Scanner sc = new Scanner(System.in);	
	void takeInputs(int[] arr) {
		int count = 1;
		for(int i=0; i<arr.length-1; i++) {
			System.out.print("Enter sale of flavor" + count+" (between 1 to 1000) :");
			count++;
			arr[i] = sc.nextInt();
			while(true) {
				if(arr[i] < 0 || arr[i] > 1000) {
					System.out.println("Invalid Number! Type (between 1 to 1000) for flavor" + --count + " :");
					arr[i] = sc.nextInt();
				}
				break;
			}
		}
		System.out.println();
	}
	
	void iceCreamSalesSorter(int[] arr) {
		int temp = 0;
		
		for(int i=0; i< arr.length-1; i++) {
			for(int j=0; j< arr.length- i- 1; j++ ) {
				if(arr[j]> arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
		}
		System.out.println("After Bubble Sort: ");
		for(int index : arr) System.out.print(index + " ");
	}
	
	void printArray(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
