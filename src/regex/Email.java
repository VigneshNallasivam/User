package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Email 
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String emailIdPattern ="^[a-z]{2,20}[@][a-z]{2,5}[.][a-z]{2,3}$";
	System.out.println("ENTER EMAIL ID");
	String emailId=sc.next();
	System.out.println(isValid(emailIdPattern, emailId));
	}
}
