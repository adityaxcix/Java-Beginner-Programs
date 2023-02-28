package stringWords;

public class StringEncoding 
{
// Encoding in Java by shifting characters by 2
	public static void main(String[] args)
	{
		String enc="";
		String word = "My Name is Aditya";
		for(int i=0;i<word.length();i++)
		{
			char c = word.charAt(i);
			if (c=='z'||c=='z'||c=='y'||c=='Y') 
			{
			c-=26;
			}
			c+=2;
			enc=enc+c;
			
			
		}
		System.out.println(enc);
		

	}

}
