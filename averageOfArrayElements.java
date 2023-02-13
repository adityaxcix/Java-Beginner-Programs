import java.util.Scanner;

public class averageOfArrayElements
{

	public static void main(String[] args) 
	{
		int avg=0;
	int arr[] = new int[5];
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the elements in array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]= obj.nextInt();
	}
	
	for(int i = 0;i<arr.length;i++ )
	{
		avg= avg+arr[i]/arr.length;
	}
System.out.println("Average of Array elements : " + avg);
	}

}
