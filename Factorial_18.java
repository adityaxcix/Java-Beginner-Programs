package in.programs;
public class Factorial_18
{
	public static void factorial()
	{
		int num=5;
		int fact =1;
		for(int i =1;i<num;i++)
		{
			fact =fact*i;
			
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args)
	{
		
		Factorial_18.factorial();
	}
}

