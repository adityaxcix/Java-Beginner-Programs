package in.programs;

public class String_Palindrome_17 
{

	public static void main(String[] args) 
	{
		String rev="";
		String s = "hello";
		for(int i =0;i <s.length();i++)
		{
			char ch = s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}

	}

}
