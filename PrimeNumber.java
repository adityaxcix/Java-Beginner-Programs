package programs;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args)
	{
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = obj1.nextInt();
		
		boolean prime = true;
		
		for(int i =2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				prime=false;
				break;
			}
		}
		
		if(prime==true)
		{
			System.out.println(num + " is a Prime Number ");
		}
		
		else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
