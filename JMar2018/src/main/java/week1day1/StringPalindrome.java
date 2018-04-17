package week1day1;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String inputString,original="";
		System.out.println("Enter the string to check palindrome");
		Scanner scan=new Scanner(System.in);
		inputString=scan.nextLine();
		for(int i=inputString.length()-1;i>=0;i--)
		{
			original=original+inputString.charAt(i);
		}
if(inputString.equals(original))
{
	System.out.println("The entered String is Palindrome");
}
else
	System.out.println("Not a palindrome");
	}

}
