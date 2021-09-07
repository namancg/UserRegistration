package com.bridgelabz.userregistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR FIRST NAME");
		String firstName= sc.next();
		System.out.println("ENTER YOUR LAST NAME");
		String lastName=sc.next();
		checkValidName(firstName,lastName);
		System.out.println("ENTER YOUR EMAIL ID");
		String emailId=sc.next();
		checkValidEmail(emailId);
		System.out.println("ENTER YOUR MOBILE NUMBER");
		String mobileNumber = sc.next();
		checkValidMobileNumber(mobileNumber);
		System.out.println("ENTER PASSWORD");
		String password=sc.next();
		checkValidPassword(password);
		
	}
	public static void checkValidName(String firstName, String lastName) 
	{
		String regexCheck= "[A-Z]{1}[a-z]{1,}";
		Pattern pattern = Pattern.compile(regexCheck);
		Matcher obj= pattern.matcher(firstName);
		if(obj.matches()==true)
		{
		System.out.println("THIS IS A VALID FIRST NAME");
			
		}
		else
			System.out.println("NOT A VALID FIRSTNAME");
		Matcher obj1= pattern.matcher(lastName);
		if(obj1.matches()==true)
		{
		System.out.println("THIS IS A VALID LAST NAME");
			
		}
		else
			System.out.println("NOT A VALID LAST NAME");
		
	}
	public static void checkValidEmail(String email) 
	{
		String regexCheck= "^[a-zA-z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(regexCheck);
		Matcher obj= pattern.matcher(email);
		if(obj.matches()==true)
		{
		System.out.println("THIS IS A VALID EMAIL");
			
		}
		else
			System.out.println("NOT A VALID EMAIL");
		
	}
	public static void checkValidMobileNumber(String mobileNumber){
		
		String regexCheck = "(0|91)?[0-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regexCheck);
        Matcher Obj = pattern.matcher(mobileNumber);
        if(Obj.matches()==true)
        {
			System.out.println(mobileNumber+" THIS IS A VALID PHONE NUMBER");
        }
		else
			System.out.println(mobileNumber+" THIS IS NOT A VALID PHONE NUMBER");
	}
	public static void checkValidPassword(String password)
	{
		String regexCheck = "(?=.*[A-Z])[a-zA-Z0-9].{8,}";
		Pattern pattern = Pattern.compile(regexCheck);
        Matcher Obj = pattern.matcher(password);
        if(Obj.matches()==true)
        {
			System.out.println(password+" THIS IS A VALID PASSWORD");
        }
		else
			System.out.println(password+" THIS IS NOT A VALID PASSWORD");
	}

}
