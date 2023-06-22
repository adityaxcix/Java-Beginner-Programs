package in.programs;

import java.util.Scanner;

public class Add_Integers_4 {

	public static void main(String[] args) 
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = obj1.nextInt();
		
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		int num2 = obj2.nextInt();

		int sum = num1 +num2;
		System.out.println(sum);
	}

}
