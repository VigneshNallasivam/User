package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Password3
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String pass3Pattern ="^[A-Za-z]{10}$";
	System.out.println("ENTER PASSWORD OF TYPE-3");
	String pass3=sc.next();
	System.out.println(isValid(pass3Pattern, pass3));
	}
}
