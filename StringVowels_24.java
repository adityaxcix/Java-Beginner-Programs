package in.programs;

import java.util.Scanner;

public class StringVowels_24 
{

	public static int vowels(String str)
	{
		int count=0;
		for(int i =0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' )
			{
				count++;
			}
			
		}
		return count;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s= sc.nextLine();
		 System.out.print("Number of  Vowels in the string: " + vowels(s)+"\n");
	}

}
