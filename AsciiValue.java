package programs;

import java.util.Scanner;

public class AsciiValue
{

	public static void main(String[] args) 
	{
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = obj1.next().charAt(0);
		
		int a = ch;
		System.out.println(a);
		

	}

}
