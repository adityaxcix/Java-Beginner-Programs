package stringWords;

public class WordOnlyLowerCase {

	public static void main(String[] args) {
		String Word = "KimiNoNawa";
		String newStr = "";
		for (int i = 0; i < Word.length(); i++) {
			char c = Word.charAt(i);
			if (Character.isLowerCase(c)) {
				newStr = newStr + c;
			}
		}
System.out.println(newStr);
	}

}
