package in.words;
public class WordTraverse {
	public static void main(String[] args) {
		String w = "";
		String s = "Hello i am Aditya";

		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(ch!=' ')
			{
				w=w+ch;
			}
			else {
				System.out.println(w);
				w="";
				
			}
			
		}

	}

}
