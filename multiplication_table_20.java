package in.programs;
import java.util.Scanner;
public class multiplication_table_20
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}
}
