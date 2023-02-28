package stringWords;
public class DigitsaAndAlphabets {

	public static void main(String[] args) 
	{
		String Dig="",alph="";
		String name = "38102ihiaaWSFD 9k jhf09";
		for(int i =0;i<name.length();i++)
		{
			char c = name.charAt(i);
			if (Character.isDigit(c))
			{
				Dig = Dig+c;
			}
			else {
				alph=alph+c;
			}
		}
		
		System.out.println(Dig+alph);
		
	}

}
