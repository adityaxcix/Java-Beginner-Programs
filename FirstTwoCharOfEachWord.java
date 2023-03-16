package in.words;
public class FirstTwoCharOfEachWord {
	public static void main(String[] args) {
		String s = "Hello I Am From Dehradun";
		String w = "";
		s = s + " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				w = w + ch;
			}
			else {
				if (w.length() > 1) {
					System.out.println(w.substring(0, 2));
				}
				w = "";
			}}}}