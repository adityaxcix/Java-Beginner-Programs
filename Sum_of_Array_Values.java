package aug_22;

public class Sum_of_Array_Values {

	public static void main(String[] args) {
		int arr[] = { 12, 43, 56, 21, 98 };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Total sum is : " + sum);
	}

}
