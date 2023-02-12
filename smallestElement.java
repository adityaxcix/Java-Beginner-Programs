import java.util.*;
public class smallestElement
{
	public static void main(String[] args)
	{
		int arr1[] = { 12, 44, 23, 56, 90, 10 };
		for(int E1 : arr1)
		{
			System.out.print(E1 + " ");
		}
		System.out.println();
		System.out.println("Smallest Element :" +sort(arr1)+"\n");
		

		
		int arr2[] = { 28, 12, 2, 30, 276 };
		
		for(int E2: arr2)
		{
			System.out.print(E2 + " ");
		}
		System.out.println();
		System.out.println("Smallest Element :"+sort(arr2));
		System.out.println();
		
	}
	static int sort(int arr[])
	{
		Arrays.sort(arr);
		return arr[0];
	}
	
	
	
	
}

