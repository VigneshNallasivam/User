package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Password4Special 
{
	static boolean isValid(String regex, String userInput)
	{
	return Pattern.compile(regex).matcher(userInput).matches();
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String pass4Pattern ="^[0-9]{10}[@#%$]$";
	System.out.println("ENTER PASSWORD OF TYPE-4 SPECIAL CHARACTER");
	String pass4=sc.next();
	System.out.println(isValid(pass4Pattern, pass4));
	}
}
