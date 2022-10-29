package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Password1 
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String pass1Pattern ="^[A-Za-z0-9]{8}$";
	System.out.println("ENTER PASSWORD OF TYPE-1");
	String pass1=sc.next();
	System.out.println(isValid(pass1Pattern, pass1));
	}
}
