package stringWords;

public class WordOnlyUpperCase 
{
	//New String that contains only upperCases
	
public static void main(String args[]) 
{
	
	
String newStr="";
String word = "AdityaIsMainSenior";
for(int i=0;i<word.length();i++)
{
	char c = word.charAt(i);
	if (Character.isUpperCase(c)) {
		newStr=newStr+c;
	}
	
}
System.out.println(newStr);
}
	
}
