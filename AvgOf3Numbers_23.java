package in.programs;

import java.util.Scanner;

public class AvgOf3Numbers_23 {

	public static int Average(int num1, int num2 , int num3)
	{
		return (num1+num2+num3)/3;
	}
	
	
	
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 3rd number");
		int num3 = sc.nextInt();

		System.out.println(Average(num1, num2, num3));
		
		
	}

}
