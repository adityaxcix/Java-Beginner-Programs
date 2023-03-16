package in.words;
public class PrintOnlyWordsFromP 
{
	public static void main(String[] args)
	{
		String s = "Pathak Plays in park s";
		String w="";
		s=s+" ";
		for(int i =0;i<s.length();i++)
		{
			char ch  = s.charAt(i);
			if(ch!=' ')
			{
				w=w+ch;
			}
			else
			{
				if(w.charAt(0)=='P' || w.charAt(0)=='p')
				{
					System.out.println(w);
				}
				w="";
			}
			
			
		}
	}

}
