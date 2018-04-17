package week6day1;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		String input=null;
		System.out.println("Enter a value which contains only 5 digits:");
		Scanner scan=new Scanner(System.in);
		input=scan.nextLine();
		scan.close();
		
		if(input.length()>5) {
			System.out.println("False");
		}
		else
			System.out.println("True");

	}

}
