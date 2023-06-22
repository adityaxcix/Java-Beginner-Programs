package in.programs;

import java.util.Scanner;

public class AlphabetOrNot_15 
{

	public static void main(String[] args) 
	{
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = obj1.next().charAt(0);
		
		if(ch>=65 && ch<=90 || ch>=97 && ch <=122)
		{
			System.out.println("Character is Alphabet");
		}
		else if (ch>=48 && ch<=57 || ch>0) 
		{
			System.out.println("Character is Number");
		}
		else {
			System.out.println("Character is Special character");
		}
		
	}

}
