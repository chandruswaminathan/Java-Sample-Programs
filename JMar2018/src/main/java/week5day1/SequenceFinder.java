package week5day1;

public class SequenceFinder {
	public static void main(String[] args){
		int a[] = new int[] {1,2,-3,-4,5,6,7,-8,-9,10};
		SequenceFinder.longSequence(a);
	}
	public static void longSequence(int[] arr) {
		int index, tempIndex;
		int length, tempLength;

		index = tempIndex = -1;
		length = tempLength = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {				
				if (tempLength > length) {
					length = tempLength;
					index = tempIndex;
				}
				tempLength = 0;
				tempIndex = i + 1;
			} else {
				tempLength++;
			}	
		}
		if (index != -1) {
			System.out.print("Output is: ");
			for(int i =0;i<length;i++)
			{
				System.out.print(arr[index]+" ");
				index++;
			}
			System.out.println();
			System.out.println("length is: " + length);	
		} else {
			System.out.println("No result found");
		}
	}
}
