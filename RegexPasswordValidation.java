package in.Demo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexPasswordValidation 
{
	public static void main(String[] args)
	{

        String passWord = "Geeks@portal20";
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passWord);
        System.out.println(matcher.matches());
}
}