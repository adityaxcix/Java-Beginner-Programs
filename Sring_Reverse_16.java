package in.programs;
import java.util.Scanner;
public class Sring_Reverse_16 
{
	
	public static void reverseString(String input) 
	{
		char[]array=input.toCharArray();
		String rev= "";
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+array[i];
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		String name="manish";
		Sring_Reverse_16.reverseString(name);
		
		}
	}

