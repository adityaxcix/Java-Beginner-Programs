package programs;
import java.util.*;
public class NumberReverse
{

	public static void main(String[] args)
	{
		
		
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = input.nextInt();
	    int reversed = 0;
	    
	    while (num != 0) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	      num = (num - digit) / 10;
	    }
	    
	    System.out.println("Reversed number: " + reversed);
	  }

}
