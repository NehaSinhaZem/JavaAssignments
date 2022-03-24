package exceptions;

import exceptions.AlphabetException;

import java.util.Scanner;
import java.util.regex.*;

public class CustomException
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String psw= s.nextLine();
		try{
		    if(psw.length()<8)
		        throw new LengthException("Password too short");
		    Pattern pattern = Pattern.compile("^[a-zA-Z]");
		    Matcher matcher = pattern.matcher(psw);
		    if(!matcher.lookingAt())
		        throw new AlphabetException("Password should contain letter");
		    pattern = Pattern.compile("^[0-9]");
		    matcher = pattern.matcher(psw);
		    if(!matcher.lookingAt())
		        throw new NumberException("Password should contain number");
		}
		catch(Exception e){
		    System.out.println(e);
		}
		finally{
		    System.out.println("Password should contain letter and number. It's length should be atleast 8");
		}
	}
}
