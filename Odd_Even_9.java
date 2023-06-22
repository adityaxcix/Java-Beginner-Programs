package in.programs;

import java.util.Scanner;

public class Odd_Even_9 
{
public static void OddEven()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = sc.nextInt();
	if(num%2==0)
	{
		System.out.println("number is even");
	}
	else {
		System.out.println("number is odd");
	}
}
	
	
	public static void main(String[] args)
	{
		Odd_Even_9.OddEven();
		
		
	}

}
