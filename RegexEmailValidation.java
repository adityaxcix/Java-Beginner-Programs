package in.Demo;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexEmailValidation 
{
	public static void main(String[] args)
	{
		List<String> emails = new ArrayList<String>();
		// Valid Emails
		emails.add("hruser2@yopmail.com");
		emails.add("hruser3@yopmail.com");
		emails.add("hruser4@yopmail.com");
		emails.add("Tesuser1@yopmail.com");
		emails.add("Tesuser2@yopmail.com");
		emails.add("Tesuser3@yopmail.com");
		emails.add("Testuser4@yopmail.com");
		emails.add("M1@yopmail.com");

		// Invalid Emails
		emails.add("@yopmail.com");
		emails.add("admin#yopmail.com");

		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		for (String email : emails) 
		{
			Matcher matcher = pattern.matcher(email);
			System.out.println(email + " : " + matcher.matches());
		}
		
		
		System.out.println("===========================================================================================");

//		String email = "Aditya@gmail.com";
//		String regex = "^(.+)@(.+)$";
//		Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher(regex);
//		System.out.println(email + " : " +matcher.matches());

	}
}