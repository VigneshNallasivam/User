package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class FirstName 
{
	
static boolean isValid(String regex, String userInput)
{
return Pattern.compile(regex).matcher(userInput).matches();
}
	
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String firstNamePattern ="^[A-Z]{1}$";
System.out.println("ENTER FIRST NAME");
String firstName=sc.next();
System.out.println(isValid(firstNamePattern, firstName));
}
}
