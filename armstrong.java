package programs;
import java.util.*;
public class armstrong
{

	public static void main(String[] args) 
	{
		
			    Scanner sc = new Scanner(System.in);
			    int num = sc.nextInt();
			    int originalNum = num;
			    int digits = 0;
			    int result = 0;

			    while (originalNum != 0) {
			      originalNum /= 10;
			      ++digits;
			    }

			    originalNum = num;

			    while (originalNum != 0) {
			      int remainder = originalNum % 10;
			      result += Math.pow(remainder, digits);
			      originalNum /= 10;
			    }

			    if (result == num) {
			      System.out.println(num + " is an Armstrong number");
			    } else {
			      System.out.println(num + " is not an Armstrong number");
			    }
			  }
			

}
