package _31_07_23_;

import java.util.Scanner;

public class RevString
	{
 public static void main(String[] args)
 	{
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a String");
	 String str = sc.nextLine();
	 String rev="";
	 
	 for(int i=str.length()-1;i>=0;i--)
	 {
		 rev = rev+str.charAt(i);
	 }
	 System.out.println(rev);
	 
	 
	 
	 
	 sc.close();
	 
 	}
 }

