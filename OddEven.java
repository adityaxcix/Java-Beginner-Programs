package programs;
import java.util.Scanner;
public class OddEven 
{

	public static void main(String[] args)
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = obj1.nextInt();

			if(num%2==0)
			{
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
	}

}
