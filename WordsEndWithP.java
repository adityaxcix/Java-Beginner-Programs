package in.words;

public class WordsEndWithP {
	public static void main(String[] args) {
		String s = "Pop in Pap of Polypap";
		String w = "";
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				w = w + ch;

			} else {
				if (w.charAt(w.length() - 1) == 'P' || w.charAt(w.length() - 1) == 'p') {
					System.out.println(w);
				}
				w = "";
			}

		}

	}

}
