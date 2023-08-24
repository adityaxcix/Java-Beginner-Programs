package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 12, 89, 54, 90, 44, 0, 4 };
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array");

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(arr[1]);
		System.out.println("Second largest");
		System.out.println(arr[arr.length-2]);
		
		
	}
}