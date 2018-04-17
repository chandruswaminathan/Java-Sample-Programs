package week2day2;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 20, 340, 21, 879, 92, 21, 474, 83647, -200 };
		int firstlarge = arr[0];
		int secondlarge = arr[0];
		
				for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > firstlarge) {
				secondlarge = firstlarge;
				firstlarge = arr[i];
 
			} else if (arr[i] > secondlarge) {
				secondlarge = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondlarge);

	}

}
