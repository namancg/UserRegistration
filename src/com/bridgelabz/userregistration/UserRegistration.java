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

}
