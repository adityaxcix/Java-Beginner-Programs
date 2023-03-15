package in.Strings;
public class RemoveSpace 
{
	public static void main(String[] args) 
	{
		String s ="hello i am Aditya";
		String rem = "";
		String newS= ""; 
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch==32)
			{
				rem=rem+ch;
			}
			else if (ch>=65 && ch<=90 || ch>=97 && ch<=122 )
			{
				newS=newS+ch;
			}
		}
		System.out.println(newS);
	}
}
