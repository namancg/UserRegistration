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
		System.out.println("\nEMAIL SAMPLES PROVIDED IS TO BE CHECKED");
		emailId = "abc@bridgelabz.co.in";
		checkValidEmail(emailId);
		emailId = "abc@bbridgelabz.com";
		checkValidEmail(emailId);
		emailId = "abc@bridgelabz.co.in";
		checkValidEmail(emailId);
		emailId = "abc@bridgelabz.com";
		checkValidEmail(emailId);
		emailId = "abc@yahoo.com";
		checkValidEmail(emailId);
		emailId = "abc@1.com";
		checkValidEmail(emailId);
		emailId = "abc-100@yahoo.com";
		checkValidEmail(emailId);
		emailId = "abc.100@yahoo.com";
		checkValidEmail(emailId);
		emailId = "abc111@abc.com";
		checkValidEmail(emailId);
		emailId = "abc-100@abc.net";
		checkValidEmail(emailId);
		emailId = "abc.100@abc.com.au";
		checkValidEmail(emailId);
		
		
		emailId = ".abc@abc.com";
		checkValidEmail(emailId);
		emailId = "abc@123@gmaila";
		checkValidEmail(emailId);
		emailId = "abc@abc@gmailcom";
		checkValidEmail(emailId);
		emailId = "abc123@gmaila";
		checkValidEmail(emailId);
		emailId = "abc";
		checkValidEmail(emailId);
		emailId = "abc..2002@gmail.com";
		checkValidEmail(emailId);
		emailId = "abc@abc@gmail.com";
		checkValidEmail(emailId);
		emailId = "abc()*@gmail.com";
		checkValidEmail(emailId);
		emailId = "abc@%*@gmail.com";
		checkValidEmail(emailId);
		emailId = "abc@gmail.com.1a";
		checkValidEmail(emailId);
		emailId = "abc@gmail.com.aa.au";
		checkValidEmail(emailId);
		
	}
	public static void checkValidName(String firstName, String lastName) 
	{
		String regexCheck= "[A-Z]{1}[a-z]{1,}";
		Pattern pattern = Pattern.compile(regexCheck);
		Matcher obj= pattern.matcher(firstName);
		if(obj.matches()==true)
		{
		System.out.println("THIS IS A VALID FIRST NAME\n");
			
		}
		else
			System.out.println("NOT A VALID FIRSTNAME\n");
		Matcher obj1= pattern.matcher(lastName);
		if(obj1.matches()==true)
		{
		System.out.println("THIS IS A VALID LAST NAME\n");
			
		}
		else
			System.out.println("NOT A VALID LAST NAME\n");
		
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
			System.out.println(mobileNumber+" THIS IS A VALID PHONE NUMBER\n");
        }
		else
			System.out.println(mobileNumber+" THIS IS NOT A VALID PHONE NUMBER\n");
	}
	public static void checkValidPassword(String password)
	{
		String regexCheck = "(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9].{8,}";
		Pattern pattern = Pattern.compile(regexCheck);
        Matcher Obj = pattern.matcher(password);
        if(Obj.matches()==true)
        {
			System.out.println(password+" THIS IS A VALID PASSWORD\n");
        }
		else
			System.out.println(password+" THIS IS NOT A VALID PASSWORD\n");
	}

}
