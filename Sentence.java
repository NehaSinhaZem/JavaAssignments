import java.util.Scanner;
import java.util.regex.*;
public class Sentence
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String psw= s.nextLine();
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z0-9 ~!@#$%^&*\'\"()_+{}\\[\\]:;,.<>/?-]*[.]$");
		Matcher matcher = pattern.matcher(psw);
		if(matcher.matches())
		    System.out.println("String starts with Capital letter and ends with .");
		else
		    System.out.println("Does not matches the criteria.");
	}
}