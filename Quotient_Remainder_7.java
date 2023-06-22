package in.programs;

import java.util.Scanner;

public class Quotient_Remainder_7 
{

	public static void QR()
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter 1st number");
		float num1 = obj1.nextFloat();
		
		
		Scanner obj2 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		float num2 = obj2.nextFloat();
		
		float quo,rem;
		
		quo= num1/num2;
		rem =num1%num2;
		System.out.println("Quotient : "+ quo);
		System.out.println("Remainder : "+ rem);
	}

	public static void main(String[] args) 
	
	{
		Quotient_Remainder_7.QR();
		
	}

}
