package programs;

public class RandomNumber
{

	public static void main(String[] args)
{
		System.out.println("1st Random number " + Math.random());
		System.out.println("2nd Random number " + Math.random());
		
		
		//Random Number between a Range : Math.random() * (max - min + 1) + min  
		
		int min = 1;
		int max =6;
		
		System.out.println("\n"+Math.random()*(max-min+1)+min);
		
	}

}
