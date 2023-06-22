package in.programs;

import java.util.Scanner;

public class LargestAmonst3Numbers_10 {

	public static void main(String[] args) 
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = obj1.nextInt();
		
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		int num2 = obj1.nextInt();
		
		Scanner obj3 = new Scanner(System.in);
		System.out.println("Enter 3rd number");
		int num3 = obj1.nextInt();
		
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1+ ": 1st largest number");
		}
		else if (num2>num1 && num2 >num3)
		{
			System.out.println(num2 + ": 2nd Largest number");
			
		}
		else 
		{
			System.out.println(num3 + ": 3rd largest number");
		}
		
		

	}

}
