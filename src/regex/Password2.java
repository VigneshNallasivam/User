package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Password2 
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String pass2Pattern ="^[A-Z0-9]{8}$";
	System.out.println("ENTER PASSWORD OF TYPE-2");
	String pass2=sc.next();
	System.out.println(isValid(pass2Pattern, pass2));
	}
}
