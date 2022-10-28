package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class LastName 
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String lastNamePattern ="^[A-Z]{1}[a-z]{2,15}$";
	System.out.println("ENTER LAST NAME");
	String lastName=sc.next();
	System.out.println(isValid(lastNamePattern, lastName));
	}
}
