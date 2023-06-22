package in.programs;

import java.util.Scanner;

public class PostiveAndNegativeNumber_14
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nubmer");
		int num = sc.nextInt();
		
		if(num<0)
		{
			System.out.println("It is Neative number");
		}
		else {
			System.out.println("It is Positive number");
		}

	}

}
