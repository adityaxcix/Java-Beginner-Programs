package in.words;

public class LongestWordInSentense {
	public static void main(String[] args) {
		String s = "hello iam Aditya";
		String w = "";
		String nw = "";
		s += " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				w = w + ch;
			} else {
				if (w.length() > nw.length()) {
					nw = w;
				}
				w = "";
			}
		}
		System.out.println(nw);
	}
}
