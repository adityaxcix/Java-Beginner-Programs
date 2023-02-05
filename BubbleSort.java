package programs;

public class BubbleSort {

	public static void main(String[] args)
	{
	int arr[] = new int[] {54,87,12,67,2342,234,5,0};
		
		System.out.println("The array of Intergers is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n");
		int length = arr.length; 
		System.out.println("sorting through Bubble sort\n");

		for(int i = 0; i < length-1; i++)
		{
			for(int j = 0; j < length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		System.out.print("The Sorted array is: \n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}