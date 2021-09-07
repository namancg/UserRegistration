package com.bridgelabz.userregistration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YOUR FIRST NAME");
		String firstName= sc.next();
		checkValidFirstName(firstName);
	}
	public static void checkValidFirstName(String firstName) 
	{
		String regexCheck= "[A-Z]{1}[a-z]{1,}";
		Pattern pattern = Pattern.compile(regexCheck);
		Matcher obj= pattern.matcher(firstName);
		if(obj.matches()==true)
		{
		System.out.println("THIS IS A VALID NAME");
			
		}
		else
			System.out.println("NOT A VALID NAME");
		
	}

}
