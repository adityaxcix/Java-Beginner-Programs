package _31_07_23_;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String rev="";
		int len = str.length();
		char ch[] = str.toCharArray();
		for(int i = len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if (str.equals(rev)) 
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not plaindrome");
		}
		
	}

}
