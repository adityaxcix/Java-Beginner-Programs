package in.programs;

public class RemoveSpaces_12 
{

	public static void main(String[] args) 
	{
		String s = "Where do you live ? ";
		String rem="";
		String ns="";
		int count=0;
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch==32)
			{
				rem=rem+ch;
				count++;
			}
			else if (ch>=32&&ch<=90||ch>=97 && ch<=122)
			{
				ns=ns+ch;
			}
		}
		System.out.println(rem);
		System.out.println(count);
		System.out.println(ns);
	}

}
