package in.programs;
import java.util.Scanner;
public class Input_Output_2 
{
public static void Userinput(String input)
{
	Scanner obj1 = new Scanner(System.in);
	System.out.println("Enter a String");
	String s = obj1.nextLine();
	System.out.println(s);
	
}

	public static void main(String[] args) 
	{
		Input_Output_2.Userinput(null);
		
	}
	
}
