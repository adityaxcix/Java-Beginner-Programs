package _31_07_23_;

import java.util.Scanner;

public class LengthCalc 
{
	public static void main(String[] args) 
	{
		int i = 0;
		String rev="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Stirng");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		for (char c : ch) 
		{
			i++;
		}
		System.out.println(i);	
		for(int j=i-1;j>=0;j--)
		{
			rev=rev+str.charAt(j);
		}
		System.out.println("Reversed String : " + rev);
	
	}
}