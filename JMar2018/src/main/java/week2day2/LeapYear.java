package week2day2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		System.out.println("Enter the year to find whether Leap Year:");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		if(year%4==0 && year%100==0 && year%400==0  )
		{
			System.out.println(+year+" is Leap Year");
		}
			else
			{
				System.out.println(+year+" is not a Leap Year");
				
		}

	}

}
