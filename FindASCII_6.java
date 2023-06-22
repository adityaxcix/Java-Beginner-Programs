package in.programs;

import java.util.Scanner;

public class FindASCII_6 {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = obj.next().charAt(0);
		int num = ch;
		System.out.println("ASCII Value of " + ch +" is  : " + num);

	}

}
