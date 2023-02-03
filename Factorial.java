package programs;

import java.util.Scanner;

public class Factorial
{

	public static void main(String[] args)
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the number");
		long num = obj1.nextLong();
		long fact =1;
		for(long i =1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
