package in.words;

public class OnlyWordsContainingP {
	public static void main(String[] args) {
		String s = "hiphop hello hprfl";
		String w = "";
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				w += ch;
			} else {
				boolean ContainsP = false;
				for (int j = 0; j < w.length(); j++) {
					if (w.charAt(j) == 'p' || w.charAt(j) == 'P') {
						ContainsP = true;
						break;

					}

				}
				if(ContainsP)
				{
					System.out.println(w);
				}
w="";
			}
		}

	}
}
