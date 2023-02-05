package programs;

public class ArrayReverse 
{

	public static void main(String[] args) 
	{
		int arr[] = new int[]{12,45,33,1,0,66};
		System.out.println("The Original Array is ");
		for(int i=0;i<arr.length;i++)
		{
			 System.out.print(arr[i] +  " ");
		}
		System.out.println("\n");
		System.out.print("The Reversed Array is\n");
		for(int i =arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
