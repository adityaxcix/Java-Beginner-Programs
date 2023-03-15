package in.words;

public class FirstCharOfEachWord
{

	public static void main(String[] args) 
	{
	
		String s = "Hi i am Aditya";
		String w="";
		s=s+" ";
		
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				w=w+ch;
			}
			else {
				
				System.out.println(w.charAt(0));
				w= "";
			}
			
			
		}
		

	}

}
