package in.words;

public class Only3CharWords {

	public static void main(String[] args) 
	{
		String s ="hii my name is Adi";
		String w= "";
		s=s+" ";
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				w=w+ch;
			}
			else 
			{
			if(w.length()==3)
				System.out.println(w);
			w="";
			}
			
			
			
		}
		

	}

}
