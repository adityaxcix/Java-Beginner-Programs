package in.programs;

import java.util.Scanner;

public class Multiply_Float_5 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		float num1 = sc.nextFloat();
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2nd valuse");
		float num2 = obj.nextFloat();
		
		float mul=0;
		mul = num1*num2;
		System.out.println(mul);
		
		

	}

}
