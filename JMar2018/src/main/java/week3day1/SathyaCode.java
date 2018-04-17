package week3day1;

import java.util.Scanner;

public class SathyaCode {

	
	public static void password(String str)
	{
		String num= "(.*[0-9].*)";
		String lower = "(.*[a-z].*)";
		String lower2=lower.toLowerCase();
		String upper = lower.toUpperCase();
		if(str.length() < 10)
		{
			System.out.println("Password should be atleast Ten character");
		}
		else if(str.matches(num)==false)
		{
			System.out.println("Password should contain digits and letters");
		}
		else if((str.matches(lower2)==false) && (str.matches(upper)==false))
		{
			System.out.println("Password should contain letters and digits");
		}
		else if(str.matches(upper)==false)
		{
			System.out.println("Password should contain atleast one upper case");
		}
		else
		{
			System.out.println("Valid password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1;
		Scanner pwd=new Scanner(System.in);
		System.out.println("Enter the Password:");
		str1=pwd.next();
		password(str1);
		pwd.close();

	}

}
