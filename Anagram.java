package programs;

public class Anagram
{

	public static void main(String[] args) 
	{
		String first = "listen";
	    String second = "silent";
	    boolean result = areAnagrams(first, second);
	    System.out.println("Are '" + first + "' and '" + second + "' anagrams? " + result);
		

	}

	private static boolean areAnagrams(String first, String second) {
		if (first.length() != second.length()) {
		      return false;
		    }
		    
		    int[] charCount = new int[26];
		    for (int i = 0; i < first.length(); i++) {
		      charCount[first.charAt(i) - 'a']++;
		    }
		    
		    for (int i = 0; i < second.length(); i++) {
		      charCount[second.charAt(i) - 'a']--;
		      if (charCount[second.charAt(i) - 'a'] < 0) {
		        return false;
		      }
		    }
		    
		    return true;
		  }
	}
	
	

	


	    