package in.programs;

public class CharFrequency_11 
{

	public static void main(String[] args)
	{
		//Frequency of Character in string
		
		String s = "cCcCccye8@Cc";
		char ch ='c';
		int count =0;
		
		for(int i =0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
			
		}
		System.out.println("Frequency of "+ ch + " is "+count);
		

	}

}
