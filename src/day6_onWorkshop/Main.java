package day6_onWorkshop;
public class Main {
	public static void main(String[] args) {
		IceCreamRush obj = new IceCreamRush();
		int[] arr = new int[9];
		obj.takeInputs(arr);
		obj.printArray(arr);
		obj.iceCreamSalesSorter(arr);
	}
}
