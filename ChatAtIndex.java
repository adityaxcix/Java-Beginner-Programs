package stringPrograms1_10;

import java.util.Scanner;

public class ChatAtIndex
{
	public static void main(String[] args) 
	{
	//1. Write a Java program to get the character at the given index within the String
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String word = obj.nextLine();
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the index : ");
		int index = obj.nextInt();
		

		try {
			System.out.println(word.charAt(index));
		} 
		catch (Exception e) {
			System.out.println("Enter the correct index : " + e);
		}
		
		
		
		
		
		
		
		
	}
}
